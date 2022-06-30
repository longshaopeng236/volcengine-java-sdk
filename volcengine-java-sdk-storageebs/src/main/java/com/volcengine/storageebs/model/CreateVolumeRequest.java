/*
 * storage_ebs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.storageebs.model;

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
 * CreateVolumeRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T20:18:13.538566+08:00[Asia/Shanghai]")
public class CreateVolumeRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("Kind")
  private String kind = null;

  @SerializedName("Size")
  private String size = null;

  @SerializedName("VolumeChargeType")
  private String volumeChargeType = null;

  @SerializedName("VolumeName")
  private String volumeName = null;

  @SerializedName("VolumeType")
  private String volumeType = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public CreateVolumeRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateVolumeRequest kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @Schema(description = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public CreateVolumeRequest size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public CreateVolumeRequest volumeChargeType(String volumeChargeType) {
    this.volumeChargeType = volumeChargeType;
    return this;
  }

   /**
   * Get volumeChargeType
   * @return volumeChargeType
  **/
  @Schema(description = "")
  public String getVolumeChargeType() {
    return volumeChargeType;
  }

  public void setVolumeChargeType(String volumeChargeType) {
    this.volumeChargeType = volumeChargeType;
  }

  public CreateVolumeRequest volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

   /**
   * Get volumeName
   * @return volumeName
  **/
  @Schema(description = "")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

  public CreateVolumeRequest volumeType(String volumeType) {
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

  public CreateVolumeRequest zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVolumeRequest createVolumeRequest = (CreateVolumeRequest) o;
    return Objects.equals(this.description, createVolumeRequest.description) &&
        Objects.equals(this.kind, createVolumeRequest.kind) &&
        Objects.equals(this.size, createVolumeRequest.size) &&
        Objects.equals(this.volumeChargeType, createVolumeRequest.volumeChargeType) &&
        Objects.equals(this.volumeName, createVolumeRequest.volumeName) &&
        Objects.equals(this.volumeType, createVolumeRequest.volumeType) &&
        Objects.equals(this.zoneId, createVolumeRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, kind, size, volumeChargeType, volumeName, volumeType, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVolumeRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    volumeChargeType: ").append(toIndentedString(volumeChargeType)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
