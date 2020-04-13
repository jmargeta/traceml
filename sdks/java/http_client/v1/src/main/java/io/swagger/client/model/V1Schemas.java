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
import io.swagger.client.model.V1ArtifactsMount;
import io.swagger.client.model.V1ArtifactsType;
import io.swagger.client.model.V1AuthType;
import io.swagger.client.model.V1CompiledOperation;
import io.swagger.client.model.V1ConnectionSchema;
import io.swagger.client.model.V1ConnectionType;
import io.swagger.client.model.V1DockerfileType;
import io.swagger.client.model.V1EarlyStopping;
import io.swagger.client.model.V1Event;
import io.swagger.client.model.V1EventType;
import io.swagger.client.model.V1GcsType;
import io.swagger.client.model.V1GitType;
import io.swagger.client.model.V1ImageType;
import io.swagger.client.model.V1K8sResourceType;
import io.swagger.client.model.V1Matrix;
import io.swagger.client.model.V1OperationCond;
import io.swagger.client.model.V1Parallel;
import io.swagger.client.model.V1PolyaxonInitContainer;
import io.swagger.client.model.V1PolyaxonSidecarContainer;
import io.swagger.client.model.V1Reference;
import io.swagger.client.model.V1RunSchema;
import io.swagger.client.model.V1S3Type;
import io.swagger.client.model.V1Schedule;
import io.swagger.client.model.V1UriType;
import io.swagger.client.model.V1WasbType;
import java.io.IOException;

/**
 * V1Schemas
 */

public class V1Schemas {
  @SerializedName("operation_cond")
  private V1OperationCond operationCond = null;

  @SerializedName("early_stopping")
  private V1EarlyStopping earlyStopping = null;

  @SerializedName("parallel")
  private V1Parallel parallel = null;

  @SerializedName("run")
  private V1RunSchema run = null;

  @SerializedName("compiled_operation")
  private V1CompiledOperation compiledOperation = null;

  @SerializedName("schedule")
  private V1Schedule schedule = null;

  @SerializedName("connection_schema")
  private V1ConnectionSchema connectionSchema = null;

  @SerializedName("matrix")
  private V1Matrix matrix = null;

  @SerializedName("refrence")
  private V1Reference refrence = null;

  @SerializedName("artifacts_mount")
  private V1ArtifactsMount artifactsMount = null;

  @SerializedName("polyaxon_sidecar_container")
  private V1PolyaxonSidecarContainer polyaxonSidecarContainer = null;

  @SerializedName("polyaxon_init_container")
  private V1PolyaxonInitContainer polyaxonInitContainer = null;

  @SerializedName("artifacs")
  private V1ArtifactsType artifacs = null;

  @SerializedName("wasb")
  private V1WasbType wasb = null;

  @SerializedName("gcs")
  private V1GcsType gcs = null;

  @SerializedName("s3")
  private V1S3Type s3 = null;

  @SerializedName("autg")
  private V1AuthType autg = null;

  @SerializedName("dockerfile")
  private V1DockerfileType dockerfile = null;

  @SerializedName("git")
  private V1GitType git = null;

  @SerializedName("uri")
  private V1UriType uri = null;

  @SerializedName("k8s_resource")
  private V1K8sResourceType k8sResource = null;

  @SerializedName("connection")
  private V1ConnectionType connection = null;

  @SerializedName("image")
  private V1ImageType image = null;

  @SerializedName("event_type")
  private V1EventType eventType = null;

  @SerializedName("event")
  private V1Event event = null;

  public V1Schemas operationCond(V1OperationCond operationCond) {
    this.operationCond = operationCond;
    return this;
  }

   /**
   * Get operationCond
   * @return operationCond
  **/
  @ApiModelProperty(value = "")
  public V1OperationCond getOperationCond() {
    return operationCond;
  }

  public void setOperationCond(V1OperationCond operationCond) {
    this.operationCond = operationCond;
  }

  public V1Schemas earlyStopping(V1EarlyStopping earlyStopping) {
    this.earlyStopping = earlyStopping;
    return this;
  }

