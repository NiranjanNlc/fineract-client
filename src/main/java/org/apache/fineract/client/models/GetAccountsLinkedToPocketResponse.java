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
import java.util.List;
import org.apache.fineract.client.models.GetPocketLoanAccounts;
import org.apache.fineract.client.models.GetPocketSavingAccounts;

/**
 * GetAccountsLinkedToPocketResponse
 */
@ApiModel(description = "GetAccountsLinkedToPocketResponse")

public class GetAccountsLinkedToPocketResponse {
  public static final String SERIALIZED_NAME_LOAN_ACCOUNTS = "loanAccounts";
  @SerializedName(SERIALIZED_NAME_LOAN_ACCOUNTS)
  private List<GetPocketLoanAccounts> loanAccounts = null;

  public static final String SERIALIZED_NAME_SAVING_ACCOUNTS = "savingAccounts";
  @SerializedName(SERIALIZED_NAME_SAVING_ACCOUNTS)
  private List<GetPocketSavingAccounts> savingAccounts = null;

  public static final String SERIALIZED_NAME_SHARE_ACCOUNTS = "shareAccounts";
  @SerializedName(SERIALIZED_NAME_SHARE_ACCOUNTS)
  private List<Object> shareAccounts = null;


  public GetAccountsLinkedToPocketResponse loanAccounts(List<GetPocketLoanAccounts> loanAccounts) {
    
    this.loanAccounts = loanAccounts;
    return this;
  }

  public GetAccountsLinkedToPocketResponse addLoanAccountsItem(GetPocketLoanAccounts loanAccountsItem) {
    if (this.loanAccounts == null) {
      this.loanAccounts = new ArrayList<GetPocketLoanAccounts>();
    }
    this.loanAccounts.add(loanAccountsItem);
    return this;
  }

   /**
   * Get loanAccounts
   * @return loanAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetPocketLoanAccounts> getLoanAccounts() {
    return loanAccounts;
  }


  public void setLoanAccounts(List<GetPocketLoanAccounts> loanAccounts) {
    this.loanAccounts = loanAccounts;
  }


  public GetAccountsLinkedToPocketResponse savingAccounts(List<GetPocketSavingAccounts> savingAccounts) {
    
    this.savingAccounts = savingAccounts;
    return this;
  }

  public GetAccountsLinkedToPocketResponse addSavingAccountsItem(GetPocketSavingAccounts savingAccountsItem) {
    if (this.savingAccounts == null) {
      this.savingAccounts = new ArrayList<GetPocketSavingAccounts>();
    }
    this.savingAccounts.add(savingAccountsItem);
    return this;
  }

   /**
   * Get savingAccounts
   * @return savingAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetPocketSavingAccounts> getSavingAccounts() {
    return savingAccounts;
  }


  public void setSavingAccounts(List<GetPocketSavingAccounts> savingAccounts) {
    this.savingAccounts = savingAccounts;
  }


  public GetAccountsLinkedToPocketResponse shareAccounts(List<Object> shareAccounts) {
    
    this.shareAccounts = shareAccounts;
    return this;
  }

  public GetAccountsLinkedToPocketResponse addShareAccountsItem(Object shareAccountsItem) {
    if (this.shareAccounts == null) {
      this.shareAccounts = new ArrayList<Object>();
    }
    this.shareAccounts.add(shareAccountsItem);
    return this;
  }

   /**
   * Get shareAccounts
   * @return shareAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getShareAccounts() {
    return shareAccounts;
  }


  public void setShareAccounts(List<Object> shareAccounts) {
    this.shareAccounts = shareAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountsLinkedToPocketResponse getAccountsLinkedToPocketResponse = (GetAccountsLinkedToPocketResponse) o;
    return Objects.equals(this.loanAccounts, getAccountsLinkedToPocketResponse.loanAccounts) &&
        Objects.equals(this.savingAccounts, getAccountsLinkedToPocketResponse.savingAccounts) &&
        Objects.equals(this.shareAccounts, getAccountsLinkedToPocketResponse.shareAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanAccounts, savingAccounts, shareAccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountsLinkedToPocketResponse {\n");
    sb.append("    loanAccounts: ").append(toIndentedString(loanAccounts)).append("\n");
    sb.append("    savingAccounts: ").append(toIndentedString(savingAccounts)).append("\n");
    sb.append("    shareAccounts: ").append(toIndentedString(shareAccounts)).append("\n");
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

