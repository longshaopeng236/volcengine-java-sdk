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
import com.volcengine.vke.model.ItemForListSupportedAddonsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListSupportedAddonsResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-19T12:20:19.967862+08:00[Asia/Shanghai]")
public class ListSupportedAddonsResponse {
  @SerializedName("Items")
  private List<ItemForListSupportedAddonsOutput> items = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public ListSupportedAddonsResponse items(List<ItemForListSupportedAddonsOutput> items) {
    this.items = items;
    return this;
  }

  public ListSupportedAddonsResponse addItemsItem(ItemForListSupportedAddonsOutput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemForListSupportedAddonsOutput>();
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
  public List<ItemForListSupportedAddonsOutput> getItems() {
    return items;
  }

  public void setItems(List<ItemForListSupportedAddonsOutput> items) {
    this.items = items;
  }

  public ListSupportedAddonsResponse totalCount(Integer totalCount) {
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
    ListSupportedAddonsResponse listSupportedAddonsResponse = (ListSupportedAddonsResponse) o;
    return Objects.equals(this.items, listSupportedAddonsResponse.items) &&
        Objects.equals(this.totalCount, listSupportedAddonsResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSupportedAddonsResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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