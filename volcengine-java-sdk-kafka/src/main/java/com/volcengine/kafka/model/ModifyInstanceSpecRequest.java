/*
 * kafka
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kafka.model;

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
 * ModifyInstanceSpecRequest
 */


public class ModifyInstanceSpecRequest {
  @SerializedName("ComputeSpec")
  private String computeSpec = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("NeedRebalance")
  private Boolean needRebalance = null;

  @SerializedName("PartitionNumber")
  private Integer partitionNumber = null;

  @SerializedName("RebalanceTime")
  private String rebalanceTime = null;

  @SerializedName("StorageSpace")
  private Integer storageSpace = null;

  public ModifyInstanceSpecRequest computeSpec(String computeSpec) {
    this.computeSpec = computeSpec;
    return this;
  }

   /**
   * Get computeSpec
   * @return computeSpec
  **/
  @Schema(description = "")
  public String getComputeSpec() {
    return computeSpec;
  }

  public void setComputeSpec(String computeSpec) {
    this.computeSpec = computeSpec;
  }

  public ModifyInstanceSpecRequest instanceId(String instanceId) {
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

  public ModifyInstanceSpecRequest needRebalance(Boolean needRebalance) {
    this.needRebalance = needRebalance;
    return this;
  }

   /**
   * Get needRebalance
   * @return needRebalance
  **/
  @Schema(description = "")
  public Boolean isNeedRebalance() {
    return needRebalance;
  }

  public void setNeedRebalance(Boolean needRebalance) {
    this.needRebalance = needRebalance;
  }

  public ModifyInstanceSpecRequest partitionNumber(Integer partitionNumber) {
    this.partitionNumber = partitionNumber;
    return this;
  }

   /**
   * Get partitionNumber
   * @return partitionNumber
  **/
  @Schema(description = "")
  public Integer getPartitionNumber() {
    return partitionNumber;
  }

  public void setPartitionNumber(Integer partitionNumber) {
    this.partitionNumber = partitionNumber;
  }

  public ModifyInstanceSpecRequest rebalanceTime(String rebalanceTime) {
    this.rebalanceTime = rebalanceTime;
    return this;
  }

   /**
   * Get rebalanceTime
   * @return rebalanceTime
  **/
  @Schema(description = "")
  public String getRebalanceTime() {
    return rebalanceTime;
  }

  public void setRebalanceTime(String rebalanceTime) {
    this.rebalanceTime = rebalanceTime;
  }

  public ModifyInstanceSpecRequest storageSpace(Integer storageSpace) {
    this.storageSpace = storageSpace;
    return this;
  }

   /**
   * Get storageSpace
   * @return storageSpace
  **/
  @Schema(description = "")
  public Integer getStorageSpace() {
    return storageSpace;
  }

  public void setStorageSpace(Integer storageSpace) {
    this.storageSpace = storageSpace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyInstanceSpecRequest modifyInstanceSpecRequest = (ModifyInstanceSpecRequest) o;
    return Objects.equals(this.computeSpec, modifyInstanceSpecRequest.computeSpec) &&
        Objects.equals(this.instanceId, modifyInstanceSpecRequest.instanceId) &&
        Objects.equals(this.needRebalance, modifyInstanceSpecRequest.needRebalance) &&
        Objects.equals(this.partitionNumber, modifyInstanceSpecRequest.partitionNumber) &&
        Objects.equals(this.rebalanceTime, modifyInstanceSpecRequest.rebalanceTime) &&
        Objects.equals(this.storageSpace, modifyInstanceSpecRequest.storageSpace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computeSpec, instanceId, needRebalance, partitionNumber, rebalanceTime, storageSpace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyInstanceSpecRequest {\n");
    
    sb.append("    computeSpec: ").append(toIndentedString(computeSpec)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    needRebalance: ").append(toIndentedString(needRebalance)).append("\n");
    sb.append("    partitionNumber: ").append(toIndentedString(partitionNumber)).append("\n");
    sb.append("    rebalanceTime: ").append(toIndentedString(rebalanceTime)).append("\n");
    sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
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