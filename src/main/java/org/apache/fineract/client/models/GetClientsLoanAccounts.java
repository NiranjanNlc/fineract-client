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
 * The version of the OpenAPI document: 1.5.0-11-gd287218-dirty
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
import org.apache.fineract.client.models.GetClientsLoanAccountsStatus;
import org.apache.fineract.client.models.GetClientsLoanAccountsType;

/**
 * GetClientsLoanAccounts
 */

public class GetClientsLoanAccounts {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ACCOUNT_NO = "accountNo";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private String accountNo;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private Integer externalId;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GetClientsLoanAccountsStatus status;

  public static final String SERIALIZED_NAME_LOAN_TYPE = "loanType";
  @SerializedName(SERIALIZED_NAME_LOAN_TYPE)
  private GetClientsLoanAccountsType loanType;

  public static final String SERIALIZED_NAME_LOAN_CYCLE = "loanCycle";
  @SerializedName(SERIALIZED_NAME_LOAN_CYCLE)
  private Integer loanCycle;


  public GetClientsLoanAccounts id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetClientsLoanAccounts accountNo(String accountNo) {
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "000000001", value = "")

  public String getAccountNo() {
    return accountNo;
  }


  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }


  public GetClientsLoanAccounts externalId(Integer externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "456", value = "")

  public Integer getExternalId() {
    return externalId;
  }


  public void setExternalId(Integer externalId) {
    this.externalId = externalId;
  }


  public GetClientsLoanAccounts productId(Integer productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getProductId() {
    return productId;
  }


  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public GetClientsLoanAccounts productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TestOne", value = "")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public GetClientsLoanAccounts status(GetClientsLoanAccountsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetClientsLoanAccountsStatus getStatus() {
    return status;
  }


  public void setStatus(GetClientsLoanAccountsStatus status) {
    this.status = status;
  }


  public GetClientsLoanAccounts loanType(GetClientsLoanAccountsType loanType) {
    
    this.loanType = loanType;
    return this;
  }

   /**
   * Get loanType
   * @return loanType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetClientsLoanAccountsType getLoanType() {
    return loanType;
  }


  public void setLoanType(GetClientsLoanAccountsType loanType) {
    this.loanType = loanType;
  }


  public GetClientsLoanAccounts loanCycle(Integer loanCycle) {
    
    this.loanCycle = loanCycle;
    return this;
  }

   /**
   * Get loanCycle
   * @return loanCycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getLoanCycle() {
    return loanCycle;
  }


  public void setLoanCycle(Integer loanCycle) {
    this.loanCycle = loanCycle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientsLoanAccounts getClientsLoanAccounts = (GetClientsLoanAccounts) o;
    return Objects.equals(this.id, getClientsLoanAccounts.id) &&
        Objects.equals(this.accountNo, getClientsLoanAccounts.accountNo) &&
        Objects.equals(this.externalId, getClientsLoanAccounts.externalId) &&
        Objects.equals(this.productId, getClientsLoanAccounts.productId) &&
        Objects.equals(this.productName, getClientsLoanAccounts.productName) &&
        Objects.equals(this.status, getClientsLoanAccounts.status) &&
        Objects.equals(this.loanType, getClientsLoanAccounts.loanType) &&
        Objects.equals(this.loanCycle, getClientsLoanAccounts.loanCycle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, externalId, productId, productName, status, loanType, loanCycle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientsLoanAccounts {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    loanType: ").append(toIndentedString(loanType)).append("\n");
    sb.append("    loanCycle: ").append(toIndentedString(loanCycle)).append("\n");
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

