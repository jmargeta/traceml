#!/usr/bin/python
#
# Copyright 2018-2023 Polyaxon, Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
import datetime

from typing import List, Optional, Text

from clipped.utils.csv import validate_csv
from clipped.utils.dates import parse_datetime
from clipped.utils.json import orjson_dumps, orjson_loads
from clipped.utils.tz import now
from pydantic import StrictStr

from polyaxon.schemas.base import BaseSchemaModel
from traceml.logging.parser import (
    DATETIME_REGEX,
    ISO_DATETIME_REGEX,
    timestamp_search_regex,
)


class V1Log(BaseSchemaModel):
    _SEPARATOR = "|"
    _IDENTIFIER = "log"

    timestamp: Optional[datetime.datetime]
    node: Optional[StrictStr]
    pod: Optional[StrictStr]
    container: Optional[StrictStr]
    value: Optional[StrictStr]

    @classmethod
    def process_log_line(
        cls,
        value: Text,
        node: Optional[str],
        pod: Optional[str],
        container: Optional[str],
        timestamp=None,
    ) -> Optional["V1Log"]:
        if not value:
            return None

        if not isinstance(value, str):
            value = value.decode("utf-8")

        value = value.strip()

        if not timestamp:
            value, timestamp = timestamp_search_regex(ISO_DATETIME_REGEX, value)
            if not timestamp:
                value, timestamp = timestamp_search_regex(DATETIME_REGEX, value)
        if isinstance(timestamp, str):
            try:
                timestamp = parse_datetime(timestamp)
            except Exception as e:
                raise ValueError("Received an invalid timestamp") from e

        return cls.construct(
            timestamp=timestamp if timestamp else now(tzinfo=True),
            node=node,
            pod=pod,
            container=container,
            value=value,
        )

    def to_csv(self) -> str:
        values = [
            str(self.timestamp) if self.timestamp is not None else "",
            str(self.node) if self.node is not None else "",
            str(self.pod) if self.pod is not None else "",
            str(self.container) if self.container is not None else "",
            orjson_dumps({"_": self.value}) if self.value is not None else "",
        ]

        return self._SEPARATOR.join(values)


class V1Logs(BaseSchemaModel):
    _CHUNK_SIZE = 2000
    _IDENTIFIER = "logs"

    logs: Optional[List[V1Log]]
    last_time: Optional[datetime.datetime]
    last_file: Optional[StrictStr]
    files: Optional[List[StrictStr]]

    @classmethod
    def get_csv_header(cls) -> str:
        return V1Log._SEPARATOR.join(V1Log.__fields__.keys())

    def to_csv(self):
        _logs = ["\n{}".format(e.to_csv()) for e in self.logs if e.value]
        return "".join(_logs)

    @classmethod
    def should_chunk(cls, logs: List[V1Log]):
        return len(logs) >= cls._CHUNK_SIZE

    @classmethod
    def chunk_logs(cls, logs: List[V1Log]):
        total_size = len(logs)
        for i in range(0, total_size, cls._CHUNK_SIZE):
            yield cls(logs=logs[i : i + cls._CHUNK_SIZE])

    @classmethod
    def read_csv(cls, data: str, parse_dates: bool = True) -> "V1Logs":
        import numpy as np
        import pandas as pd

        csv = validate_csv(data)
        if parse_dates:
            df = pd.read_csv(
                csv,
                sep=V1Log._SEPARATOR,
                parse_dates=["timestamp"],
                error_bad_lines=False,
            )
        else:
            df = pd.read_csv(
                csv,
                sep=V1Log._SEPARATOR,
            )

        return cls.construct(
            logs=[
                V1Log.construct(
                    timestamp=i.get("timestamp"),
                    node=i.get("node"),
                    pod=i.get("pod"),
                    container=i.get("container"),
                    value=orjson_loads(i.get("value")).get("_"),
                )
                for i in df.replace({np.nan: None}).to_dict(orient="records")
            ]
        )
