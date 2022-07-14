/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.autoscaling.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.autoscaling.model.EipForModifyScalingConfigurationInput;
import com.volcengine.autoscaling.model.VolumeForModifyScalingConfigurationInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyScalingConfigurationRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:22:44.255986+08:00[Asia/Shanghai]")
public class ModifyScalingConfigurationRequest {
  @SerializedName("Eip")
  private EipForModifyScalingConfigurationInput eip = null;

  @SerializedName("HostName")
  private String hostName = null;

  @SerializedName("ImageId")
  private String imageId = null;

  @SerializedName("InstanceDescription")
  private String instanceDescription = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceTypes")
  private List<String> instanceTypes = null;

  @SerializedName("KeyPairName")
  private String keyPairName = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("ScalingConfigurationId")
  private String scalingConfigurationId = null;

  @SerializedName("ScalingConfigurationName")
  private String scalingConfigurationName = null;

  @SerializedName("SecurityEnhancementStrategy")
  private String securityEnhancementStrategy = null;

  @SerializedName("SecurityGroupIds")
  private List<String> securityGroupIds = null;

  @SerializedName("UserData")
  private String userData = null;

  @SerializedName("Volumes")
  private List<VolumeForModifyScalingConfigurationInput> volumes = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public ModifyScalingConfigurationRequest eip(EipForModifyScalingConfigurationInput eip) {
    this.eip = eip;
    return this;
  }

   /**
   * Get eip
   * @return eip
  **/
  @Valid
  @Schema(description = "")
  public EipForModifyScalingConfigurationInput getEip() {
    return eip;
  }

  public void setEip(EipForModifyScalingConfigurationInput eip) {
    this.eip = eip;
  }

  public ModifyScalingConfigurationRequest hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * Get hostName
   * @return hostName
  **/
  @Schema(description = "")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public ModifyScalingConfigurationRequest imageId(String imageId) {
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

  public ModifyScalingConfigurationRequest instanceDescription(String instanceDescription) {
    this.instanceDescription = instanceDescription;
    return this;
  }

   /**
   * Get instanceDescription
   * @return instanceDescription
  **/
  @Schema(description = "")
  public String getInstanceDescription() {
    return instanceDescription;
  }

  public void setInstanceDescription(String instanceDescription) {
    this.instanceDescription = instanceDescription;
  }

  public ModifyScalingConfigurationRequest instanceName(String instanceName) {
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

  public ModifyScalingConfigurationRequest instanceTypes(List<String> instanceTypes) {
    this.instanceTypes = instanceTypes;
    return this;
  }

  public ModifyScalingConfigurationRequest addInstanceTypesItem(String instanceTypesItem) {
    if (this.instanceTypes == null) {
      this.instanceTypes = new ArrayList<String>();
    }
    this.instanceTypes.add(instanceTypesItem);
    return this;
  }

   /**
   * Get instanceTypes
   * @return instanceTypes
  **/
  @Schema(description = "")
  public List<String> getInstanceTypes() {
    return instanceTypes;
  }

  public void setInstanceTypes(List<String> instanceTypes) {
    this.instanceTypes = instanceTypes;
  }

  public ModifyScalingConfigurationRequest keyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
    return this;
  }

   /**
   * Get keyPairName
   * @return keyPairName
  **/
  @Schema(description = "")
  public String getKeyPairName() {
    return keyPairName;
  }

  public void setKeyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
  }

  public ModifyScalingConfigurationRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ModifyScalingConfigurationRequest scalingConfigurationId(String scalingConfigurationId) {
    this.scalingConfigurationId = scalingConfigurationId;
    return this;
  }

   /**
   * Get scalingConfigurationId
   * @return scalingConfigurationId
  **/
  @Schema(description = "")
  public String getScalingConfigurationId() {
    return scalingConfigurationId;
  }

  public void setScalingConfigurationId(String scalingConfigurationId) {
    this.scalingConfigurationId = scalingConfigurationId;
  }

  public ModifyScalingConfigurationRequest scalingConfigurationName(String scalingConfigurationName) {
    this.scalingConfigurationName = scalingConfigurationName;
    return this;
  }

   /**
   * Get scalingConfigurationName
   * @return scalingConfigurationName
  **/
  @Schema(description = "")
  public String getScalingConfigurationName() {
    return scalingConfigurationName;
  }

  public void setScalingConfigurationName(String scalingConfigurationName) {
    this.scalingConfigurationName = scalingConfigurationName;
  }

