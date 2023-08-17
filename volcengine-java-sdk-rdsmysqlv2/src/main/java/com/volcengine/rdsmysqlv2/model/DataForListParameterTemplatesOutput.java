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
import com.volcengine.rdsmysqlv2.model.TemplateParamForListParameterTemplatesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DataForListParameterTemplatesOutput
 */


public class DataForListParameterTemplatesOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("NeedRestart")
  private Boolean needRestart = null;

  @SerializedName("ParameterNum")
  private Long parameterNum = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("TemplateCategory")
  private String templateCategory = null;

  @SerializedName("TemplateDesc")
  private String templateDesc = null;

  @SerializedName("TemplateId")
  private String templateId = null;

  @SerializedName("TemplateName")
  private String templateName = null;

  @SerializedName("TemplateParams")
  private List<TemplateParamForListParameterTemplatesOutput> templateParams = null;

  @SerializedName("TemplateSource")
  private String templateSource = null;

  @SerializedName("TemplateType")
  private String templateType = null;

  @SerializedName("TemplateTypeVersion")
  private String templateTypeVersion = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public DataForListParameterTemplatesOutput accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public DataForListParameterTemplatesOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public DataForListParameterTemplatesOutput needRestart(Boolean needRestart) {
    this.needRestart = needRestart;
    return this;
  }

   /**
   * Get needRestart
   * @return needRestart
  **/
  @Schema(description = "")
  public Boolean isNeedRestart() {
    return needRestart;
  }

  public void setNeedRestart(Boolean needRestart) {
    this.needRestart = needRestart;
  }

  public DataForListParameterTemplatesOutput parameterNum(Long parameterNum) {
    this.parameterNum = parameterNum;
    return this;
  }

   /**
   * Get parameterNum
   * @return parameterNum
  **/
  @Schema(description = "")
  public Long getParameterNum() {
    return parameterNum;
  }

  public void setParameterNum(Long parameterNum) {
    this.parameterNum = parameterNum;
  }

  public DataForListParameterTemplatesOutput projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public DataForListParameterTemplatesOutput templateCategory(String templateCategory) {
    this.templateCategory = templateCategory;
    return this;
  }

   /**
   * Get templateCategory
   * @return templateCategory
  **/
  @Schema(description = "")
  public String getTemplateCategory() {
    return templateCategory;
  }

  public void setTemplateCategory(String templateCategory) {
    this.templateCategory = templateCategory;
  }

  public DataForListParameterTemplatesOutput templateDesc(String templateDesc) {
    this.templateDesc = templateDesc;
    return this;
  }

   /**
   * Get templateDesc
   * @return templateDesc
  **/
  @Schema(description = "")
  public String getTemplateDesc() {
    return templateDesc;
  }

  public void setTemplateDesc(String templateDesc) {
    this.templateDesc = templateDesc;
  }

  public DataForListParameterTemplatesOutput templateId(String templateId) {
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

  public DataForListParameterTemplatesOutput templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
  @Schema(description = "")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public DataForListParameterTemplatesOutput templateParams(List<TemplateParamForListParameterTemplatesOutput> templateParams) {
    this.templateParams = templateParams;
    return this;
  }

  public DataForListParameterTemplatesOutput addTemplateParamsItem(TemplateParamForListParameterTemplatesOutput templateParamsItem) {
    if (this.templateParams == null) {
      this.templateParams = new ArrayList<TemplateParamForListParameterTemplatesOutput>();
    }
    this.templateParams.add(templateParamsItem);
    return this;
  }

   /**
   * Get templateParams
   * @return templateParams
  **/
  @Valid
  @Schema(description = "")
  public List<TemplateParamForListParameterTemplatesOutput> getTemplateParams() {
    return templateParams;
  }

  public void setTemplateParams(List<TemplateParamForListParameterTemplatesOutput> templateParams) {
    this.templateParams = templateParams;
  }

  public DataForListParameterTemplatesOutput templateSource(String templateSource) {
    this.templateSource = templateSource;
    return this;
  }

   /**
   * Get templateSource
   * @return templateSource
  **/
  @Schema(description = "")
  public String getTemplateSource() {
    return templateSource;
  }

  public void setTemplateSource(String templateSource) {
    this.templateSource = templateSource;
  }

  public DataForListParameterTemplatesOutput templateType(String templateType) {
    this.templateType = templateType;
    return this;
  }

   /**
   * Get templateType
   * @return templateType
  **/
  @Schema(description = "")
  public String getTemplateType() {
    return templateType;
  }

  public void setTemplateType(String templateType) {
    this.templateType = templateType;
  }

  public DataForListParameterTemplatesOutput templateTypeVersion(String templateTypeVersion) {
    this.templateTypeVersion = templateTypeVersion;
    return this;
  }

   /**
   * Get templateTypeVersion
   * @return templateTypeVersion
  **/
  @Schema(description = "")
  public String getTemplateTypeVersion() {
    return templateTypeVersion;
  }

  public void setTemplateTypeVersion(String templateTypeVersion) {
    this.templateTypeVersion = templateTypeVersion;
  }

  public DataForListParameterTemplatesOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForListParameterTemplatesOutput dataForListParameterTemplatesOutput = (DataForListParameterTemplatesOutput) o;
    return Objects.equals(this.accountId, dataForListParameterTemplatesOutput.accountId) &&
        Objects.equals(this.createTime, dataForListParameterTemplatesOutput.createTime) &&
        Objects.equals(this.needRestart, dataForListParameterTemplatesOutput.needRestart) &&
        Objects.equals(this.parameterNum, dataForListParameterTemplatesOutput.parameterNum) &&
        Objects.equals(this.projectName, dataForListParameterTemplatesOutput.projectName) &&
        Objects.equals(this.templateCategory, dataForListParameterTemplatesOutput.templateCategory) &&
        Objects.equals(this.templateDesc, dataForListParameterTemplatesOutput.templateDesc) &&
        Objects.equals(this.templateId, dataForListParameterTemplatesOutput.templateId) &&
        Objects.equals(this.templateName, dataForListParameterTemplatesOutput.templateName) &&
        Objects.equals(this.templateParams, dataForListParameterTemplatesOutput.templateParams) &&
        Objects.equals(this.templateSource, dataForListParameterTemplatesOutput.templateSource) &&
        Objects.equals(this.templateType, dataForListParameterTemplatesOutput.templateType) &&
        Objects.equals(this.templateTypeVersion, dataForListParameterTemplatesOutput.templateTypeVersion) &&
        Objects.equals(this.updateTime, dataForListParameterTemplatesOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, createTime, needRestart, parameterNum, projectName, templateCategory, templateDesc, templateId, templateName, templateParams, templateSource, templateType, templateTypeVersion, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForListParameterTemplatesOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    needRestart: ").append(toIndentedString(needRestart)).append("\n");
    sb.append("    parameterNum: ").append(toIndentedString(parameterNum)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    templateCategory: ").append(toIndentedString(templateCategory)).append("\n");
    sb.append("    templateDesc: ").append(toIndentedString(templateDesc)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    templateParams: ").append(toIndentedString(templateParams)).append("\n");
    sb.append("    templateSource: ").append(toIndentedString(templateSource)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    templateTypeVersion: ").append(toIndentedString(templateTypeVersion)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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