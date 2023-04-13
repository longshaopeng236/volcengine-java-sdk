/*
 * iam
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.iam.model.UserGroupForUpdateGroupOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateGroupResponse
 */


public class UpdateGroupResponse {
  @SerializedName("UserGroup")
  private UserGroupForUpdateGroupOutput userGroup = null;

  public UpdateGroupResponse userGroup(UserGroupForUpdateGroupOutput userGroup) {
    this.userGroup = userGroup;
    return this;
  }

   /**
   * Get userGroup
   * @return userGroup
  **/
  @Valid
  @Schema(description = "")
  public UserGroupForUpdateGroupOutput getUserGroup() {
    return userGroup;
  }

  public void setUserGroup(UserGroupForUpdateGroupOutput userGroup) {
    this.userGroup = userGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGroupResponse updateGroupResponse = (UpdateGroupResponse) o;
    return Objects.equals(this.userGroup, updateGroupResponse.userGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGroupResponse {\n");
    
    sb.append("    userGroup: ").append(toIndentedString(userGroup)).append("\n");
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
