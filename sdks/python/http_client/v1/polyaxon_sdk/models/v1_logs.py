#!/usr/bin/python
#
# Copyright 2018-2020 Polyaxon, Inc.
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

# coding: utf-8

"""
    Polyaxon SDKs and REST API specification.

    Polyaxon SDKs and REST API specification.  # noqa: E501

    OpenAPI spec version: 1.0.76
    Contact: contact@polyaxon.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class V1Logs(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {"logs": "list[V1Log]", "last_time": "datetime", "last_file": "str"}

    attribute_map = {"logs": "logs", "last_time": "last_time", "last_file": "last_file"}

    def __init__(self, logs=None, last_time=None, last_file=None):  # noqa: E501
        """V1Logs - a model defined in Swagger"""  # noqa: E501

        self._logs = None
        self._last_time = None
        self._last_file = None
        self.discriminator = None

        if logs is not None:
            self.logs = logs
        if last_time is not None:
            self.last_time = last_time
        if last_file is not None:
            self.last_file = last_file

    @property
    def logs(self):
        """Gets the logs of this V1Logs.  # noqa: E501


        :return: The logs of this V1Logs.  # noqa: E501
        :rtype: list[V1Log]
        """
        return self._logs

    @logs.setter
    def logs(self, logs):
        """Sets the logs of this V1Logs.


        :param logs: The logs of this V1Logs.  # noqa: E501
        :type: list[V1Log]
        """

        self._logs = logs

    @property
    def last_time(self):
        """Gets the last_time of this V1Logs.  # noqa: E501


        :return: The last_time of this V1Logs.  # noqa: E501
        :rtype: datetime
        """
        return self._last_time

    @last_time.setter
    def last_time(self, last_time):
        """Sets the last_time of this V1Logs.


        :param last_time: The last_time of this V1Logs.  # noqa: E501
        :type: datetime
        """

        self._last_time = last_time

    @property
    def last_file(self):
        """Gets the last_file of this V1Logs.  # noqa: E501


        :return: The last_file of this V1Logs.  # noqa: E501
        :rtype: str
        """
        return self._last_file

    @last_file.setter
    def last_file(self, last_file):
        """Sets the last_file of this V1Logs.


        :param last_file: The last_file of this V1Logs.  # noqa: E501
        :type: str
        """

        self._last_file = last_file

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(
                    map(lambda x: x.to_dict() if hasattr(x, "to_dict") else x, value)
                )
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(
                    map(
                        lambda item: (item[0], item[1].to_dict())
                        if hasattr(item[1], "to_dict")
                        else item,
                        value.items(),
                    )
                )
            else:
                result[attr] = value
        if issubclass(V1Logs, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, V1Logs):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
