/*
 * cen
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cen.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeCenAttachedInstanceAttributesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:24.026407+08:00[Asia/Shanghai]")
public class DescribeCenAttachedInstanceAttributesResponse {
  @SerializedName("CenId")
  private String cenId = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceOwnerId")
  private String instanceOwnerId = null;

  @SerializedName("InstanceRegionId")
  private String instanceRegionId = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("Status")
  private String status = null;

  public DescribeCenAttachedInstanceAttributesResponse cenId(String cenId) {
    this.cenId = cenId;
    return this;
  }

   /**
   * Get cenId
   * @return cenId
  **/
  @Schema(description = "")
  public String getCenId() {
    return cenId;
  }

  public void setCenId(String cenId) {
    this.cenId = cenId;
  }

  public DescribeCenAttachedInstanceAttributesResponse instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public DescribeCenAttachedInstanceAttributesResponse instanceOwnerId(String instanceOwnerId) {
    this.instanceOwnerId = instanceOwnerId;
    return this;
  }

   /**
   * Get instanceOwnerId
   * @return instanceOwnerId
  **/
  @Schema(description = "")
  public String getInstanceOwnerId() {
    return instanceOwnerId;
  }

  public void setInstanceOwnerId(String instanceOwnerId) {
    this.instanceOwnerId = instanceOwnerId;
  }

  public DescribeCenAttachedInstanceAttributesResponse instanceRegionId(String instanceRegionId) {
    this.instanceRegionId = instanceRegionId;
    return this;
  }

   /**
   * Get instanceRegionId
   * @return instanceRegionId
  **/
  @Schema(description = "")
  public String getInstanceRegionId() {
    return instanceRegionId;
  }

  public void setInstanceRegionId(String instanceRegionId) {
    this.instanceRegionId = instanceRegionId;
  }

  public DescribeCenAttachedInstanceAttributesResponse instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public DescribeCenAttachedInstanceAttributesResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCenAttachedInstanceAttributesResponse describeCenAttachedInstanceAttributesResponse = (DescribeCenAttachedInstanceAttributesResponse) o;
    return Objects.equals(this.cenId, describeCenAttachedInstanceAttributesResponse.cenId) &&
        Objects.equals(this.instanceId, describeCenAttachedInstanceAttributesResponse.instanceId) &&
        Objects.equals(this.instanceOwnerId, describeCenAttachedInstanceAttributesResponse.instanceOwnerId) &&
        Objects.equals(this.instanceRegionId, describeCenAttachedInstanceAttributesResponse.instanceRegionId) &&
        Objects.equals(this.instanceType, describeCenAttachedInstanceAttributesResponse.instanceType) &&
        Objects.equals(this.status, describeCenAttachedInstanceAttributesResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cenId, instanceId, instanceOwnerId, instanceRegionId, instanceType, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCenAttachedInstanceAttributesResponse {\n");
    
    sb.append("    cenId: ").append(toIndentedString(cenId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceOwnerId: ").append(toIndentedString(instanceOwnerId)).append("\n");
    sb.append("    instanceRegionId: ").append(toIndentedString(instanceRegionId)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
