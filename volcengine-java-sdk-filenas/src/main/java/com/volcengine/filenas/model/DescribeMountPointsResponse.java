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
import com.volcengine.filenas.model.ConvertMountPointForDescribeMountPointsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeMountPointsResponse
 */


public class DescribeMountPointsResponse {
  @SerializedName("MountPoints")
  private List<ConvertMountPointForDescribeMountPointsOutput> mountPoints = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeMountPointsResponse mountPoints(List<ConvertMountPointForDescribeMountPointsOutput> mountPoints) {
    this.mountPoints = mountPoints;
    return this;
  }

  public DescribeMountPointsResponse addMountPointsItem(ConvertMountPointForDescribeMountPointsOutput mountPointsItem) {
    if (this.mountPoints == null) {
      this.mountPoints = new ArrayList<ConvertMountPointForDescribeMountPointsOutput>();
    }
    this.mountPoints.add(mountPointsItem);
    return this;
  }

   /**
   * Get mountPoints
   * @return mountPoints
  **/
  @Valid
  @Schema(description = "")
  public List<ConvertMountPointForDescribeMountPointsOutput> getMountPoints() {
    return mountPoints;
  }

  public void setMountPoints(List<ConvertMountPointForDescribeMountPointsOutput> mountPoints) {
    this.mountPoints = mountPoints;
  }

  public DescribeMountPointsResponse totalCount(Integer totalCount) {
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
    DescribeMountPointsResponse describeMountPointsResponse = (DescribeMountPointsResponse) o;
    return Objects.equals(this.mountPoints, describeMountPointsResponse.mountPoints) &&
        Objects.equals(this.totalCount, describeMountPointsResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPoints, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeMountPointsResponse {\n");
    
    sb.append("    mountPoints: ").append(toIndentedString(mountPoints)).append("\n");
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
