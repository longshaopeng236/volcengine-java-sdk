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
import com.volcengine.ecs.model.InstancesIamRoleForDescribeInstancesIamRolesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeInstancesIamRolesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:28.947116+08:00[Asia/Shanghai]")
public class DescribeInstancesIamRolesResponse {
  @SerializedName("InstancesIamRoles")
  private List<InstancesIamRoleForDescribeInstancesIamRolesOutput> instancesIamRoles = null;

  public DescribeInstancesIamRolesResponse instancesIamRoles(List<InstancesIamRoleForDescribeInstancesIamRolesOutput> instancesIamRoles) {
    this.instancesIamRoles = instancesIamRoles;
    return this;
  }

  public DescribeInstancesIamRolesResponse addInstancesIamRolesItem(InstancesIamRoleForDescribeInstancesIamRolesOutput instancesIamRolesItem) {
    if (this.instancesIamRoles == null) {
      this.instancesIamRoles = new ArrayList<InstancesIamRoleForDescribeInstancesIamRolesOutput>();
    }
    this.instancesIamRoles.add(instancesIamRolesItem);
    return this;
  }

   /**
   * Get instancesIamRoles
   * @return instancesIamRoles
  **/
  @Valid
  @Schema(description = "")
  public List<InstancesIamRoleForDescribeInstancesIamRolesOutput> getInstancesIamRoles() {
    return instancesIamRoles;
  }

  public void setInstancesIamRoles(List<InstancesIamRoleForDescribeInstancesIamRolesOutput> instancesIamRoles) {
    this.instancesIamRoles = instancesIamRoles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeInstancesIamRolesResponse describeInstancesIamRolesResponse = (DescribeInstancesIamRolesResponse) o;
    return Objects.equals(this.instancesIamRoles, describeInstancesIamRolesResponse.instancesIamRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instancesIamRoles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeInstancesIamRolesResponse {\n");
    
    sb.append("    instancesIamRoles: ").append(toIndentedString(instancesIamRoles)).append("\n");
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
