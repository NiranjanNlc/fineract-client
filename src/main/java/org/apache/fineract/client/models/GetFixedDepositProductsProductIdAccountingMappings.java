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
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdIncomeFromFeeAccount;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdIncomeFromPenaltyAccount;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdInterestOnSavingsAccount;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdSavingsControlAccount;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdSavingsReferenceAccount;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdTransfersInSuspenseAccount;

/**
 * GetFixedDepositProductsProductIdAccountingMappings
 */

public class GetFixedDepositProductsProductIdAccountingMappings {
  public static final String SERIALIZED_NAME_SAVINGS_REFERENCE_ACCOUNT = "savingsReferenceAccount";
  @SerializedName(SERIALIZED_NAME_SAVINGS_REFERENCE_ACCOUNT)
  private GetFixedDepositProductsProductIdSavingsReferenceAccount savingsReferenceAccount;

  public static final String SERIALIZED_NAME_INCOME_FROM_FEE_ACCOUNT = "incomeFromFeeAccount";
  @SerializedName(SERIALIZED_NAME_INCOME_FROM_FEE_ACCOUNT)
  private GetFixedDepositProductsProductIdIncomeFromFeeAccount incomeFromFeeAccount;

  public static final String SERIALIZED_NAME_INCOME_FROM_PENALTY_ACCOUNT = "incomeFromPenaltyAccount";
  @SerializedName(SERIALIZED_NAME_INCOME_FROM_PENALTY_ACCOUNT)
  private GetFixedDepositProductsProductIdIncomeFromPenaltyAccount incomeFromPenaltyAccount;

  public static final String SERIALIZED_NAME_INTEREST_ON_SAVINGS_ACCOUNT = "interestOnSavingsAccount";
  @SerializedName(SERIALIZED_NAME_INTEREST_ON_SAVINGS_ACCOUNT)
  private GetFixedDepositProductsProductIdInterestOnSavingsAccount interestOnSavingsAccount;

  public static final String SERIALIZED_NAME_SAVINGS_CONTROL_ACCOUNT = "savingsControlAccount";
  @SerializedName(SERIALIZED_NAME_SAVINGS_CONTROL_ACCOUNT)
  private GetFixedDepositProductsProductIdSavingsControlAccount savingsControlAccount;

  public static final String SERIALIZED_NAME_TRANSFERS_IN_SUSPENSE_ACCOUNT = "transfersInSuspenseAccount";
  @SerializedName(SERIALIZED_NAME_TRANSFERS_IN_SUSPENSE_ACCOUNT)
  private GetFixedDepositProductsProductIdTransfersInSuspenseAccount transfersInSuspenseAccount;


  public GetFixedDepositProductsProductIdAccountingMappings savingsReferenceAccount(GetFixedDepositProductsProductIdSavingsReferenceAccount savingsReferenceAccount) {
    
    this.savingsReferenceAccount = savingsReferenceAccount;
    return this;
  }

