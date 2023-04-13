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
import com.volcengine.iam.model.LoginProfileForGetLoginProfileOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetLoginProfileResponse
 */


public class GetLoginProfileResponse {
  @SerializedName("LoginProfile")
  private LoginProfileForGetLoginProfileOutput loginProfile = null;

  public GetLoginProfileResponse loginProfile(LoginProfileForGetLoginProfileOutput loginProfile) {
    this.loginProfile = loginProfile;
    return this;
  }

   /**
   * Get loginProfile
   * @return loginProfile
  **/
  @Valid
  @Schema(description = "")
  public LoginProfileForGetLoginProfileOutput getLoginProfile() {
    return loginProfile;
  }

  public void setLoginProfile(LoginProfileForGetLoginProfileOutput loginProfile) {
    this.loginProfile = loginProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoginProfileResponse getLoginProfileResponse = (GetLoginProfileResponse) o;
    return Objects.equals(this.loginProfile, getLoginProfileResponse.loginProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginProfile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoginProfileResponse {\n");
    
    sb.append("    loginProfile: ").append(toIndentedString(loginProfile)).append("\n");
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
