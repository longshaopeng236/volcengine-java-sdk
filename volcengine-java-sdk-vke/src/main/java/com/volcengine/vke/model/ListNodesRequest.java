/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vke.model.FilterForListNodesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListNodesRequest
 */


public class ListNodesRequest {
  @SerializedName("Filter")
  private FilterForListNodesInput filter = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  public ListNodesRequest filter(FilterForListNodesInput filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Valid
  @Schema(description = "")
  public FilterForListNodesInput getFilter() {
    return filter;
  }

  public void setFilter(FilterForListNodesInput filter) {
    this.filter = filter;
  }

  public ListNodesRequest pageNumber(Integer pageNumber) {
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

  public ListNodesRequest pageSize(Integer pageSize) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListNodesRequest listNodesRequest = (ListNodesRequest) o;
    return Objects.equals(this.filter, listNodesRequest.filter) &&
        Objects.equals(this.pageNumber, listNodesRequest.pageNumber) &&
        Objects.equals(this.pageSize, listNodesRequest.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListNodesRequest {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
