/*
 * rds_mysql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysql.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateDBInstanceIPListRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:46.453185+08:00[Asia/Shanghai]")
public class CreateDBInstanceIPListRequest {
  @SerializedName("GroupName")
  private String groupName = null;

  @SerializedName("IPList")
  private List<String> ipList = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  public CreateDBInstanceIPListRequest groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
 @Size(min=2,max=120)  @Schema(description = "")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public CreateDBInstanceIPListRequest ipList(List<String> ipList) {
    this.ipList = ipList;
    return this;
  }

  public CreateDBInstanceIPListRequest addIpListItem(String ipListItem) {
    if (this.ipList == null) {
      this.ipList = new ArrayList<String>();
    }
    this.ipList.add(ipListItem);
    return this;
  }

   /**
   * Get ipList
   * @return ipList
  **/
  @Schema(description = "")
  public List<String> getIpList() {
    return ipList;
  }

  public void setIpList(List<String> ipList) {
    this.ipList = ipList;
  }

  public CreateDBInstanceIPListRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDBInstanceIPListRequest createDBInstanceIPListRequest = (CreateDBInstanceIPListRequest) o;
    return Objects.equals(this.groupName, createDBInstanceIPListRequest.groupName) &&
        Objects.equals(this.ipList, createDBInstanceIPListRequest.ipList) &&
        Objects.equals(this.instanceId, createDBInstanceIPListRequest.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, ipList, instanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDBInstanceIPListRequest {\n");
    
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
