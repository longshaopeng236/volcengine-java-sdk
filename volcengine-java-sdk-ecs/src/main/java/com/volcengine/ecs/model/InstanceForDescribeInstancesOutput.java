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

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ecs.model.EipAddressForDescribeInstancesOutput;
import com.volcengine.ecs.model.LocalVolumeForDescribeInstancesOutput;
import com.volcengine.ecs.model.NetworkInterfaceForDescribeInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InstanceForDescribeInstancesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-01T17:18:25.441969+08:00[Asia/Shanghai]")
public class InstanceForDescribeInstancesOutput {
  @SerializedName("Cpus")
  private Integer cpus = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EipAddress")
  private EipAddressForDescribeInstancesOutput eipAddress = null;

  @SerializedName("ExpiredAt")
  private String expiredAt = null;

  @SerializedName("HostName")
  private String hostName = null;

  @SerializedName("ImageId")
  private String imageId = null;

  @SerializedName("InstanceChargeType")
  private String instanceChargeType = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceTypeId")
  private String instanceTypeId = null;

  @SerializedName("KeyPairId")
  private String keyPairId = null;

  @SerializedName("KeyPairName")
  private String keyPairName = null;

  @SerializedName("LocalVolumes")
  private List<LocalVolumeForDescribeInstancesOutput> localVolumes = null;

  @SerializedName("MemorySize")
  private Integer memorySize = null;

  @SerializedName("NetworkInterfaces")
  private List<NetworkInterfaceForDescribeInstancesOutput> networkInterfaces = null;

  @SerializedName("OsName")
  private String osName = null;

  @SerializedName("OsType")
  private String osType = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RdmaIpAddresses")
  private List<String> rdmaIpAddresses = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("StoppedMode")
  private String stoppedMode = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  @SerializedName("Uuid")
  private String uuid = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public InstanceForDescribeInstancesOutput cpus(Integer cpus) {
    this.cpus = cpus;
    return this;
  }

   /**
   * Get cpus
   * @return cpus
  **/
  @Schema(description = "")
  public Integer getCpus() {
    return cpus;
  }

  public void setCpus(Integer cpus) {
    this.cpus = cpus;
  }

