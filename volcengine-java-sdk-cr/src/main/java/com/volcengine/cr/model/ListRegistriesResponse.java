/*
 * cr
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cr.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cr.model.ItemForListRegistriesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListRegistriesResponse
 */


public class ListRegistriesResponse {
  @SerializedName("Items")
  private List<ItemForListRegistriesOutput> items = null;

  @SerializedName("PageNumber")
  private Long pageNumber = null;

  @SerializedName("PageSize")
  private Long pageSize = null;

  @SerializedName("TotalCount")
  private Long totalCount = null;

  public ListRegistriesResponse items(List<ItemForListRegistriesOutput> items) {
    this.items = items;
    return this;
  }

  public ListRegistriesResponse addItemsItem(ItemForListRegistriesOutput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemForListRegistriesOutput>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Valid
  @Schema(description = "")
  public List<ItemForListRegistriesOutput> getItems() {
    return items;
  }

  public void setItems(List<ItemForListRegistriesOutput> items) {
    this.items = items;
  }

  public ListRegistriesResponse pageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Long getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
  }

  public ListRegistriesResponse pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public ListRegistriesResponse totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
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
    ListRegistriesResponse listRegistriesResponse = (ListRegistriesResponse) o;
    return Objects.equals(this.items, listRegistriesResponse.items) &&
        Objects.equals(this.pageNumber, listRegistriesResponse.pageNumber) &&
        Objects.equals(this.pageSize, listRegistriesResponse.pageSize) &&
        Objects.equals(this.totalCount, listRegistriesResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, pageNumber, pageSize, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRegistriesResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
