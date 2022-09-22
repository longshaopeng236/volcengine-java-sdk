/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.directconnect.model.TagForDescribeDirectConnectVirtualInterfacesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:22.987183+08:00[Asia/Shanghai]")
public class VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BfdDetectInterval")
  private Integer bfdDetectInterval = null;

  @SerializedName("BfdDetectMultiplier")
  private Integer bfdDetectMultiplier = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DirectConnectConnectionId")
  private String directConnectConnectionId = null;

  @SerializedName("DirectConnectGatewayId")
  private String directConnectGatewayId = null;

  @SerializedName("EnableBfd")
  private Boolean enableBfd = null;

  @SerializedName("LocalIp")
  private String localIp = null;

  @SerializedName("LocalIpv6Ip")
  private String localIpv6Ip = null;

  @SerializedName("PeerIp")
  private String peerIp = null;

  @SerializedName("PeerIpv6Ip")
  private String peerIpv6Ip = null;

  @SerializedName("RouteType")
  private String routeType = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeDirectConnectVirtualInterfacesOutput> tags = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VirtualInterfaceId")
  private String virtualInterfaceId = null;

  @SerializedName("VirtualInterfaceName")
  private String virtualInterfaceName = null;

  @SerializedName("VlanId")
  private Integer vlanId = null;

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput accountId(String accountId) {
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

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @Schema(description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput bfdDetectInterval(Integer bfdDetectInterval) {
    this.bfdDetectInterval = bfdDetectInterval;
    return this;
  }

   /**
   * Get bfdDetectInterval
   * @return bfdDetectInterval
  **/
  @Schema(description = "")
  public Integer getBfdDetectInterval() {
    return bfdDetectInterval;
  }

  public void setBfdDetectInterval(Integer bfdDetectInterval) {
    this.bfdDetectInterval = bfdDetectInterval;
  }

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput bfdDetectMultiplier(Integer bfdDetectMultiplier) {
    this.bfdDetectMultiplier = bfdDetectMultiplier;
    return this;
  }

   /**
   * Get bfdDetectMultiplier
   * @return bfdDetectMultiplier
  **/
  @Schema(description = "")
  public Integer getBfdDetectMultiplier() {
    return bfdDetectMultiplier;
  }

  public void setBfdDetectMultiplier(Integer bfdDetectMultiplier) {
    this.bfdDetectMultiplier = bfdDetectMultiplier;
  }

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput description(String description) {
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

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput directConnectConnectionId(String directConnectConnectionId) {
    this.directConnectConnectionId = directConnectConnectionId;
    return this;
  }

   /**
   * Get directConnectConnectionId
   * @return directConnectConnectionId
  **/
  @Schema(description = "")
  public String getDirectConnectConnectionId() {
    return directConnectConnectionId;
  }

  public void setDirectConnectConnectionId(String directConnectConnectionId) {
    this.directConnectConnectionId = directConnectConnectionId;
  }

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput directConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
    return this;
  }

   /**
   * Get directConnectGatewayId
   * @return directConnectGatewayId
  **/
  @Schema(description = "")
  public String getDirectConnectGatewayId() {
    return directConnectGatewayId;
  }

  public void setDirectConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
  }

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput enableBfd(Boolean enableBfd) {
    this.enableBfd = enableBfd;
    return this;
  }

   /**
   * Get enableBfd
   * @return enableBfd
  **/
  @Schema(description = "")
  public Boolean isEnableBfd() {
    return enableBfd;
  }

  public void setEnableBfd(Boolean enableBfd) {
    this.enableBfd = enableBfd;
  }

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput localIp(String localIp) {
    this.localIp = localIp;
    return this;
  }

   /**
   * Get localIp
   * @return localIp
  **/
  @Schema(description = "")
  public String getLocalIp() {
    return localIp;
  }

  public void setLocalIp(String localIp) {
    this.localIp = localIp;
  }

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput localIpv6Ip(String localIpv6Ip) {
    this.localIpv6Ip = localIpv6Ip;
    return this;
  }

   /**
   * Get localIpv6Ip
   * @return localIpv6Ip
  **/
  @Schema(description = "")
  public String getLocalIpv6Ip() {
    return localIpv6Ip;
  }

  public void setLocalIpv6Ip(String localIpv6Ip) {
    this.localIpv6Ip = localIpv6Ip;
  }

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput peerIp(String peerIp) {
    this.peerIp = peerIp;
    return this;
  }

   /**
   * Get peerIp
   * @return peerIp
  **/
  @Schema(description = "")
  public String getPeerIp() {
    return peerIp;
  }

  public void setPeerIp(String peerIp) {
    this.peerIp = peerIp;
  }

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput peerIpv6Ip(String peerIpv6Ip) {
    this.peerIpv6Ip = peerIpv6Ip;
    return this;
  }

   /**
   * Get peerIpv6Ip
   * @return peerIpv6Ip
  **/
  @Schema(description = "")
  public String getPeerIpv6Ip() {
    return peerIpv6Ip;
  }

  public void setPeerIpv6Ip(String peerIpv6Ip) {
    this.peerIpv6Ip = peerIpv6Ip;
  }

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput routeType(String routeType) {
    this.routeType = routeType;
    return this;
  }

   /**
   * Get routeType
   * @return routeType
  **/
  @Schema(description = "")
  public String getRouteType() {
    return routeType;
  }

  public void setRouteType(String routeType) {
    this.routeType = routeType;
  }

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput status(String status) {
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

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput tags(List<TagForDescribeDirectConnectVirtualInterfacesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput addTagsItem(TagForDescribeDirectConnectVirtualInterfacesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeDirectConnectVirtualInterfacesOutput>();
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
  public List<TagForDescribeDirectConnectVirtualInterfacesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeDirectConnectVirtualInterfacesOutput> tags) {
    this.tags = tags;
  }

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput updateTime(String updateTime) {
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

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput virtualInterfaceId(String virtualInterfaceId) {
    this.virtualInterfaceId = virtualInterfaceId;
    return this;
  }

   /**
   * Get virtualInterfaceId
   * @return virtualInterfaceId
  **/
  @Schema(description = "")
  public String getVirtualInterfaceId() {
    return virtualInterfaceId;
  }

  public void setVirtualInterfaceId(String virtualInterfaceId) {
    this.virtualInterfaceId = virtualInterfaceId;
  }

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput virtualInterfaceName(String virtualInterfaceName) {
    this.virtualInterfaceName = virtualInterfaceName;
    return this;
  }

   /**
   * Get virtualInterfaceName
   * @return virtualInterfaceName
  **/
  @Schema(description = "")
  public String getVirtualInterfaceName() {
    return virtualInterfaceName;
  }

  public void setVirtualInterfaceName(String virtualInterfaceName) {
    this.virtualInterfaceName = virtualInterfaceName;
  }

  public VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput vlanId(Integer vlanId) {
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @Schema(description = "")
  public Integer getVlanId() {
    return vlanId;
  }

  public void setVlanId(Integer vlanId) {
    this.vlanId = vlanId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput = (VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput) o;
    return Objects.equals(this.accountId, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.accountId) &&
        Objects.equals(this.bandwidth, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.bandwidth) &&
        Objects.equals(this.bfdDetectInterval, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.bfdDetectInterval) &&
        Objects.equals(this.bfdDetectMultiplier, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.bfdDetectMultiplier) &&
        Objects.equals(this.creationTime, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.creationTime) &&
        Objects.equals(this.description, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.description) &&
        Objects.equals(this.directConnectConnectionId, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.directConnectConnectionId) &&
        Objects.equals(this.directConnectGatewayId, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.directConnectGatewayId) &&
        Objects.equals(this.enableBfd, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.enableBfd) &&
        Objects.equals(this.localIp, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.localIp) &&
        Objects.equals(this.localIpv6Ip, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.localIpv6Ip) &&
        Objects.equals(this.peerIp, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.peerIp) &&
        Objects.equals(this.peerIpv6Ip, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.peerIpv6Ip) &&
        Objects.equals(this.routeType, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.routeType) &&
        Objects.equals(this.status, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.status) &&
        Objects.equals(this.tags, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.tags) &&
        Objects.equals(this.updateTime, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.updateTime) &&
        Objects.equals(this.virtualInterfaceId, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.virtualInterfaceId) &&
        Objects.equals(this.virtualInterfaceName, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.virtualInterfaceName) &&
        Objects.equals(this.vlanId, virtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput.vlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bandwidth, bfdDetectInterval, bfdDetectMultiplier, creationTime, description, directConnectConnectionId, directConnectGatewayId, enableBfd, localIp, localIpv6Ip, peerIp, peerIpv6Ip, routeType, status, tags, updateTime, virtualInterfaceId, virtualInterfaceName, vlanId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    bfdDetectInterval: ").append(toIndentedString(bfdDetectInterval)).append("\n");
    sb.append("    bfdDetectMultiplier: ").append(toIndentedString(bfdDetectMultiplier)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    directConnectConnectionId: ").append(toIndentedString(directConnectConnectionId)).append("\n");
    sb.append("    directConnectGatewayId: ").append(toIndentedString(directConnectGatewayId)).append("\n");
    sb.append("    enableBfd: ").append(toIndentedString(enableBfd)).append("\n");
    sb.append("    localIp: ").append(toIndentedString(localIp)).append("\n");
    sb.append("    localIpv6Ip: ").append(toIndentedString(localIpv6Ip)).append("\n");
    sb.append("    peerIp: ").append(toIndentedString(peerIp)).append("\n");
    sb.append("    peerIpv6Ip: ").append(toIndentedString(peerIpv6Ip)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    virtualInterfaceId: ").append(toIndentedString(virtualInterfaceId)).append("\n");
    sb.append("    virtualInterfaceName: ").append(toIndentedString(virtualInterfaceName)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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
