/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpc.model.AssociatedElasticIpForDescribeNetworkInterfaceAttributesOutput;
import com.volcengine.vpc.model.PrivateIpSetsForDescribeNetworkInterfaceAttributesOutput;
import com.volcengine.vpc.model.TagForDescribeNetworkInterfaceAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeNetworkInterfaceAttributesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T12:08:25.743848+08:00[Asia/Shanghai]")
public class DescribeNetworkInterfaceAttributesResponse {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("AssociatedElasticIp")
  private AssociatedElasticIpForDescribeNetworkInterfaceAttributesOutput associatedElasticIp = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DeviceId")
  private String deviceId = null;

  @SerializedName("MacAddress")
  private String macAddress = null;

  @SerializedName("NetworkInterfaceId")
  private String networkInterfaceId = null;

  @SerializedName("NetworkInterfaceName")
  private String networkInterfaceName = null;

  @SerializedName("PortSecurityEnabled")
  private Boolean portSecurityEnabled = null;

  @SerializedName("PrimaryIpAddress")
  private String primaryIpAddress = null;

  @SerializedName("PrivateIpSets")
  private PrivateIpSetsForDescribeNetworkInterfaceAttributesOutput privateIpSets = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("SecurityGroupIds")
  private List<String> securityGroupIds = null;

