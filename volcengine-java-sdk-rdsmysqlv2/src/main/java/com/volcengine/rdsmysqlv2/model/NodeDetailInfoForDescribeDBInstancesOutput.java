/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

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
 * NodeDetailInfoForDescribeDBInstancesOutput
 */


public class NodeDetailInfoForDescribeDBInstancesOutput {
  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Memory")
  private Integer memory = null;

  @SerializedName("NodeId")
  private String nodeId = null;

  @SerializedName("NodeSpec")
  private String nodeSpec = null;

  @SerializedName("NodeStatus")
  private String nodeStatus = null;

  @SerializedName("NodeType")
  private String nodeType = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VCPU")
  private Integer VCPU = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public NodeDetailInfoForDescribeDBInstancesOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public NodeDetailInfoForDescribeDBInstancesOutput instanceId(String instanceId) {
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

  public NodeDetailInfoForDescribeDBInstancesOutput memory(Integer memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @Schema(description = "")
  public Integer getMemory() {
    return memory;
  }

  public void setMemory(Integer memory) {
    this.memory = memory;
  }

  public NodeDetailInfoForDescribeDBInstancesOutput nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @Schema(description = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public NodeDetailInfoForDescribeDBInstancesOutput nodeSpec(String nodeSpec) {
    this.nodeSpec = nodeSpec;
    return this;
  }

   /**
   * Get nodeSpec
   * @return nodeSpec
  **/
  @Schema(description = "")
  public String getNodeSpec() {
    return nodeSpec;
  }

  public void setNodeSpec(String nodeSpec) {
    this.nodeSpec = nodeSpec;
  }

  public NodeDetailInfoForDescribeDBInstancesOutput nodeStatus(String nodeStatus) {
    this.nodeStatus = nodeStatus;
    return this;
  }

   /**
   * Get nodeStatus
   * @return nodeStatus
  **/
  @Schema(description = "")
  public String getNodeStatus() {
    return nodeStatus;
  }

  public void setNodeStatus(String nodeStatus) {
    this.nodeStatus = nodeStatus;
  }

  public NodeDetailInfoForDescribeDBInstancesOutput nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @Schema(description = "")
  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public NodeDetailInfoForDescribeDBInstancesOutput regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @Schema(description = "")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public NodeDetailInfoForDescribeDBInstancesOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public NodeDetailInfoForDescribeDBInstancesOutput VCPU(Integer VCPU) {
    this.VCPU = VCPU;
    return this;
  }

   /**
   * Get VCPU
   * @return VCPU
  **/
  @Schema(description = "")
  public Integer getVCPU() {
    return VCPU;
  }

  public void setVCPU(Integer VCPU) {
    this.VCPU = VCPU;
  }

  public NodeDetailInfoForDescribeDBInstancesOutput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeDetailInfoForDescribeDBInstancesOutput nodeDetailInfoForDescribeDBInstancesOutput = (NodeDetailInfoForDescribeDBInstancesOutput) o;
    return Objects.equals(this.createTime, nodeDetailInfoForDescribeDBInstancesOutput.createTime) &&
        Objects.equals(this.instanceId, nodeDetailInfoForDescribeDBInstancesOutput.instanceId) &&
        Objects.equals(this.memory, nodeDetailInfoForDescribeDBInstancesOutput.memory) &&
        Objects.equals(this.nodeId, nodeDetailInfoForDescribeDBInstancesOutput.nodeId) &&
        Objects.equals(this.nodeSpec, nodeDetailInfoForDescribeDBInstancesOutput.nodeSpec) &&
        Objects.equals(this.nodeStatus, nodeDetailInfoForDescribeDBInstancesOutput.nodeStatus) &&
        Objects.equals(this.nodeType, nodeDetailInfoForDescribeDBInstancesOutput.nodeType) &&
        Objects.equals(this.regionId, nodeDetailInfoForDescribeDBInstancesOutput.regionId) &&
        Objects.equals(this.updateTime, nodeDetailInfoForDescribeDBInstancesOutput.updateTime) &&
        Objects.equals(this.VCPU, nodeDetailInfoForDescribeDBInstancesOutput.VCPU) &&
        Objects.equals(this.zoneId, nodeDetailInfoForDescribeDBInstancesOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, instanceId, memory, nodeId, nodeSpec, nodeStatus, nodeType, regionId, updateTime, VCPU, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeDetailInfoForDescribeDBInstancesOutput {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    nodeSpec: ").append(toIndentedString(nodeSpec)).append("\n");
    sb.append("    nodeStatus: ").append(toIndentedString(nodeStatus)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    VCPU: ").append(toIndentedString(VCPU)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
