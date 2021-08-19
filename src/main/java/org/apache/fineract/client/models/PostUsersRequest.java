/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 * Apache Fineract
 * Apache Fineract is a secure, multi-tenanted microfinance platform  The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform<br>The [reference app](https://cui.fineract.dev) (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation  - The API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) - Find out more about Apache Fineract [here](/fineract-provider/api-docs/apiLive.htm#top) - You can [Try The API From Your Browser](/fineract-provider/api-docs/apiLive.htm#interact) - The Generic Options are available [here](/fineract-provider/api-docs/apiLive.htm#genopts) - Find out more about [Updating Dates and Numbers](/fineract-provider/api-docs/apiLive.htm#dates_and_numbers) - For the Authentication and the Basic of HTTP and HTTPS refer [here](/fineract-provider/api-docs/apiLive.htm#authentication_overview) - Check about ERROR codes [here](/fineract-provider/api-docs/apiLive.htm#errors)  Please refer to the [old documentation](/fineract-provider/api-docs/apiLive.htm) for any documentation queries
 *
 * The version of the OpenAPI document: 1.5.0-39-gc7b9611-dirty
 * Contact: dev@fineract.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.apache.fineract.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PostUsersRequest
 */
@ApiModel(description = "PostUsersRequest")

public class PostUsersRequest {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Long officeId;

  public static final String SERIALIZED_NAME_STAFF_ID = "staffId";
  @SerializedName(SERIALIZED_NAME_STAFF_ID)
  private Long staffId;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private String roles;

  public static final String SERIALIZED_NAME_SEND_PASSWORD_TO_EMAIL = "sendPasswordToEmail";
  @SerializedName(SERIALIZED_NAME_SEND_PASSWORD_TO_EMAIL)
  private Boolean sendPasswordToEmail;

  public static final String SERIALIZED_NAME_IS_SELF_SERVICE_USER = "isSelfServiceUser";
  @SerializedName(SERIALIZED_NAME_IS_SELF_SERVICE_USER)
  private Boolean isSelfServiceUser;


  public PostUsersRequest username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "newuser", value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public PostUsersRequest firstname(String firstname) {
    
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Test", value = "")

  public String getFirstname() {
    return firstname;
  }


  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public PostUsersRequest lastname(String lastname) {
    
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "User", value = "")

  public String getLastname() {
    return lastname;
  }


  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public PostUsersRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "whatever@mifos.org", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public PostUsersRequest officeId(Long officeId) {
    
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getOfficeId() {
    return officeId;
  }


  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }


  public PostUsersRequest staffId(Long staffId) {
    
    this.staffId = staffId;
    return this;
  }

   /**
   * Get staffId
   * @return staffId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getStaffId() {
    return staffId;
  }


  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }


  public PostUsersRequest roles(String roles) {
    
    this.roles = roles;
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[2,3]", value = "")

  public String getRoles() {
    return roles;
  }


  public void setRoles(String roles) {
    this.roles = roles;
  }


  public PostUsersRequest sendPasswordToEmail(Boolean sendPasswordToEmail) {
    
    this.sendPasswordToEmail = sendPasswordToEmail;
    return this;
  }

   /**
   * Get sendPasswordToEmail
   * @return sendPasswordToEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getSendPasswordToEmail() {
    return sendPasswordToEmail;
  }


  public void setSendPasswordToEmail(Boolean sendPasswordToEmail) {
    this.sendPasswordToEmail = sendPasswordToEmail;
  }


  public PostUsersRequest isSelfServiceUser(Boolean isSelfServiceUser) {
    
    this.isSelfServiceUser = isSelfServiceUser;
    return this;
  }

   /**
   * Get isSelfServiceUser
   * @return isSelfServiceUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsSelfServiceUser() {
    return isSelfServiceUser;
  }


  public void setIsSelfServiceUser(Boolean isSelfServiceUser) {
    this.isSelfServiceUser = isSelfServiceUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUsersRequest postUsersRequest = (PostUsersRequest) o;
    return Objects.equals(this.username, postUsersRequest.username) &&
        Objects.equals(this.firstname, postUsersRequest.firstname) &&
        Objects.equals(this.lastname, postUsersRequest.lastname) &&
        Objects.equals(this.email, postUsersRequest.email) &&
        Objects.equals(this.officeId, postUsersRequest.officeId) &&
        Objects.equals(this.staffId, postUsersRequest.staffId) &&
        Objects.equals(this.roles, postUsersRequest.roles) &&
        Objects.equals(this.sendPasswordToEmail, postUsersRequest.sendPasswordToEmail) &&
        Objects.equals(this.isSelfServiceUser, postUsersRequest.isSelfServiceUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, firstname, lastname, email, officeId, staffId, roles, sendPasswordToEmail, isSelfServiceUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUsersRequest {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    sendPasswordToEmail: ").append(toIndentedString(sendPasswordToEmail)).append("\n");
    sb.append("    isSelfServiceUser: ").append(toIndentedString(isSelfServiceUser)).append("\n");
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