   /**
   * Get savingsReferenceAccount
   * @return savingsReferenceAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdSavingsReferenceAccount getSavingsReferenceAccount() {
    return savingsReferenceAccount;
  }


  public void setSavingsReferenceAccount(GetFixedDepositProductsProductIdSavingsReferenceAccount savingsReferenceAccount) {
    this.savingsReferenceAccount = savingsReferenceAccount;
  }


  public GetFixedDepositProductsProductIdAccountingMappings incomeFromFeeAccount(GetFixedDepositProductsProductIdIncomeFromFeeAccount incomeFromFeeAccount) {
    
    this.incomeFromFeeAccount = incomeFromFeeAccount;
    return this;
  }

   /**
   * Get incomeFromFeeAccount
   * @return incomeFromFeeAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdIncomeFromFeeAccount getIncomeFromFeeAccount() {
    return incomeFromFeeAccount;
  }


  public void setIncomeFromFeeAccount(GetFixedDepositProductsProductIdIncomeFromFeeAccount incomeFromFeeAccount) {
    this.incomeFromFeeAccount = incomeFromFeeAccount;
  }


  public GetFixedDepositProductsProductIdAccountingMappings incomeFromPenaltyAccount(GetFixedDepositProductsProductIdIncomeFromPenaltyAccount incomeFromPenaltyAccount) {
    
    this.incomeFromPenaltyAccount = incomeFromPenaltyAccount;
    return this;
  }

   /**
   * Get incomeFromPenaltyAccount
   * @return incomeFromPenaltyAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdIncomeFromPenaltyAccount getIncomeFromPenaltyAccount() {
    return incomeFromPenaltyAccount;
  }


  public void setIncomeFromPenaltyAccount(GetFixedDepositProductsProductIdIncomeFromPenaltyAccount incomeFromPenaltyAccount) {
    this.incomeFromPenaltyAccount = incomeFromPenaltyAccount;
  }


  public GetFixedDepositProductsProductIdAccountingMappings interestOnSavingsAccount(GetFixedDepositProductsProductIdInterestOnSavingsAccount interestOnSavingsAccount) {
    
    this.interestOnSavingsAccount = interestOnSavingsAccount;
    return this;
  }

   /**
   * Get interestOnSavingsAccount
   * @return interestOnSavingsAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdInterestOnSavingsAccount getInterestOnSavingsAccount() {
    return interestOnSavingsAccount;
  }


  public void setInterestOnSavingsAccount(GetFixedDepositProductsProductIdInterestOnSavingsAccount interestOnSavingsAccount) {
    this.interestOnSavingsAccount = interestOnSavingsAccount;
  }


  public GetFixedDepositProductsProductIdAccountingMappings savingsControlAccount(GetFixedDepositProductsProductIdSavingsControlAccount savingsControlAccount) {
    
    this.savingsControlAccount = savingsControlAccount;
    return this;
  }

   /**
   * Get savingsControlAccount
   * @return savingsControlAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdSavingsControlAccount getSavingsControlAccount() {
    return savingsControlAccount;
  }


  public void setSavingsControlAccount(GetFixedDepositProductsProductIdSavingsControlAccount savingsControlAccount) {
    this.savingsControlAccount = savingsControlAccount;
  }


  public GetFixedDepositProductsProductIdAccountingMappings transfersInSuspenseAccount(GetFixedDepositProductsProductIdTransfersInSuspenseAccount transfersInSuspenseAccount) {
    
    this.transfersInSuspenseAccount = transfersInSuspenseAccount;
    return this;
  }

   /**
   * Get transfersInSuspenseAccount
   * @return transfersInSuspenseAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdTransfersInSuspenseAccount getTransfersInSuspenseAccount() {
    return transfersInSuspenseAccount;
  }


  public void setTransfersInSuspenseAccount(GetFixedDepositProductsProductIdTransfersInSuspenseAccount transfersInSuspenseAccount) {
    this.transfersInSuspenseAccount = transfersInSuspenseAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFixedDepositProductsProductIdAccountingMappings getFixedDepositProductsProductIdAccountingMappings = (GetFixedDepositProductsProductIdAccountingMappings) o;
    return Objects.equals(this.savingsReferenceAccount, getFixedDepositProductsProductIdAccountingMappings.savingsReferenceAccount) &&
        Objects.equals(this.incomeFromFeeAccount, getFixedDepositProductsProductIdAccountingMappings.incomeFromFeeAccount) &&
        Objects.equals(this.incomeFromPenaltyAccount, getFixedDepositProductsProductIdAccountingMappings.incomeFromPenaltyAccount) &&
        Objects.equals(this.interestOnSavingsAccount, getFixedDepositProductsProductIdAccountingMappings.interestOnSavingsAccount) &&
        Objects.equals(this.savingsControlAccount, getFixedDepositProductsProductIdAccountingMappings.savingsControlAccount) &&
        Objects.equals(this.transfersInSuspenseAccount, getFixedDepositProductsProductIdAccountingMappings.transfersInSuspenseAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savingsReferenceAccount, incomeFromFeeAccount, incomeFromPenaltyAccount, interestOnSavingsAccount, savingsControlAccount, transfersInSuspenseAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFixedDepositProductsProductIdAccountingMappings {\n");
    sb.append("    savingsReferenceAccount: ").append(toIndentedString(savingsReferenceAccount)).append("\n");
    sb.append("    incomeFromFeeAccount: ").append(toIndentedString(incomeFromFeeAccount)).append("\n");
    sb.append("    incomeFromPenaltyAccount: ").append(toIndentedString(incomeFromPenaltyAccount)).append("\n");
    sb.append("    interestOnSavingsAccount: ").append(toIndentedString(interestOnSavingsAccount)).append("\n");
    sb.append("    savingsControlAccount: ").append(toIndentedString(savingsControlAccount)).append("\n");
    sb.append("    transfersInSuspenseAccount: ").append(toIndentedString(transfersInSuspenseAccount)).append("\n");
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

