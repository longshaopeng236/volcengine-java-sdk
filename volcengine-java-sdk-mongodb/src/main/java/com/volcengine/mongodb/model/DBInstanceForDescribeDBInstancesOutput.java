/*
 * mongodb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mongodb.model;

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
 * DBInstanceForDescribeDBInstancesOutput
 */


public class DBInstanceForDescribeDBInstancesOutput {
  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  @SerializedName("ChargeStatus")
  private String chargeStatus = null;

  @SerializedName("ChargeType")
  private String chargeType = null;

  @SerializedName("ClosedTime")
  private String closedTime = null;

  @SerializedName("ConfigServersId")
  private String configServersId = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("DBEngine")
  private String dbEngine = null;

  @SerializedName("DBEngineVersion")
  private String dbEngineVersion = null;

  @SerializedName("DBEngineVersionStr")
  private String dbEngineVersionStr = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceStatus")
  private String instanceStatus = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("MongosId")
  private String mongosId = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("ReclaimTime")
  private String reclaimTime = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public DBInstanceForDescribeDBInstancesOutput autoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
    return this;
  }

   /**
   * Get autoRenew
   * @return autoRenew
  **/
  @Schema(description = "")
  public Boolean isAutoRenew() {
    return autoRenew;
  }

  public void setAutoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  public DBInstanceForDescribeDBInstancesOutput chargeStatus(String chargeStatus) {
    this.chargeStatus = chargeStatus;
    return this;
  }

   /**
   * Get chargeStatus
   * @return chargeStatus
  **/
  @Schema(description = "")
  public String getChargeStatus() {
    return chargeStatus;
  }

  public void setChargeStatus(String chargeStatus) {
    this.chargeStatus = chargeStatus;
  }

  public DBInstanceForDescribeDBInstancesOutput chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @Schema(description = "")
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public DBInstanceForDescribeDBInstancesOutput closedTime(String closedTime) {
    this.closedTime = closedTime;
    return this;
  }

   /**
   * Get closedTime
   * @return closedTime
  **/
  @Schema(description = "")
  public String getClosedTime() {
    return closedTime;
  }

  public void setClosedTime(String closedTime) {
    this.closedTime = closedTime;
  }

  public DBInstanceForDescribeDBInstancesOutput configServersId(String configServersId) {
    this.configServersId = configServersId;
    return this;
  }

   /**
   * Get configServersId
   * @return configServersId
  **/
  @Schema(description = "")
  public String getConfigServersId() {
    return configServersId;
  }

  public void setConfigServersId(String configServersId) {
    this.configServersId = configServersId;
  }

  public DBInstanceForDescribeDBInstancesOutput createTime(String createTime) {
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

  public DBInstanceForDescribeDBInstancesOutput dbEngine(String dbEngine) {
    this.dbEngine = dbEngine;
    return this;
  }

   /**
   * Get dbEngine
   * @return dbEngine
  **/
  @Schema(description = "")
  public String getDbEngine() {
    return dbEngine;
  }

  public void setDbEngine(String dbEngine) {
    this.dbEngine = dbEngine;
  }

  public DBInstanceForDescribeDBInstancesOutput dbEngineVersion(String dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
    return this;
  }

   /**
   * Get dbEngineVersion
   * @return dbEngineVersion
  **/
  @Schema(description = "")
  public String getDbEngineVersion() {
    return dbEngineVersion;
  }

  public void setDbEngineVersion(String dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
  }

  public DBInstanceForDescribeDBInstancesOutput dbEngineVersionStr(String dbEngineVersionStr) {
    this.dbEngineVersionStr = dbEngineVersionStr;
    return this;
  }

   /**
   * Get dbEngineVersionStr
   * @return dbEngineVersionStr
  **/
  @Schema(description = "")
  public String getDbEngineVersionStr() {
    return dbEngineVersionStr;
  }

  public void setDbEngineVersionStr(String dbEngineVersionStr) {
    this.dbEngineVersionStr = dbEngineVersionStr;
  }

  public DBInstanceForDescribeDBInstancesOutput expiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
    return this;
  }

   /**
   * Get expiredTime
   * @return expiredTime
  **/
  @Schema(description = "")
  public String getExpiredTime() {
    return expiredTime;
  }

  public void setExpiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
  }

  public DBInstanceForDescribeDBInstancesOutput instanceId(String instanceId) {
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

  public DBInstanceForDescribeDBInstancesOutput instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Get instanceName
   * @return instanceName
  **/
  @Schema(description = "")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public DBInstanceForDescribeDBInstancesOutput instanceStatus(String instanceStatus) {
    this.instanceStatus = instanceStatus;
    return this;
  }

   /**
   * Get instanceStatus
   * @return instanceStatus
  **/
  @Schema(description = "")
  public String getInstanceStatus() {
    return instanceStatus;
  }

  public void setInstanceStatus(String instanceStatus) {
    this.instanceStatus = instanceStatus;
  }

  public DBInstanceForDescribeDBInstancesOutput instanceType(String instanceType) {
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

  public DBInstanceForDescribeDBInstancesOutput mongosId(String mongosId) {
    this.mongosId = mongosId;
    return this;
  }

   /**
   * Get mongosId
   * @return mongosId
  **/
  @Schema(description = "")
  public String getMongosId() {
    return mongosId;
  }

  public void setMongosId(String mongosId) {
    this.mongosId = mongosId;
  }

  public DBInstanceForDescribeDBInstancesOutput projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public DBInstanceForDescribeDBInstancesOutput reclaimTime(String reclaimTime) {
    this.reclaimTime = reclaimTime;
    return this;
  }

   /**
   * Get reclaimTime
   * @return reclaimTime
  **/
  @Schema(description = "")
  public String getReclaimTime() {
    return reclaimTime;
  }

  public void setReclaimTime(String reclaimTime) {
    this.reclaimTime = reclaimTime;
  }

  public DBInstanceForDescribeDBInstancesOutput subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @Schema(description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public DBInstanceForDescribeDBInstancesOutput updateTime(String updateTime) {
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

  public DBInstanceForDescribeDBInstancesOutput vpcId(String vpcId) {
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

  public DBInstanceForDescribeDBInstancesOutput zoneId(String zoneId) {
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
    DBInstanceForDescribeDBInstancesOutput dbInstanceForDescribeDBInstancesOutput = (DBInstanceForDescribeDBInstancesOutput) o;
    return Objects.equals(this.autoRenew, dbInstanceForDescribeDBInstancesOutput.autoRenew) &&
        Objects.equals(this.chargeStatus, dbInstanceForDescribeDBInstancesOutput.chargeStatus) &&
        Objects.equals(this.chargeType, dbInstanceForDescribeDBInstancesOutput.chargeType) &&
        Objects.equals(this.closedTime, dbInstanceForDescribeDBInstancesOutput.closedTime) &&
        Objects.equals(this.configServersId, dbInstanceForDescribeDBInstancesOutput.configServersId) &&
        Objects.equals(this.createTime, dbInstanceForDescribeDBInstancesOutput.createTime) &&
        Objects.equals(this.dbEngine, dbInstanceForDescribeDBInstancesOutput.dbEngine) &&
        Objects.equals(this.dbEngineVersion, dbInstanceForDescribeDBInstancesOutput.dbEngineVersion) &&
        Objects.equals(this.dbEngineVersionStr, dbInstanceForDescribeDBInstancesOutput.dbEngineVersionStr) &&
        Objects.equals(this.expiredTime, dbInstanceForDescribeDBInstancesOutput.expiredTime) &&
        Objects.equals(this.instanceId, dbInstanceForDescribeDBInstancesOutput.instanceId) &&
        Objects.equals(this.instanceName, dbInstanceForDescribeDBInstancesOutput.instanceName) &&
        Objects.equals(this.instanceStatus, dbInstanceForDescribeDBInstancesOutput.instanceStatus) &&
        Objects.equals(this.instanceType, dbInstanceForDescribeDBInstancesOutput.instanceType) &&
        Objects.equals(this.mongosId, dbInstanceForDescribeDBInstancesOutput.mongosId) &&
        Objects.equals(this.projectName, dbInstanceForDescribeDBInstancesOutput.projectName) &&
        Objects.equals(this.reclaimTime, dbInstanceForDescribeDBInstancesOutput.reclaimTime) &&
        Objects.equals(this.subnetId, dbInstanceForDescribeDBInstancesOutput.subnetId) &&
        Objects.equals(this.updateTime, dbInstanceForDescribeDBInstancesOutput.updateTime) &&
        Objects.equals(this.vpcId, dbInstanceForDescribeDBInstancesOutput.vpcId) &&
        Objects.equals(this.zoneId, dbInstanceForDescribeDBInstancesOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRenew, chargeStatus, chargeType, closedTime, configServersId, createTime, dbEngine, dbEngineVersion, dbEngineVersionStr, expiredTime, instanceId, instanceName, instanceStatus, instanceType, mongosId, projectName, reclaimTime, subnetId, updateTime, vpcId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBInstanceForDescribeDBInstancesOutput {\n");
    
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    chargeStatus: ").append(toIndentedString(chargeStatus)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    closedTime: ").append(toIndentedString(closedTime)).append("\n");
    sb.append("    configServersId: ").append(toIndentedString(configServersId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    dbEngine: ").append(toIndentedString(dbEngine)).append("\n");
    sb.append("    dbEngineVersion: ").append(toIndentedString(dbEngineVersion)).append("\n");
    sb.append("    dbEngineVersionStr: ").append(toIndentedString(dbEngineVersionStr)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    mongosId: ").append(toIndentedString(mongosId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    reclaimTime: ").append(toIndentedString(reclaimTime)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
