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
import com.volcengine.filenas.model.OverviewForDescribeFileSystemOverviewOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeFileSystemOverviewResponse
 */


public class DescribeFileSystemOverviewResponse {
  @SerializedName("Overview")
  private OverviewForDescribeFileSystemOverviewOutput overview = null;

  public DescribeFileSystemOverviewResponse overview(OverviewForDescribeFileSystemOverviewOutput overview) {
    this.overview = overview;
    return this;
  }

   /**
   * Get overview
   * @return overview
  **/
  @Valid
  @Schema(description = "")
  public OverviewForDescribeFileSystemOverviewOutput getOverview() {
    return overview;
  }

  public void setOverview(OverviewForDescribeFileSystemOverviewOutput overview) {
    this.overview = overview;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeFileSystemOverviewResponse describeFileSystemOverviewResponse = (DescribeFileSystemOverviewResponse) o;
    return Objects.equals(this.overview, describeFileSystemOverviewResponse.overview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overview);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeFileSystemOverviewResponse {\n");
    
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
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
