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
import com.volcengine.mongodb.model.AccountPrivilegeForDescribeDBAccountsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AccountForDescribeDBAccountsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T12:08:21.110021+08:00[Asia/Shanghai]")
public class AccountForDescribeDBAccountsOutput {
  @SerializedName("AccountName")
  private String accountName = null;

  @SerializedName("AccountPrivileges")
  private List<AccountPrivilegeForDescribeDBAccountsOutput> accountPrivileges = null;

  /**
   * Gets or Sets accountType
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    SUPER("Super");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AccountTypeEnum fromValue(String input) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AccountTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("AccountType")
  private AccountTypeEnum accountType = null;

  public AccountForDescribeDBAccountsOutput accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @Schema(description = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public AccountForDescribeDBAccountsOutput accountPrivileges(List<AccountPrivilegeForDescribeDBAccountsOutput> accountPrivileges) {
    this.accountPrivileges = accountPrivileges;
    return this;
  }

  public AccountForDescribeDBAccountsOutput addAccountPrivilegesItem(AccountPrivilegeForDescribeDBAccountsOutput accountPrivilegesItem) {
    if (this.accountPrivileges == null) {
      this.accountPrivileges = new ArrayList<AccountPrivilegeForDescribeDBAccountsOutput>();
    }
    this.accountPrivileges.add(accountPrivilegesItem);
    return this;
  }

   /**
   * Get accountPrivileges
   * @return accountPrivileges
  **/
  @Valid
  @Schema(description = "")
  public List<AccountPrivilegeForDescribeDBAccountsOutput> getAccountPrivileges() {
    return accountPrivileges;
  }

  public void setAccountPrivileges(List<AccountPrivilegeForDescribeDBAccountsOutput> accountPrivileges) {
    this.accountPrivileges = accountPrivileges;
  }

  public AccountForDescribeDBAccountsOutput accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @Schema(description = "")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountForDescribeDBAccountsOutput accountForDescribeDBAccountsOutput = (AccountForDescribeDBAccountsOutput) o;
    return Objects.equals(this.accountName, accountForDescribeDBAccountsOutput.accountName) &&
        Objects.equals(this.accountPrivileges, accountForDescribeDBAccountsOutput.accountPrivileges) &&
        Objects.equals(this.accountType, accountForDescribeDBAccountsOutput.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountPrivileges, accountType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountForDescribeDBAccountsOutput {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountPrivileges: ").append(toIndentedString(accountPrivileges)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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
