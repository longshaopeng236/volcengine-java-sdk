/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vke.model.DataVolumeForListNodePoolsOutput;
import com.volcengine.vke.model.SecurityForListNodePoolsOutput;
import com.volcengine.vke.model.SystemVolumeForListNodePoolsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NodeConfigForListNodePoolsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-19T12:20:19.967862+08:00[Asia/Shanghai]")
public class NodeConfigForListNodePoolsOutput {
  @SerializedName("AdditionalContainerStorageEnabled")
  private Boolean additionalContainerStorageEnabled = null;

  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  @SerializedName("AutoRenewPeriod")
  private Integer autoRenewPeriod = null;

  @SerializedName("DataVolumes")
  private List<DataVolumeForListNodePoolsOutput> dataVolumes = null;

  @SerializedName("ImageId")
  private String imageId = null;

  @SerializedName("InitializeScript")
  private String initializeScript = null;

  @SerializedName("InstanceChargeType")
  private String instanceChargeType = null;

  @SerializedName("InstanceTypeIds")
  private List<String> instanceTypeIds = null;

  @SerializedName("Period")
  private Integer period = null;

  @SerializedName("Security")
  private SecurityForListNodePoolsOutput security = null;

  @SerializedName("SubnetIds")
  private List<String> subnetIds = null;

  @SerializedName("SystemVolume")
  private SystemVolumeForListNodePoolsOutput systemVolume = null;

  public NodeConfigForListNodePoolsOutput additionalContainerStorageEnabled(Boolean additionalContainerStorageEnabled) {
    this.additionalContainerStorageEnabled = additionalContainerStorageEnabled;
    return this;
  }

   /**
   * Get additionalContainerStorageEnabled
   * @return additionalContainerStorageEnabled
  **/
  @Schema(description = "")
  public Boolean isAdditionalContainerStorageEnabled() {
    return additionalContainerStorageEnabled;
  }

  public void setAdditionalContainerStorageEnabled(Boolean additionalContainerStorageEnabled) {
    this.additionalContainerStorageEnabled = additionalContainerStorageEnabled;
  }

