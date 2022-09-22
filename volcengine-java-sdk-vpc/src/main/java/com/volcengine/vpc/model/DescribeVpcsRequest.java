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
import com.volcengine.vpc.model.TagFilterForDescribeVpcsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeVpcsRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:39.157783+08:00[Asia/Shanghai]")
public class DescribeVpcsRequest {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("TagFilters")
  private List<TagFilterForDescribeVpcsInput> tagFilters = null;

  @SerializedName("VpcIds")
  private List<String> vpcIds = null;

  @SerializedName("VpcName")
  private String vpcName = null;

  public DescribeVpcsRequest pageNumber(Integer pageNumber) {
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

  public DescribeVpcsRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * maximum: 100
   * @return pageSize
  **/
 @Max(100)  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeVpcsRequest projectName(String projectName) {
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

  public DescribeVpcsRequest tagFilters(List<TagFilterForDescribeVpcsInput> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public DescribeVpcsRequest addTagFiltersItem(TagFilterForDescribeVpcsInput tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<TagFilterForDescribeVpcsInput>();
    }
    this.tagFilters.add(tagFiltersItem);
    return this;
  }

   /**
   * Get tagFilters
   * @return tagFilters
  **/
  @Valid
  @Schema(description = "")
  public List<TagFilterForDescribeVpcsInput> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<TagFilterForDescribeVpcsInput> tagFilters) {
    this.tagFilters = tagFilters;
  }

  public DescribeVpcsRequest vpcIds(List<String> vpcIds) {
    this.vpcIds = vpcIds;
    return this;
  }

  public DescribeVpcsRequest addVpcIdsItem(String vpcIdsItem) {
    if (this.vpcIds == null) {
      this.vpcIds = new ArrayList<String>();
    }
    this.vpcIds.add(vpcIdsItem);
    return this;
  }

   /**
   * Get vpcIds
   * @return vpcIds
  **/
  @Schema(description = "")
  public List<String> getVpcIds() {
    return vpcIds;
  }

  public void setVpcIds(List<String> vpcIds) {
    this.vpcIds = vpcIds;
  }

  public DescribeVpcsRequest vpcName(String vpcName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVpcsRequest describeVpcsRequest = (DescribeVpcsRequest) o;
    return Objects.equals(this.pageNumber, describeVpcsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeVpcsRequest.pageSize) &&
        Objects.equals(this.projectName, describeVpcsRequest.projectName) &&
        Objects.equals(this.tagFilters, describeVpcsRequest.tagFilters) &&
        Objects.equals(this.vpcIds, describeVpcsRequest.vpcIds) &&
        Objects.equals(this.vpcName, describeVpcsRequest.vpcName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, projectName, tagFilters, vpcIds, vpcName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVpcsRequest {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
    sb.append("    vpcIds: ").append(toIndentedString(vpcIds)).append("\n");
    sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
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
