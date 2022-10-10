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
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConfigServerForDescribeDBInstanceDetailOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T12:08:21.110021+08:00[Asia/Shanghai]")
public class ConfigServerForDescribeDBInstanceDetailOutput {
  @SerializedName("ConfigServerNodeId")
  private String configServerNodeId = null;

  /**
   * Gets or Sets nodeRole
   */
  @JsonAdapter(NodeRoleEnum.Adapter.class)
  public enum NodeRoleEnum {
    PRIMARY("Primary"),
    SECONDARY("Secondary");

    private String value;

    NodeRoleEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static NodeRoleEnum fromValue(String input) {
      for (NodeRoleEnum b : NodeRoleEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<NodeRoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NodeRoleEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public NodeRoleEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return NodeRoleEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("NodeRole")
  private NodeRoleEnum nodeRole = null;

  /**
   * Gets or Sets nodeStatus
   */
  @JsonAdapter(NodeStatusEnum.Adapter.class)
  public enum NodeStatusEnum {
    ERROR("Error"),
    RUNNING("Running");

    private String value;

    NodeStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static NodeStatusEnum fromValue(String input) {
      for (NodeStatusEnum b : NodeStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<NodeStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NodeStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public NodeStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return NodeStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("NodeStatus")
  private NodeStatusEnum nodeStatus = null;

  @SerializedName("TotalMemoryGB")
  private Double totalMemoryGB = null;

  @SerializedName("TotalvCPU")
  private Double totalvCPU = null;

  @SerializedName("UsedMemoryGB")
  private Double usedMemoryGB = null;

  @SerializedName("UsedvCPU")
  private Double usedvCPU = null;

  public ConfigServerForDescribeDBInstanceDetailOutput configServerNodeId(String configServerNodeId) {
    this.configServerNodeId = configServerNodeId;
    return this;
  }

   /**
   * Get configServerNodeId
   * @return configServerNodeId
  **/
  @Schema(description = "")
  public String getConfigServerNodeId() {
    return configServerNodeId;
  }

  public void setConfigServerNodeId(String configServerNodeId) {
    this.configServerNodeId = configServerNodeId;
  }

  public ConfigServerForDescribeDBInstanceDetailOutput nodeRole(NodeRoleEnum nodeRole) {
    this.nodeRole = nodeRole;
    return this;
  }

   /**
   * Get nodeRole
   * @return nodeRole
  **/
  @Schema(description = "")
  public NodeRoleEnum getNodeRole() {
    return nodeRole;
  }

  public void setNodeRole(NodeRoleEnum nodeRole) {
    this.nodeRole = nodeRole;
  }

  public ConfigServerForDescribeDBInstanceDetailOutput nodeStatus(NodeStatusEnum nodeStatus) {
    this.nodeStatus = nodeStatus;
    return this;
  }

   /**
   * Get nodeStatus
   * @return nodeStatus
  **/
  @Schema(description = "")
  public NodeStatusEnum getNodeStatus() {
    return nodeStatus;
  }

  public void setNodeStatus(NodeStatusEnum nodeStatus) {
    this.nodeStatus = nodeStatus;
  }

  public ConfigServerForDescribeDBInstanceDetailOutput totalMemoryGB(Double totalMemoryGB) {
    this.totalMemoryGB = totalMemoryGB;
    return this;
  }

   /**
   * Get totalMemoryGB
   * @return totalMemoryGB
  **/
  @Schema(description = "")
  public Double getTotalMemoryGB() {
    return totalMemoryGB;
  }

  public void setTotalMemoryGB(Double totalMemoryGB) {
    this.totalMemoryGB = totalMemoryGB;
  }

  public ConfigServerForDescribeDBInstanceDetailOutput totalvCPU(Double totalvCPU) {
    this.totalvCPU = totalvCPU;
    return this;
  }

   /**
   * Get totalvCPU
   * @return totalvCPU
  **/
  @Schema(description = "")
  public Double getTotalvCPU() {
    return totalvCPU;
  }

  public void setTotalvCPU(Double totalvCPU) {
    this.totalvCPU = totalvCPU;
  }

  public ConfigServerForDescribeDBInstanceDetailOutput usedMemoryGB(Double usedMemoryGB) {
    this.usedMemoryGB = usedMemoryGB;
    return this;
  }

   /**
   * Get usedMemoryGB
   * @return usedMemoryGB
  **/
  @Schema(description = "")
  public Double getUsedMemoryGB() {
    return usedMemoryGB;
  }

  public void setUsedMemoryGB(Double usedMemoryGB) {
    this.usedMemoryGB = usedMemoryGB;
  }

  public ConfigServerForDescribeDBInstanceDetailOutput usedvCPU(Double usedvCPU) {
    this.usedvCPU = usedvCPU;
    return this;
  }

   /**
   * Get usedvCPU
   * @return usedvCPU
  **/
  @Schema(description = "")
  public Double getUsedvCPU() {
    return usedvCPU;
  }

  public void setUsedvCPU(Double usedvCPU) {
    this.usedvCPU = usedvCPU;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigServerForDescribeDBInstanceDetailOutput configServerForDescribeDBInstanceDetailOutput = (ConfigServerForDescribeDBInstanceDetailOutput) o;
    return Objects.equals(this.configServerNodeId, configServerForDescribeDBInstanceDetailOutput.configServerNodeId) &&
        Objects.equals(this.nodeRole, configServerForDescribeDBInstanceDetailOutput.nodeRole) &&
        Objects.equals(this.nodeStatus, configServerForDescribeDBInstanceDetailOutput.nodeStatus) &&
        Objects.equals(this.totalMemoryGB, configServerForDescribeDBInstanceDetailOutput.totalMemoryGB) &&
        Objects.equals(this.totalvCPU, configServerForDescribeDBInstanceDetailOutput.totalvCPU) &&
        Objects.equals(this.usedMemoryGB, configServerForDescribeDBInstanceDetailOutput.usedMemoryGB) &&
        Objects.equals(this.usedvCPU, configServerForDescribeDBInstanceDetailOutput.usedvCPU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configServerNodeId, nodeRole, nodeStatus, totalMemoryGB, totalvCPU, usedMemoryGB, usedvCPU);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigServerForDescribeDBInstanceDetailOutput {\n");
    
    sb.append("    configServerNodeId: ").append(toIndentedString(configServerNodeId)).append("\n");
    sb.append("    nodeRole: ").append(toIndentedString(nodeRole)).append("\n");
    sb.append("    nodeStatus: ").append(toIndentedString(nodeStatus)).append("\n");
    sb.append("    totalMemoryGB: ").append(toIndentedString(totalMemoryGB)).append("\n");
    sb.append("    totalvCPU: ").append(toIndentedString(totalvCPU)).append("\n");
    sb.append("    usedMemoryGB: ").append(toIndentedString(usedMemoryGB)).append("\n");
    sb.append("    usedvCPU: ").append(toIndentedString(usedvCPU)).append("\n");
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
