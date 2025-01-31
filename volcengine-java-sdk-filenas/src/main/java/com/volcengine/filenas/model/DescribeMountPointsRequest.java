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
 * DescribeMountPointsRequest
 */


public class DescribeMountPointsRequest {
  @SerializedName("FileSystemId")
  private String fileSystemId = null;

  @SerializedName("MountPointId")
  private String mountPointId = null;

  @SerializedName("MountPointName")
  private String mountPointName = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public DescribeMountPointsRequest fileSystemId(String fileSystemId) {
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

  public DescribeMountPointsRequest mountPointId(String mountPointId) {
    this.mountPointId = mountPointId;
    return this;
  }

   /**
   * Get mountPointId
   * @return mountPointId
  **/
  @Schema(description = "")
  public String getMountPointId() {
    return mountPointId;
  }

  public void setMountPointId(String mountPointId) {
    this.mountPointId = mountPointId;
  }

  public DescribeMountPointsRequest mountPointName(String mountPointName) {
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

  public DescribeMountPointsRequest vpcId(String vpcId) {
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
    DescribeMountPointsRequest describeMountPointsRequest = (DescribeMountPointsRequest) o;
    return Objects.equals(this.fileSystemId, describeMountPointsRequest.fileSystemId) &&
        Objects.equals(this.mountPointId, describeMountPointsRequest.mountPointId) &&
        Objects.equals(this.mountPointName, describeMountPointsRequest.mountPointName) &&
        Objects.equals(this.vpcId, describeMountPointsRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSystemId, mountPointId, mountPointName, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeMountPointsRequest {\n");
    
    sb.append("    fileSystemId: ").append(toIndentedString(fileSystemId)).append("\n");
    sb.append("    mountPointId: ").append(toIndentedString(mountPointId)).append("\n");
    sb.append("    mountPointName: ").append(toIndentedString(mountPointName)).append("\n");
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
