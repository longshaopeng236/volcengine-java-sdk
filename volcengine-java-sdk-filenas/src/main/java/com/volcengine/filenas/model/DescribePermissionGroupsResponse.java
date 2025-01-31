/*
 * FileNAS
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.filenas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.filenas.model.PermissionGroupForDescribePermissionGroupsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribePermissionGroupsResponse
 */


public class DescribePermissionGroupsResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("PermissionGroups")
  private List<PermissionGroupForDescribePermissionGroupsOutput> permissionGroups = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribePermissionGroupsResponse pageNumber(Integer pageNumber) {
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

  public DescribePermissionGroupsResponse pageSize(Integer pageSize) {
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

  public DescribePermissionGroupsResponse permissionGroups(List<PermissionGroupForDescribePermissionGroupsOutput> permissionGroups) {
    this.permissionGroups = permissionGroups;
    return this;
  }

  public DescribePermissionGroupsResponse addPermissionGroupsItem(PermissionGroupForDescribePermissionGroupsOutput permissionGroupsItem) {
    if (this.permissionGroups == null) {
      this.permissionGroups = new ArrayList<PermissionGroupForDescribePermissionGroupsOutput>();
    }
    this.permissionGroups.add(permissionGroupsItem);
    return this;
  }

   /**
   * Get permissionGroups
   * @return permissionGroups
  **/
  @Valid
  @Schema(description = "")
  public List<PermissionGroupForDescribePermissionGroupsOutput> getPermissionGroups() {
    return permissionGroups;
  }

  public void setPermissionGroups(List<PermissionGroupForDescribePermissionGroupsOutput> permissionGroups) {
    this.permissionGroups = permissionGroups;
  }

  public DescribePermissionGroupsResponse totalCount(Integer totalCount) {
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
    DescribePermissionGroupsResponse describePermissionGroupsResponse = (DescribePermissionGroupsResponse) o;
    return Objects.equals(this.pageNumber, describePermissionGroupsResponse.pageNumber) &&
        Objects.equals(this.pageSize, describePermissionGroupsResponse.pageSize) &&
        Objects.equals(this.permissionGroups, describePermissionGroupsResponse.permissionGroups) &&
        Objects.equals(this.totalCount, describePermissionGroupsResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, permissionGroups, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribePermissionGroupsResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    permissionGroups: ").append(toIndentedString(permissionGroups)).append("\n");
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
