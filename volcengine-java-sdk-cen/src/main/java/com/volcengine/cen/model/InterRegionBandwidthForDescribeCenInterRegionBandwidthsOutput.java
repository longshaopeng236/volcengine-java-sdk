/*
 * cen
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cen.model;

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
 * InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:22:50.791272+08:00[Asia/Shanghai]")
public class InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput {
  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("CenId")
  private String cenId = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("InterRegionBandwidthId")
  private String interRegionBandwidthId = null;

  @SerializedName("LocalRegionId")
  private String localRegionId = null;

  @SerializedName("PeerRegionId")
  private String peerRegionId = null;

  @SerializedName("Status")
  private String status = null;

  public InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @Schema(description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput cenId(String cenId) {
    this.cenId = cenId;
    return this;
  }

   /**
   * Get cenId
   * @return cenId
  **/
  @Schema(description = "")
  public String getCenId() {
    return cenId;
  }

  public void setCenId(String cenId) {
    this.cenId = cenId;
  }

  public InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput interRegionBandwidthId(String interRegionBandwidthId) {
    this.interRegionBandwidthId = interRegionBandwidthId;
    return this;
  }

   /**
   * Get interRegionBandwidthId
   * @return interRegionBandwidthId
  **/
  @Schema(description = "")
  public String getInterRegionBandwidthId() {
    return interRegionBandwidthId;
  }

  public void setInterRegionBandwidthId(String interRegionBandwidthId) {
    this.interRegionBandwidthId = interRegionBandwidthId;
  }

  public InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput localRegionId(String localRegionId) {
    this.localRegionId = localRegionId;
    return this;
  }

   /**
   * Get localRegionId
   * @return localRegionId
  **/
  @Schema(description = "")
  public String getLocalRegionId() {
    return localRegionId;
  }

  public void setLocalRegionId(String localRegionId) {
    this.localRegionId = localRegionId;
  }

  public InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput peerRegionId(String peerRegionId) {
    this.peerRegionId = peerRegionId;
    return this;
  }

   /**
   * Get peerRegionId
   * @return peerRegionId
  **/
  @Schema(description = "")
  public String getPeerRegionId() {
    return peerRegionId;
  }

  public void setPeerRegionId(String peerRegionId) {
    this.peerRegionId = peerRegionId;
  }

  public InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput status(String status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput interRegionBandwidthForDescribeCenInterRegionBandwidthsOutput = (InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput) o;
    return Objects.equals(this.bandwidth, interRegionBandwidthForDescribeCenInterRegionBandwidthsOutput.bandwidth) &&
        Objects.equals(this.cenId, interRegionBandwidthForDescribeCenInterRegionBandwidthsOutput.cenId) &&
        Objects.equals(this.creationTime, interRegionBandwidthForDescribeCenInterRegionBandwidthsOutput.creationTime) &&
        Objects.equals(this.interRegionBandwidthId, interRegionBandwidthForDescribeCenInterRegionBandwidthsOutput.interRegionBandwidthId) &&
        Objects.equals(this.localRegionId, interRegionBandwidthForDescribeCenInterRegionBandwidthsOutput.localRegionId) &&
        Objects.equals(this.peerRegionId, interRegionBandwidthForDescribeCenInterRegionBandwidthsOutput.peerRegionId) &&
        Objects.equals(this.status, interRegionBandwidthForDescribeCenInterRegionBandwidthsOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth, cenId, creationTime, interRegionBandwidthId, localRegionId, peerRegionId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterRegionBandwidthForDescribeCenInterRegionBandwidthsOutput {\n");
    
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    cenId: ").append(toIndentedString(cenId)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    interRegionBandwidthId: ").append(toIndentedString(interRegionBandwidthId)).append("\n");
    sb.append("    localRegionId: ").append(toIndentedString(localRegionId)).append("\n");
    sb.append("    peerRegionId: ").append(toIndentedString(peerRegionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
