/*
 * natgateway
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.natgateway.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcstack.natgateway.model.EipAddressForDescribeNatGatewaysOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NatGatewayForDescribeNatGatewaysOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:41.250123+08:00[Asia/Shanghai]")
public class NatGatewayForDescribeNatGatewaysOutput {
  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EipAddresses")
  private List<EipAddressForDescribeNatGatewaysOutput> eipAddresses = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("LockReason")
  private String lockReason = null;

  @SerializedName("NatGatewayId")
  private String natGatewayId = null;

  @SerializedName("NatGatewayName")
  private String natGatewayName = null;

  @SerializedName("NetworkInterfaceId")
  private String networkInterfaceId = null;

  @SerializedName("OverdueTime")
  private String overdueTime = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Spec")
  private String spec = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public NatGatewayForDescribeNatGatewaysOutput billingType(Integer billingType) {
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

  public NatGatewayForDescribeNatGatewaysOutput businessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
    return this;
  }

   /**
   * Get businessStatus
   * @return businessStatus
  **/
  @Schema(description = "")
  public String getBusinessStatus() {
    return businessStatus;
  }

  public void setBusinessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
  }

  public NatGatewayForDescribeNatGatewaysOutput creationTime(String creationTime) {
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

  public NatGatewayForDescribeNatGatewaysOutput deletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
    return this;
  }

   /**
   * Get deletedTime
   * @return deletedTime
  **/
  @Schema(description = "")
  public String getDeletedTime() {
    return deletedTime;
  }

  public void setDeletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
  }

  public NatGatewayForDescribeNatGatewaysOutput description(String description) {
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

  public NatGatewayForDescribeNatGatewaysOutput eipAddresses(List<EipAddressForDescribeNatGatewaysOutput> eipAddresses) {
    this.eipAddresses = eipAddresses;
    return this;
  }

  public NatGatewayForDescribeNatGatewaysOutput addEipAddressesItem(EipAddressForDescribeNatGatewaysOutput eipAddressesItem) {
    if (this.eipAddresses == null) {
      this.eipAddresses = new ArrayList<EipAddressForDescribeNatGatewaysOutput>();
    }
    this.eipAddresses.add(eipAddressesItem);
    return this;
  }

   /**
   * Get eipAddresses
   * @return eipAddresses
  **/
  @Valid
  @Schema(description = "")
  public List<EipAddressForDescribeNatGatewaysOutput> getEipAddresses() {
    return eipAddresses;
  }

  public void setEipAddresses(List<EipAddressForDescribeNatGatewaysOutput> eipAddresses) {
    this.eipAddresses = eipAddresses;
  }

  public NatGatewayForDescribeNatGatewaysOutput expiredTime(String expiredTime) {
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

  public NatGatewayForDescribeNatGatewaysOutput lockReason(String lockReason) {
    this.lockReason = lockReason;
    return this;
  }

   /**
   * Get lockReason
   * @return lockReason
  **/
  @Schema(description = "")
  public String getLockReason() {
    return lockReason;
  }

  public void setLockReason(String lockReason) {
    this.lockReason = lockReason;
  }

  public NatGatewayForDescribeNatGatewaysOutput natGatewayId(String natGatewayId) {
    this.natGatewayId = natGatewayId;
    return this;
  }

   /**
   * Get natGatewayId
   * @return natGatewayId
  **/
  @Schema(description = "")
  public String getNatGatewayId() {
    return natGatewayId;
  }

  public void setNatGatewayId(String natGatewayId) {
    this.natGatewayId = natGatewayId;
  }

  public NatGatewayForDescribeNatGatewaysOutput natGatewayName(String natGatewayName) {
    this.natGatewayName = natGatewayName;
    return this;
  }

   /**
   * Get natGatewayName
   * @return natGatewayName
  **/
  @Schema(description = "")
  public String getNatGatewayName() {
    return natGatewayName;
  }

  public void setNatGatewayName(String natGatewayName) {
    this.natGatewayName = natGatewayName;
  }

  public NatGatewayForDescribeNatGatewaysOutput networkInterfaceId(String networkInterfaceId) {
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

  public NatGatewayForDescribeNatGatewaysOutput overdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
    return this;
  }

   /**
   * Get overdueTime
   * @return overdueTime
  **/
  @Schema(description = "")
  public String getOverdueTime() {
    return overdueTime;
  }

  public void setOverdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
  }

  public NatGatewayForDescribeNatGatewaysOutput projectName(String projectName) {
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

  public NatGatewayForDescribeNatGatewaysOutput spec(String spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @Schema(description = "")
  public String getSpec() {
    return spec;
  }

  public void setSpec(String spec) {
    this.spec = spec;
  }

  public NatGatewayForDescribeNatGatewaysOutput status(String status) {
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

  public NatGatewayForDescribeNatGatewaysOutput subnetId(String subnetId) {
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

  public NatGatewayForDescribeNatGatewaysOutput updatedAt(String updatedAt) {
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

  public NatGatewayForDescribeNatGatewaysOutput vpcId(String vpcId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NatGatewayForDescribeNatGatewaysOutput natGatewayForDescribeNatGatewaysOutput = (NatGatewayForDescribeNatGatewaysOutput) o;
    return Objects.equals(this.billingType, natGatewayForDescribeNatGatewaysOutput.billingType) &&
        Objects.equals(this.businessStatus, natGatewayForDescribeNatGatewaysOutput.businessStatus) &&
        Objects.equals(this.creationTime, natGatewayForDescribeNatGatewaysOutput.creationTime) &&
        Objects.equals(this.deletedTime, natGatewayForDescribeNatGatewaysOutput.deletedTime) &&
        Objects.equals(this.description, natGatewayForDescribeNatGatewaysOutput.description) &&
        Objects.equals(this.eipAddresses, natGatewayForDescribeNatGatewaysOutput.eipAddresses) &&
        Objects.equals(this.expiredTime, natGatewayForDescribeNatGatewaysOutput.expiredTime) &&
        Objects.equals(this.lockReason, natGatewayForDescribeNatGatewaysOutput.lockReason) &&
        Objects.equals(this.natGatewayId, natGatewayForDescribeNatGatewaysOutput.natGatewayId) &&
        Objects.equals(this.natGatewayName, natGatewayForDescribeNatGatewaysOutput.natGatewayName) &&
        Objects.equals(this.networkInterfaceId, natGatewayForDescribeNatGatewaysOutput.networkInterfaceId) &&
        Objects.equals(this.overdueTime, natGatewayForDescribeNatGatewaysOutput.overdueTime) &&
        Objects.equals(this.projectName, natGatewayForDescribeNatGatewaysOutput.projectName) &&
        Objects.equals(this.spec, natGatewayForDescribeNatGatewaysOutput.spec) &&
        Objects.equals(this.status, natGatewayForDescribeNatGatewaysOutput.status) &&
        Objects.equals(this.subnetId, natGatewayForDescribeNatGatewaysOutput.subnetId) &&
        Objects.equals(this.updatedAt, natGatewayForDescribeNatGatewaysOutput.updatedAt) &&
        Objects.equals(this.vpcId, natGatewayForDescribeNatGatewaysOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingType, businessStatus, creationTime, deletedTime, description, eipAddresses, expiredTime, lockReason, natGatewayId, natGatewayName, networkInterfaceId, overdueTime, projectName, spec, status, subnetId, updatedAt, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatGatewayForDescribeNatGatewaysOutput {\n");
    
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eipAddresses: ").append(toIndentedString(eipAddresses)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    lockReason: ").append(toIndentedString(lockReason)).append("\n");
    sb.append("    natGatewayId: ").append(toIndentedString(natGatewayId)).append("\n");
    sb.append("    natGatewayName: ").append(toIndentedString(natGatewayName)).append("\n");
    sb.append("    networkInterfaceId: ").append(toIndentedString(networkInterfaceId)).append("\n");
    sb.append("    overdueTime: ").append(toIndentedString(overdueTime)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
