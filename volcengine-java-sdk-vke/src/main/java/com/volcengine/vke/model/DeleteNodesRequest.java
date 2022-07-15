/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

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
 * DeleteNodesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:54.001539+08:00[Asia/Shanghai]")
public class DeleteNodesRequest {
  /**
   * Gets or Sets cascadingDeleteResources
   */
  @JsonAdapter(CascadingDeleteResourcesEnum.Adapter.class)
  public enum CascadingDeleteResourcesEnum {
    ECS("Ecs");

    private String value;

    CascadingDeleteResourcesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CascadingDeleteResourcesEnum fromValue(String input) {
      for (CascadingDeleteResourcesEnum b : CascadingDeleteResourcesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CascadingDeleteResourcesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CascadingDeleteResourcesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CascadingDeleteResourcesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CascadingDeleteResourcesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("CascadingDeleteResources")
  private List<CascadingDeleteResourcesEnum> cascadingDeleteResources = null;

  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("Ids")
  private List<String> ids = null;

  @SerializedName("NodePoolId")
  private String nodePoolId = null;

  public DeleteNodesRequest cascadingDeleteResources(List<CascadingDeleteResourcesEnum> cascadingDeleteResources) {
    this.cascadingDeleteResources = cascadingDeleteResources;
    return this;
  }

  public DeleteNodesRequest addCascadingDeleteResourcesItem(CascadingDeleteResourcesEnum cascadingDeleteResourcesItem) {
    if (this.cascadingDeleteResources == null) {
      this.cascadingDeleteResources = new ArrayList<CascadingDeleteResourcesEnum>();
    }
    this.cascadingDeleteResources.add(cascadingDeleteResourcesItem);
    return this;
  }

   /**
   * Get cascadingDeleteResources
   * @return cascadingDeleteResources
  **/
  @Schema(description = "")
  public List<CascadingDeleteResourcesEnum> getCascadingDeleteResources() {
    return cascadingDeleteResources;
  }

  public void setCascadingDeleteResources(List<CascadingDeleteResourcesEnum> cascadingDeleteResources) {
    this.cascadingDeleteResources = cascadingDeleteResources;
  }

  public DeleteNodesRequest clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @Schema(description = "")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public DeleteNodesRequest ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public DeleteNodesRequest addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<String>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @Schema(description = "")
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  public DeleteNodesRequest nodePoolId(String nodePoolId) {
    this.nodePoolId = nodePoolId;
    return this;
  }

   /**
   * Get nodePoolId
   * @return nodePoolId
  **/
  @Schema(description = "")
  public String getNodePoolId() {
    return nodePoolId;
  }

  public void setNodePoolId(String nodePoolId) {
    this.nodePoolId = nodePoolId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteNodesRequest deleteNodesRequest = (DeleteNodesRequest) o;
    return Objects.equals(this.cascadingDeleteResources, deleteNodesRequest.cascadingDeleteResources) &&
        Objects.equals(this.clusterId, deleteNodesRequest.clusterId) &&
        Objects.equals(this.ids, deleteNodesRequest.ids) &&
        Objects.equals(this.nodePoolId, deleteNodesRequest.nodePoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cascadingDeleteResources, clusterId, ids, nodePoolId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteNodesRequest {\n");
    
    sb.append("    cascadingDeleteResources: ").append(toIndentedString(cascadingDeleteResources)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    nodePoolId: ").append(toIndentedString(nodePoolId)).append("\n");
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