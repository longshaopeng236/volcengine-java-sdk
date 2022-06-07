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
import com.volcengine.volcstack.ecs.model.CpuOptionsForCreateInstancesInput;
import com.volcengine.volcstack.ecs.model.EipForCreateInstancesInput;
import com.volcengine.volcstack.ecs.model.NetworkInterfaceForCreateInstancesInput;
import com.volcengine.volcstack.ecs.model.TagForCreateInstancesInput;
import com.volcengine.volcstack.ecs.model.VolumeForCreateInstancesInput;
import com.volcengine.volcstack.ecs.model.VolumeIdGroupForCreateInstancesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateInstancesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class CreateInstancesRequest {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("AntiAffinityRuleId")
  private String antiAffinityRuleId = null;

  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  @SerializedName("AutoRenewPeriod")
  private Integer autoRenewPeriod = null;

  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("CpuOptions")
  private CpuOptionsForCreateInstancesInput cpuOptions = null;

  @SerializedName("DeploymentSetId")
  private String deploymentSetId = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DryRun")
  private Boolean dryRun = null;

  @SerializedName("Eip")
  private EipForCreateInstancesInput eip = null;

  @SerializedName("HostName")
  private String hostName = null;

  @SerializedName("Hostname")
  private String hostname = null;

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

  @SerializedName("InstanceTypeId")
  private String instanceTypeId = null;

  @SerializedName("Ipv6Address")
  private List<String> ipv6Address = null;

  @SerializedName("Ipv6AddressCount")
  private Integer ipv6AddressCount = null;

  @SerializedName("Kerberos")
  private Boolean kerberos = null;

  @SerializedName("KeyPairName")
  private String keyPairName = null;

  @SerializedName("NetworkInterfaces")
  private List<NetworkInterfaceForCreateInstancesInput> networkInterfaces = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("Period")
  private Integer period = null;

  @SerializedName("PeriodUnit")
  private String periodUnit = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("SecurityEnhancementStrategy")
  private String securityEnhancementStrategy = null;

  @SerializedName("SuffixIndex")
  private Integer suffixIndex = null;

  @SerializedName("Tag")
  private List<TagForCreateInstancesInput> tag = null;

  @SerializedName("UniqueSuffix")
  private Boolean uniqueSuffix = null;

  @SerializedName("UserData")
  private String userData = null;

  @SerializedName("VolumeIdGroups")
  private List<VolumeIdGroupForCreateInstancesInput> volumeIdGroups = null;

  @SerializedName("Volumes")
  private List<VolumeForCreateInstancesInput> volumes = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public CreateInstancesRequest accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public CreateInstancesRequest antiAffinityRuleId(String antiAffinityRuleId) {
    this.antiAffinityRuleId = antiAffinityRuleId;
    return this;
  }

   /**
   * Get antiAffinityRuleId
   * @return antiAffinityRuleId
  **/
  @Schema(description = "")
  public String getAntiAffinityRuleId() {
    return antiAffinityRuleId;
  }

  public void setAntiAffinityRuleId(String antiAffinityRuleId) {
    this.antiAffinityRuleId = antiAffinityRuleId;
  }

  public CreateInstancesRequest autoRenew(Boolean autoRenew) {
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

  public CreateInstancesRequest autoRenewPeriod(Integer autoRenewPeriod) {
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

  public CreateInstancesRequest count(Integer count) {
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

  public CreateInstancesRequest cpuOptions(CpuOptionsForCreateInstancesInput cpuOptions) {
    this.cpuOptions = cpuOptions;
    return this;
  }

   /**
   * Get cpuOptions
   * @return cpuOptions
  **/
  @Valid
  @Schema(description = "")
  public CpuOptionsForCreateInstancesInput getCpuOptions() {
    return cpuOptions;
  }

  public void setCpuOptions(CpuOptionsForCreateInstancesInput cpuOptions) {
    this.cpuOptions = cpuOptions;
  }

  public CreateInstancesRequest deploymentSetId(String deploymentSetId) {
    this.deploymentSetId = deploymentSetId;
    return this;
  }

   /**
   * Get deploymentSetId
   * @return deploymentSetId
  **/
  @Schema(description = "")
  public String getDeploymentSetId() {
    return deploymentSetId;
  }

  public void setDeploymentSetId(String deploymentSetId) {
    this.deploymentSetId = deploymentSetId;
  }

  public CreateInstancesRequest description(String description) {
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

  public CreateInstancesRequest dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

   /**
   * Get dryRun
   * @return dryRun
  **/
  @Schema(description = "")
  public Boolean isDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public CreateInstancesRequest eip(EipForCreateInstancesInput eip) {
    this.eip = eip;
    return this;
  }

   /**
   * Get eip
   * @return eip
  **/
  @Valid
  @Schema(description = "")
  public EipForCreateInstancesInput getEip() {
    return eip;
  }

  public void setEip(EipForCreateInstancesInput eip) {
    this.eip = eip;
  }

  public CreateInstancesRequest hostName(String hostName) {
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

  public CreateInstancesRequest hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @Schema(description = "")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public CreateInstancesRequest hpcClusterId(String hpcClusterId) {
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

  public CreateInstancesRequest imageId(String imageId) {
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

  public CreateInstancesRequest instanceChargeType(String instanceChargeType) {
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

  public CreateInstancesRequest instanceName(String instanceName) {
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

  public CreateInstancesRequest instanceType(String instanceType) {
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

  public CreateInstancesRequest instanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
    return this;
  }

   /**
   * Get instanceTypeId
   * @return instanceTypeId
  **/
  @Schema(description = "")
  public String getInstanceTypeId() {
    return instanceTypeId;
  }

  public void setInstanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
  }

  public CreateInstancesRequest ipv6Address(List<String> ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }

  public CreateInstancesRequest addIpv6AddressItem(String ipv6AddressItem) {
    if (this.ipv6Address == null) {
      this.ipv6Address = new ArrayList<String>();
    }
    this.ipv6Address.add(ipv6AddressItem);
    return this;
  }

   /**
   * Get ipv6Address
   * @return ipv6Address
  **/
  @Schema(description = "")
  public List<String> getIpv6Address() {
    return ipv6Address;
  }

  public void setIpv6Address(List<String> ipv6Address) {
    this.ipv6Address = ipv6Address;
  }

  public CreateInstancesRequest ipv6AddressCount(Integer ipv6AddressCount) {
    this.ipv6AddressCount = ipv6AddressCount;
    return this;
  }

   /**
   * Get ipv6AddressCount
   * @return ipv6AddressCount
  **/
  @Schema(description = "")
  public Integer getIpv6AddressCount() {
    return ipv6AddressCount;
  }

  public void setIpv6AddressCount(Integer ipv6AddressCount) {
    this.ipv6AddressCount = ipv6AddressCount;
  }

  public CreateInstancesRequest kerberos(Boolean kerberos) {
    this.kerberos = kerberos;
    return this;
  }

   /**
   * Get kerberos
   * @return kerberos
  **/
  @Schema(description = "")
  public Boolean isKerberos() {
    return kerberos;
  }

  public void setKerberos(Boolean kerberos) {
    this.kerberos = kerberos;
  }

  public CreateInstancesRequest keyPairName(String keyPairName) {
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

  public CreateInstancesRequest networkInterfaces(List<NetworkInterfaceForCreateInstancesInput> networkInterfaces) {
    this.networkInterfaces = networkInterfaces;
    return this;
  }

  public CreateInstancesRequest addNetworkInterfacesItem(NetworkInterfaceForCreateInstancesInput networkInterfacesItem) {
    if (this.networkInterfaces == null) {
      this.networkInterfaces = new ArrayList<NetworkInterfaceForCreateInstancesInput>();
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
  public List<NetworkInterfaceForCreateInstancesInput> getNetworkInterfaces() {
    return networkInterfaces;
  }

  public void setNetworkInterfaces(List<NetworkInterfaceForCreateInstancesInput> networkInterfaces) {
    this.networkInterfaces = networkInterfaces;
  }

  public CreateInstancesRequest password(String password) {
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

  public CreateInstancesRequest period(Integer period) {
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

  public CreateInstancesRequest periodUnit(String periodUnit) {
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

  public CreateInstancesRequest projectName(String projectName) {
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

  public CreateInstancesRequest securityEnhancementStrategy(String securityEnhancementStrategy) {
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

  public CreateInstancesRequest suffixIndex(Integer suffixIndex) {
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

  public CreateInstancesRequest tag(List<TagForCreateInstancesInput> tag) {
    this.tag = tag;
    return this;
  }

  public CreateInstancesRequest addTagItem(TagForCreateInstancesInput tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<TagForCreateInstancesInput>();
    }
    this.tag.add(tagItem);
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @Valid
  @Schema(description = "")
  public List<TagForCreateInstancesInput> getTag() {
    return tag;
  }

  public void setTag(List<TagForCreateInstancesInput> tag) {
    this.tag = tag;
  }

  public CreateInstancesRequest uniqueSuffix(Boolean uniqueSuffix) {
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

  public CreateInstancesRequest userData(String userData) {
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

  public CreateInstancesRequest volumeIdGroups(List<VolumeIdGroupForCreateInstancesInput> volumeIdGroups) {
    this.volumeIdGroups = volumeIdGroups;
    return this;
  }

  public CreateInstancesRequest addVolumeIdGroupsItem(VolumeIdGroupForCreateInstancesInput volumeIdGroupsItem) {
    if (this.volumeIdGroups == null) {
      this.volumeIdGroups = new ArrayList<VolumeIdGroupForCreateInstancesInput>();
    }
    this.volumeIdGroups.add(volumeIdGroupsItem);
    return this;
  }

   /**
   * Get volumeIdGroups
   * @return volumeIdGroups
  **/
  @Valid
  @Schema(description = "")
  public List<VolumeIdGroupForCreateInstancesInput> getVolumeIdGroups() {
    return volumeIdGroups;
  }

  public void setVolumeIdGroups(List<VolumeIdGroupForCreateInstancesInput> volumeIdGroups) {
    this.volumeIdGroups = volumeIdGroups;
  }

  public CreateInstancesRequest volumes(List<VolumeForCreateInstancesInput> volumes) {
    this.volumes = volumes;
    return this;
  }

  public CreateInstancesRequest addVolumesItem(VolumeForCreateInstancesInput volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<VolumeForCreateInstancesInput>();
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
  public List<VolumeForCreateInstancesInput> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<VolumeForCreateInstancesInput> volumes) {
    this.volumes = volumes;
  }

  public CreateInstancesRequest zoneId(String zoneId) {
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
    CreateInstancesRequest createInstancesRequest = (CreateInstancesRequest) o;
    return Objects.equals(this.accountId, createInstancesRequest.accountId) &&
        Objects.equals(this.antiAffinityRuleId, createInstancesRequest.antiAffinityRuleId) &&
        Objects.equals(this.autoRenew, createInstancesRequest.autoRenew) &&
        Objects.equals(this.autoRenewPeriod, createInstancesRequest.autoRenewPeriod) &&
        Objects.equals(this.count, createInstancesRequest.count) &&
        Objects.equals(this.cpuOptions, createInstancesRequest.cpuOptions) &&
        Objects.equals(this.deploymentSetId, createInstancesRequest.deploymentSetId) &&
        Objects.equals(this.description, createInstancesRequest.description) &&
        Objects.equals(this.dryRun, createInstancesRequest.dryRun) &&
        Objects.equals(this.eip, createInstancesRequest.eip) &&
        Objects.equals(this.hostName, createInstancesRequest.hostName) &&
        Objects.equals(this.hostname, createInstancesRequest.hostname) &&
        Objects.equals(this.hpcClusterId, createInstancesRequest.hpcClusterId) &&
        Objects.equals(this.imageId, createInstancesRequest.imageId) &&
        Objects.equals(this.instanceChargeType, createInstancesRequest.instanceChargeType) &&
        Objects.equals(this.instanceName, createInstancesRequest.instanceName) &&
        Objects.equals(this.instanceType, createInstancesRequest.instanceType) &&
        Objects.equals(this.instanceTypeId, createInstancesRequest.instanceTypeId) &&
        Objects.equals(this.ipv6Address, createInstancesRequest.ipv6Address) &&
        Objects.equals(this.ipv6AddressCount, createInstancesRequest.ipv6AddressCount) &&
        Objects.equals(this.kerberos, createInstancesRequest.kerberos) &&
        Objects.equals(this.keyPairName, createInstancesRequest.keyPairName) &&
        Objects.equals(this.networkInterfaces, createInstancesRequest.networkInterfaces) &&
        Objects.equals(this.password, createInstancesRequest.password) &&
        Objects.equals(this.period, createInstancesRequest.period) &&
        Objects.equals(this.periodUnit, createInstancesRequest.periodUnit) &&
        Objects.equals(this.projectName, createInstancesRequest.projectName) &&
        Objects.equals(this.securityEnhancementStrategy, createInstancesRequest.securityEnhancementStrategy) &&
        Objects.equals(this.suffixIndex, createInstancesRequest.suffixIndex) &&
        Objects.equals(this.tag, createInstancesRequest.tag) &&
        Objects.equals(this.uniqueSuffix, createInstancesRequest.uniqueSuffix) &&
        Objects.equals(this.userData, createInstancesRequest.userData) &&
        Objects.equals(this.volumeIdGroups, createInstancesRequest.volumeIdGroups) &&
        Objects.equals(this.volumes, createInstancesRequest.volumes) &&
        Objects.equals(this.zoneId, createInstancesRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, antiAffinityRuleId, autoRenew, autoRenewPeriod, count, cpuOptions, deploymentSetId, description, dryRun, eip, hostName, hostname, hpcClusterId, imageId, instanceChargeType, instanceName, instanceType, instanceTypeId, ipv6Address, ipv6AddressCount, kerberos, keyPairName, networkInterfaces, password, period, periodUnit, projectName, securityEnhancementStrategy, suffixIndex, tag, uniqueSuffix, userData, volumeIdGroups, volumes, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstancesRequest {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    antiAffinityRuleId: ").append(toIndentedString(antiAffinityRuleId)).append("\n");
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    autoRenewPeriod: ").append(toIndentedString(autoRenewPeriod)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    cpuOptions: ").append(toIndentedString(cpuOptions)).append("\n");
    sb.append("    deploymentSetId: ").append(toIndentedString(deploymentSetId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    hpcClusterId: ").append(toIndentedString(hpcClusterId)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    instanceChargeType: ").append(toIndentedString(instanceChargeType)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    instanceTypeId: ").append(toIndentedString(instanceTypeId)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
    sb.append("    ipv6AddressCount: ").append(toIndentedString(ipv6AddressCount)).append("\n");
    sb.append("    kerberos: ").append(toIndentedString(kerberos)).append("\n");
    sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
    sb.append("    networkInterfaces: ").append(toIndentedString(networkInterfaces)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    securityEnhancementStrategy: ").append(toIndentedString(securityEnhancementStrategy)).append("\n");
    sb.append("    suffixIndex: ").append(toIndentedString(suffixIndex)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    uniqueSuffix: ").append(toIndentedString(uniqueSuffix)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    volumeIdGroups: ").append(toIndentedString(volumeIdGroups)).append("\n");
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
