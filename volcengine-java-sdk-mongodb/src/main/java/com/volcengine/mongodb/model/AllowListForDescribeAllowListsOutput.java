/*
 * mongodb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mongodb.model;

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
 * AllowListForDescribeAllowListsOutput
 */


public class AllowListForDescribeAllowListsOutput {
  @SerializedName("AllowListDesc")
  private String allowListDesc = null;

  @SerializedName("AllowListIPNum")
  private Long allowListIPNum = null;

  @SerializedName("AllowListId")
  private String allowListId = null;

  @SerializedName("AllowListName")
  private String allowListName = null;

  @SerializedName("AllowListType")
  private String allowListType = null;

  @SerializedName("AssociatedInstanceNum")
  private Long associatedInstanceNum = null;

  public AllowListForDescribeAllowListsOutput allowListDesc(String allowListDesc) {
    this.allowListDesc = allowListDesc;
    return this;
  }

   /**
   * Get allowListDesc
   * @return allowListDesc
  **/
  @Schema(description = "")
  public String getAllowListDesc() {
    return allowListDesc;
  }

  public void setAllowListDesc(String allowListDesc) {
    this.allowListDesc = allowListDesc;
  }

  public AllowListForDescribeAllowListsOutput allowListIPNum(Long allowListIPNum) {
    this.allowListIPNum = allowListIPNum;
    return this;
  }

   /**
   * Get allowListIPNum
   * @return allowListIPNum
  **/
  @Schema(description = "")
  public Long getAllowListIPNum() {
    return allowListIPNum;
  }

  public void setAllowListIPNum(Long allowListIPNum) {
    this.allowListIPNum = allowListIPNum;
  }

  public AllowListForDescribeAllowListsOutput allowListId(String allowListId) {
    this.allowListId = allowListId;
    return this;
  }

   /**
   * Get allowListId
   * @return allowListId
  **/
  @Schema(description = "")
  public String getAllowListId() {
    return allowListId;
  }

  public void setAllowListId(String allowListId) {
    this.allowListId = allowListId;
  }

  public AllowListForDescribeAllowListsOutput allowListName(String allowListName) {
    this.allowListName = allowListName;
    return this;
  }

   /**
   * Get allowListName
   * @return allowListName
  **/
  @Schema(description = "")
  public String getAllowListName() {
    return allowListName;
  }

  public void setAllowListName(String allowListName) {
    this.allowListName = allowListName;
  }

  public AllowListForDescribeAllowListsOutput allowListType(String allowListType) {
    this.allowListType = allowListType;
    return this;
  }

   /**
   * Get allowListType
   * @return allowListType
  **/
  @Schema(description = "")
  public String getAllowListType() {
    return allowListType;
  }

  public void setAllowListType(String allowListType) {
    this.allowListType = allowListType;
  }

  public AllowListForDescribeAllowListsOutput associatedInstanceNum(Long associatedInstanceNum) {
    this.associatedInstanceNum = associatedInstanceNum;
    return this;
  }

   /**
   * Get associatedInstanceNum
   * @return associatedInstanceNum
  **/
  @Schema(description = "")
  public Long getAssociatedInstanceNum() {
    return associatedInstanceNum;
  }

  public void setAssociatedInstanceNum(Long associatedInstanceNum) {
    this.associatedInstanceNum = associatedInstanceNum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowListForDescribeAllowListsOutput allowListForDescribeAllowListsOutput = (AllowListForDescribeAllowListsOutput) o;
    return Objects.equals(this.allowListDesc, allowListForDescribeAllowListsOutput.allowListDesc) &&
        Objects.equals(this.allowListIPNum, allowListForDescribeAllowListsOutput.allowListIPNum) &&
        Objects.equals(this.allowListId, allowListForDescribeAllowListsOutput.allowListId) &&
        Objects.equals(this.allowListName, allowListForDescribeAllowListsOutput.allowListName) &&
        Objects.equals(this.allowListType, allowListForDescribeAllowListsOutput.allowListType) &&
        Objects.equals(this.associatedInstanceNum, allowListForDescribeAllowListsOutput.associatedInstanceNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowListDesc, allowListIPNum, allowListId, allowListName, allowListType, associatedInstanceNum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowListForDescribeAllowListsOutput {\n");
    
    sb.append("    allowListDesc: ").append(toIndentedString(allowListDesc)).append("\n");
    sb.append("    allowListIPNum: ").append(toIndentedString(allowListIPNum)).append("\n");
    sb.append("    allowListId: ").append(toIndentedString(allowListId)).append("\n");
    sb.append("    allowListName: ").append(toIndentedString(allowListName)).append("\n");
    sb.append("    allowListType: ").append(toIndentedString(allowListType)).append("\n");
    sb.append("    associatedInstanceNum: ").append(toIndentedString(associatedInstanceNum)).append("\n");
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