  public InstanceForDescribeInstancesOutput createdAt(String createdAt) {
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

  public InstanceForDescribeInstancesOutput description(String description) {
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

  public InstanceForDescribeInstancesOutput eipAddress(EipAddressForDescribeInstancesOutput eipAddress) {
    this.eipAddress = eipAddress;
    return this;
  }

   /**
   * Get eipAddress
   * @return eipAddress
  **/
  @Valid
  @Schema(description = "")
  public EipAddressForDescribeInstancesOutput getEipAddress() {
    return eipAddress;
  }

  public void setEipAddress(EipAddressForDescribeInstancesOutput eipAddress) {
    this.eipAddress = eipAddress;
  }

  public InstanceForDescribeInstancesOutput expiredAt(String expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

   /**
   * Get expiredAt
   * @return expiredAt
  **/
  @Schema(description = "")
  public String getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(String expiredAt) {
    this.expiredAt = expiredAt;
  }

  public InstanceForDescribeInstancesOutput hostName(String hostName) {
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

  public InstanceForDescribeInstancesOutput imageId(String imageId) {
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

  public InstanceForDescribeInstancesOutput instanceChargeType(String instanceChargeType) {
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

  public InstanceForDescribeInstancesOutput instanceId(String instanceId) {
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

  public InstanceForDescribeInstancesOutput instanceName(String instanceName) {
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

  public InstanceForDescribeInstancesOutput instanceTypeId(String instanceTypeId) {
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

  public InstanceForDescribeInstancesOutput keyPairId(String keyPairId) {
    this.keyPairId = keyPairId;
    return this;
  }

   /**
   * Get keyPairId
   * @return keyPairId
  **/
  @Schema(description = "")
  public String getKeyPairId() {
    return keyPairId;
  }

  public void setKeyPairId(String keyPairId) {
    this.keyPairId = keyPairId;
  }

  public InstanceForDescribeInstancesOutput keyPairName(String keyPairName) {
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

  public InstanceForDescribeInstancesOutput localVolumes(List<LocalVolumeForDescribeInstancesOutput> localVolumes) {
    this.localVolumes = localVolumes;
    return this;
  }

  public InstanceForDescribeInstancesOutput addLocalVolumesItem(LocalVolumeForDescribeInstancesOutput localVolumesItem) {
    if (this.localVolumes == null) {
      this.localVolumes = new ArrayList<LocalVolumeForDescribeInstancesOutput>();
    }
    this.localVolumes.add(localVolumesItem);
    return this;
  }

   /**
   * Get localVolumes
   * @return localVolumes
  **/
  @Valid
  @Schema(description = "")
  public List<LocalVolumeForDescribeInstancesOutput> getLocalVolumes() {
    return localVolumes;
  }

  public void setLocalVolumes(List<LocalVolumeForDescribeInstancesOutput> localVolumes) {
    this.localVolumes = localVolumes;
  }

  public InstanceForDescribeInstancesOutput memorySize(Integer memorySize) {
    this.memorySize = memorySize;
    return this;
  }

   /**
   * Get memorySize
   * @return memorySize
  **/
  @Schema(description = "")
  public Integer getMemorySize() {
    return memorySize;
  }

  public void setMemorySize(Integer memorySize) {
    this.memorySize = memorySize;
  }

  public InstanceForDescribeInstancesOutput networkInterfaces(List<NetworkInterfaceForDescribeInstancesOutput> networkInterfaces) {
    this.networkInterfaces = networkInterfaces;
    return this;
  }

  public InstanceForDescribeInstancesOutput addNetworkInterfacesItem(NetworkInterfaceForDescribeInstancesOutput networkInterfacesItem) {
    if (this.networkInterfaces == null) {
      this.networkInterfaces = new ArrayList<NetworkInterfaceForDescribeInstancesOutput>();
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
  public List<NetworkInterfaceForDescribeInstancesOutput> getNetworkInterfaces() {
    return networkInterfaces;
  }

  public void setNetworkInterfaces(List<NetworkInterfaceForDescribeInstancesOutput> networkInterfaces) {
    this.networkInterfaces = networkInterfaces;
  }

  public InstanceForDescribeInstancesOutput osName(String osName) {
    this.osName = osName;
    return this;
  }

   /**
   * Get osName
   * @return osName
  **/
  @Schema(description = "")
  public String getOsName() {
    return osName;
  }

  public void setOsName(String osName) {
    this.osName = osName;
  }

  public InstanceForDescribeInstancesOutput osType(String osType) {
    this.osType = osType;
    return this;
  }

   /**
   * Get osType
   * @return osType
  **/
  @Schema(description = "")
  public String getOsType() {
    return osType;
  }

  public void setOsType(String osType) {
    this.osType = osType;
  }

  public InstanceForDescribeInstancesOutput projectName(String projectName) {
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

  public InstanceForDescribeInstancesOutput rdmaIpAddresses(List<String> rdmaIpAddresses) {
    this.rdmaIpAddresses = rdmaIpAddresses;
    return this;
  }

  public InstanceForDescribeInstancesOutput addRdmaIpAddressesItem(String rdmaIpAddressesItem) {
    if (this.rdmaIpAddresses == null) {
      this.rdmaIpAddresses = new ArrayList<String>();
    }
    this.rdmaIpAddresses.add(rdmaIpAddressesItem);
    return this;
  }

   /**
   * Get rdmaIpAddresses
   * @return rdmaIpAddresses
  **/
  @Schema(description = "")
  public List<String> getRdmaIpAddresses() {
    return rdmaIpAddresses;
  }

  public void setRdmaIpAddresses(List<String> rdmaIpAddresses) {
    this.rdmaIpAddresses = rdmaIpAddresses;
  }

  public InstanceForDescribeInstancesOutput status(String status) {
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

  public InstanceForDescribeInstancesOutput stoppedMode(String stoppedMode) {
    this.stoppedMode = stoppedMode;
    return this;
  }

   /**
   * Get stoppedMode
   * @return stoppedMode
  **/
  @Schema(description = "")
  public String getStoppedMode() {
    return stoppedMode;
  }

  public void setStoppedMode(String stoppedMode) {
    this.stoppedMode = stoppedMode;
  }

  public InstanceForDescribeInstancesOutput updatedAt(String updatedAt) {
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

  public InstanceForDescribeInstancesOutput uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public InstanceForDescribeInstancesOutput vpcId(String vpcId) {
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

  public InstanceForDescribeInstancesOutput zoneId(String zoneId) {
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
    InstanceForDescribeInstancesOutput instanceForDescribeInstancesOutput = (InstanceForDescribeInstancesOutput) o;
    return Objects.equals(this.cpus, instanceForDescribeInstancesOutput.cpus) &&
        Objects.equals(this.createdAt, instanceForDescribeInstancesOutput.createdAt) &&
        Objects.equals(this.description, instanceForDescribeInstancesOutput.description) &&
        Objects.equals(this.eipAddress, instanceForDescribeInstancesOutput.eipAddress) &&
        Objects.equals(this.expiredAt, instanceForDescribeInstancesOutput.expiredAt) &&
        Objects.equals(this.hostName, instanceForDescribeInstancesOutput.hostName) &&
        Objects.equals(this.imageId, instanceForDescribeInstancesOutput.imageId) &&
        Objects.equals(this.instanceChargeType, instanceForDescribeInstancesOutput.instanceChargeType) &&
        Objects.equals(this.instanceId, instanceForDescribeInstancesOutput.instanceId) &&
        Objects.equals(this.instanceName, instanceForDescribeInstancesOutput.instanceName) &&
        Objects.equals(this.instanceTypeId, instanceForDescribeInstancesOutput.instanceTypeId) &&
        Objects.equals(this.keyPairId, instanceForDescribeInstancesOutput.keyPairId) &&
        Objects.equals(this.keyPairName, instanceForDescribeInstancesOutput.keyPairName) &&
        Objects.equals(this.localVolumes, instanceForDescribeInstancesOutput.localVolumes) &&
        Objects.equals(this.memorySize, instanceForDescribeInstancesOutput.memorySize) &&
        Objects.equals(this.networkInterfaces, instanceForDescribeInstancesOutput.networkInterfaces) &&
        Objects.equals(this.osName, instanceForDescribeInstancesOutput.osName) &&
        Objects.equals(this.osType, instanceForDescribeInstancesOutput.osType) &&
        Objects.equals(this.projectName, instanceForDescribeInstancesOutput.projectName) &&
        Objects.equals(this.rdmaIpAddresses, instanceForDescribeInstancesOutput.rdmaIpAddresses) &&
        Objects.equals(this.status, instanceForDescribeInstancesOutput.status) &&
        Objects.equals(this.stoppedMode, instanceForDescribeInstancesOutput.stoppedMode) &&
        Objects.equals(this.updatedAt, instanceForDescribeInstancesOutput.updatedAt) &&
        Objects.equals(this.uuid, instanceForDescribeInstancesOutput.uuid) &&
        Objects.equals(this.vpcId, instanceForDescribeInstancesOutput.vpcId) &&
        Objects.equals(this.zoneId, instanceForDescribeInstancesOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpus, createdAt, description, eipAddress, expiredAt, hostName, imageId, instanceChargeType, instanceId, instanceName, instanceTypeId, keyPairId, keyPairName, localVolumes, memorySize, networkInterfaces, osName, osType, projectName, rdmaIpAddresses, status, stoppedMode, updatedAt, uuid, vpcId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceForDescribeInstancesOutput {\n");
    
    sb.append("    cpus: ").append(toIndentedString(cpus)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    instanceChargeType: ").append(toIndentedString(instanceChargeType)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceTypeId: ").append(toIndentedString(instanceTypeId)).append("\n");
    sb.append("    keyPairId: ").append(toIndentedString(keyPairId)).append("\n");
    sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
    sb.append("    localVolumes: ").append(toIndentedString(localVolumes)).append("\n");
    sb.append("    memorySize: ").append(toIndentedString(memorySize)).append("\n");
    sb.append("    networkInterfaces: ").append(toIndentedString(networkInterfaces)).append("\n");
    sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
    sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    rdmaIpAddresses: ").append(toIndentedString(rdmaIpAddresses)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stoppedMode: ").append(toIndentedString(stoppedMode)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
