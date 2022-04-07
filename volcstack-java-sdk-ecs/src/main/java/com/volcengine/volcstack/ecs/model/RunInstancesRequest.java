/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcstack.ecs.model.NetworkInterfaceForRunInstancesInput;
import com.volcengine.volcstack.ecs.model.VolumeForRunInstancesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RunInstancesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-04-07T19:27:18.461509+08:00[Asia/Shanghai]")
public class RunInstancesRequest {
  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  @SerializedName("AutoRenewPeriod")
  private Integer autoRenewPeriod = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("HostName")
  private String hostName = null;

  @SerializedName("HpcClusterId")
  private String hpcClusterId = null;

  @SerializedName("ImageId")
  private String imageId = null;

  @SerializedName("InstanceChargeType")
  private String instanceChargeType = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("KeyPairName")
  private String keyPairName = null;

  @SerializedName("NetworkInterfaces")
  private List<NetworkInterfaceForRunInstancesInput> networkInterfaces = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("Period")
  private Integer period = null;

  @SerializedName("PeriodUnit")
  private String periodUnit = null;

  @SerializedName("SecurityEnhancementStrategy")
  private String securityEnhancementStrategy = null;

  @SerializedName("SuffixIndex")
  private Integer suffixIndex = null;

  @SerializedName("UniqueSuffix")
  private Boolean uniqueSuffix = null;

  @SerializedName("UserData")
  private String userData = null;

