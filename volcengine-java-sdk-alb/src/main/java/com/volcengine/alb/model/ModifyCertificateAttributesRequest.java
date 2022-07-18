/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

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
 * ModifyCertificateAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-18T11:53:48.716788+08:00[Asia/Shanghai]")
public class ModifyCertificateAttributesRequest {
  @SerializedName("CertificateId")
  private String certificateId = null;

  @SerializedName("CertificateName")
  private String certificateName = null;

  @SerializedName("Description")
  private String description = null;

  public ModifyCertificateAttributesRequest certificateId(String certificateId) {
    this.certificateId = certificateId;
    return this;
  }

   /**
   * Get certificateId
   * @return certificateId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCertificateId() {
    return certificateId;
  }

  public void setCertificateId(String certificateId) {
    this.certificateId = certificateId;
  }

  public ModifyCertificateAttributesRequest certificateName(String certificateName) {
    this.certificateName = certificateName;
    return this;
  }

   /**
   * Get certificateName
   * @return certificateName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getCertificateName() {
    return certificateName;
  }

  public void setCertificateName(String certificateName) {
    this.certificateName = certificateName;
  }

  public ModifyCertificateAttributesRequest description(String description) {
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyCertificateAttributesRequest modifyCertificateAttributesRequest = (ModifyCertificateAttributesRequest) o;
    return Objects.equals(this.certificateId, modifyCertificateAttributesRequest.certificateId) &&
        Objects.equals(this.certificateName, modifyCertificateAttributesRequest.certificateName) &&
        Objects.equals(this.description, modifyCertificateAttributesRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateId, certificateName, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyCertificateAttributesRequest {\n");
    
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