  @SerializedName("ServiceManaged")
  private Boolean serviceManaged = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("Tags")
  private List<TagForDescribeNetworkInterfaceAttributesOutput> tags = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("VpcName")
  private String vpcName = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public DescribeNetworkInterfaceAttributesResponse accountId(String accountId) {
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

  public DescribeNetworkInterfaceAttributesResponse associatedElasticIp(AssociatedElasticIpForDescribeNetworkInterfaceAttributesOutput associatedElasticIp) {
    this.associatedElasticIp = associatedElasticIp;
    return this;
  }

   /**
   * Get associatedElasticIp
   * @return associatedElasticIp
  **/
  @Valid
  @Schema(description = "")
  public AssociatedElasticIpForDescribeNetworkInterfaceAttributesOutput getAssociatedElasticIp() {
    return associatedElasticIp;
  }

  public void setAssociatedElasticIp(AssociatedElasticIpForDescribeNetworkInterfaceAttributesOutput associatedElasticIp) {
    this.associatedElasticIp = associatedElasticIp;
  }

  public DescribeNetworkInterfaceAttributesResponse createdAt(String createdAt) {
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

  public DescribeNetworkInterfaceAttributesResponse description(String description) {
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

  public DescribeNetworkInterfaceAttributesResponse deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @Schema(description = "")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public DescribeNetworkInterfaceAttributesResponse macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * Get macAddress
   * @return macAddress
  **/
  @Schema(description = "")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public DescribeNetworkInterfaceAttributesResponse networkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
    return this;
  }

   /**
   * Get networkInterfaceId
   * @return networkInterfaceId
  **/
  @Schema(description = "")
  public String getNetworkInterfaceId() {
    return networkInterfaceId;
  }

  public void setNetworkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
  }

  public DescribeNetworkInterfaceAttributesResponse networkInterfaceName(String networkInterfaceName) {
    this.networkInterfaceName = networkInterfaceName;
    return this;
  }

   /**
   * Get networkInterfaceName
   * @return networkInterfaceName
  **/
  @Schema(description = "")
  public String getNetworkInterfaceName() {
    return networkInterfaceName;
  }

  public void setNetworkInterfaceName(String networkInterfaceName) {
    this.networkInterfaceName = networkInterfaceName;
  }

  public DescribeNetworkInterfaceAttributesResponse portSecurityEnabled(Boolean portSecurityEnabled) {
    this.portSecurityEnabled = portSecurityEnabled;
    return this;
  }

   /**
   * Get portSecurityEnabled
   * @return portSecurityEnabled
  **/
  @Schema(description = "")
  public Boolean isPortSecurityEnabled() {
    return portSecurityEnabled;
  }

  public void setPortSecurityEnabled(Boolean portSecurityEnabled) {
    this.portSecurityEnabled = portSecurityEnabled;
  }

  public DescribeNetworkInterfaceAttributesResponse primaryIpAddress(String primaryIpAddress) {
    this.primaryIpAddress = primaryIpAddress;
    return this;
  }

   /**
   * Get primaryIpAddress
   * @return primaryIpAddress
  **/
  @Schema(description = "")
  public String getPrimaryIpAddress() {
    return primaryIpAddress;
  }

  public void setPrimaryIpAddress(String primaryIpAddress) {
    this.primaryIpAddress = primaryIpAddress;
  }

  public DescribeNetworkInterfaceAttributesResponse privateIpSets(PrivateIpSetsForDescribeNetworkInterfaceAttributesOutput privateIpSets) {
    this.privateIpSets = privateIpSets;
    return this;
  }

   /**
   * Get privateIpSets
   * @return privateIpSets
  **/
  @Valid
  @Schema(description = "")
  public PrivateIpSetsForDescribeNetworkInterfaceAttributesOutput getPrivateIpSets() {
    return privateIpSets;
  }

  public void setPrivateIpSets(PrivateIpSetsForDescribeNetworkInterfaceAttributesOutput privateIpSets) {
    this.privateIpSets = privateIpSets;
  }

  public DescribeNetworkInterfaceAttributesResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DescribeNetworkInterfaceAttributesResponse securityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public DescribeNetworkInterfaceAttributesResponse addSecurityGroupIdsItem(String securityGroupIdsItem) {
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

  public DescribeNetworkInterfaceAttributesResponse serviceManaged(Boolean serviceManaged) {
    this.serviceManaged = serviceManaged;
    return this;
  }

   /**
   * Get serviceManaged
   * @return serviceManaged
  **/
  @Schema(description = "")
  public Boolean isServiceManaged() {
    return serviceManaged;
  }

  public void setServiceManaged(Boolean serviceManaged) {
    this.serviceManaged = serviceManaged;
  }

  public DescribeNetworkInterfaceAttributesResponse status(String status) {
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

  public DescribeNetworkInterfaceAttributesResponse subnetId(String subnetId) {
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

  public DescribeNetworkInterfaceAttributesResponse tags(List<TagForDescribeNetworkInterfaceAttributesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public DescribeNetworkInterfaceAttributesResponse addTagsItem(TagForDescribeNetworkInterfaceAttributesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeNetworkInterfaceAttributesOutput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForDescribeNetworkInterfaceAttributesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeNetworkInterfaceAttributesOutput> tags) {
    this.tags = tags;
  }

  public DescribeNetworkInterfaceAttributesResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DescribeNetworkInterfaceAttributesResponse updatedAt(String updatedAt) {
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

  public DescribeNetworkInterfaceAttributesResponse vpcId(String vpcId) {
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

  public DescribeNetworkInterfaceAttributesResponse vpcName(String vpcName) {
    this.vpcName = vpcName;
    return this;
  }

   /**
   * Get vpcName
   * @return vpcName
  **/
  @Schema(description = "")
  public String getVpcName() {
    return vpcName;
  }

  public void setVpcName(String vpcName) {
    this.vpcName = vpcName;
  }

  public DescribeNetworkInterfaceAttributesResponse zoneId(String zoneId) {
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
    DescribeNetworkInterfaceAttributesResponse describeNetworkInterfaceAttributesResponse = (DescribeNetworkInterfaceAttributesResponse) o;
    return Objects.equals(this.accountId, describeNetworkInterfaceAttributesResponse.accountId) &&
        Objects.equals(this.associatedElasticIp, describeNetworkInterfaceAttributesResponse.associatedElasticIp) &&
        Objects.equals(this.createdAt, describeNetworkInterfaceAttributesResponse.createdAt) &&
        Objects.equals(this.description, describeNetworkInterfaceAttributesResponse.description) &&
        Objects.equals(this.deviceId, describeNetworkInterfaceAttributesResponse.deviceId) &&
        Objects.equals(this.macAddress, describeNetworkInterfaceAttributesResponse.macAddress) &&
        Objects.equals(this.networkInterfaceId, describeNetworkInterfaceAttributesResponse.networkInterfaceId) &&
        Objects.equals(this.networkInterfaceName, describeNetworkInterfaceAttributesResponse.networkInterfaceName) &&
        Objects.equals(this.portSecurityEnabled, describeNetworkInterfaceAttributesResponse.portSecurityEnabled) &&
        Objects.equals(this.primaryIpAddress, describeNetworkInterfaceAttributesResponse.primaryIpAddress) &&
        Objects.equals(this.privateIpSets, describeNetworkInterfaceAttributesResponse.privateIpSets) &&
        Objects.equals(this.requestId, describeNetworkInterfaceAttributesResponse.requestId) &&
        Objects.equals(this.securityGroupIds, describeNetworkInterfaceAttributesResponse.securityGroupIds) &&
        Objects.equals(this.serviceManaged, describeNetworkInterfaceAttributesResponse.serviceManaged) &&
        Objects.equals(this.status, describeNetworkInterfaceAttributesResponse.status) &&
        Objects.equals(this.subnetId, describeNetworkInterfaceAttributesResponse.subnetId) &&
        Objects.equals(this.tags, describeNetworkInterfaceAttributesResponse.tags) &&
        Objects.equals(this.type, describeNetworkInterfaceAttributesResponse.type) &&
        Objects.equals(this.updatedAt, describeNetworkInterfaceAttributesResponse.updatedAt) &&
        Objects.equals(this.vpcId, describeNetworkInterfaceAttributesResponse.vpcId) &&
        Objects.equals(this.vpcName, describeNetworkInterfaceAttributesResponse.vpcName) &&
        Objects.equals(this.zoneId, describeNetworkInterfaceAttributesResponse.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, associatedElasticIp, createdAt, description, deviceId, macAddress, networkInterfaceId, networkInterfaceName, portSecurityEnabled, primaryIpAddress, privateIpSets, requestId, securityGroupIds, serviceManaged, status, subnetId, tags, type, updatedAt, vpcId, vpcName, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeNetworkInterfaceAttributesResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    associatedElasticIp: ").append(toIndentedString(associatedElasticIp)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    networkInterfaceId: ").append(toIndentedString(networkInterfaceId)).append("\n");
    sb.append("    networkInterfaceName: ").append(toIndentedString(networkInterfaceName)).append("\n");
    sb.append("    portSecurityEnabled: ").append(toIndentedString(portSecurityEnabled)).append("\n");
    sb.append("    primaryIpAddress: ").append(toIndentedString(primaryIpAddress)).append("\n");
    sb.append("    privateIpSets: ").append(toIndentedString(privateIpSets)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
    sb.append("    serviceManaged: ").append(toIndentedString(serviceManaged)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
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
