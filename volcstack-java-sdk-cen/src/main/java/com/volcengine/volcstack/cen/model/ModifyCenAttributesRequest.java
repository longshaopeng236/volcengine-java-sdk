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

package com.volcengine.volcstack.cen.model;

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
 * ModifyCenAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-24T18:20:48.145669+08:00[Asia/Shanghai]")
public class ModifyCenAttributesRequest {
  @SerializedName("CenId")
  private String cenId = null;

  @SerializedName("CenName")
  private String cenName = null;

  @SerializedName("Description")
  private String description = null;

  public ModifyCenAttributesRequest cenId(String cenId) {
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

  public ModifyCenAttributesRequest cenName(String cenName) {
    this.cenName = cenName;
    return this;
  }

   /**
   * Get cenName
   * @return cenName
  **/
  @Schema(description = "")
  public String getCenName() {
    return cenName;
  }

  public void setCenName(String cenName) {
    this.cenName = cenName;
  }

  public ModifyCenAttributesRequest description(String description) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyCenAttributesRequest modifyCenAttributesRequest = (ModifyCenAttributesRequest) o;
    return Objects.equals(this.cenId, modifyCenAttributesRequest.cenId) &&
        Objects.equals(this.cenName, modifyCenAttributesRequest.cenName) &&
        Objects.equals(this.description, modifyCenAttributesRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cenId, cenName, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyCenAttributesRequest {\n");
    
    sb.append("    cenId: ").append(toIndentedString(cenId)).append("\n");
    sb.append("    cenName: ").append(toIndentedString(cenName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}