  @SerializedName("Volumes")
  private List<VolumeForRunInstancesInput> volumes = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public RunInstancesRequest autoRenew(Boolean autoRenew) {
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

  public RunInstancesRequest autoRenewPeriod(Integer autoRenewPeriod) {
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

  public RunInstancesRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public RunInstancesRequest count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(description = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public RunInstancesRequest description(String description) {
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

  public RunInstancesRequest hostName(String hostName) {
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

  public RunInstancesRequest hpcClusterId(String hpcClusterId) {
    this.hpcClusterId = hpcClusterId;
    return this;
  }

   /**
   * Get hpcClusterId
   * @return hpcClusterId
  **/
  @Schema(description = "")
  public String getHpcClusterId() {
    return hpcClusterId;
  }

  public void setHpcClusterId(String hpcClusterId) {
    this.hpcClusterId = hpcClusterId;
  }

  public RunInstancesRequest imageId(String imageId) {
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

  public RunInstancesRequest instanceChargeType(String instanceChargeType) {
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

  public RunInstancesRequest instanceName(String instanceName) {
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

  public RunInstancesRequest instanceType(String instanceType) {
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

  public RunInstancesRequest keyPairName(String keyPairName) {
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

  public RunInstancesRequest networkInterfaces(List<NetworkInterfaceForRunInstancesInput> networkInterfaces) {
    this.networkInterfaces = networkInterfaces;
    return this;
  }

  public RunInstancesRequest addNetworkInterfacesItem(NetworkInterfaceForRunInstancesInput networkInterfacesItem) {
    if (this.networkInterfaces == null) {
      this.networkInterfaces = new ArrayList<NetworkInterfaceForRunInstancesInput>();
    }
    this.networkInterfaces.add(networkInterfacesItem);
    return this;
  }

   /**
   * Get networkInterfaces
   * @return networkInterfaces
  **/
  @Valid
  @Schema(description = "")
  public List<NetworkInterfaceForRunInstancesInput> getNetworkInterfaces() {
    return networkInterfaces;
  }

  public void setNetworkInterfaces(List<NetworkInterfaceForRunInstancesInput> networkInterfaces) {
    this.networkInterfaces = networkInterfaces;
  }

  public RunInstancesRequest password(String password) {
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

  public RunInstancesRequest period(Integer period) {
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

  public RunInstancesRequest periodUnit(String periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Get periodUnit
   * @return periodUnit
  **/
  @Schema(description = "")
  public String getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(String periodUnit) {
    this.periodUnit = periodUnit;
  }

  public RunInstancesRequest securityEnhancementStrategy(String securityEnhancementStrategy) {
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

  public RunInstancesRequest suffixIndex(Integer suffixIndex) {
    this.suffixIndex = suffixIndex;
    return this;
  }

   /**
   * Get suffixIndex
   * @return suffixIndex
  **/
  @Schema(description = "")
  public Integer getSuffixIndex() {
    return suffixIndex;
  }

  public void setSuffixIndex(Integer suffixIndex) {
    this.suffixIndex = suffixIndex;
  }

  public RunInstancesRequest uniqueSuffix(Boolean uniqueSuffix) {
    this.uniqueSuffix = uniqueSuffix;
    return this;
  }

   /**
   * Get uniqueSuffix
   * @return uniqueSuffix
  **/
  @Schema(description = "")
  public Boolean isUniqueSuffix() {
    return uniqueSuffix;
  }

  public void setUniqueSuffix(Boolean uniqueSuffix) {
    this.uniqueSuffix = uniqueSuffix;
  }

  public RunInstancesRequest userData(String userData) {
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

  public RunInstancesRequest volumes(List<VolumeForRunInstancesInput> volumes) {
    this.volumes = volumes;
    return this;
  }

  public RunInstancesRequest addVolumesItem(VolumeForRunInstancesInput volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<VolumeForRunInstancesInput>();
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
  public List<VolumeForRunInstancesInput> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<VolumeForRunInstancesInput> volumes) {
    this.volumes = volumes;
  }

  public RunInstancesRequest zoneId(String zoneId) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunInstancesRequest runInstancesRequest = (RunInstancesRequest) o;
    return Objects.equals(this.autoRenew, runInstancesRequest.autoRenew) &&
        Objects.equals(this.autoRenewPeriod, runInstancesRequest.autoRenewPeriod) &&
        Objects.equals(this.clientToken, runInstancesRequest.clientToken) &&
        Objects.equals(this.count, runInstancesRequest.count) &&
        Objects.equals(this.description, runInstancesRequest.description) &&
        Objects.equals(this.hostName, runInstancesRequest.hostName) &&
        Objects.equals(this.hpcClusterId, runInstancesRequest.hpcClusterId) &&
        Objects.equals(this.imageId, runInstancesRequest.imageId) &&
        Objects.equals(this.instanceChargeType, runInstancesRequest.instanceChargeType) &&
        Objects.equals(this.instanceName, runInstancesRequest.instanceName) &&
        Objects.equals(this.instanceType, runInstancesRequest.instanceType) &&
        Objects.equals(this.keyPairName, runInstancesRequest.keyPairName) &&
        Objects.equals(this.networkInterfaces, runInstancesRequest.networkInterfaces) &&
        Objects.equals(this.password, runInstancesRequest.password) &&
        Objects.equals(this.period, runInstancesRequest.period) &&
        Objects.equals(this.periodUnit, runInstancesRequest.periodUnit) &&
        Objects.equals(this.securityEnhancementStrategy, runInstancesRequest.securityEnhancementStrategy) &&
        Objects.equals(this.suffixIndex, runInstancesRequest.suffixIndex) &&
        Objects.equals(this.uniqueSuffix, runInstancesRequest.uniqueSuffix) &&
        Objects.equals(this.userData, runInstancesRequest.userData) &&
        Objects.equals(this.volumes, runInstancesRequest.volumes) &&
        Objects.equals(this.zoneId, runInstancesRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRenew, autoRenewPeriod, clientToken, count, description, hostName, hpcClusterId, imageId, instanceChargeType, instanceName, instanceType, keyPairName, networkInterfaces, password, period, periodUnit, securityEnhancementStrategy, suffixIndex, uniqueSuffix, userData, volumes, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunInstancesRequest {\n");
    
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    autoRenewPeriod: ").append(toIndentedString(autoRenewPeriod)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    hpcClusterId: ").append(toIndentedString(hpcClusterId)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    instanceChargeType: ").append(toIndentedString(instanceChargeType)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
    sb.append("    networkInterfaces: ").append(toIndentedString(networkInterfaces)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    securityEnhancementStrategy: ").append(toIndentedString(securityEnhancementStrategy)).append("\n");
    sb.append("    suffixIndex: ").append(toIndentedString(suffixIndex)).append("\n");
    sb.append("    uniqueSuffix: ").append(toIndentedString(uniqueSuffix)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
