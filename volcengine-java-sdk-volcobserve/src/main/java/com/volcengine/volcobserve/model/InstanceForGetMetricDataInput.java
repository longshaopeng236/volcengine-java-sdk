/*
 * volc_observe
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcobserve.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcobserve.model.DimensionForGetMetricDataInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InstanceForGetMetricDataInput
 */


public class InstanceForGetMetricDataInput {
  @SerializedName("Dimensions")
  private List<DimensionForGetMetricDataInput> dimensions = null;

  public InstanceForGetMetricDataInput dimensions(List<DimensionForGetMetricDataInput> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public InstanceForGetMetricDataInput addDimensionsItem(DimensionForGetMetricDataInput dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<DimensionForGetMetricDataInput>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @Valid
  @Schema(description = "")
  public List<DimensionForGetMetricDataInput> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<DimensionForGetMetricDataInput> dimensions) {
    this.dimensions = dimensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceForGetMetricDataInput instanceForGetMetricDataInput = (InstanceForGetMetricDataInput) o;
    return Objects.equals(this.dimensions, instanceForGetMetricDataInput.dimensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceForGetMetricDataInput {\n");
    
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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
