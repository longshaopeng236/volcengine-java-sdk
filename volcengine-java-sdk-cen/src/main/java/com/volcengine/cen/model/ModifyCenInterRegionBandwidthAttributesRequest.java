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
 * ModifyCenInterRegionBandwidthAttributesRequest
 */


public class ModifyCenInterRegionBandwidthAttributesRequest {
  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("InterRegionBandwidthId")
  private String interRegionBandwidthId = null;

  public ModifyCenInterRegionBandwidthAttributesRequest bandwidth(Integer bandwidth) {
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

  public ModifyCenInterRegionBandwidthAttributesRequest interRegionBandwidthId(String interRegionBandwidthId) {
    this.interRegionBandwidthId = interRegionBandwidthId;
    return this;
  }

   /**
   * Get interRegionBandwidthId
   * @return interRegionBandwidthId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInterRegionBandwidthId() {
    return interRegionBandwidthId;
  }

  public void setInterRegionBandwidthId(String interRegionBandwidthId) {
    this.interRegionBandwidthId = interRegionBandwidthId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyCenInterRegionBandwidthAttributesRequest modifyCenInterRegionBandwidthAttributesRequest = (ModifyCenInterRegionBandwidthAttributesRequest) o;
    return Objects.equals(this.bandwidth, modifyCenInterRegionBandwidthAttributesRequest.bandwidth) &&
        Objects.equals(this.interRegionBandwidthId, modifyCenInterRegionBandwidthAttributesRequest.interRegionBandwidthId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth, interRegionBandwidthId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyCenInterRegionBandwidthAttributesRequest {\n");
    
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    interRegionBandwidthId: ").append(toIndentedString(interRegionBandwidthId)).append("\n");
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
