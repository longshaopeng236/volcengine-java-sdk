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
 * DescribeCenRouteEntriesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:24.026407+08:00[Asia/Shanghai]")
public class DescribeCenRouteEntriesRequest {
  @SerializedName("CenId")
  private String cenId = null;

  @SerializedName("DestinationCidrBlock")
  private String destinationCidrBlock = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceRegionId")
  private String instanceRegionId = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  public DescribeCenRouteEntriesRequest cenId(String cenId) {
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

  public DescribeCenRouteEntriesRequest destinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
    return this;
  }

   /**
   * Get destinationCidrBlock
   * @return destinationCidrBlock
  **/
  @Schema(description = "")
  public String getDestinationCidrBlock() {
    return destinationCidrBlock;
  }

  public void setDestinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
  }

  public DescribeCenRouteEntriesRequest instanceId(String instanceId) {
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

  public DescribeCenRouteEntriesRequest instanceRegionId(String instanceRegionId) {
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

  public DescribeCenRouteEntriesRequest instanceType(String instanceType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCenRouteEntriesRequest describeCenRouteEntriesRequest = (DescribeCenRouteEntriesRequest) o;
    return Objects.equals(this.cenId, describeCenRouteEntriesRequest.cenId) &&
        Objects.equals(this.destinationCidrBlock, describeCenRouteEntriesRequest.destinationCidrBlock) &&
        Objects.equals(this.instanceId, describeCenRouteEntriesRequest.instanceId) &&
        Objects.equals(this.instanceRegionId, describeCenRouteEntriesRequest.instanceRegionId) &&
        Objects.equals(this.instanceType, describeCenRouteEntriesRequest.instanceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cenId, destinationCidrBlock, instanceId, instanceRegionId, instanceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCenRouteEntriesRequest {\n");
    
    sb.append("    cenId: ").append(toIndentedString(cenId)).append("\n");
    sb.append("    destinationCidrBlock: ").append(toIndentedString(destinationCidrBlock)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceRegionId: ").append(toIndentedString(instanceRegionId)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
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
