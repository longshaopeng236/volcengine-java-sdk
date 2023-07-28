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
import com.volcengine.rdsmysqlv2.model.ParameterForDescribeApplyParameterTemplateOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeApplyParameterTemplateResponse
 */


public class DescribeApplyParameterTemplateResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Parameters")
  private List<ParameterForDescribeApplyParameterTemplateOutput> parameters = null;

  @SerializedName("TemplateId")
  private String templateId = null;

  public DescribeApplyParameterTemplateResponse instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public DescribeApplyParameterTemplateResponse parameters(List<ParameterForDescribeApplyParameterTemplateOutput> parameters) {
    this.parameters = parameters;
    return this;
  }

  public DescribeApplyParameterTemplateResponse addParametersItem(ParameterForDescribeApplyParameterTemplateOutput parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<ParameterForDescribeApplyParameterTemplateOutput>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @Valid
  @Schema(description = "")
  public List<ParameterForDescribeApplyParameterTemplateOutput> getParameters() {
    return parameters;
  }

  public void setParameters(List<ParameterForDescribeApplyParameterTemplateOutput> parameters) {
    this.parameters = parameters;
  }

  public DescribeApplyParameterTemplateResponse templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @Schema(description = "")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeApplyParameterTemplateResponse describeApplyParameterTemplateResponse = (DescribeApplyParameterTemplateResponse) o;
    return Objects.equals(this.instanceId, describeApplyParameterTemplateResponse.instanceId) &&
        Objects.equals(this.parameters, describeApplyParameterTemplateResponse.parameters) &&
        Objects.equals(this.templateId, describeApplyParameterTemplateResponse.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, parameters, templateId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeApplyParameterTemplateResponse {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
