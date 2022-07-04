/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.autoscaling.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.autoscaling.model.ScalingActivityForDescribeScalingActivitiesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeScalingActivitiesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-04T12:08:52.868690+08:00[Asia/Shanghai]")
public class DescribeScalingActivitiesResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ScalingActivities")
  private List<ScalingActivityForDescribeScalingActivitiesOutput> scalingActivities = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeScalingActivitiesResponse pageNumber(Integer pageNumber) {
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

  public DescribeScalingActivitiesResponse pageSize(Integer pageSize) {
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

  public DescribeScalingActivitiesResponse scalingActivities(List<ScalingActivityForDescribeScalingActivitiesOutput> scalingActivities) {
    this.scalingActivities = scalingActivities;
    return this;
  }

  public DescribeScalingActivitiesResponse addScalingActivitiesItem(ScalingActivityForDescribeScalingActivitiesOutput scalingActivitiesItem) {
    if (this.scalingActivities == null) {
      this.scalingActivities = new ArrayList<ScalingActivityForDescribeScalingActivitiesOutput>();
    }
    this.scalingActivities.add(scalingActivitiesItem);
    return this;
  }

   /**
   * Get scalingActivities
   * @return scalingActivities
  **/
  @Valid
  @Schema(description = "")
  public List<ScalingActivityForDescribeScalingActivitiesOutput> getScalingActivities() {
    return scalingActivities;
  }

  public void setScalingActivities(List<ScalingActivityForDescribeScalingActivitiesOutput> scalingActivities) {
    this.scalingActivities = scalingActivities;
  }

  public DescribeScalingActivitiesResponse totalCount(Integer totalCount) {
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
    DescribeScalingActivitiesResponse describeScalingActivitiesResponse = (DescribeScalingActivitiesResponse) o;
    return Objects.equals(this.pageNumber, describeScalingActivitiesResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeScalingActivitiesResponse.pageSize) &&
        Objects.equals(this.scalingActivities, describeScalingActivitiesResponse.scalingActivities) &&
        Objects.equals(this.totalCount, describeScalingActivitiesResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, scalingActivities, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeScalingActivitiesResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    scalingActivities: ").append(toIndentedString(scalingActivities)).append("\n");
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
