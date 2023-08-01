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
import com.volcengine.cen.model.InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeCenInterRegionBandwidthsResponse
 */


public class DescribeCenInterRegionBandwidthsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("InterRegionBandwidths")
  private List<InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput> interRegionBandwidths = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeCenInterRegionBandwidthsResponse interRegionBandwidths(List<InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput> interRegionBandwidths) {
    this.interRegionBandwidths = interRegionBandwidths;
    return this;
  }

  public DescribeCenInterRegionBandwidthsResponse addInterRegionBandwidthsItem(InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput interRegionBandwidthsItem) {
    if (this.interRegionBandwidths == null) {
      this.interRegionBandwidths = new ArrayList<InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput>();
    }
    this.interRegionBandwidths.add(interRegionBandwidthsItem);
    return this;
  }

   /**
   * Get interRegionBandwidths
   * @return interRegionBandwidths
  **/
  @Valid
  @Schema(description = "")
  public List<InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput> getInterRegionBandwidths() {
    return interRegionBandwidths;
  }

  public void setInterRegionBandwidths(List<InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput> interRegionBandwidths) {
    this.interRegionBandwidths = interRegionBandwidths;
  }

  public DescribeCenInterRegionBandwidthsResponse pageNumber(Integer pageNumber) {
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

  public DescribeCenInterRegionBandwidthsResponse pageSize(Integer pageSize) {
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

  public DescribeCenInterRegionBandwidthsResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCenInterRegionBandwidthsResponse describeCenInterRegionBandwidthsResponse = (DescribeCenInterRegionBandwidthsResponse) o;
    return Objects.equals(this.interRegionBandwidths, describeCenInterRegionBandwidthsResponse.interRegionBandwidths) &&
        Objects.equals(this.pageNumber, describeCenInterRegionBandwidthsResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeCenInterRegionBandwidthsResponse.pageSize) &&
        Objects.equals(this.totalCount, describeCenInterRegionBandwidthsResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interRegionBandwidths, pageNumber, pageSize, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCenInterRegionBandwidthsResponse {\n");
    
    sb.append("    interRegionBandwidths: ").append(toIndentedString(interRegionBandwidths)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
