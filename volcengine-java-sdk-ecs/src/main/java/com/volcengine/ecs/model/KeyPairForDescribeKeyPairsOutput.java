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

package com.volcengine.ecs.model;

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
 * KeyPairForDescribeKeyPairsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:28.947116+08:00[Asia/Shanghai]")
public class KeyPairForDescribeKeyPairsOutput {
  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("FingerPrint")
  private String fingerPrint = null;

  @SerializedName("KeyPairId")
  private String keyPairId = null;

  @SerializedName("KeyPairName")
  private String keyPairName = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  public KeyPairForDescribeKeyPairsOutput createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public KeyPairForDescribeKeyPairsOutput description(String description) {
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

  public KeyPairForDescribeKeyPairsOutput fingerPrint(String fingerPrint) {
    this.fingerPrint = fingerPrint;
    return this;
  }

   /**
   * Get fingerPrint
   * @return fingerPrint
  **/
  @Schema(description = "")
  public String getFingerPrint() {
    return fingerPrint;
  }

  public void setFingerPrint(String fingerPrint) {
    this.fingerPrint = fingerPrint;
  }

  public KeyPairForDescribeKeyPairsOutput keyPairId(String keyPairId) {
    this.keyPairId = keyPairId;
    return this;
  }

   /**
   * Get keyPairId
   * @return keyPairId
  **/
  @Schema(description = "")
  public String getKeyPairId() {
    return keyPairId;
  }

  public void setKeyPairId(String keyPairId) {
    this.keyPairId = keyPairId;
  }

  public KeyPairForDescribeKeyPairsOutput keyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
    return this;
  }

   /**
   * Get keyPairName
   * @return keyPairName
  **/
  @Schema(description = "")
  public String getKeyPairName() {
    return keyPairName;
  }

  public void setKeyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
  }

  public KeyPairForDescribeKeyPairsOutput updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyPairForDescribeKeyPairsOutput keyPairForDescribeKeyPairsOutput = (KeyPairForDescribeKeyPairsOutput) o;
    return Objects.equals(this.createdAt, keyPairForDescribeKeyPairsOutput.createdAt) &&
        Objects.equals(this.description, keyPairForDescribeKeyPairsOutput.description) &&
        Objects.equals(this.fingerPrint, keyPairForDescribeKeyPairsOutput.fingerPrint) &&
        Objects.equals(this.keyPairId, keyPairForDescribeKeyPairsOutput.keyPairId) &&
        Objects.equals(this.keyPairName, keyPairForDescribeKeyPairsOutput.keyPairName) &&
        Objects.equals(this.updatedAt, keyPairForDescribeKeyPairsOutput.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, fingerPrint, keyPairId, keyPairName, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyPairForDescribeKeyPairsOutput {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fingerPrint: ").append(toIndentedString(fingerPrint)).append("\n");
    sb.append("    keyPairId: ").append(toIndentedString(keyPairId)).append("\n");
    sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
