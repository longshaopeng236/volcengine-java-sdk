/*
 * storage_ebs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.storageebs.model;

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
 * VolumeForDescribeVolumesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:23:15.605776+08:00[Asia/Shanghai]")
public class VolumeForDescribeVolumesOutput {
  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("DeleteWithInstance")
  private Boolean deleteWithInstance = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DeviceName")
  private String deviceName = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("ImageId")
  private String imageId = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Kind")
  private String kind = null;

  @SerializedName("PayType")
  private String payType = null;

  @SerializedName("RenewType")
  private Integer renewType = null;

  @SerializedName("Size")
  private String size = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TradeStatus")
  private Integer tradeStatus = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  @SerializedName("VolumeId")
  private String volumeId = null;

  @SerializedName("VolumeName")
  private String volumeName = null;

  @SerializedName("VolumeType")
  private String volumeType = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public VolumeForDescribeVolumesOutput billingType(Integer billingType) {
    this.billingType = billingType;
    return this;
  }

   /**
   * Get billingType
   * @return billingType
  **/
  @Schema(description = "")
  public Integer getBillingType() {
    return billingType;
  }

  public void setBillingType(Integer billingType) {
    this.billingType = billingType;
  }

  public VolumeForDescribeVolumesOutput createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public VolumeForDescribeVolumesOutput deleteWithInstance(Boolean deleteWithInstance) {
    this.deleteWithInstance = deleteWithInstance;
    return this;
  }

   /**
   * Get deleteWithInstance
   * @return deleteWithInstance
  **/
  @Schema(description = "")
  public Boolean isDeleteWithInstance() {
    return deleteWithInstance;
  }

  public void setDeleteWithInstance(Boolean deleteWithInstance) {
    this.deleteWithInstance = deleteWithInstance;
  }

  public VolumeForDescribeVolumesOutput description(String description) {
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

  public VolumeForDescribeVolumesOutput deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

   /**
   * Get deviceName
   * @return deviceName
  **/
  @Schema(description = "")
  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public VolumeForDescribeVolumesOutput expiredTime(String expiredTime) {
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

  public VolumeForDescribeVolumesOutput imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @Schema(description = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public VolumeForDescribeVolumesOutput instanceId(String instanceId) {
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

  public VolumeForDescribeVolumesOutput kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @Schema(description = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public VolumeForDescribeVolumesOutput payType(String payType) {
    this.payType = payType;
    return this;
  }

   /**
   * Get payType
   * @return payType
  **/
  @Schema(description = "")
  public String getPayType() {
    return payType;
  }

  public void setPayType(String payType) {
    this.payType = payType;
  }

  public VolumeForDescribeVolumesOutput renewType(Integer renewType) {
    this.renewType = renewType;
    return this;
  }

   /**
   * Get renewType
   * @return renewType
  **/
  @Schema(description = "")
  public Integer getRenewType() {
    return renewType;
  }

  public void setRenewType(Integer renewType) {
    this.renewType = renewType;
  }

  public VolumeForDescribeVolumesOutput size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public VolumeForDescribeVolumesOutput status(String status) {
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

  public VolumeForDescribeVolumesOutput tradeStatus(Integer tradeStatus) {
    this.tradeStatus = tradeStatus;
    return this;
  }

   /**
   * Get tradeStatus
   * @return tradeStatus
  **/
  @Schema(description = "")
  public Integer getTradeStatus() {
    return tradeStatus;
  }

  public void setTradeStatus(Integer tradeStatus) {
    this.tradeStatus = tradeStatus;
  }

  public VolumeForDescribeVolumesOutput updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public VolumeForDescribeVolumesOutput volumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

   /**
   * Get volumeId
   * @return volumeId
  **/
  @Schema(description = "")
  public String getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }

  public VolumeForDescribeVolumesOutput volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

   /**
   * Get volumeName
   * @return volumeName
  **/
  @Schema(description = "")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

  public VolumeForDescribeVolumesOutput volumeType(String volumeType) {
    this.volumeType = volumeType;
    return this;
  }

   /**
   * Get volumeType
   * @return volumeType
  **/
  @Schema(description = "")
  public String getVolumeType() {
    return volumeType;
  }

  public void setVolumeType(String volumeType) {
    this.volumeType = volumeType;
  }

  public VolumeForDescribeVolumesOutput zoneId(String zoneId) {
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
    VolumeForDescribeVolumesOutput volumeForDescribeVolumesOutput = (VolumeForDescribeVolumesOutput) o;
    return Objects.equals(this.billingType, volumeForDescribeVolumesOutput.billingType) &&
        Objects.equals(this.createdAt, volumeForDescribeVolumesOutput.createdAt) &&
        Objects.equals(this.deleteWithInstance, volumeForDescribeVolumesOutput.deleteWithInstance) &&
        Objects.equals(this.description, volumeForDescribeVolumesOutput.description) &&
        Objects.equals(this.deviceName, volumeForDescribeVolumesOutput.deviceName) &&
        Objects.equals(this.expiredTime, volumeForDescribeVolumesOutput.expiredTime) &&
        Objects.equals(this.imageId, volumeForDescribeVolumesOutput.imageId) &&
        Objects.equals(this.instanceId, volumeForDescribeVolumesOutput.instanceId) &&
        Objects.equals(this.kind, volumeForDescribeVolumesOutput.kind) &&
        Objects.equals(this.payType, volumeForDescribeVolumesOutput.payType) &&
        Objects.equals(this.renewType, volumeForDescribeVolumesOutput.renewType) &&
        Objects.equals(this.size, volumeForDescribeVolumesOutput.size) &&
        Objects.equals(this.status, volumeForDescribeVolumesOutput.status) &&
        Objects.equals(this.tradeStatus, volumeForDescribeVolumesOutput.tradeStatus) &&
        Objects.equals(this.updatedAt, volumeForDescribeVolumesOutput.updatedAt) &&
        Objects.equals(this.volumeId, volumeForDescribeVolumesOutput.volumeId) &&
        Objects.equals(this.volumeName, volumeForDescribeVolumesOutput.volumeName) &&
        Objects.equals(this.volumeType, volumeForDescribeVolumesOutput.volumeType) &&
        Objects.equals(this.zoneId, volumeForDescribeVolumesOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingType, createdAt, deleteWithInstance, description, deviceName, expiredTime, imageId, instanceId, kind, payType, renewType, size, status, tradeStatus, updatedAt, volumeId, volumeName, volumeType, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeForDescribeVolumesOutput {\n");
    
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deleteWithInstance: ").append(toIndentedString(deleteWithInstance)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    payType: ").append(toIndentedString(payType)).append("\n");
    sb.append("    renewType: ").append(toIndentedString(renewType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tradeStatus: ").append(toIndentedString(tradeStatus)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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