  public NodeConfigForListNodePoolsOutput autoRenew(Boolean autoRenew) {
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

  public NodeConfigForListNodePoolsOutput autoRenewPeriod(Integer autoRenewPeriod) {
    this.autoRenewPeriod = autoRenewPeriod;
    return this;
  }

   /**
   * Get autoRenewPeriod
   * @return autoRenewPeriod
  **/
  @Schema(description = "")
  public Integer getAutoRenewPeriod() {
    return autoRenewPeriod;
  }

  public void setAutoRenewPeriod(Integer autoRenewPeriod) {
    this.autoRenewPeriod = autoRenewPeriod;
  }

  public NodeConfigForListNodePoolsOutput dataVolumes(List<DataVolumeForListNodePoolsOutput> dataVolumes) {
    this.dataVolumes = dataVolumes;
    return this;
  }

  public NodeConfigForListNodePoolsOutput addDataVolumesItem(DataVolumeForListNodePoolsOutput dataVolumesItem) {
    if (this.dataVolumes == null) {
      this.dataVolumes = new ArrayList<DataVolumeForListNodePoolsOutput>();
    }
    this.dataVolumes.add(dataVolumesItem);
    return this;
  }

   /**
   * Get dataVolumes
   * @return dataVolumes
  **/
  @Valid
  @Schema(description = "")
  public List<DataVolumeForListNodePoolsOutput> getDataVolumes() {
    return dataVolumes;
  }

  public void setDataVolumes(List<DataVolumeForListNodePoolsOutput> dataVolumes) {
    this.dataVolumes = dataVolumes;
  }

  public NodeConfigForListNodePoolsOutput imageId(String imageId) {
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

  public NodeConfigForListNodePoolsOutput initializeScript(String initializeScript) {
    this.initializeScript = initializeScript;
    return this;
  }

   /**
   * Get initializeScript
   * @return initializeScript
  **/
  @Schema(description = "")
  public String getInitializeScript() {
    return initializeScript;
  }

  public void setInitializeScript(String initializeScript) {
    this.initializeScript = initializeScript;
  }

  public NodeConfigForListNodePoolsOutput instanceChargeType(String instanceChargeType) {
    this.instanceChargeType = instanceChargeType;
    return this;
  }

   /**
   * Get instanceChargeType
   * @return instanceChargeType
  **/
  @Schema(description = "")
  public String getInstanceChargeType() {
    return instanceChargeType;
  }

  public void setInstanceChargeType(String instanceChargeType) {
    this.instanceChargeType = instanceChargeType;
  }

  public NodeConfigForListNodePoolsOutput instanceTypeIds(List<String> instanceTypeIds) {
    this.instanceTypeIds = instanceTypeIds;
    return this;
  }

  public NodeConfigForListNodePoolsOutput addInstanceTypeIdsItem(String instanceTypeIdsItem) {
    if (this.instanceTypeIds == null) {
      this.instanceTypeIds = new ArrayList<String>();
    }
    this.instanceTypeIds.add(instanceTypeIdsItem);
    return this;
  }

   /**
   * Get instanceTypeIds
   * @return instanceTypeIds
  **/
  @Schema(description = "")
  public List<String> getInstanceTypeIds() {
    return instanceTypeIds;
  }

  public void setInstanceTypeIds(List<String> instanceTypeIds) {
    this.instanceTypeIds = instanceTypeIds;
  }

  public NodeConfigForListNodePoolsOutput period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public NodeConfigForListNodePoolsOutput security(SecurityForListNodePoolsOutput security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @Valid
  @Schema(description = "")
  public SecurityForListNodePoolsOutput getSecurity() {
    return security;
  }

  public void setSecurity(SecurityForListNodePoolsOutput security) {
    this.security = security;
  }

  public NodeConfigForListNodePoolsOutput subnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public NodeConfigForListNodePoolsOutput addSubnetIdsItem(String subnetIdsItem) {
    if (this.subnetIds == null) {
      this.subnetIds = new ArrayList<String>();
    }
    this.subnetIds.add(subnetIdsItem);
    return this;
  }

   /**
   * Get subnetIds
   * @return subnetIds
  **/
  @Schema(description = "")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }

  public NodeConfigForListNodePoolsOutput systemVolume(SystemVolumeForListNodePoolsOutput systemVolume) {
    this.systemVolume = systemVolume;
    return this;
  }

   /**
   * Get systemVolume
   * @return systemVolume
  **/
  @Valid
  @Schema(description = "")
  public SystemVolumeForListNodePoolsOutput getSystemVolume() {
    return systemVolume;
  }

  public void setSystemVolume(SystemVolumeForListNodePoolsOutput systemVolume) {
    this.systemVolume = systemVolume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeConfigForListNodePoolsOutput nodeConfigForListNodePoolsOutput = (NodeConfigForListNodePoolsOutput) o;
    return Objects.equals(this.additionalContainerStorageEnabled, nodeConfigForListNodePoolsOutput.additionalContainerStorageEnabled) &&
        Objects.equals(this.autoRenew, nodeConfigForListNodePoolsOutput.autoRenew) &&
        Objects.equals(this.autoRenewPeriod, nodeConfigForListNodePoolsOutput.autoRenewPeriod) &&
        Objects.equals(this.dataVolumes, nodeConfigForListNodePoolsOutput.dataVolumes) &&
        Objects.equals(this.imageId, nodeConfigForListNodePoolsOutput.imageId) &&
        Objects.equals(this.initializeScript, nodeConfigForListNodePoolsOutput.initializeScript) &&
        Objects.equals(this.instanceChargeType, nodeConfigForListNodePoolsOutput.instanceChargeType) &&
        Objects.equals(this.instanceTypeIds, nodeConfigForListNodePoolsOutput.instanceTypeIds) &&
        Objects.equals(this.period, nodeConfigForListNodePoolsOutput.period) &&
        Objects.equals(this.security, nodeConfigForListNodePoolsOutput.security) &&
        Objects.equals(this.subnetIds, nodeConfigForListNodePoolsOutput.subnetIds) &&
        Objects.equals(this.systemVolume, nodeConfigForListNodePoolsOutput.systemVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalContainerStorageEnabled, autoRenew, autoRenewPeriod, dataVolumes, imageId, initializeScript, instanceChargeType, instanceTypeIds, period, security, subnetIds, systemVolume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeConfigForListNodePoolsOutput {\n");
    
    sb.append("    additionalContainerStorageEnabled: ").append(toIndentedString(additionalContainerStorageEnabled)).append("\n");
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    autoRenewPeriod: ").append(toIndentedString(autoRenewPeriod)).append("\n");
    sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    initializeScript: ").append(toIndentedString(initializeScript)).append("\n");
    sb.append("    instanceChargeType: ").append(toIndentedString(instanceChargeType)).append("\n");
    sb.append("    instanceTypeIds: ").append(toIndentedString(instanceTypeIds)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    systemVolume: ").append(toIndentedString(systemVolume)).append("\n");
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
