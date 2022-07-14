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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeCenBandwidthPackagesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:22:50.791272+08:00[Asia/Shanghai]")
public class DescribeCenBandwidthPackagesRequest {
  @SerializedName("CenBandwidthPackageIds")
  private List<String> cenBandwidthPackageIds = null;

  @SerializedName("CenBandwidthPackageName")
  private String cenBandwidthPackageName = null;

  @SerializedName("CenId")
  private String cenId = null;

  @SerializedName("LocalGeographicRegionSetId")
  private String localGeographicRegionSetId = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("PeerGeographicRegionSetId")
  private String peerGeographicRegionSetId = null;

  public DescribeCenBandwidthPackagesRequest cenBandwidthPackageIds(List<String> cenBandwidthPackageIds) {
    this.cenBandwidthPackageIds = cenBandwidthPackageIds;
    return this;
  }

  public DescribeCenBandwidthPackagesRequest addCenBandwidthPackageIdsItem(String cenBandwidthPackageIdsItem) {
    if (this.cenBandwidthPackageIds == null) {
      this.cenBandwidthPackageIds = new ArrayList<String>();
    }
    this.cenBandwidthPackageIds.add(cenBandwidthPackageIdsItem);
    return this;
  }

   /**
   * Get cenBandwidthPackageIds
   * @return cenBandwidthPackageIds
  **/
  @Schema(description = "")
  public List<String> getCenBandwidthPackageIds() {
    return cenBandwidthPackageIds;
  }

  public void setCenBandwidthPackageIds(List<String> cenBandwidthPackageIds) {
    this.cenBandwidthPackageIds = cenBandwidthPackageIds;
  }

  public DescribeCenBandwidthPackagesRequest cenBandwidthPackageName(String cenBandwidthPackageName) {
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

  public DescribeCenBandwidthPackagesRequest cenId(String cenId) {
    this.cenId = cenId;
    return this;
  }

   /**
   * Get cenId
   * @return cenId
  **/
  @Schema(description = "")
  public String getCenId() {
    return cenId;
  }

  public void setCenId(String cenId) {
    this.cenId = cenId;
  }

  public DescribeCenBandwidthPackagesRequest localGeographicRegionSetId(String localGeographicRegionSetId) {
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

  public DescribeCenBandwidthPackagesRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeCenBandwidthPackagesRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeCenBandwidthPackagesRequest peerGeographicRegionSetId(String peerGeographicRegionSetId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCenBandwidthPackagesRequest describeCenBandwidthPackagesRequest = (DescribeCenBandwidthPackagesRequest) o;
    return Objects.equals(this.cenBandwidthPackageIds, describeCenBandwidthPackagesRequest.cenBandwidthPackageIds) &&
        Objects.equals(this.cenBandwidthPackageName, describeCenBandwidthPackagesRequest.cenBandwidthPackageName) &&
        Objects.equals(this.cenId, describeCenBandwidthPackagesRequest.cenId) &&
        Objects.equals(this.localGeographicRegionSetId, describeCenBandwidthPackagesRequest.localGeographicRegionSetId) &&
        Objects.equals(this.pageNumber, describeCenBandwidthPackagesRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeCenBandwidthPackagesRequest.pageSize) &&
        Objects.equals(this.peerGeographicRegionSetId, describeCenBandwidthPackagesRequest.peerGeographicRegionSetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cenBandwidthPackageIds, cenBandwidthPackageName, cenId, localGeographicRegionSetId, pageNumber, pageSize, peerGeographicRegionSetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCenBandwidthPackagesRequest {\n");
    
    sb.append("    cenBandwidthPackageIds: ").append(toIndentedString(cenBandwidthPackageIds)).append("\n");
    sb.append("    cenBandwidthPackageName: ").append(toIndentedString(cenBandwidthPackageName)).append("\n");
    sb.append("    cenId: ").append(toIndentedString(cenId)).append("\n");
    sb.append("    localGeographicRegionSetId: ").append(toIndentedString(localGeographicRegionSetId)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    peerGeographicRegionSetId: ").append(toIndentedString(peerGeographicRegionSetId)).append("\n");
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
