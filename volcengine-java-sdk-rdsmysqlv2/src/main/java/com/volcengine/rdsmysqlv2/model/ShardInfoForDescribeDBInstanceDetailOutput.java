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
import com.volcengine.rdsmysqlv2.model.NodeDetailInfoForDescribeDBInstanceDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ShardInfoForDescribeDBInstanceDetailOutput
 */


public class ShardInfoForDescribeDBInstanceDetailOutput {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("NodeDetailInfo")
  private List<NodeDetailInfoForDescribeDBInstanceDetailOutput> nodeDetailInfo = null;

  @SerializedName("ShardId")
  private String shardId = null;

  @SerializedName("ShardStatus")
  private String shardStatus = null;

  public ShardInfoForDescribeDBInstanceDetailOutput instanceId(String instanceId) {
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

  public ShardInfoForDescribeDBInstanceDetailOutput nodeDetailInfo(List<NodeDetailInfoForDescribeDBInstanceDetailOutput> nodeDetailInfo) {
    this.nodeDetailInfo = nodeDetailInfo;
    return this;
  }

  public ShardInfoForDescribeDBInstanceDetailOutput addNodeDetailInfoItem(NodeDetailInfoForDescribeDBInstanceDetailOutput nodeDetailInfoItem) {
    if (this.nodeDetailInfo == null) {
      this.nodeDetailInfo = new ArrayList<NodeDetailInfoForDescribeDBInstanceDetailOutput>();
    }
    this.nodeDetailInfo.add(nodeDetailInfoItem);
    return this;
  }

   /**
   * Get nodeDetailInfo
   * @return nodeDetailInfo
  **/
  @Valid
  @Schema(description = "")
  public List<NodeDetailInfoForDescribeDBInstanceDetailOutput> getNodeDetailInfo() {
    return nodeDetailInfo;
  }

  public void setNodeDetailInfo(List<NodeDetailInfoForDescribeDBInstanceDetailOutput> nodeDetailInfo) {
    this.nodeDetailInfo = nodeDetailInfo;
  }

  public ShardInfoForDescribeDBInstanceDetailOutput shardId(String shardId) {
    this.shardId = shardId;
    return this;
  }

   /**
   * Get shardId
   * @return shardId
  **/
  @Schema(description = "")
  public String getShardId() {
    return shardId;
  }

  public void setShardId(String shardId) {
    this.shardId = shardId;
  }

  public ShardInfoForDescribeDBInstanceDetailOutput shardStatus(String shardStatus) {
    this.shardStatus = shardStatus;
    return this;
  }

   /**
   * Get shardStatus
   * @return shardStatus
  **/
  @Schema(description = "")
  public String getShardStatus() {
    return shardStatus;
  }

  public void setShardStatus(String shardStatus) {
    this.shardStatus = shardStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShardInfoForDescribeDBInstanceDetailOutput shardInfoForDescribeDBInstanceDetailOutput = (ShardInfoForDescribeDBInstanceDetailOutput) o;
    return Objects.equals(this.instanceId, shardInfoForDescribeDBInstanceDetailOutput.instanceId) &&
        Objects.equals(this.nodeDetailInfo, shardInfoForDescribeDBInstanceDetailOutput.nodeDetailInfo) &&
        Objects.equals(this.shardId, shardInfoForDescribeDBInstanceDetailOutput.shardId) &&
        Objects.equals(this.shardStatus, shardInfoForDescribeDBInstanceDetailOutput.shardStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, nodeDetailInfo, shardId, shardStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShardInfoForDescribeDBInstanceDetailOutput {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    nodeDetailInfo: ").append(toIndentedString(nodeDetailInfo)).append("\n");
    sb.append("    shardId: ").append(toIndentedString(shardId)).append("\n");
    sb.append("    shardStatus: ").append(toIndentedString(shardStatus)).append("\n");
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
