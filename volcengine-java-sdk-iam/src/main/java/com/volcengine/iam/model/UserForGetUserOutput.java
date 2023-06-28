/*
 * iam
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam.model;

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
 * UserForGetUserOutput
 */


public class UserForGetUserOutput {
  @SerializedName("AccountId")
  private Integer accountId = null;

  @SerializedName("CreateDate")
  private String createDate = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("Email")
  private String email = null;

  @SerializedName("EmailIsVerify")
  private Boolean emailIsVerify = null;

  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("MobilePhone")
  private String mobilePhone = null;

  @SerializedName("MobilePhoneIsVerify")
  private Boolean mobilePhoneIsVerify = null;

  @SerializedName("Trn")
  private String trn = null;

  @SerializedName("UpdateDate")
  private String updateDate = null;

  @SerializedName("UserName")
  private String userName = null;

  public UserForGetUserOutput accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public UserForGetUserOutput createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @Schema(description = "")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public UserForGetUserOutput description(String description) {
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

  public UserForGetUserOutput displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserForGetUserOutput email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserForGetUserOutput emailIsVerify(Boolean emailIsVerify) {
    this.emailIsVerify = emailIsVerify;
    return this;
  }

   /**
   * Get emailIsVerify
   * @return emailIsVerify
  **/
  @Schema(description = "")
  public Boolean isEmailIsVerify() {
    return emailIsVerify;
  }

  public void setEmailIsVerify(Boolean emailIsVerify) {
    this.emailIsVerify = emailIsVerify;
  }

  public UserForGetUserOutput id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserForGetUserOutput mobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
    return this;
  }

   /**
   * Get mobilePhone
   * @return mobilePhone
  **/
  @Schema(description = "")
  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public UserForGetUserOutput mobilePhoneIsVerify(Boolean mobilePhoneIsVerify) {
    this.mobilePhoneIsVerify = mobilePhoneIsVerify;
    return this;
  }

   /**
   * Get mobilePhoneIsVerify
   * @return mobilePhoneIsVerify
  **/
  @Schema(description = "")
  public Boolean isMobilePhoneIsVerify() {
    return mobilePhoneIsVerify;
  }

  public void setMobilePhoneIsVerify(Boolean mobilePhoneIsVerify) {
    this.mobilePhoneIsVerify = mobilePhoneIsVerify;
  }

  public UserForGetUserOutput trn(String trn) {
    this.trn = trn;
    return this;
  }

   /**
   * Get trn
   * @return trn
  **/
  @Schema(description = "")
  public String getTrn() {
    return trn;
  }

  public void setTrn(String trn) {
    this.trn = trn;
  }

  public UserForGetUserOutput updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @Schema(description = "")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }

  public UserForGetUserOutput userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserForGetUserOutput userForGetUserOutput = (UserForGetUserOutput) o;
    return Objects.equals(this.accountId, userForGetUserOutput.accountId) &&
        Objects.equals(this.createDate, userForGetUserOutput.createDate) &&
        Objects.equals(this.description, userForGetUserOutput.description) &&
        Objects.equals(this.displayName, userForGetUserOutput.displayName) &&
        Objects.equals(this.email, userForGetUserOutput.email) &&
        Objects.equals(this.emailIsVerify, userForGetUserOutput.emailIsVerify) &&
        Objects.equals(this.id, userForGetUserOutput.id) &&
        Objects.equals(this.mobilePhone, userForGetUserOutput.mobilePhone) &&
        Objects.equals(this.mobilePhoneIsVerify, userForGetUserOutput.mobilePhoneIsVerify) &&
        Objects.equals(this.trn, userForGetUserOutput.trn) &&
        Objects.equals(this.updateDate, userForGetUserOutput.updateDate) &&
        Objects.equals(this.userName, userForGetUserOutput.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, createDate, description, displayName, email, emailIsVerify, id, mobilePhone, mobilePhoneIsVerify, trn, updateDate, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserForGetUserOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailIsVerify: ").append(toIndentedString(emailIsVerify)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    mobilePhoneIsVerify: ").append(toIndentedString(mobilePhoneIsVerify)).append("\n");
    sb.append("    trn: ").append(toIndentedString(trn)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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