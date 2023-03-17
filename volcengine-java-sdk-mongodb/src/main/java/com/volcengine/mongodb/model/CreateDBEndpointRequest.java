/*
 * mongodb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mongodb.model;

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
 * CreateDBEndpointRequest
 */


public class CreateDBEndpointRequest {
  @SerializedName("EipIds")
  private List<String> eipIds = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("MongosNodeIds")
  private List<String> mongosNodeIds = null;

  /**
   * Gets or Sets networkType
   */
  @JsonAdapter(NetworkTypeEnum.Adapter.class)
  public enum NetworkTypeEnum {
    INNERPLB("InnerPLB"),
    PRIVATE("Private"),
    PUBLIC("Public"),
    STORAGEINNER("StorageInner");

    private String value;

    NetworkTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static NetworkTypeEnum fromValue(String input) {
      for (NetworkTypeEnum b : NetworkTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<NetworkTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NetworkTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public NetworkTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return NetworkTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("NetworkType")
  private NetworkTypeEnum networkType = null;

  @SerializedName("ObjectId")
  private String objectId = null;

  public CreateDBEndpointRequest eipIds(List<String> eipIds) {
    this.eipIds = eipIds;
    return this;
  }

  public CreateDBEndpointRequest addEipIdsItem(String eipIdsItem) {
    if (this.eipIds == null) {
      this.eipIds = new ArrayList<String>();
    }
    this.eipIds.add(eipIdsItem);
    return this;
  }

   /**
   * Get eipIds
   * @return eipIds
  **/
  @Schema(description = "")
  public List<String> getEipIds() {
    return eipIds;
  }

  public void setEipIds(List<String> eipIds) {
    this.eipIds = eipIds;
  }

  public CreateDBEndpointRequest instanceId(String instanceId) {
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

  public CreateDBEndpointRequest mongosNodeIds(List<String> mongosNodeIds) {
    this.mongosNodeIds = mongosNodeIds;
    return this;
  }

  public CreateDBEndpointRequest addMongosNodeIdsItem(String mongosNodeIdsItem) {
    if (this.mongosNodeIds == null) {
      this.mongosNodeIds = new ArrayList<String>();
    }
    this.mongosNodeIds.add(mongosNodeIdsItem);
    return this;
  }

   /**
   * Get mongosNodeIds
   * @return mongosNodeIds
  **/
  @Schema(description = "")
  public List<String> getMongosNodeIds() {
    return mongosNodeIds;
  }

  public void setMongosNodeIds(List<String> mongosNodeIds) {
    this.mongosNodeIds = mongosNodeIds;
  }

  public CreateDBEndpointRequest networkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
    return this;
  }

   /**
   * Get networkType
   * @return networkType
  **/
  @Schema(description = "")
  public NetworkTypeEnum getNetworkType() {
    return networkType;
  }

  public void setNetworkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
  }

  public CreateDBEndpointRequest objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @Schema(description = "")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDBEndpointRequest createDBEndpointRequest = (CreateDBEndpointRequest) o;
    return Objects.equals(this.eipIds, createDBEndpointRequest.eipIds) &&
        Objects.equals(this.instanceId, createDBEndpointRequest.instanceId) &&
        Objects.equals(this.mongosNodeIds, createDBEndpointRequest.mongosNodeIds) &&
        Objects.equals(this.networkType, createDBEndpointRequest.networkType) &&
        Objects.equals(this.objectId, createDBEndpointRequest.objectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eipIds, instanceId, mongosNodeIds, networkType, objectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDBEndpointRequest {\n");
    
    sb.append("    eipIds: ").append(toIndentedString(eipIds)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    mongosNodeIds: ").append(toIndentedString(mongosNodeIds)).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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
