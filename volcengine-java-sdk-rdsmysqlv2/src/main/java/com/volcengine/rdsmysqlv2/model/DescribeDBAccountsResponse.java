/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.AccountForDescribeDBAccountsOutput;
import com.volcengine.rdsmysqlv2.model.AccountsInfoForDescribeDBAccountsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDBAccountsResponse
 */


public class DescribeDBAccountsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Accounts")
  private List<AccountForDescribeDBAccountsOutput> accounts = null;

  @SerializedName("AccountsInfo")
  private List<AccountsInfoForDescribeDBAccountsOutput> accountsInfo = null;

  @SerializedName("Total")
  private Integer total = null;

  public DescribeDBAccountsResponse accounts(List<AccountForDescribeDBAccountsOutput> accounts) {
    this.accounts = accounts;
    return this;
  }

  public DescribeDBAccountsResponse addAccountsItem(AccountForDescribeDBAccountsOutput accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<AccountForDescribeDBAccountsOutput>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @Valid
  @Schema(description = "")
  public List<AccountForDescribeDBAccountsOutput> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<AccountForDescribeDBAccountsOutput> accounts) {
    this.accounts = accounts;
  }

  public DescribeDBAccountsResponse accountsInfo(List<AccountsInfoForDescribeDBAccountsOutput> accountsInfo) {
    this.accountsInfo = accountsInfo;
    return this;
  }

  public DescribeDBAccountsResponse addAccountsInfoItem(AccountsInfoForDescribeDBAccountsOutput accountsInfoItem) {
    if (this.accountsInfo == null) {
      this.accountsInfo = new ArrayList<AccountsInfoForDescribeDBAccountsOutput>();
    }
    this.accountsInfo.add(accountsInfoItem);
    return this;
  }

   /**
   * Get accountsInfo
   * @return accountsInfo
  **/
  @Valid
  @Schema(description = "")
  public List<AccountsInfoForDescribeDBAccountsOutput> getAccountsInfo() {
    return accountsInfo;
  }

  public void setAccountsInfo(List<AccountsInfoForDescribeDBAccountsOutput> accountsInfo) {
    this.accountsInfo = accountsInfo;
  }

  public DescribeDBAccountsResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDBAccountsResponse describeDBAccountsResponse = (DescribeDBAccountsResponse) o;
    return Objects.equals(this.accounts, describeDBAccountsResponse.accounts) &&
        Objects.equals(this.accountsInfo, describeDBAccountsResponse.accountsInfo) &&
        Objects.equals(this.total, describeDBAccountsResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, accountsInfo, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDBAccountsResponse {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    accountsInfo: ").append(toIndentedString(accountsInfo)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