   /**
   * Get earlyStopping
   * @return earlyStopping
  **/
  @ApiModelProperty(value = "")
  public V1EarlyStopping getEarlyStopping() {
    return earlyStopping;
  }

  public void setEarlyStopping(V1EarlyStopping earlyStopping) {
    this.earlyStopping = earlyStopping;
  }

  public V1Schemas parallel(V1Parallel parallel) {
    this.parallel = parallel;
    return this;
  }

   /**
   * Get parallel
   * @return parallel
  **/
  @ApiModelProperty(value = "")
  public V1Parallel getParallel() {
    return parallel;
  }

  public void setParallel(V1Parallel parallel) {
    this.parallel = parallel;
  }

  public V1Schemas run(V1RunSchema run) {
    this.run = run;
    return this;
  }

   /**
   * Get run
   * @return run
  **/
  @ApiModelProperty(value = "")
  public V1RunSchema getRun() {
    return run;
  }

  public void setRun(V1RunSchema run) {
    this.run = run;
  }

  public V1Schemas compiledOperation(V1CompiledOperation compiledOperation) {
    this.compiledOperation = compiledOperation;
    return this;
  }

   /**
   * Get compiledOperation
   * @return compiledOperation
  **/
  @ApiModelProperty(value = "")
  public V1CompiledOperation getCompiledOperation() {
    return compiledOperation;
  }

  public void setCompiledOperation(V1CompiledOperation compiledOperation) {
    this.compiledOperation = compiledOperation;
  }

