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
 * DescribeCenInterRegionBandwidthsRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:24.026407+08:00[Asia/Shanghai]")
public class DescribeCenInterRegionBandwidthsRequest {
  @SerializedName("InterRegionBandwidthIds")
  private List<String> interRegionBandwidthIds = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private String pageSize = null;

  public DescribeCenInterRegionBandwidthsRequest interRegionBandwidthIds(List<String> interRegionBandwidthIds) {
    this.interRegionBandwidthIds = interRegionBandwidthIds;
    return this;
  }

  public DescribeCenInterRegionBandwidthsRequest addInterRegionBandwidthIdsItem(String interRegionBandwidthIdsItem) {
    if (this.interRegionBandwidthIds == null) {
      this.interRegionBandwidthIds = new ArrayList<String>();
    }
    this.interRegionBandwidthIds.add(interRegionBandwidthIdsItem);
    return this;
  }

   /**
   * Get interRegionBandwidthIds
   * @return interRegionBandwidthIds
  **/
  @Schema(description = "")
  public List<String> getInterRegionBandwidthIds() {
    return interRegionBandwidthIds;
  }

  public void setInterRegionBandwidthIds(List<String> interRegionBandwidthIds) {
    this.interRegionBandwidthIds = interRegionBandwidthIds;
  }

  public DescribeCenInterRegionBandwidthsRequest pageNumber(Integer pageNumber) {
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

  public DescribeCenInterRegionBandwidthsRequest pageSize(String pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public String getPageSize() {
    return pageSize;
  }

  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCenInterRegionBandwidthsRequest describeCenInterRegionBandwidthsRequest = (DescribeCenInterRegionBandwidthsRequest) o;
    return Objects.equals(this.interRegionBandwidthIds, describeCenInterRegionBandwidthsRequest.interRegionBandwidthIds) &&
        Objects.equals(this.pageNumber, describeCenInterRegionBandwidthsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeCenInterRegionBandwidthsRequest.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interRegionBandwidthIds, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCenInterRegionBandwidthsRequest {\n");
    
    sb.append("    interRegionBandwidthIds: ").append(toIndentedString(interRegionBandwidthIds)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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