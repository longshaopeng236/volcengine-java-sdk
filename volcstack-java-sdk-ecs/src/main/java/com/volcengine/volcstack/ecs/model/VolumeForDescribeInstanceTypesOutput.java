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

package com.volcengine.volcstack.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VolumeForDescribeInstanceTypesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:32.628524+08:00[Asia/Shanghai]")
public class VolumeForDescribeInstanceTypesOutput {
  @SerializedName("SupportedVolumeTypes")
  private List<String> supportedVolumeTypes = null;

  public VolumeForDescribeInstanceTypesOutput supportedVolumeTypes(List<String> supportedVolumeTypes) {
    this.supportedVolumeTypes = supportedVolumeTypes;
    return this;
  }

  public VolumeForDescribeInstanceTypesOutput addSupportedVolumeTypesItem(String supportedVolumeTypesItem) {
    if (this.supportedVolumeTypes == null) {
      this.supportedVolumeTypes = new ArrayList<String>();
    }
    this.supportedVolumeTypes.add(supportedVolumeTypesItem);
    return this;
  }

   /**
   * Get supportedVolumeTypes
   * @return supportedVolumeTypes
  **/
  @Schema(description = "")
  public List<String> getSupportedVolumeTypes() {
    return supportedVolumeTypes;
  }

  public void setSupportedVolumeTypes(List<String> supportedVolumeTypes) {
    this.supportedVolumeTypes = supportedVolumeTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeForDescribeInstanceTypesOutput volumeForDescribeInstanceTypesOutput = (VolumeForDescribeInstanceTypesOutput) o;
    return Objects.equals(this.supportedVolumeTypes, volumeForDescribeInstanceTypesOutput.supportedVolumeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedVolumeTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeForDescribeInstanceTypesOutput {\n");
    
    sb.append("    supportedVolumeTypes: ").append(toIndentedString(supportedVolumeTypes)).append("\n");
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
