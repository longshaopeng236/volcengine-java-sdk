/*
 * volc_observe
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcobserve.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcobserve.model.InstanceForGetMetricDataInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetMetricDataRequest
 */


public class GetMetricDataRequest {
  @SerializedName("EndTime")
  private Integer endTime = null;

  @SerializedName("Instances")
  private List<InstanceForGetMetricDataInput> instances = null;

  @SerializedName("MetricName")
  private String metricName = null;

  @SerializedName("Namespace")
  private String namespace = null;

  @SerializedName("Period")
  private String period = null;

  @SerializedName("StartTime")
  private Integer startTime = null;

  @SerializedName("SubNamespace")
  private String subNamespace = null;

  public GetMetricDataRequest endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public GetMetricDataRequest instances(List<InstanceForGetMetricDataInput> instances) {
    this.instances = instances;
    return this;
  }

  public GetMetricDataRequest addInstancesItem(InstanceForGetMetricDataInput instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<InstanceForGetMetricDataInput>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Get instances
   * @return instances
  **/
  @Valid
  @Schema(description = "")
  public List<InstanceForGetMetricDataInput> getInstances() {
    return instances;
  }

  public void setInstances(List<InstanceForGetMetricDataInput> instances) {
    this.instances = instances;
  }

  public GetMetricDataRequest metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

   /**
   * Get metricName
   * @return metricName
  **/
  @Schema(description = "")
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public GetMetricDataRequest namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @Schema(description = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public GetMetricDataRequest period(String period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public GetMetricDataRequest startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public GetMetricDataRequest subNamespace(String subNamespace) {
    this.subNamespace = subNamespace;
    return this;
  }

   /**
   * Get subNamespace
   * @return subNamespace
  **/
  @Schema(description = "")
  public String getSubNamespace() {
    return subNamespace;
  }

  public void setSubNamespace(String subNamespace) {
    this.subNamespace = subNamespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMetricDataRequest getMetricDataRequest = (GetMetricDataRequest) o;
    return Objects.equals(this.endTime, getMetricDataRequest.endTime) &&
        Objects.equals(this.instances, getMetricDataRequest.instances) &&
        Objects.equals(this.metricName, getMetricDataRequest.metricName) &&
        Objects.equals(this.namespace, getMetricDataRequest.namespace) &&
        Objects.equals(this.period, getMetricDataRequest.period) &&
        Objects.equals(this.startTime, getMetricDataRequest.startTime) &&
        Objects.equals(this.subNamespace, getMetricDataRequest.subNamespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, instances, metricName, namespace, period, startTime, subNamespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMetricDataRequest {\n");
    
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    subNamespace: ").append(toIndentedString(subNamespace)).append("\n");
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
