/*
 * FileNAS
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.filenas.model;

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
 * PermissionRuleForUpdatePermissionRuleInput
 */


public class PermissionRuleForUpdatePermissionRuleInput {
  @SerializedName("CidrIp")
  private String cidrIp = null;

  @SerializedName("PermissionRuleId")
  private String permissionRuleId = null;

  @SerializedName("RwMode")
  private String rwMode = null;

  @SerializedName("UserMode")
  private String userMode = null;

  public PermissionRuleForUpdatePermissionRuleInput cidrIp(String cidrIp) {
    this.cidrIp = cidrIp;
    return this;
  }

   /**
   * Get cidrIp
   * @return cidrIp
  **/
  @Schema(description = "")
  public String getCidrIp() {
    return cidrIp;
  }

  public void setCidrIp(String cidrIp) {
    this.cidrIp = cidrIp;
  }

  public PermissionRuleForUpdatePermissionRuleInput permissionRuleId(String permissionRuleId) {
    this.permissionRuleId = permissionRuleId;
    return this;
  }

   /**
   * Get permissionRuleId
   * @return permissionRuleId
  **/
  @Schema(description = "")
  public String getPermissionRuleId() {
    return permissionRuleId;
  }

  public void setPermissionRuleId(String permissionRuleId) {
    this.permissionRuleId = permissionRuleId;
  }

  public PermissionRuleForUpdatePermissionRuleInput rwMode(String rwMode) {
    this.rwMode = rwMode;
    return this;
  }

   /**
   * Get rwMode
   * @return rwMode
  **/
  @Schema(description = "")
  public String getRwMode() {
    return rwMode;
  }

  public void setRwMode(String rwMode) {
    this.rwMode = rwMode;
  }

  public PermissionRuleForUpdatePermissionRuleInput userMode(String userMode) {
    this.userMode = userMode;
    return this;
  }

   /**
   * Get userMode
   * @return userMode
  **/
  @Schema(description = "")
  public String getUserMode() {
    return userMode;
  }

  public void setUserMode(String userMode) {
    this.userMode = userMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionRuleForUpdatePermissionRuleInput permissionRuleForUpdatePermissionRuleInput = (PermissionRuleForUpdatePermissionRuleInput) o;
    return Objects.equals(this.cidrIp, permissionRuleForUpdatePermissionRuleInput.cidrIp) &&
        Objects.equals(this.permissionRuleId, permissionRuleForUpdatePermissionRuleInput.permissionRuleId) &&
        Objects.equals(this.rwMode, permissionRuleForUpdatePermissionRuleInput.rwMode) &&
        Objects.equals(this.userMode, permissionRuleForUpdatePermissionRuleInput.userMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrIp, permissionRuleId, rwMode, userMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionRuleForUpdatePermissionRuleInput {\n");
    
    sb.append("    cidrIp: ").append(toIndentedString(cidrIp)).append("\n");
    sb.append("    permissionRuleId: ").append(toIndentedString(permissionRuleId)).append("\n");
    sb.append("    rwMode: ").append(toIndentedString(rwMode)).append("\n");
    sb.append("    userMode: ").append(toIndentedString(userMode)).append("\n");
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
