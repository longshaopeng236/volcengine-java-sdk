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
import com.volcengine.vke.model.DataVolumeForCreateNodePoolInput;
import com.volcengine.vke.model.SecurityForCreateNodePoolInput;
import com.volcengine.vke.model.SystemVolumeForCreateNodePoolInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NodeConfigForCreateNodePoolInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-04T12:08:56.909838+08:00[Asia/Shanghai]")
public class NodeConfigForCreateNodePoolInput {
  @SerializedName("AdditionalContainerStorageEnabled")
  private Boolean additionalContainerStorageEnabled = null;

  @SerializedName("DataVolumes")
  private List<DataVolumeForCreateNodePoolInput> dataVolumes = null;

  @SerializedName("InitializeScript")
  private String initializeScript = null;

  @SerializedName("InstanceTypeIds")
  private List<String> instanceTypeIds = null;

  @SerializedName("Security")
  private SecurityForCreateNodePoolInput security = null;

  @SerializedName("SubnetIds")
  private List<String> subnetIds = null;

  @SerializedName("SystemVolume")
  private SystemVolumeForCreateNodePoolInput systemVolume = null;

  public NodeConfigForCreateNodePoolInput additionalContainerStorageEnabled(Boolean additionalContainerStorageEnabled) {
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

  public NodeConfigForCreateNodePoolInput dataVolumes(List<DataVolumeForCreateNodePoolInput> dataVolumes) {
    this.dataVolumes = dataVolumes;
    return this;
  }

  public NodeConfigForCreateNodePoolInput addDataVolumesItem(DataVolumeForCreateNodePoolInput dataVolumesItem) {
    if (this.dataVolumes == null) {
      this.dataVolumes = new ArrayList<DataVolumeForCreateNodePoolInput>();
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
  public List<DataVolumeForCreateNodePoolInput> getDataVolumes() {
    return dataVolumes;
  }

  public void setDataVolumes(List<DataVolumeForCreateNodePoolInput> dataVolumes) {
    this.dataVolumes = dataVolumes;
  }

  public NodeConfigForCreateNodePoolInput initializeScript(String initializeScript) {
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

  public NodeConfigForCreateNodePoolInput instanceTypeIds(List<String> instanceTypeIds) {
    this.instanceTypeIds = instanceTypeIds;
    return this;
  }

  public NodeConfigForCreateNodePoolInput addInstanceTypeIdsItem(String instanceTypeIdsItem) {
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

  public NodeConfigForCreateNodePoolInput security(SecurityForCreateNodePoolInput security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @Valid
  @Schema(description = "")
  public SecurityForCreateNodePoolInput getSecurity() {
    return security;
  }

  public void setSecurity(SecurityForCreateNodePoolInput security) {
    this.security = security;
  }

  public NodeConfigForCreateNodePoolInput subnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public NodeConfigForCreateNodePoolInput addSubnetIdsItem(String subnetIdsItem) {
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

  public NodeConfigForCreateNodePoolInput systemVolume(SystemVolumeForCreateNodePoolInput systemVolume) {
    this.systemVolume = systemVolume;
    return this;
  }

   /**
   * Get systemVolume
   * @return systemVolume
  **/
  @Valid
  @Schema(description = "")
  public SystemVolumeForCreateNodePoolInput getSystemVolume() {
    return systemVolume;
  }

  public void setSystemVolume(SystemVolumeForCreateNodePoolInput systemVolume) {
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
    NodeConfigForCreateNodePoolInput nodeConfigForCreateNodePoolInput = (NodeConfigForCreateNodePoolInput) o;
    return Objects.equals(this.additionalContainerStorageEnabled, nodeConfigForCreateNodePoolInput.additionalContainerStorageEnabled) &&
        Objects.equals(this.dataVolumes, nodeConfigForCreateNodePoolInput.dataVolumes) &&
        Objects.equals(this.initializeScript, nodeConfigForCreateNodePoolInput.initializeScript) &&
        Objects.equals(this.instanceTypeIds, nodeConfigForCreateNodePoolInput.instanceTypeIds) &&
        Objects.equals(this.security, nodeConfigForCreateNodePoolInput.security) &&
        Objects.equals(this.subnetIds, nodeConfigForCreateNodePoolInput.subnetIds) &&
        Objects.equals(this.systemVolume, nodeConfigForCreateNodePoolInput.systemVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalContainerStorageEnabled, dataVolumes, initializeScript, instanceTypeIds, security, subnetIds, systemVolume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeConfigForCreateNodePoolInput {\n");
    
    sb.append("    additionalContainerStorageEnabled: ").append(toIndentedString(additionalContainerStorageEnabled)).append("\n");
    sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
    sb.append("    initializeScript: ").append(toIndentedString(initializeScript)).append("\n");
    sb.append("    instanceTypeIds: ").append(toIndentedString(instanceTypeIds)).append("\n");
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
