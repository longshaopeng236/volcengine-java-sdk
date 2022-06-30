/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpn.model.IkeConfigForDescribeVpnConnectionsOutput;
import com.volcengine.vpn.model.IpsecConfigForDescribeVpnConnectionsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VpnConnectionForDescribeVpnConnectionsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T20:18:23.808118+08:00[Asia/Shanghai]")
public class VpnConnectionForDescribeVpnConnectionsOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("CustomerGatewayId")
  private String customerGatewayId = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("IkeConfig")
  private IkeConfigForDescribeVpnConnectionsOutput ikeConfig = null;

  @SerializedName("IpsecConfig")
  private IpsecConfigForDescribeVpnConnectionsOutput ipsecConfig = null;

  @SerializedName("LocalSubnet")
  private List<String> localSubnet = null;

  @SerializedName("NatTraversal")
  private Boolean natTraversal = null;

  @SerializedName("RemoteSubnet")
  private List<String> remoteSubnet = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpnConnectionId")
  private String vpnConnectionId = null;

  @SerializedName("VpnConnectionName")
  private String vpnConnectionName = null;

  @SerializedName("VpnGatewayId")
  private String vpnGatewayId = null;

  public VpnConnectionForDescribeVpnConnectionsOutput accountId(String accountId) {
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

  public VpnConnectionForDescribeVpnConnectionsOutput creationTime(String creationTime) {
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

  public VpnConnectionForDescribeVpnConnectionsOutput customerGatewayId(String customerGatewayId) {
    this.customerGatewayId = customerGatewayId;
    return this;
  }

   /**
   * Get customerGatewayId
   * @return customerGatewayId
  **/
  @Schema(description = "")
  public String getCustomerGatewayId() {
    return customerGatewayId;
  }

  public void setCustomerGatewayId(String customerGatewayId) {
    this.customerGatewayId = customerGatewayId;
  }

  public VpnConnectionForDescribeVpnConnectionsOutput description(String description) {
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

  public VpnConnectionForDescribeVpnConnectionsOutput ikeConfig(IkeConfigForDescribeVpnConnectionsOutput ikeConfig) {
    this.ikeConfig = ikeConfig;
    return this;
  }

   /**
   * Get ikeConfig
   * @return ikeConfig
  **/
  @Valid
  @Schema(description = "")
  public IkeConfigForDescribeVpnConnectionsOutput getIkeConfig() {
    return ikeConfig;
  }

  public void setIkeConfig(IkeConfigForDescribeVpnConnectionsOutput ikeConfig) {
    this.ikeConfig = ikeConfig;
  }

  public VpnConnectionForDescribeVpnConnectionsOutput ipsecConfig(IpsecConfigForDescribeVpnConnectionsOutput ipsecConfig) {
    this.ipsecConfig = ipsecConfig;
    return this;
  }

   /**
   * Get ipsecConfig
   * @return ipsecConfig
  **/
  @Valid
  @Schema(description = "")
  public IpsecConfigForDescribeVpnConnectionsOutput getIpsecConfig() {
    return ipsecConfig;
  }

  public void setIpsecConfig(IpsecConfigForDescribeVpnConnectionsOutput ipsecConfig) {
    this.ipsecConfig = ipsecConfig;
  }

  public VpnConnectionForDescribeVpnConnectionsOutput localSubnet(List<String> localSubnet) {
    this.localSubnet = localSubnet;
    return this;
  }

  public VpnConnectionForDescribeVpnConnectionsOutput addLocalSubnetItem(String localSubnetItem) {
    if (this.localSubnet == null) {
      this.localSubnet = new ArrayList<String>();
    }
    this.localSubnet.add(localSubnetItem);
    return this;
  }

   /**
   * Get localSubnet
   * @return localSubnet
  **/
  @Schema(description = "")
  public List<String> getLocalSubnet() {
    return localSubnet;
  }

  public void setLocalSubnet(List<String> localSubnet) {
    this.localSubnet = localSubnet;
  }

  public VpnConnectionForDescribeVpnConnectionsOutput natTraversal(Boolean natTraversal) {
    this.natTraversal = natTraversal;
    return this;
  }

   /**
   * Get natTraversal
   * @return natTraversal
  **/
  @Schema(description = "")
  public Boolean isNatTraversal() {
    return natTraversal;
  }

  public void setNatTraversal(Boolean natTraversal) {
    this.natTraversal = natTraversal;
  }

  public VpnConnectionForDescribeVpnConnectionsOutput remoteSubnet(List<String> remoteSubnet) {
    this.remoteSubnet = remoteSubnet;
    return this;
  }

  public VpnConnectionForDescribeVpnConnectionsOutput addRemoteSubnetItem(String remoteSubnetItem) {
    if (this.remoteSubnet == null) {
      this.remoteSubnet = new ArrayList<String>();
    }
    this.remoteSubnet.add(remoteSubnetItem);
    return this;
  }

   /**
   * Get remoteSubnet
   * @return remoteSubnet
  **/
  @Schema(description = "")
  public List<String> getRemoteSubnet() {
    return remoteSubnet;
  }

  public void setRemoteSubnet(List<String> remoteSubnet) {
    this.remoteSubnet = remoteSubnet;
  }

  public VpnConnectionForDescribeVpnConnectionsOutput status(String status) {
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

  public VpnConnectionForDescribeVpnConnectionsOutput updateTime(String updateTime) {
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

  public VpnConnectionForDescribeVpnConnectionsOutput vpnConnectionId(String vpnConnectionId) {
    this.vpnConnectionId = vpnConnectionId;
    return this;
  }

   /**
   * Get vpnConnectionId
   * @return vpnConnectionId
  **/
  @Schema(description = "")
  public String getVpnConnectionId() {
    return vpnConnectionId;
  }

  public void setVpnConnectionId(String vpnConnectionId) {
    this.vpnConnectionId = vpnConnectionId;
  }

  public VpnConnectionForDescribeVpnConnectionsOutput vpnConnectionName(String vpnConnectionName) {
    this.vpnConnectionName = vpnConnectionName;
    return this;
  }

   /**
   * Get vpnConnectionName
   * @return vpnConnectionName
  **/
  @Schema(description = "")
  public String getVpnConnectionName() {
    return vpnConnectionName;
  }

  public void setVpnConnectionName(String vpnConnectionName) {
    this.vpnConnectionName = vpnConnectionName;
  }

  public VpnConnectionForDescribeVpnConnectionsOutput vpnGatewayId(String vpnGatewayId) {
    this.vpnGatewayId = vpnGatewayId;
    return this;
  }

   /**
   * Get vpnGatewayId
   * @return vpnGatewayId
  **/
  @Schema(description = "")
  public String getVpnGatewayId() {
    return vpnGatewayId;
  }

  public void setVpnGatewayId(String vpnGatewayId) {
    this.vpnGatewayId = vpnGatewayId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VpnConnectionForDescribeVpnConnectionsOutput vpnConnectionForDescribeVpnConnectionsOutput = (VpnConnectionForDescribeVpnConnectionsOutput) o;
    return Objects.equals(this.accountId, vpnConnectionForDescribeVpnConnectionsOutput.accountId) &&
        Objects.equals(this.creationTime, vpnConnectionForDescribeVpnConnectionsOutput.creationTime) &&
        Objects.equals(this.customerGatewayId, vpnConnectionForDescribeVpnConnectionsOutput.customerGatewayId) &&
        Objects.equals(this.description, vpnConnectionForDescribeVpnConnectionsOutput.description) &&
        Objects.equals(this.ikeConfig, vpnConnectionForDescribeVpnConnectionsOutput.ikeConfig) &&
        Objects.equals(this.ipsecConfig, vpnConnectionForDescribeVpnConnectionsOutput.ipsecConfig) &&
        Objects.equals(this.localSubnet, vpnConnectionForDescribeVpnConnectionsOutput.localSubnet) &&
        Objects.equals(this.natTraversal, vpnConnectionForDescribeVpnConnectionsOutput.natTraversal) &&
        Objects.equals(this.remoteSubnet, vpnConnectionForDescribeVpnConnectionsOutput.remoteSubnet) &&
        Objects.equals(this.status, vpnConnectionForDescribeVpnConnectionsOutput.status) &&
        Objects.equals(this.updateTime, vpnConnectionForDescribeVpnConnectionsOutput.updateTime) &&
        Objects.equals(this.vpnConnectionId, vpnConnectionForDescribeVpnConnectionsOutput.vpnConnectionId) &&
        Objects.equals(this.vpnConnectionName, vpnConnectionForDescribeVpnConnectionsOutput.vpnConnectionName) &&
        Objects.equals(this.vpnGatewayId, vpnConnectionForDescribeVpnConnectionsOutput.vpnGatewayId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, creationTime, customerGatewayId, description, ikeConfig, ipsecConfig, localSubnet, natTraversal, remoteSubnet, status, updateTime, vpnConnectionId, vpnConnectionName, vpnGatewayId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VpnConnectionForDescribeVpnConnectionsOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    customerGatewayId: ").append(toIndentedString(customerGatewayId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ikeConfig: ").append(toIndentedString(ikeConfig)).append("\n");
    sb.append("    ipsecConfig: ").append(toIndentedString(ipsecConfig)).append("\n");
    sb.append("    localSubnet: ").append(toIndentedString(localSubnet)).append("\n");
    sb.append("    natTraversal: ").append(toIndentedString(natTraversal)).append("\n");
    sb.append("    remoteSubnet: ").append(toIndentedString(remoteSubnet)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpnConnectionId: ").append(toIndentedString(vpnConnectionId)).append("\n");
    sb.append("    vpnConnectionName: ").append(toIndentedString(vpnConnectionName)).append("\n");
    sb.append("    vpnGatewayId: ").append(toIndentedString(vpnGatewayId)).append("\n");
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
