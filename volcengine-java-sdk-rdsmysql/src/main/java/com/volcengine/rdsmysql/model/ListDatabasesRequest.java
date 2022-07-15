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
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListDatabasesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:46.453185+08:00[Asia/Shanghai]")
public class ListDatabasesRequest {
  /**
   * Gets or Sets dbStatus
   */
  @JsonAdapter(DbStatusEnum.Adapter.class)
  public enum DbStatusEnum {
    CREATING("Creating"),
    DELETING("Deleting"),
    RUNNING("Running");

    private String value;

    DbStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DbStatusEnum fromValue(String input) {
      for (DbStatusEnum b : DbStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DbStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DbStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DbStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DbStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DBStatus")
  private DbStatusEnum dbStatus = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("Offset")
  private Integer offset = null;

  public ListDatabasesRequest dbStatus(DbStatusEnum dbStatus) {
    this.dbStatus = dbStatus;
    return this;
  }

   /**
   * Get dbStatus
   * @return dbStatus
  **/
  @Schema(description = "")
  public DbStatusEnum getDbStatus() {
    return dbStatus;
  }

  public void setDbStatus(DbStatusEnum dbStatus) {
    this.dbStatus = dbStatus;
  }

  public ListDatabasesRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ListDatabasesRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @Schema(description = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ListDatabasesRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @Schema(description = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDatabasesRequest listDatabasesRequest = (ListDatabasesRequest) o;
    return Objects.equals(this.dbStatus, listDatabasesRequest.dbStatus) &&
        Objects.equals(this.instanceId, listDatabasesRequest.instanceId) &&
        Objects.equals(this.limit, listDatabasesRequest.limit) &&
        Objects.equals(this.offset, listDatabasesRequest.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbStatus, instanceId, limit, offset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDatabasesRequest {\n");
    
    sb.append("    dbStatus: ").append(toIndentedString(dbStatus)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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