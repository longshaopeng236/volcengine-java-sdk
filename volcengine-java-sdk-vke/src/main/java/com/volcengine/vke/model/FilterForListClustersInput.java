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
import com.volcengine.vke.model.StatusForListClustersInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FilterForListClustersInput
 */


public class FilterForListClustersInput {
  @SerializedName("CreateClientToken")
  private String createClientToken = null;

  @SerializedName("DeleteProtectionEnabled")
  private Boolean deleteProtectionEnabled = null;

  @SerializedName("Ids")
  private List<String> ids = null;

  @SerializedName("Name")
  private String name = null;

  /**
   * Gets or Sets podsConfigPodNetworkMode
   */
  @JsonAdapter(PodsConfigPodNetworkModeEnum.Adapter.class)
  public enum PodsConfigPodNetworkModeEnum {
    CALICOBGP("CalicoBgp"),
    CALICOVXLAN("CalicoVxlan"),
    CARMA("Carma"),
    CILIUM("Cilium"),
    DEFAULT("Default"),
    FLANNEL("Flannel"),
    KUBEOVN("KubeOvn"),
    VPCCNIDEDICATED("VpcCniDedicated"),
    VPCCNISHARED("VpcCniShared");

    private String value;

    PodsConfigPodNetworkModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PodsConfigPodNetworkModeEnum fromValue(String input) {
      for (PodsConfigPodNetworkModeEnum b : PodsConfigPodNetworkModeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PodsConfigPodNetworkModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PodsConfigPodNetworkModeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PodsConfigPodNetworkModeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PodsConfigPodNetworkModeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("PodsConfig.PodNetworkMode")
  private PodsConfigPodNetworkModeEnum podsConfigPodNetworkMode = null;

  @SerializedName("Statuses")
  private List<StatusForListClustersInput> statuses = null;

  @SerializedName("UpdateClientToken")
  private String updateClientToken = null;

  public FilterForListClustersInput createClientToken(String createClientToken) {
    this.createClientToken = createClientToken;
    return this;
  }

   /**
   * Get createClientToken
   * @return createClientToken
  **/
  @Schema(description = "")
  public String getCreateClientToken() {
    return createClientToken;
  }

  public void setCreateClientToken(String createClientToken) {
    this.createClientToken = createClientToken;
  }

  public FilterForListClustersInput deleteProtectionEnabled(Boolean deleteProtectionEnabled) {
    this.deleteProtectionEnabled = deleteProtectionEnabled;
    return this;
  }

   /**
   * Get deleteProtectionEnabled
   * @return deleteProtectionEnabled
  **/
  @Schema(description = "")
  public Boolean isDeleteProtectionEnabled() {
    return deleteProtectionEnabled;
  }

  public void setDeleteProtectionEnabled(Boolean deleteProtectionEnabled) {
    this.deleteProtectionEnabled = deleteProtectionEnabled;
  }

  public FilterForListClustersInput ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public FilterForListClustersInput addIdsItem(String idsItem) {
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

  public FilterForListClustersInput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FilterForListClustersInput podsConfigPodNetworkMode(PodsConfigPodNetworkModeEnum podsConfigPodNetworkMode) {
    this.podsConfigPodNetworkMode = podsConfigPodNetworkMode;
    return this;
  }

   /**
   * Get podsConfigPodNetworkMode
   * @return podsConfigPodNetworkMode
  **/
  @Schema(description = "")
  public PodsConfigPodNetworkModeEnum getPodsConfigPodNetworkMode() {
    return podsConfigPodNetworkMode;
  }

  public void setPodsConfigPodNetworkMode(PodsConfigPodNetworkModeEnum podsConfigPodNetworkMode) {
    this.podsConfigPodNetworkMode = podsConfigPodNetworkMode;
  }

  public FilterForListClustersInput statuses(List<StatusForListClustersInput> statuses) {
    this.statuses = statuses;
    return this;
  }

  public FilterForListClustersInput addStatusesItem(StatusForListClustersInput statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<StatusForListClustersInput>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Get statuses
   * @return statuses
  **/
  @Valid
  @Schema(description = "")
  public List<StatusForListClustersInput> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<StatusForListClustersInput> statuses) {
    this.statuses = statuses;
  }

  public FilterForListClustersInput updateClientToken(String updateClientToken) {
    this.updateClientToken = updateClientToken;
    return this;
  }

   /**
   * Get updateClientToken
   * @return updateClientToken
  **/
  @Schema(description = "")
  public String getUpdateClientToken() {
    return updateClientToken;
  }

  public void setUpdateClientToken(String updateClientToken) {
    this.updateClientToken = updateClientToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterForListClustersInput filterForListClustersInput = (FilterForListClustersInput) o;
    return Objects.equals(this.createClientToken, filterForListClustersInput.createClientToken) &&
        Objects.equals(this.deleteProtectionEnabled, filterForListClustersInput.deleteProtectionEnabled) &&
        Objects.equals(this.ids, filterForListClustersInput.ids) &&
        Objects.equals(this.name, filterForListClustersInput.name) &&
        Objects.equals(this.podsConfigPodNetworkMode, filterForListClustersInput.podsConfigPodNetworkMode) &&
        Objects.equals(this.statuses, filterForListClustersInput.statuses) &&
        Objects.equals(this.updateClientToken, filterForListClustersInput.updateClientToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createClientToken, deleteProtectionEnabled, ids, name, podsConfigPodNetworkMode, statuses, updateClientToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterForListClustersInput {\n");
    
    sb.append("    createClientToken: ").append(toIndentedString(createClientToken)).append("\n");
    sb.append("    deleteProtectionEnabled: ").append(toIndentedString(deleteProtectionEnabled)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    podsConfigPodNetworkMode: ").append(toIndentedString(podsConfigPodNetworkMode)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    updateClientToken: ").append(toIndentedString(updateClientToken)).append("\n");
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