  public ModifyScalingConfigurationRequest securityEnhancementStrategy(String securityEnhancementStrategy) {
    this.securityEnhancementStrategy = securityEnhancementStrategy;
    return this;
  }

   /**
   * Get securityEnhancementStrategy
   * @return securityEnhancementStrategy
  **/
  @Schema(description = "")
  public String getSecurityEnhancementStrategy() {
    return securityEnhancementStrategy;
  }

  public void setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
    this.securityEnhancementStrategy = securityEnhancementStrategy;
  }

  public ModifyScalingConfigurationRequest securityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public ModifyScalingConfigurationRequest addSecurityGroupIdsItem(String securityGroupIdsItem) {
    if (this.securityGroupIds == null) {
      this.securityGroupIds = new ArrayList<String>();
    }
    this.securityGroupIds.add(securityGroupIdsItem);
    return this;
  }

   /**
   * Get securityGroupIds
   * @return securityGroupIds
  **/
  @Schema(description = "")
  public List<String> getSecurityGroupIds() {
    return securityGroupIds;
  }

  public void setSecurityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
  }

  public ModifyScalingConfigurationRequest userData(String userData) {
    this.userData = userData;
    return this;
  }

   /**
   * Get userData
   * @return userData
  **/
  @Schema(description = "")
  public String getUserData() {
    return userData;
  }

  public void setUserData(String userData) {
    this.userData = userData;
  }

  public ModifyScalingConfigurationRequest volumes(List<VolumeForModifyScalingConfigurationInput> volumes) {
    this.volumes = volumes;
    return this;
  }

  public ModifyScalingConfigurationRequest addVolumesItem(VolumeForModifyScalingConfigurationInput volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<VolumeForModifyScalingConfigurationInput>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Get volumes
   * @return volumes
  **/
  @Valid
  @Schema(description = "")
  public List<VolumeForModifyScalingConfigurationInput> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<VolumeForModifyScalingConfigurationInput> volumes) {
    this.volumes = volumes;
  }

  public ModifyScalingConfigurationRequest zoneId(String zoneId) {
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
    ModifyScalingConfigurationRequest modifyScalingConfigurationRequest = (ModifyScalingConfigurationRequest) o;
    return Objects.equals(this.eip, modifyScalingConfigurationRequest.eip) &&
        Objects.equals(this.hostName, modifyScalingConfigurationRequest.hostName) &&
        Objects.equals(this.imageId, modifyScalingConfigurationRequest.imageId) &&
        Objects.equals(this.instanceDescription, modifyScalingConfigurationRequest.instanceDescription) &&
        Objects.equals(this.instanceName, modifyScalingConfigurationRequest.instanceName) &&
        Objects.equals(this.instanceTypes, modifyScalingConfigurationRequest.instanceTypes) &&
        Objects.equals(this.keyPairName, modifyScalingConfigurationRequest.keyPairName) &&
        Objects.equals(this.password, modifyScalingConfigurationRequest.password) &&
        Objects.equals(this.scalingConfigurationId, modifyScalingConfigurationRequest.scalingConfigurationId) &&
        Objects.equals(this.scalingConfigurationName, modifyScalingConfigurationRequest.scalingConfigurationName) &&
        Objects.equals(this.securityEnhancementStrategy, modifyScalingConfigurationRequest.securityEnhancementStrategy) &&
        Objects.equals(this.securityGroupIds, modifyScalingConfigurationRequest.securityGroupIds) &&
        Objects.equals(this.userData, modifyScalingConfigurationRequest.userData) &&
        Objects.equals(this.volumes, modifyScalingConfigurationRequest.volumes) &&
        Objects.equals(this.zoneId, modifyScalingConfigurationRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eip, hostName, imageId, instanceDescription, instanceName, instanceTypes, keyPairName, password, scalingConfigurationId, scalingConfigurationName, securityEnhancementStrategy, securityGroupIds, userData, volumes, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyScalingConfigurationRequest {\n");
    
    sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    instanceDescription: ").append(toIndentedString(instanceDescription)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceTypes: ").append(toIndentedString(instanceTypes)).append("\n");
    sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    scalingConfigurationId: ").append(toIndentedString(scalingConfigurationId)).append("\n");
    sb.append("    scalingConfigurationName: ").append(toIndentedString(scalingConfigurationName)).append("\n");
    sb.append("    securityEnhancementStrategy: ").append(toIndentedString(securityEnhancementStrategy)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
