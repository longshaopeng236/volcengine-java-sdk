/*
 * cen
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cen.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cen.model.TagForDescribeCenBandwidthPackagesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CenBandwidthPackageForDescribeCenBandwidthPackagesOutput
 */


public class CenBandwidthPackageForDescribeCenBandwidthPackagesOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("Business")
  private String business = null;

  @SerializedName("CenBandwidthPackageId")
  private String cenBandwidthPackageId = null;

  @SerializedName("CenBandwidthPackageName")
  private String cenBandwidthPackageName = null;

  @SerializedName("CenIds")
  private List<String> cenIds = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("LocalGeographicRegionSetId")
  private String localGeographicRegionSetId = null;

  @SerializedName("LocalGeographiclRegionSetId")
  private String localGeographiclRegionSetId = null;

  @SerializedName("PeerGeographicRegionSetId")
  private String peerGeographicRegionSetId = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RemainingBandwidth")
  private Integer remainingBandwidth = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeCenBandwidthPackagesOutput> tags = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput accountId(String accountId) {
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

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput bandwidth(Integer bandwidth) {
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

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput billingType(Integer billingType) {
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

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput business(String business) {
    this.business = business;
    return this;
  }

   /**
   * Get business
   * @return business
  **/
  @Schema(description = "")
  public String getBusiness() {
    return business;
  }

  public void setBusiness(String business) {
    this.business = business;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput cenBandwidthPackageId(String cenBandwidthPackageId) {
    this.cenBandwidthPackageId = cenBandwidthPackageId;
    return this;
  }

   /**
   * Get cenBandwidthPackageId
   * @return cenBandwidthPackageId
  **/
  @Schema(description = "")
  public String getCenBandwidthPackageId() {
    return cenBandwidthPackageId;
  }

  public void setCenBandwidthPackageId(String cenBandwidthPackageId) {
    this.cenBandwidthPackageId = cenBandwidthPackageId;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput cenBandwidthPackageName(String cenBandwidthPackageName) {
    this.cenBandwidthPackageName = cenBandwidthPackageName;
    return this;
  }

   /**
   * Get cenBandwidthPackageName
   * @return cenBandwidthPackageName
  **/
  @Schema(description = "")
  public String getCenBandwidthPackageName() {
    return cenBandwidthPackageName;
  }

  public void setCenBandwidthPackageName(String cenBandwidthPackageName) {
    this.cenBandwidthPackageName = cenBandwidthPackageName;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput cenIds(List<String> cenIds) {
    this.cenIds = cenIds;
    return this;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput addCenIdsItem(String cenIdsItem) {
    if (this.cenIds == null) {
      this.cenIds = new ArrayList<String>();
    }
    this.cenIds.add(cenIdsItem);
    return this;
  }

   /**
   * Get cenIds
   * @return cenIds
  **/
  @Schema(description = "")
  public List<String> getCenIds() {
    return cenIds;
  }

  public void setCenIds(List<String> cenIds) {
    this.cenIds = cenIds;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput creationTime(String creationTime) {
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

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput deletedTime(String deletedTime) {
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

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput description(String description) {
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

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput expiredTime(String expiredTime) {
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

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput localGeographicRegionSetId(String localGeographicRegionSetId) {
    this.localGeographicRegionSetId = localGeographicRegionSetId;
    return this;
  }

   /**
   * Get localGeographicRegionSetId
   * @return localGeographicRegionSetId
  **/
  @Schema(description = "")
  public String getLocalGeographicRegionSetId() {
    return localGeographicRegionSetId;
  }

  public void setLocalGeographicRegionSetId(String localGeographicRegionSetId) {
    this.localGeographicRegionSetId = localGeographicRegionSetId;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput localGeographiclRegionSetId(String localGeographiclRegionSetId) {
    this.localGeographiclRegionSetId = localGeographiclRegionSetId;
    return this;
  }

   /**
   * Get localGeographiclRegionSetId
   * @return localGeographiclRegionSetId
  **/
  @Schema(description = "")
  public String getLocalGeographiclRegionSetId() {
    return localGeographiclRegionSetId;
  }

  public void setLocalGeographiclRegionSetId(String localGeographiclRegionSetId) {
    this.localGeographiclRegionSetId = localGeographiclRegionSetId;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput peerGeographicRegionSetId(String peerGeographicRegionSetId) {
    this.peerGeographicRegionSetId = peerGeographicRegionSetId;
    return this;
  }

   /**
   * Get peerGeographicRegionSetId
   * @return peerGeographicRegionSetId
  **/
  @Schema(description = "")
  public String getPeerGeographicRegionSetId() {
    return peerGeographicRegionSetId;
  }

  public void setPeerGeographicRegionSetId(String peerGeographicRegionSetId) {
    this.peerGeographicRegionSetId = peerGeographicRegionSetId;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput projectName(String projectName) {
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

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput remainingBandwidth(Integer remainingBandwidth) {
    this.remainingBandwidth = remainingBandwidth;
    return this;
  }

   /**
   * Get remainingBandwidth
   * @return remainingBandwidth
  **/
  @Schema(description = "")
  public Integer getRemainingBandwidth() {
    return remainingBandwidth;
  }

  public void setRemainingBandwidth(Integer remainingBandwidth) {
    this.remainingBandwidth = remainingBandwidth;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput status(String status) {
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

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput tags(List<TagForDescribeCenBandwidthPackagesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput addTagsItem(TagForDescribeCenBandwidthPackagesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeCenBandwidthPackagesOutput>();
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
  public List<TagForDescribeCenBandwidthPackagesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeCenBandwidthPackagesOutput> tags) {
    this.tags = tags;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput updatedAt(String updatedAt) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CenBandwidthPackageForDescribeCenBandwidthPackagesOutput cenBandwidthPackageForDescribeCenBandwidthPackagesOutput = (CenBandwidthPackageForDescribeCenBandwidthPackagesOutput) o;
    return Objects.equals(this.accountId, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.accountId) &&
        Objects.equals(this.bandwidth, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.bandwidth) &&
        Objects.equals(this.billingType, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.billingType) &&
        Objects.equals(this.business, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.business) &&
        Objects.equals(this.cenBandwidthPackageId, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.cenBandwidthPackageId) &&
        Objects.equals(this.cenBandwidthPackageName, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.cenBandwidthPackageName) &&
        Objects.equals(this.cenIds, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.cenIds) &&
        Objects.equals(this.creationTime, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.creationTime) &&
        Objects.equals(this.deletedTime, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.deletedTime) &&
        Objects.equals(this.description, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.description) &&
        Objects.equals(this.expiredTime, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.expiredTime) &&
        Objects.equals(this.localGeographicRegionSetId, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.localGeographicRegionSetId) &&
        Objects.equals(this.localGeographiclRegionSetId, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.localGeographiclRegionSetId) &&
        Objects.equals(this.peerGeographicRegionSetId, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.peerGeographicRegionSetId) &&
        Objects.equals(this.projectName, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.projectName) &&
        Objects.equals(this.remainingBandwidth, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.remainingBandwidth) &&
        Objects.equals(this.status, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.status) &&
        Objects.equals(this.tags, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.tags) &&
        Objects.equals(this.updatedAt, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bandwidth, billingType, business, cenBandwidthPackageId, cenBandwidthPackageName, cenIds, creationTime, deletedTime, description, expiredTime, localGeographicRegionSetId, localGeographiclRegionSetId, peerGeographicRegionSetId, projectName, remainingBandwidth, status, tags, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CenBandwidthPackageForDescribeCenBandwidthPackagesOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
    sb.append("    cenBandwidthPackageId: ").append(toIndentedString(cenBandwidthPackageId)).append("\n");
    sb.append("    cenBandwidthPackageName: ").append(toIndentedString(cenBandwidthPackageName)).append("\n");
    sb.append("    cenIds: ").append(toIndentedString(cenIds)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    localGeographicRegionSetId: ").append(toIndentedString(localGeographicRegionSetId)).append("\n");
    sb.append("    localGeographiclRegionSetId: ").append(toIndentedString(localGeographiclRegionSetId)).append("\n");
    sb.append("    peerGeographicRegionSetId: ").append(toIndentedString(peerGeographicRegionSetId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    remainingBandwidth: ").append(toIndentedString(remainingBandwidth)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
