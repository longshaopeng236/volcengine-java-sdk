/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GpuForDescribeSpotAdviceInput
 */


public class GpuForDescribeSpotAdviceInput {
  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("ProductName")
  private String productName = null;

  public GpuForDescribeSpotAdviceInput count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(description = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public GpuForDescribeSpotAdviceInput productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @Schema(description = "")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GpuForDescribeSpotAdviceInput gpuForDescribeSpotAdviceInput = (GpuForDescribeSpotAdviceInput) o;
    return Objects.equals(this.count, gpuForDescribeSpotAdviceInput.count) &&
        Objects.equals(this.productName, gpuForDescribeSpotAdviceInput.productName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, productName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GpuForDescribeSpotAdviceInput {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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