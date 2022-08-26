/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.alb.model.HealthCheckForDescribeServerGroupsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ServerGroupForDescribeServerGroupsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-26T18:47:55.368678+08:00[Asia/Shanghai]")
public class ServerGroupForDescribeServerGroupsOutput {
  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("HealthCheck")
  private HealthCheckForDescribeServerGroupsOutput healthCheck = null;

  @SerializedName("Listeners")
  private List<String> listeners = null;

  @SerializedName("Scheduler")
  private String scheduler = null;

  @SerializedName("ServerCount")
  private Integer serverCount = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  @SerializedName("ServerGroupName")
  private String serverGroupName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public ServerGroupForDescribeServerGroupsOutput createTime(String createTime) {
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

  public ServerGroupForDescribeServerGroupsOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServerGroupForDescribeServerGroupsOutput healthCheck(HealthCheckForDescribeServerGroupsOutput healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

   /**
   * Get healthCheck
   * @return healthCheck
  **/
  @Valid
  @Schema(description = "")
  public HealthCheckForDescribeServerGroupsOutput getHealthCheck() {
    return healthCheck;
  }

  public void setHealthCheck(HealthCheckForDescribeServerGroupsOutput healthCheck) {
    this.healthCheck = healthCheck;
  }

  public ServerGroupForDescribeServerGroupsOutput listeners(List<String> listeners) {
    this.listeners = listeners;
    return this;
  }

  public ServerGroupForDescribeServerGroupsOutput addListenersItem(String listenersItem) {
    if (this.listeners == null) {
      this.listeners = new ArrayList<String>();
    }
    this.listeners.add(listenersItem);
    return this;
  }

   /**
   * Get listeners
   * @return listeners
  **/
  @Schema(description = "")
  public List<String> getListeners() {
    return listeners;
  }

  public void setListeners(List<String> listeners) {
    this.listeners = listeners;
  }

  public ServerGroupForDescribeServerGroupsOutput scheduler(String scheduler) {
    this.scheduler = scheduler;
    return this;
  }

   /**
   * Get scheduler
   * @return scheduler
  **/
  @Schema(description = "")
  public String getScheduler() {
    return scheduler;
  }

  public void setScheduler(String scheduler) {
    this.scheduler = scheduler;
  }

  public ServerGroupForDescribeServerGroupsOutput serverCount(Integer serverCount) {
    this.serverCount = serverCount;
    return this;
  }

   /**
   * Get serverCount
   * @return serverCount
  **/
  @Schema(description = "")
  public Integer getServerCount() {
    return serverCount;
  }

  public void setServerCount(Integer serverCount) {
    this.serverCount = serverCount;
  }

  public ServerGroupForDescribeServerGroupsOutput serverGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
    return this;
  }

   /**
   * Get serverGroupId
   * @return serverGroupId
  **/
  @Schema(description = "")
  public String getServerGroupId() {
    return serverGroupId;
  }

  public void setServerGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
  }

  public ServerGroupForDescribeServerGroupsOutput serverGroupName(String serverGroupName) {
    this.serverGroupName = serverGroupName;
    return this;
  }

   /**
   * Get serverGroupName
   * @return serverGroupName
  **/
  @Schema(description = "")
  public String getServerGroupName() {
    return serverGroupName;
  }

  public void setServerGroupName(String serverGroupName) {
    this.serverGroupName = serverGroupName;
  }

  public ServerGroupForDescribeServerGroupsOutput status(String status) {
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

  public ServerGroupForDescribeServerGroupsOutput updateTime(String updateTime) {
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

  public ServerGroupForDescribeServerGroupsOutput vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerGroupForDescribeServerGroupsOutput serverGroupForDescribeServerGroupsOutput = (ServerGroupForDescribeServerGroupsOutput) o;
    return Objects.equals(this.createTime, serverGroupForDescribeServerGroupsOutput.createTime) &&
        Objects.equals(this.description, serverGroupForDescribeServerGroupsOutput.description) &&
        Objects.equals(this.healthCheck, serverGroupForDescribeServerGroupsOutput.healthCheck) &&
        Objects.equals(this.listeners, serverGroupForDescribeServerGroupsOutput.listeners) &&
        Objects.equals(this.scheduler, serverGroupForDescribeServerGroupsOutput.scheduler) &&
        Objects.equals(this.serverCount, serverGroupForDescribeServerGroupsOutput.serverCount) &&
        Objects.equals(this.serverGroupId, serverGroupForDescribeServerGroupsOutput.serverGroupId) &&
        Objects.equals(this.serverGroupName, serverGroupForDescribeServerGroupsOutput.serverGroupName) &&
        Objects.equals(this.status, serverGroupForDescribeServerGroupsOutput.status) &&
        Objects.equals(this.updateTime, serverGroupForDescribeServerGroupsOutput.updateTime) &&
        Objects.equals(this.vpcId, serverGroupForDescribeServerGroupsOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, description, healthCheck, listeners, scheduler, serverCount, serverGroupId, serverGroupName, status, updateTime, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerGroupForDescribeServerGroupsOutput {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
    sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
    sb.append("    scheduler: ").append(toIndentedString(scheduler)).append("\n");
    sb.append("    serverCount: ").append(toIndentedString(serverCount)).append("\n");
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
    sb.append("    serverGroupName: ").append(toIndentedString(serverGroupName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
