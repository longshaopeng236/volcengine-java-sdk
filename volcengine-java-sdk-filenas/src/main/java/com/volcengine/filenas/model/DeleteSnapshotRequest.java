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
 * DeleteSnapshotRequest
 */


public class DeleteSnapshotRequest {
  @SerializedName("SnapshotId")
  private String snapshotId = null;

  public DeleteSnapshotRequest snapshotId(String snapshotId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteSnapshotRequest deleteSnapshotRequest = (DeleteSnapshotRequest) o;
    return Objects.equals(this.snapshotId, deleteSnapshotRequest.snapshotId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteSnapshotRequest {\n");
    
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
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
