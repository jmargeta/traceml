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
import io.swagger.client.model.V1Queue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1ListQueuesResponse
 */

public class V1ListQueuesResponse {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("results")
  private List<V1Queue> results = null;

  @SerializedName("previous")
  private String previous = null;

  @SerializedName("next")
  private String next = null;

  public V1ListQueuesResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public V1ListQueuesResponse results(List<V1Queue> results) {
    this.results = results;
    return this;
  }

  public V1ListQueuesResponse addResultsItem(V1Queue resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<V1Queue>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<V1Queue> getResults() {
    return results;
  }

  public void setResults(List<V1Queue> results) {
    this.results = results;
  }

  public V1ListQueuesResponse previous(String previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(value = "")
  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public V1ListQueuesResponse next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ListQueuesResponse v1ListQueuesResponse = (V1ListQueuesResponse) o;
    return Objects.equals(this.count, v1ListQueuesResponse.count) &&
        Objects.equals(this.results, v1ListQueuesResponse.results) &&
        Objects.equals(this.previous, v1ListQueuesResponse.previous) &&
        Objects.equals(this.next, v1ListQueuesResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, results, previous, next);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ListQueuesResponse {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

