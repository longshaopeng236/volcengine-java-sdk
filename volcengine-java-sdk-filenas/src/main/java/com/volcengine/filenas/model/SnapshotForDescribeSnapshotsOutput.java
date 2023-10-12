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
 * SnapshotForDescribeSnapshotsOutput
 */


public class SnapshotForDescribeSnapshotsOutput {
  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("FileSystemId")
  private String fileSystemId = null;

  @SerializedName("FileSystemName")
  private String fileSystemName = null;

  @SerializedName("IsEncrypt")
  private Boolean isEncrypt = null;

  @SerializedName("Progress")
  private String progress = null;

  @SerializedName("RetentionDays")
  private Integer retentionDays = null;

  @SerializedName("SnapshotId")
  private String snapshotId = null;

  @SerializedName("SnapshotName")
  private String snapshotName = null;

  @SerializedName("SnapshotType")
  private String snapshotType = null;

  @SerializedName("SourceSize")
  private Integer sourceSize = null;

  @SerializedName("SourceVersion")
  private String sourceVersion = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public SnapshotForDescribeSnapshotsOutput createTime(String createTime) {
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

  public SnapshotForDescribeSnapshotsOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SnapshotForDescribeSnapshotsOutput fileSystemId(String fileSystemId) {
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

  public SnapshotForDescribeSnapshotsOutput fileSystemName(String fileSystemName) {
    this.fileSystemName = fileSystemName;
    return this;
  }

   /**
   * Get fileSystemName
   * @return fileSystemName
  **/
  @Schema(description = "")
  public String getFileSystemName() {
    return fileSystemName;
  }

  public void setFileSystemName(String fileSystemName) {
    this.fileSystemName = fileSystemName;
  }

  public SnapshotForDescribeSnapshotsOutput isEncrypt(Boolean isEncrypt) {
    this.isEncrypt = isEncrypt;
    return this;
  }

   /**
   * Get isEncrypt
   * @return isEncrypt
  **/
  @Schema(description = "")
  public Boolean isIsEncrypt() {
    return isEncrypt;
  }

  public void setIsEncrypt(Boolean isEncrypt) {
    this.isEncrypt = isEncrypt;
  }

  public SnapshotForDescribeSnapshotsOutput progress(String progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @Schema(description = "")
  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }

  public SnapshotForDescribeSnapshotsOutput retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

   /**
   * Get retentionDays
   * @return retentionDays
  **/
  @Schema(description = "")
  public Integer getRetentionDays() {
    return retentionDays;
  }

  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }

  public SnapshotForDescribeSnapshotsOutput snapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

   /**
   * Get snapshotId
   * @return snapshotId
  **/
  @Schema(description = "")
  public String getSnapshotId() {
    return snapshotId;
  }

  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  public SnapshotForDescribeSnapshotsOutput snapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
    return this;
  }

   /**
   * Get snapshotName
   * @return snapshotName
  **/
  @Schema(description = "")
  public String getSnapshotName() {
    return snapshotName;
  }

  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }

  public SnapshotForDescribeSnapshotsOutput snapshotType(String snapshotType) {
    this.snapshotType = snapshotType;
    return this;
  }

   /**
   * Get snapshotType
   * @return snapshotType
  **/
  @Schema(description = "")
  public String getSnapshotType() {
    return snapshotType;
  }

  public void setSnapshotType(String snapshotType) {
    this.snapshotType = snapshotType;
  }

  public SnapshotForDescribeSnapshotsOutput sourceSize(Integer sourceSize) {
    this.sourceSize = sourceSize;
    return this;
  }

   /**
   * Get sourceSize
   * @return sourceSize
  **/
  @Schema(description = "")
  public Integer getSourceSize() {
    return sourceSize;
  }

  public void setSourceSize(Integer sourceSize) {
    this.sourceSize = sourceSize;
  }

  public SnapshotForDescribeSnapshotsOutput sourceVersion(String sourceVersion) {
    this.sourceVersion = sourceVersion;
    return this;
  }

   /**
   * Get sourceVersion
   * @return sourceVersion
  **/
  @Schema(description = "")
  public String getSourceVersion() {
    return sourceVersion;
  }

  public void setSourceVersion(String sourceVersion) {
    this.sourceVersion = sourceVersion;
  }

  public SnapshotForDescribeSnapshotsOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SnapshotForDescribeSnapshotsOutput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotForDescribeSnapshotsOutput snapshotForDescribeSnapshotsOutput = (SnapshotForDescribeSnapshotsOutput) o;
    return Objects.equals(this.createTime, snapshotForDescribeSnapshotsOutput.createTime) &&
        Objects.equals(this.description, snapshotForDescribeSnapshotsOutput.description) &&
        Objects.equals(this.fileSystemId, snapshotForDescribeSnapshotsOutput.fileSystemId) &&
        Objects.equals(this.fileSystemName, snapshotForDescribeSnapshotsOutput.fileSystemName) &&
        Objects.equals(this.isEncrypt, snapshotForDescribeSnapshotsOutput.isEncrypt) &&
        Objects.equals(this.progress, snapshotForDescribeSnapshotsOutput.progress) &&
        Objects.equals(this.retentionDays, snapshotForDescribeSnapshotsOutput.retentionDays) &&
        Objects.equals(this.snapshotId, snapshotForDescribeSnapshotsOutput.snapshotId) &&
        Objects.equals(this.snapshotName, snapshotForDescribeSnapshotsOutput.snapshotName) &&
        Objects.equals(this.snapshotType, snapshotForDescribeSnapshotsOutput.snapshotType) &&
        Objects.equals(this.sourceSize, snapshotForDescribeSnapshotsOutput.sourceSize) &&
        Objects.equals(this.sourceVersion, snapshotForDescribeSnapshotsOutput.sourceVersion) &&
        Objects.equals(this.status, snapshotForDescribeSnapshotsOutput.status) &&
        Objects.equals(this.zoneId, snapshotForDescribeSnapshotsOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, description, fileSystemId, fileSystemName, isEncrypt, progress, retentionDays, snapshotId, snapshotName, snapshotType, sourceSize, sourceVersion, status, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotForDescribeSnapshotsOutput {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileSystemId: ").append(toIndentedString(fileSystemId)).append("\n");
    sb.append("    fileSystemName: ").append(toIndentedString(fileSystemName)).append("\n");
    sb.append("    isEncrypt: ").append(toIndentedString(isEncrypt)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
    sb.append("    snapshotType: ").append(toIndentedString(snapshotType)).append("\n");
    sb.append("    sourceSize: ").append(toIndentedString(sourceSize)).append("\n");
    sb.append("    sourceVersion: ").append(toIndentedString(sourceVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
