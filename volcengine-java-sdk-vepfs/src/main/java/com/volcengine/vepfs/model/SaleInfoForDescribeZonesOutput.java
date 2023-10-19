/*
 * vepfs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vepfs.model;

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
 * SaleInfoForDescribeZonesOutput
 */


public class SaleInfoForDescribeZonesOutput {
  @SerializedName("FileSystemType")
  private String fileSystemType = null;

  @SerializedName("ProtocolType")
  private String protocolType = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("StoreType")
  private String storeType = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public SaleInfoForDescribeZonesOutput fileSystemType(String fileSystemType) {
    this.fileSystemType = fileSystemType;
    return this;
  }

   /**
   * Get fileSystemType
   * @return fileSystemType
  **/
  @Schema(description = "")
  public String getFileSystemType() {
    return fileSystemType;
  }

  public void setFileSystemType(String fileSystemType) {
    this.fileSystemType = fileSystemType;
  }

  public SaleInfoForDescribeZonesOutput protocolType(String protocolType) {
    this.protocolType = protocolType;
    return this;
  }

   /**
   * Get protocolType
   * @return protocolType
  **/
  @Schema(description = "")
  public String getProtocolType() {
    return protocolType;
  }

  public void setProtocolType(String protocolType) {
    this.protocolType = protocolType;
  }

  public SaleInfoForDescribeZonesOutput regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @Schema(description = "")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public SaleInfoForDescribeZonesOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SaleInfoForDescribeZonesOutput storeType(String storeType) {
    this.storeType = storeType;
    return this;
  }

   /**
   * Get storeType
   * @return storeType
  **/
  @Schema(description = "")
  public String getStoreType() {
    return storeType;
  }

  public void setStoreType(String storeType) {
    this.storeType = storeType;
  }

  public SaleInfoForDescribeZonesOutput zoneId(String zoneId) {
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
    SaleInfoForDescribeZonesOutput saleInfoForDescribeZonesOutput = (SaleInfoForDescribeZonesOutput) o;
    return Objects.equals(this.fileSystemType, saleInfoForDescribeZonesOutput.fileSystemType) &&
        Objects.equals(this.protocolType, saleInfoForDescribeZonesOutput.protocolType) &&
        Objects.equals(this.regionId, saleInfoForDescribeZonesOutput.regionId) &&
        Objects.equals(this.status, saleInfoForDescribeZonesOutput.status) &&
        Objects.equals(this.storeType, saleInfoForDescribeZonesOutput.storeType) &&
        Objects.equals(this.zoneId, saleInfoForDescribeZonesOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSystemType, protocolType, regionId, status, storeType, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleInfoForDescribeZonesOutput {\n");
    
    sb.append("    fileSystemType: ").append(toIndentedString(fileSystemType)).append("\n");
    sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storeType: ").append(toIndentedString(storeType)).append("\n");
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
