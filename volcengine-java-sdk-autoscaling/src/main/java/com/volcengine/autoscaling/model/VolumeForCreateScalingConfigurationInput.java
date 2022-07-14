/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.autoscaling.model;

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
 * VolumeForCreateScalingConfigurationInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:22:44.255986+08:00[Asia/Shanghai]")
public class VolumeForCreateScalingConfigurationInput {
  @SerializedName("DeleteWithInstance")
  private Boolean deleteWithInstance = null;

  @SerializedName("Size")
  private Integer size = null;

  @SerializedName("VolumeType")
  private String volumeType = null;

  public VolumeForCreateScalingConfigurationInput deleteWithInstance(Boolean deleteWithInstance) {
    this.deleteWithInstance = deleteWithInstance;
    return this;
  }

   /**
   * Get deleteWithInstance
   * @return deleteWithInstance
  **/
  @Schema(description = "")
  public Boolean isDeleteWithInstance() {
    return deleteWithInstance;
  }

  public void setDeleteWithInstance(Boolean deleteWithInstance) {
    this.deleteWithInstance = deleteWithInstance;
  }

  public VolumeForCreateScalingConfigurationInput size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public VolumeForCreateScalingConfigurationInput volumeType(String volumeType) {
    this.volumeType = volumeType;
    return this;
  }

   /**
   * Get volumeType
   * @return volumeType
  **/
  @Schema(description = "")
  public String getVolumeType() {
    return volumeType;
  }

  public void setVolumeType(String volumeType) {
    this.volumeType = volumeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeForCreateScalingConfigurationInput volumeForCreateScalingConfigurationInput = (VolumeForCreateScalingConfigurationInput) o;
    return Objects.equals(this.deleteWithInstance, volumeForCreateScalingConfigurationInput.deleteWithInstance) &&
        Objects.equals(this.size, volumeForCreateScalingConfigurationInput.size) &&
        Objects.equals(this.volumeType, volumeForCreateScalingConfigurationInput.volumeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteWithInstance, size, volumeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeForCreateScalingConfigurationInput {\n");
    
    sb.append("    deleteWithInstance: ").append(toIndentedString(deleteWithInstance)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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
