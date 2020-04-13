// Copyright 2018-2020 Polyaxon, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/*
 * Polyaxon SDKs and REST API specification.
 * Polyaxon SDKs and REST API specification.
 *
 * OpenAPI spec version: 1.0.76
 * Contact: contact@polyaxon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.V1Version;
import java.io.IOException;

/**
 * V1Versions
 */

public class V1Versions {
  @SerializedName("platform_version")
  private String platformVersion = null;

  @SerializedName("cli")
  private V1Version cli = null;

  @SerializedName("platform")
  private V1Version platform = null;

  @SerializedName("agent")
  private V1Version agent = null;

  public V1Versions platformVersion(String platformVersion) {
    this.platformVersion = platformVersion;
    return this;
  }

   /**
   * Get platformVersion
   * @return platformVersion
  **/
  @ApiModelProperty(value = "")
  public String getPlatformVersion() {
    return platformVersion;
  }

  public void setPlatformVersion(String platformVersion) {
    this.platformVersion = platformVersion;
  }

  public V1Versions cli(V1Version cli) {
    this.cli = cli;
    return this;
  }

   /**
   * Get cli
   * @return cli
  **/
  @ApiModelProperty(value = "")
  public V1Version getCli() {
    return cli;
  }

  public void setCli(V1Version cli) {
    this.cli = cli;
  }

  public V1Versions platform(V1Version platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @ApiModelProperty(value = "")
  public V1Version getPlatform() {
    return platform;
  }

  public void setPlatform(V1Version platform) {
    this.platform = platform;
  }

  public V1Versions agent(V1Version agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @ApiModelProperty(value = "")
  public V1Version getAgent() {
    return agent;
  }

  public void setAgent(V1Version agent) {
    this.agent = agent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Versions v1Versions = (V1Versions) o;
    return Objects.equals(this.platformVersion, v1Versions.platformVersion) &&
        Objects.equals(this.cli, v1Versions.cli) &&
        Objects.equals(this.platform, v1Versions.platform) &&
        Objects.equals(this.agent, v1Versions.agent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platformVersion, cli, platform, agent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Versions {\n");
    
    sb.append("    platformVersion: ").append(toIndentedString(platformVersion)).append("\n");
    sb.append("    cli: ").append(toIndentedString(cli)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