  public V1Schemas schedule(V1Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(value = "")
  public V1Schedule getSchedule() {
    return schedule;
  }

  public void setSchedule(V1Schedule schedule) {
    this.schedule = schedule;
  }

  public V1Schemas connectionSchema(V1ConnectionSchema connectionSchema) {
    this.connectionSchema = connectionSchema;
    return this;
  }

   /**
   * Get connectionSchema
   * @return connectionSchema
  **/
  @ApiModelProperty(value = "")
  public V1ConnectionSchema getConnectionSchema() {
    return connectionSchema;
  }

  public void setConnectionSchema(V1ConnectionSchema connectionSchema) {
    this.connectionSchema = connectionSchema;
  }

  public V1Schemas matrix(V1Matrix matrix) {
    this.matrix = matrix;
    return this;
  }

   /**
   * Get matrix
   * @return matrix
  **/
  @ApiModelProperty(value = "")
  public V1Matrix getMatrix() {
    return matrix;
  }

  public void setMatrix(V1Matrix matrix) {
    this.matrix = matrix;
  }

  public V1Schemas refrence(V1Reference refrence) {
    this.refrence = refrence;
    return this;
  }

   /**
   * Get refrence
   * @return refrence
  **/
  @ApiModelProperty(value = "")
  public V1Reference getRefrence() {
    return refrence;
  }

  public void setRefrence(V1Reference refrence) {
    this.refrence = refrence;
  }

  public V1Schemas artifactsMount(V1ArtifactsMount artifactsMount) {
    this.artifactsMount = artifactsMount;
    return this;
  }

   /**
   * Get artifactsMount
   * @return artifactsMount
  **/
  @ApiModelProperty(value = "")
  public V1ArtifactsMount getArtifactsMount() {
    return artifactsMount;
  }

  public void setArtifactsMount(V1ArtifactsMount artifactsMount) {
    this.artifactsMount = artifactsMount;
  }

  public V1Schemas polyaxonSidecarContainer(V1PolyaxonSidecarContainer polyaxonSidecarContainer) {
    this.polyaxonSidecarContainer = polyaxonSidecarContainer;
    return this;
  }

   /**
   * Get polyaxonSidecarContainer
   * @return polyaxonSidecarContainer
  **/
  @ApiModelProperty(value = "")
  public V1PolyaxonSidecarContainer getPolyaxonSidecarContainer() {
    return polyaxonSidecarContainer;
  }

  public void setPolyaxonSidecarContainer(V1PolyaxonSidecarContainer polyaxonSidecarContainer) {
    this.polyaxonSidecarContainer = polyaxonSidecarContainer;
  }

  public V1Schemas polyaxonInitContainer(V1PolyaxonInitContainer polyaxonInitContainer) {
    this.polyaxonInitContainer = polyaxonInitContainer;
    return this;
  }

   /**
   * Get polyaxonInitContainer
   * @return polyaxonInitContainer
  **/
  @ApiModelProperty(value = "")
  public V1PolyaxonInitContainer getPolyaxonInitContainer() {
    return polyaxonInitContainer;
  }

  public void setPolyaxonInitContainer(V1PolyaxonInitContainer polyaxonInitContainer) {
    this.polyaxonInitContainer = polyaxonInitContainer;
  }

  public V1Schemas artifacs(V1ArtifactsType artifacs) {
    this.artifacs = artifacs;
    return this;
  }

   /**
   * Get artifacs
   * @return artifacs
  **/
  @ApiModelProperty(value = "")
  public V1ArtifactsType getArtifacs() {
    return artifacs;
  }

  public void setArtifacs(V1ArtifactsType artifacs) {
    this.artifacs = artifacs;
  }

  public V1Schemas wasb(V1WasbType wasb) {
    this.wasb = wasb;
    return this;
  }

   /**
   * Get wasb
   * @return wasb
  **/
  @ApiModelProperty(value = "")
  public V1WasbType getWasb() {
    return wasb;
  }

  public void setWasb(V1WasbType wasb) {
    this.wasb = wasb;
  }

  public V1Schemas gcs(V1GcsType gcs) {
    this.gcs = gcs;
    return this;
  }

   /**
   * Get gcs
   * @return gcs
  **/
  @ApiModelProperty(value = "")
  public V1GcsType getGcs() {
    return gcs;
  }

  public void setGcs(V1GcsType gcs) {
    this.gcs = gcs;
  }

  public V1Schemas s3(V1S3Type s3) {
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @ApiModelProperty(value = "")
  public V1S3Type getS3() {
    return s3;
  }

  public void setS3(V1S3Type s3) {
    this.s3 = s3;
  }

  public V1Schemas autg(V1AuthType autg) {
    this.autg = autg;
    return this;
  }

   /**
   * Get autg
   * @return autg
  **/
  @ApiModelProperty(value = "")
  public V1AuthType getAutg() {
    return autg;
  }

  public void setAutg(V1AuthType autg) {
    this.autg = autg;
  }

  public V1Schemas dockerfile(V1DockerfileType dockerfile) {
    this.dockerfile = dockerfile;
    return this;
  }

   /**
   * Get dockerfile
   * @return dockerfile
  **/
  @ApiModelProperty(value = "")
  public V1DockerfileType getDockerfile() {
    return dockerfile;
  }

  public void setDockerfile(V1DockerfileType dockerfile) {
    this.dockerfile = dockerfile;
  }

  public V1Schemas git(V1GitType git) {
    this.git = git;
    return this;
  }

   /**
   * Get git
   * @return git
  **/
  @ApiModelProperty(value = "")
  public V1GitType getGit() {
    return git;
  }

  public void setGit(V1GitType git) {
    this.git = git;
  }

  public V1Schemas uri(V1UriType uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(value = "")
  public V1UriType getUri() {
    return uri;
  }

  public void setUri(V1UriType uri) {
    this.uri = uri;
  }

  public V1Schemas k8sResource(V1K8sResourceType k8sResource) {
    this.k8sResource = k8sResource;
    return this;
  }

   /**
   * Get k8sResource
   * @return k8sResource
  **/
  @ApiModelProperty(value = "")
  public V1K8sResourceType getK8sResource() {
    return k8sResource;
  }

  public void setK8sResource(V1K8sResourceType k8sResource) {
    this.k8sResource = k8sResource;
  }

  public V1Schemas connection(V1ConnectionType connection) {
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  @ApiModelProperty(value = "")
  public V1ConnectionType getConnection() {
    return connection;
  }

  public void setConnection(V1ConnectionType connection) {
    this.connection = connection;
  }

  public V1Schemas image(V1ImageType image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")
  public V1ImageType getImage() {
    return image;
  }

  public void setImage(V1ImageType image) {
    this.image = image;
  }

  public V1Schemas eventType(V1EventType eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(value = "")
  public V1EventType getEventType() {
    return eventType;
  }

  public void setEventType(V1EventType eventType) {
    this.eventType = eventType;
  }

  public V1Schemas event(V1Event event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @ApiModelProperty(value = "")
  public V1Event getEvent() {
    return event;
  }

  public void setEvent(V1Event event) {
    this.event = event;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Schemas v1Schemas = (V1Schemas) o;
    return Objects.equals(this.operationCond, v1Schemas.operationCond) &&
        Objects.equals(this.earlyStopping, v1Schemas.earlyStopping) &&
        Objects.equals(this.parallel, v1Schemas.parallel) &&
        Objects.equals(this.run, v1Schemas.run) &&
        Objects.equals(this.compiledOperation, v1Schemas.compiledOperation) &&
        Objects.equals(this.schedule, v1Schemas.schedule) &&
        Objects.equals(this.connectionSchema, v1Schemas.connectionSchema) &&
        Objects.equals(this.matrix, v1Schemas.matrix) &&
        Objects.equals(this.refrence, v1Schemas.refrence) &&
        Objects.equals(this.artifactsMount, v1Schemas.artifactsMount) &&
        Objects.equals(this.polyaxonSidecarContainer, v1Schemas.polyaxonSidecarContainer) &&
        Objects.equals(this.polyaxonInitContainer, v1Schemas.polyaxonInitContainer) &&
        Objects.equals(this.artifacs, v1Schemas.artifacs) &&
        Objects.equals(this.wasb, v1Schemas.wasb) &&
        Objects.equals(this.gcs, v1Schemas.gcs) &&
        Objects.equals(this.s3, v1Schemas.s3) &&
        Objects.equals(this.autg, v1Schemas.autg) &&
        Objects.equals(this.dockerfile, v1Schemas.dockerfile) &&
        Objects.equals(this.git, v1Schemas.git) &&
        Objects.equals(this.uri, v1Schemas.uri) &&
        Objects.equals(this.k8sResource, v1Schemas.k8sResource) &&
        Objects.equals(this.connection, v1Schemas.connection) &&
        Objects.equals(this.image, v1Schemas.image) &&
        Objects.equals(this.eventType, v1Schemas.eventType) &&
        Objects.equals(this.event, v1Schemas.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationCond, earlyStopping, parallel, run, compiledOperation, schedule, connectionSchema, matrix, refrence, artifactsMount, polyaxonSidecarContainer, polyaxonInitContainer, artifacs, wasb, gcs, s3, autg, dockerfile, git, uri, k8sResource, connection, image, eventType, event);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Schemas {\n");
    
    sb.append("    operationCond: ").append(toIndentedString(operationCond)).append("\n");
    sb.append("    earlyStopping: ").append(toIndentedString(earlyStopping)).append("\n");
    sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
    sb.append("    run: ").append(toIndentedString(run)).append("\n");
    sb.append("    compiledOperation: ").append(toIndentedString(compiledOperation)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    connectionSchema: ").append(toIndentedString(connectionSchema)).append("\n");
    sb.append("    matrix: ").append(toIndentedString(matrix)).append("\n");
    sb.append("    refrence: ").append(toIndentedString(refrence)).append("\n");
    sb.append("    artifactsMount: ").append(toIndentedString(artifactsMount)).append("\n");
    sb.append("    polyaxonSidecarContainer: ").append(toIndentedString(polyaxonSidecarContainer)).append("\n");
    sb.append("    polyaxonInitContainer: ").append(toIndentedString(polyaxonInitContainer)).append("\n");
    sb.append("    artifacs: ").append(toIndentedString(artifacs)).append("\n");
    sb.append("    wasb: ").append(toIndentedString(wasb)).append("\n");
    sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
    sb.append("    autg: ").append(toIndentedString(autg)).append("\n");
    sb.append("    dockerfile: ").append(toIndentedString(dockerfile)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    k8sResource: ").append(toIndentedString(k8sResource)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

