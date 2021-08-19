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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.fineract.client.models.AppUserClientMapping;
import org.apache.fineract.client.models.GrantedAuthority;
import org.apache.fineract.client.models.Office;
import org.apache.fineract.client.models.Role;
import org.apache.fineract.client.models.Staff;

/**
 * AppUser
 */

public class AppUser {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_ACCOUNT_NON_EXPIRED = "accountNonExpired";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NON_EXPIRED)
  private Boolean accountNonExpired;

  public static final String SERIALIZED_NAME_ACCOUNT_NON_LOCKED = "accountNonLocked";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NON_LOCKED)
  private Boolean accountNonLocked;

  public static final String SERIALIZED_NAME_CREDENTIALS_NON_EXPIRED = "credentialsNonExpired";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS_NON_EXPIRED)
  private Boolean credentialsNonExpired;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_OFFICE = "office";
  @SerializedName(SERIALIZED_NAME_OFFICE)
  private Office office;

  public static final String SERIALIZED_NAME_STAFF = "staff";
  @SerializedName(SERIALIZED_NAME_STAFF)
  private Staff staff;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<Role> roles = null;

  public static final String SERIALIZED_NAME_LAST_TIME_PASSWORD_UPDATED = "lastTimePasswordUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_TIME_PASSWORD_UPDATED)
  private Date lastTimePasswordUpdated;

  public static final String SERIALIZED_NAME_PASSWORD_NEVER_EXPIRES = "passwordNeverExpires";
  @SerializedName(SERIALIZED_NAME_PASSWORD_NEVER_EXPIRES)
  private Boolean passwordNeverExpires;

  public static final String SERIALIZED_NAME_APP_USER_CLIENT_MAPPINGS = "appUserClientMappings";
  @SerializedName(SERIALIZED_NAME_APP_USER_CLIENT_MAPPINGS)
  private List<AppUserClientMapping> appUserClientMappings = null;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_STAFF_ID = "staffId";
  @SerializedName(SERIALIZED_NAME_STAFF_ID)
  private Long staffId;

  public static final String SERIALIZED_NAME_STAFF_DISPLAY_NAME = "staffDisplayName";
  @SerializedName(SERIALIZED_NAME_STAFF_DISPLAY_NAME)
  private String staffDisplayName;

  public static final String SERIALIZED_NAME_NOT_ENABLED = "notEnabled";
  @SerializedName(SERIALIZED_NAME_NOT_ENABLED)
  private Boolean notEnabled;

  public static final String SERIALIZED_NAME_SELF_SERVICE_USER = "selfServiceUser";
  @SerializedName(SERIALIZED_NAME_SELF_SERVICE_USER)
  private Boolean selfServiceUser;

  public static final String SERIALIZED_NAME_SYSTEM_USER = "systemUser";
  @SerializedName(SERIALIZED_NAME_SYSTEM_USER)
  private Boolean systemUser;

  public static final String SERIALIZED_NAME_AUTHORITIES = "authorities";
  @SerializedName(SERIALIZED_NAME_AUTHORITIES)
  private List<GrantedAuthority> authorities = null;

  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private Boolean _new;


  public AppUser id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public AppUser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public AppUser username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public AppUser firstname(String firstname) {
    
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstname() {
    return firstname;
  }


  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public AppUser lastname(String lastname) {
    
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastname() {
    return lastname;
  }


  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public AppUser password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public AppUser accountNonExpired(Boolean accountNonExpired) {
    
    this.accountNonExpired = accountNonExpired;
    return this;
  }

   /**
   * Get accountNonExpired
   * @return accountNonExpired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAccountNonExpired() {
    return accountNonExpired;
  }


  public void setAccountNonExpired(Boolean accountNonExpired) {
    this.accountNonExpired = accountNonExpired;
  }


  public AppUser accountNonLocked(Boolean accountNonLocked) {
    
    this.accountNonLocked = accountNonLocked;
    return this;
  }

   /**
   * Get accountNonLocked
   * @return accountNonLocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAccountNonLocked() {
    return accountNonLocked;
  }


  public void setAccountNonLocked(Boolean accountNonLocked) {
    this.accountNonLocked = accountNonLocked;
  }


  public AppUser credentialsNonExpired(Boolean credentialsNonExpired) {
    
    this.credentialsNonExpired = credentialsNonExpired;
    return this;
  }

   /**
   * Get credentialsNonExpired
   * @return credentialsNonExpired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCredentialsNonExpired() {
    return credentialsNonExpired;
  }


  public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
    this.credentialsNonExpired = credentialsNonExpired;
  }


  public AppUser enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public AppUser deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public AppUser office(Office office) {
    
    this.office = office;
    return this;
  }

   /**
   * Get office
   * @return office
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Office getOffice() {
    return office;
  }


  public void setOffice(Office office) {
    this.office = office;
  }


  public AppUser staff(Staff staff) {
    
    this.staff = staff;
    return this;
  }

   /**
   * Get staff
   * @return staff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Staff getStaff() {
    return staff;
  }


  public void setStaff(Staff staff) {
    this.staff = staff;
  }


  public AppUser roles(List<Role> roles) {
    
    this.roles = roles;
    return this;
  }

  public AppUser addRolesItem(Role rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<Role>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Role> getRoles() {
    return roles;
  }


  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }


  public AppUser lastTimePasswordUpdated(Date lastTimePasswordUpdated) {
    
    this.lastTimePasswordUpdated = lastTimePasswordUpdated;
    return this;
  }

   /**
   * Get lastTimePasswordUpdated
   * @return lastTimePasswordUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getLastTimePasswordUpdated() {
    return lastTimePasswordUpdated;
  }


  public void setLastTimePasswordUpdated(Date lastTimePasswordUpdated) {
    this.lastTimePasswordUpdated = lastTimePasswordUpdated;
  }


  public AppUser passwordNeverExpires(Boolean passwordNeverExpires) {
    
    this.passwordNeverExpires = passwordNeverExpires;
    return this;
  }

   /**
   * Get passwordNeverExpires
   * @return passwordNeverExpires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPasswordNeverExpires() {
    return passwordNeverExpires;
  }


  public void setPasswordNeverExpires(Boolean passwordNeverExpires) {
    this.passwordNeverExpires = passwordNeverExpires;
  }


  public AppUser appUserClientMappings(List<AppUserClientMapping> appUserClientMappings) {
    
    this.appUserClientMappings = appUserClientMappings;
    return this;
  }

  public AppUser addAppUserClientMappingsItem(AppUserClientMapping appUserClientMappingsItem) {
    if (this.appUserClientMappings == null) {
      this.appUserClientMappings = new ArrayList<AppUserClientMapping>();
    }
    this.appUserClientMappings.add(appUserClientMappingsItem);
    return this;
  }

   /**
   * Get appUserClientMappings
   * @return appUserClientMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AppUserClientMapping> getAppUserClientMappings() {
    return appUserClientMappings;
  }


  public void setAppUserClientMappings(List<AppUserClientMapping> appUserClientMappings) {
    this.appUserClientMappings = appUserClientMappings;
  }


  public AppUser displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public AppUser staffId(Long staffId) {
    
    this.staffId = staffId;
    return this;
  }

   /**
   * Get staffId
   * @return staffId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getStaffId() {
    return staffId;
  }


  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }


  public AppUser staffDisplayName(String staffDisplayName) {
    
    this.staffDisplayName = staffDisplayName;
    return this;
  }

   /**
   * Get staffDisplayName
   * @return staffDisplayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStaffDisplayName() {
    return staffDisplayName;
  }


  public void setStaffDisplayName(String staffDisplayName) {
    this.staffDisplayName = staffDisplayName;
  }


  public AppUser notEnabled(Boolean notEnabled) {
    
    this.notEnabled = notEnabled;
    return this;
  }

   /**
   * Get notEnabled
   * @return notEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNotEnabled() {
    return notEnabled;
  }


  public void setNotEnabled(Boolean notEnabled) {
    this.notEnabled = notEnabled;
  }


  public AppUser selfServiceUser(Boolean selfServiceUser) {
    
    this.selfServiceUser = selfServiceUser;
    return this;
  }

   /**
   * Get selfServiceUser
   * @return selfServiceUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSelfServiceUser() {
    return selfServiceUser;
  }


  public void setSelfServiceUser(Boolean selfServiceUser) {
    this.selfServiceUser = selfServiceUser;
  }


  public AppUser systemUser(Boolean systemUser) {
    
    this.systemUser = systemUser;
    return this;
  }

   /**
   * Get systemUser
   * @return systemUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSystemUser() {
    return systemUser;
  }


  public void setSystemUser(Boolean systemUser) {
    this.systemUser = systemUser;
  }


  public AppUser authorities(List<GrantedAuthority> authorities) {
    
    this.authorities = authorities;
    return this;
  }

  public AppUser addAuthoritiesItem(GrantedAuthority authoritiesItem) {
    if (this.authorities == null) {
      this.authorities = new ArrayList<GrantedAuthority>();
    }
    this.authorities.add(authoritiesItem);
    return this;
  }

   /**
   * Get authorities
   * @return authorities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GrantedAuthority> getAuthorities() {
    return authorities;
  }


  public void setAuthorities(List<GrantedAuthority> authorities) {
    this.authorities = authorities;
  }


  public AppUser _new(Boolean _new) {
    
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNew() {
    return _new;
  }


  public void setNew(Boolean _new) {
    this._new = _new;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppUser appUser = (AppUser) o;
    return Objects.equals(this.id, appUser.id) &&
        Objects.equals(this.email, appUser.email) &&
        Objects.equals(this.username, appUser.username) &&
        Objects.equals(this.firstname, appUser.firstname) &&
        Objects.equals(this.lastname, appUser.lastname) &&
        Objects.equals(this.password, appUser.password) &&
        Objects.equals(this.accountNonExpired, appUser.accountNonExpired) &&
        Objects.equals(this.accountNonLocked, appUser.accountNonLocked) &&
        Objects.equals(this.credentialsNonExpired, appUser.credentialsNonExpired) &&
        Objects.equals(this.enabled, appUser.enabled) &&
        Objects.equals(this.deleted, appUser.deleted) &&
        Objects.equals(this.office, appUser.office) &&
        Objects.equals(this.staff, appUser.staff) &&
        Objects.equals(this.roles, appUser.roles) &&
        Objects.equals(this.lastTimePasswordUpdated, appUser.lastTimePasswordUpdated) &&
        Objects.equals(this.passwordNeverExpires, appUser.passwordNeverExpires) &&
        Objects.equals(this.appUserClientMappings, appUser.appUserClientMappings) &&
        Objects.equals(this.displayName, appUser.displayName) &&
        Objects.equals(this.staffId, appUser.staffId) &&
        Objects.equals(this.staffDisplayName, appUser.staffDisplayName) &&
        Objects.equals(this.notEnabled, appUser.notEnabled) &&
        Objects.equals(this.selfServiceUser, appUser.selfServiceUser) &&
        Objects.equals(this.systemUser, appUser.systemUser) &&
        Objects.equals(this.authorities, appUser.authorities) &&
        Objects.equals(this._new, appUser._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, username, firstname, lastname, password, accountNonExpired, accountNonLocked, credentialsNonExpired, enabled, deleted, office, staff, roles, lastTimePasswordUpdated, passwordNeverExpires, appUserClientMappings, displayName, staffId, staffDisplayName, notEnabled, selfServiceUser, systemUser, authorities, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    accountNonExpired: ").append(toIndentedString(accountNonExpired)).append("\n");
    sb.append("    accountNonLocked: ").append(toIndentedString(accountNonLocked)).append("\n");
    sb.append("    credentialsNonExpired: ").append(toIndentedString(credentialsNonExpired)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    staff: ").append(toIndentedString(staff)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    lastTimePasswordUpdated: ").append(toIndentedString(lastTimePasswordUpdated)).append("\n");
    sb.append("    passwordNeverExpires: ").append(toIndentedString(passwordNeverExpires)).append("\n");
    sb.append("    appUserClientMappings: ").append(toIndentedString(appUserClientMappings)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffDisplayName: ").append(toIndentedString(staffDisplayName)).append("\n");
    sb.append("    notEnabled: ").append(toIndentedString(notEnabled)).append("\n");
    sb.append("    selfServiceUser: ").append(toIndentedString(selfServiceUser)).append("\n");
    sb.append("    systemUser: ").append(toIndentedString(systemUser)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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

