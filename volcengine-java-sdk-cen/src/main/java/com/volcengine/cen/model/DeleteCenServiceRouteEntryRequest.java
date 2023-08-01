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
 * DeleteCenServiceRouteEntryRequest
 */


public class DeleteCenServiceRouteEntryRequest {
  @SerializedName("CenId")
  private String cenId = null;

  @SerializedName("DestinationCidrBlock")
  private String destinationCidrBlock = null;

  @SerializedName("ServiceRegionId")
  private String serviceRegionId = null;

  public DeleteCenServiceRouteEntryRequest cenId(String cenId) {
    this.cenId = cenId;
    return this;
  }

   /**
   * Get cenId
   * @return cenId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCenId() {
    return cenId;
  }

  public void setCenId(String cenId) {
    this.cenId = cenId;
  }

  public DeleteCenServiceRouteEntryRequest destinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
    return this;
  }

   /**
   * Get destinationCidrBlock
   * @return destinationCidrBlock
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDestinationCidrBlock() {
    return destinationCidrBlock;
  }

  public void setDestinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
  }

  public DeleteCenServiceRouteEntryRequest serviceRegionId(String serviceRegionId) {
    this.serviceRegionId = serviceRegionId;
    return this;
  }

   /**
   * Get serviceRegionId
   * @return serviceRegionId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getServiceRegionId() {
    return serviceRegionId;
  }

  public void setServiceRegionId(String serviceRegionId) {
    this.serviceRegionId = serviceRegionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteCenServiceRouteEntryRequest deleteCenServiceRouteEntryRequest = (DeleteCenServiceRouteEntryRequest) o;
    return Objects.equals(this.cenId, deleteCenServiceRouteEntryRequest.cenId) &&
        Objects.equals(this.destinationCidrBlock, deleteCenServiceRouteEntryRequest.destinationCidrBlock) &&
        Objects.equals(this.serviceRegionId, deleteCenServiceRouteEntryRequest.serviceRegionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cenId, destinationCidrBlock, serviceRegionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteCenServiceRouteEntryRequest {\n");
    
    sb.append("    cenId: ").append(toIndentedString(cenId)).append("\n");
    sb.append("    destinationCidrBlock: ").append(toIndentedString(destinationCidrBlock)).append("\n");
    sb.append("    serviceRegionId: ").append(toIndentedString(serviceRegionId)).append("\n");
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
