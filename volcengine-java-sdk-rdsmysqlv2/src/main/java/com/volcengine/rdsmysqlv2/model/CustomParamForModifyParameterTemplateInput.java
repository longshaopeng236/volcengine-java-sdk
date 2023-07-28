/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

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
 * CustomParamForModifyParameterTemplateInput
 */


public class CustomParamForModifyParameterTemplateInput {
  @SerializedName("DefaultValue")
  private String defaultValue = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ExpectValue")
  private String expectValue = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Restart")
  private Boolean restart = null;

  @SerializedName("RunningValue")
  private String runningValue = null;

  @SerializedName("ValueRange")
  private String valueRange = null;

  public CustomParamForModifyParameterTemplateInput defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @Schema(description = "")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public CustomParamForModifyParameterTemplateInput description(String description) {
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

  public CustomParamForModifyParameterTemplateInput expectValue(String expectValue) {
    this.expectValue = expectValue;
    return this;
  }

   /**
   * Get expectValue
   * @return expectValue
  **/
  @Schema(description = "")
  public String getExpectValue() {
    return expectValue;
  }

  public void setExpectValue(String expectValue) {
    this.expectValue = expectValue;
  }

  public CustomParamForModifyParameterTemplateInput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomParamForModifyParameterTemplateInput restart(Boolean restart) {
    this.restart = restart;
    return this;
  }

   /**
   * Get restart
   * @return restart
  **/
  @Schema(description = "")
  public Boolean isRestart() {
    return restart;
  }

  public void setRestart(Boolean restart) {
    this.restart = restart;
  }

  public CustomParamForModifyParameterTemplateInput runningValue(String runningValue) {
    this.runningValue = runningValue;
    return this;
  }

   /**
   * Get runningValue
   * @return runningValue
  **/
  @Schema(description = "")
  public String getRunningValue() {
    return runningValue;
  }

  public void setRunningValue(String runningValue) {
    this.runningValue = runningValue;
  }

  public CustomParamForModifyParameterTemplateInput valueRange(String valueRange) {
    this.valueRange = valueRange;
    return this;
  }

   /**
   * Get valueRange
   * @return valueRange
  **/
  @Schema(description = "")
  public String getValueRange() {
    return valueRange;
  }

  public void setValueRange(String valueRange) {
    this.valueRange = valueRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomParamForModifyParameterTemplateInput customParamForModifyParameterTemplateInput = (CustomParamForModifyParameterTemplateInput) o;
    return Objects.equals(this.defaultValue, customParamForModifyParameterTemplateInput.defaultValue) &&
        Objects.equals(this.description, customParamForModifyParameterTemplateInput.description) &&
        Objects.equals(this.expectValue, customParamForModifyParameterTemplateInput.expectValue) &&
        Objects.equals(this.name, customParamForModifyParameterTemplateInput.name) &&
        Objects.equals(this.restart, customParamForModifyParameterTemplateInput.restart) &&
        Objects.equals(this.runningValue, customParamForModifyParameterTemplateInput.runningValue) &&
        Objects.equals(this.valueRange, customParamForModifyParameterTemplateInput.valueRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, description, expectValue, name, restart, runningValue, valueRange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomParamForModifyParameterTemplateInput {\n");
    
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectValue: ").append(toIndentedString(expectValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    restart: ").append(toIndentedString(restart)).append("\n");
    sb.append("    runningValue: ").append(toIndentedString(runningValue)).append("\n");
    sb.append("    valueRange: ").append(toIndentedString(valueRange)).append("\n");
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
