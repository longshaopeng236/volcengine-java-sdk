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
 * CreateMountPointRequest
 */


public class CreateMountPointRequest {
  @SerializedName("FileSystemId")
  private String fileSystemId = null;

  @SerializedName("MountPointName")
  private String mountPointName = null;

  @SerializedName("PermissionGroupId")
  private String permissionGroupId = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public CreateMountPointRequest fileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
    return this;
  }

   /**
   * Get fileSystemId
   * @return fileSystemId
  **/
  @Schema(description = "")
  public String getFileSystemId() {
    return fileSystemId;
  }

  public void setFileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
  }

  public CreateMountPointRequest mountPointName(String mountPointName) {
    this.mountPointName = mountPointName;
    return this;
  }

   /**
   * Get mountPointName
   * @return mountPointName
  **/
  @Schema(description = "")
  public String getMountPointName() {
    return mountPointName;
  }

  public void setMountPointName(String mountPointName) {
    this.mountPointName = mountPointName;
  }

  public CreateMountPointRequest permissionGroupId(String permissionGroupId) {
    this.permissionGroupId = permissionGroupId;
    return this;
  }

   /**
   * Get permissionGroupId
   * @return permissionGroupId
  **/
  @Schema(description = "")
  public String getPermissionGroupId() {
    return permissionGroupId;
  }

  public void setPermissionGroupId(String permissionGroupId) {
    this.permissionGroupId = permissionGroupId;
  }

  public CreateMountPointRequest subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @Schema(description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public CreateMountPointRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMountPointRequest createMountPointRequest = (CreateMountPointRequest) o;
    return Objects.equals(this.fileSystemId, createMountPointRequest.fileSystemId) &&
        Objects.equals(this.mountPointName, createMountPointRequest.mountPointName) &&
        Objects.equals(this.permissionGroupId, createMountPointRequest.permissionGroupId) &&
        Objects.equals(this.subnetId, createMountPointRequest.subnetId) &&
        Objects.equals(this.vpcId, createMountPointRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSystemId, mountPointName, permissionGroupId, subnetId, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMountPointRequest {\n");
    
    sb.append("    fileSystemId: ").append(toIndentedString(fileSystemId)).append("\n");
    sb.append("    mountPointName: ").append(toIndentedString(mountPointName)).append("\n");
    sb.append("    permissionGroupId: ").append(toIndentedString(permissionGroupId)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
