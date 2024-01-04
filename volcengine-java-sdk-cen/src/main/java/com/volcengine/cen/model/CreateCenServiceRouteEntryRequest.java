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
import com.volcengine.cen.model.PublishToInstanceForCreateCenServiceRouteEntryInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateCenServiceRouteEntryRequest
 */


public class CreateCenServiceRouteEntryRequest {
  @SerializedName("CenId")
  private String cenId = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DestinationCidrBlock")
  private String destinationCidrBlock = null;

  @SerializedName("PublishMode")
  private String publishMode = null;

  @SerializedName("PublishToInstances")
  private List<PublishToInstanceForCreateCenServiceRouteEntryInput> publishToInstances = null;

  @SerializedName("ServiceRegionId")
  private String serviceRegionId = null;

  @SerializedName("ServiceVpcId")
  private String serviceVpcId = null;

  public CreateCenServiceRouteEntryRequest cenId(String cenId) {
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

  public CreateCenServiceRouteEntryRequest description(String description) {
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

  public CreateCenServiceRouteEntryRequest destinationCidrBlock(String destinationCidrBlock) {
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

  public CreateCenServiceRouteEntryRequest publishMode(String publishMode) {
    this.publishMode = publishMode;
    return this;
  }

   /**
   * Get publishMode
   * @return publishMode
  **/
  @Schema(description = "")
  public String getPublishMode() {
    return publishMode;
  }

  public void setPublishMode(String publishMode) {
    this.publishMode = publishMode;
  }

  public CreateCenServiceRouteEntryRequest publishToInstances(List<PublishToInstanceForCreateCenServiceRouteEntryInput> publishToInstances) {
    this.publishToInstances = publishToInstances;
    return this;
  }

  public CreateCenServiceRouteEntryRequest addPublishToInstancesItem(PublishToInstanceForCreateCenServiceRouteEntryInput publishToInstancesItem) {
    if (this.publishToInstances == null) {
      this.publishToInstances = new ArrayList<PublishToInstanceForCreateCenServiceRouteEntryInput>();
    }
    this.publishToInstances.add(publishToInstancesItem);
    return this;
  }

   /**
   * Get publishToInstances
   * @return publishToInstances
  **/
  @Valid
  @Schema(description = "")
  public List<PublishToInstanceForCreateCenServiceRouteEntryInput> getPublishToInstances() {
    return publishToInstances;
  }

  public void setPublishToInstances(List<PublishToInstanceForCreateCenServiceRouteEntryInput> publishToInstances) {
    this.publishToInstances = publishToInstances;
  }

  public CreateCenServiceRouteEntryRequest serviceRegionId(String serviceRegionId) {
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

  public CreateCenServiceRouteEntryRequest serviceVpcId(String serviceVpcId) {
    this.serviceVpcId = serviceVpcId;
    return this;
  }

   /**
   * Get serviceVpcId
   * @return serviceVpcId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getServiceVpcId() {
    return serviceVpcId;
  }

  public void setServiceVpcId(String serviceVpcId) {
    this.serviceVpcId = serviceVpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCenServiceRouteEntryRequest createCenServiceRouteEntryRequest = (CreateCenServiceRouteEntryRequest) o;
    return Objects.equals(this.cenId, createCenServiceRouteEntryRequest.cenId) &&
        Objects.equals(this.description, createCenServiceRouteEntryRequest.description) &&
        Objects.equals(this.destinationCidrBlock, createCenServiceRouteEntryRequest.destinationCidrBlock) &&
        Objects.equals(this.publishMode, createCenServiceRouteEntryRequest.publishMode) &&
        Objects.equals(this.publishToInstances, createCenServiceRouteEntryRequest.publishToInstances) &&
        Objects.equals(this.serviceRegionId, createCenServiceRouteEntryRequest.serviceRegionId) &&
        Objects.equals(this.serviceVpcId, createCenServiceRouteEntryRequest.serviceVpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cenId, description, destinationCidrBlock, publishMode, publishToInstances, serviceRegionId, serviceVpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCenServiceRouteEntryRequest {\n");
    
    sb.append("    cenId: ").append(toIndentedString(cenId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destinationCidrBlock: ").append(toIndentedString(destinationCidrBlock)).append("\n");
    sb.append("    publishMode: ").append(toIndentedString(publishMode)).append("\n");
    sb.append("    publishToInstances: ").append(toIndentedString(publishToInstances)).append("\n");
    sb.append("    serviceRegionId: ").append(toIndentedString(serviceRegionId)).append("\n");
    sb.append("    serviceVpcId: ").append(toIndentedString(serviceVpcId)).append("\n");
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
