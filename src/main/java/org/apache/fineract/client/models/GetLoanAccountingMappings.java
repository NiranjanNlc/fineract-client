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
import org.apache.fineract.client.models.GetLoanFundSourceAccount;
import org.apache.fineract.client.models.GetLoanIncomeFromFeeAccount;
import org.apache.fineract.client.models.GetLoanIncomeFromPenaltyAccount;
import org.apache.fineract.client.models.GetLoanInterestOnLoanAccount;
import org.apache.fineract.client.models.GetLoanOverpaymentLiabilityAccount;
import org.apache.fineract.client.models.GetLoanPortfolioAccount;
import org.apache.fineract.client.models.GetLoanTransfersInSuspenseAccount;
import org.apache.fineract.client.models.GetLoanWriteOffAccount;

/**
 * GetLoanAccountingMappings
 */

public class GetLoanAccountingMappings {
  public static final String SERIALIZED_NAME_FUND_SOURCE_ACCOUNT = "fundSourceAccount";
  @SerializedName(SERIALIZED_NAME_FUND_SOURCE_ACCOUNT)
  private GetLoanFundSourceAccount fundSourceAccount;

  public static final String SERIALIZED_NAME_LOAN_PORTFOLIO_ACCOUNT = "loanPortfolioAccount";
  @SerializedName(SERIALIZED_NAME_LOAN_PORTFOLIO_ACCOUNT)
  private GetLoanPortfolioAccount loanPortfolioAccount;

  public static final String SERIALIZED_NAME_TRANSFERS_IN_SUSPENSE_ACCOUNT = "transfersInSuspenseAccount";
  @SerializedName(SERIALIZED_NAME_TRANSFERS_IN_SUSPENSE_ACCOUNT)
  private GetLoanTransfersInSuspenseAccount transfersInSuspenseAccount;

  public static final String SERIALIZED_NAME_INTEREST_ON_LOAN_ACCOUNT = "interestOnLoanAccount";
  @SerializedName(SERIALIZED_NAME_INTEREST_ON_LOAN_ACCOUNT)
  private GetLoanInterestOnLoanAccount interestOnLoanAccount;

  public static final String SERIALIZED_NAME_INCOME_FROM_FEE_ACCOUNT = "incomeFromFeeAccount";
  @SerializedName(SERIALIZED_NAME_INCOME_FROM_FEE_ACCOUNT)
  private GetLoanIncomeFromFeeAccount incomeFromFeeAccount;

  public static final String SERIALIZED_NAME_INCOME_FROM_PENALTY_ACCOUNT = "incomeFromPenaltyAccount";
  @SerializedName(SERIALIZED_NAME_INCOME_FROM_PENALTY_ACCOUNT)
  private GetLoanIncomeFromPenaltyAccount incomeFromPenaltyAccount;

  public static final String SERIALIZED_NAME_WRITE_OFF_ACCOUNT = "writeOffAccount";
  @SerializedName(SERIALIZED_NAME_WRITE_OFF_ACCOUNT)
  private GetLoanWriteOffAccount writeOffAccount;

  public static final String SERIALIZED_NAME_OVERPAYMENT_LIABILITY_ACCOUNT = "overpaymentLiabilityAccount";
  @SerializedName(SERIALIZED_NAME_OVERPAYMENT_LIABILITY_ACCOUNT)
  private GetLoanOverpaymentLiabilityAccount overpaymentLiabilityAccount;


  public GetLoanAccountingMappings fundSourceAccount(GetLoanFundSourceAccount fundSourceAccount) {
    
    this.fundSourceAccount = fundSourceAccount;
    return this;
  }

   /**
   * Get fundSourceAccount
   * @return fundSourceAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanFundSourceAccount getFundSourceAccount() {
    return fundSourceAccount;
  }


  public void setFundSourceAccount(GetLoanFundSourceAccount fundSourceAccount) {
    this.fundSourceAccount = fundSourceAccount;
  }


  public GetLoanAccountingMappings loanPortfolioAccount(GetLoanPortfolioAccount loanPortfolioAccount) {
    
    this.loanPortfolioAccount = loanPortfolioAccount;
    return this;
  }

   /**
   * Get loanPortfolioAccount
   * @return loanPortfolioAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanPortfolioAccount getLoanPortfolioAccount() {
    return loanPortfolioAccount;
  }


  public void setLoanPortfolioAccount(GetLoanPortfolioAccount loanPortfolioAccount) {
    this.loanPortfolioAccount = loanPortfolioAccount;
  }


  public GetLoanAccountingMappings transfersInSuspenseAccount(GetLoanTransfersInSuspenseAccount transfersInSuspenseAccount) {
    
    this.transfersInSuspenseAccount = transfersInSuspenseAccount;
    return this;
  }

   /**
   * Get transfersInSuspenseAccount
   * @return transfersInSuspenseAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanTransfersInSuspenseAccount getTransfersInSuspenseAccount() {
    return transfersInSuspenseAccount;
  }


  public void setTransfersInSuspenseAccount(GetLoanTransfersInSuspenseAccount transfersInSuspenseAccount) {
    this.transfersInSuspenseAccount = transfersInSuspenseAccount;
  }


  public GetLoanAccountingMappings interestOnLoanAccount(GetLoanInterestOnLoanAccount interestOnLoanAccount) {
    
    this.interestOnLoanAccount = interestOnLoanAccount;
    return this;
  }

   /**
   * Get interestOnLoanAccount
   * @return interestOnLoanAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanInterestOnLoanAccount getInterestOnLoanAccount() {
    return interestOnLoanAccount;
  }


  public void setInterestOnLoanAccount(GetLoanInterestOnLoanAccount interestOnLoanAccount) {
    this.interestOnLoanAccount = interestOnLoanAccount;
  }


  public GetLoanAccountingMappings incomeFromFeeAccount(GetLoanIncomeFromFeeAccount incomeFromFeeAccount) {
    
    this.incomeFromFeeAccount = incomeFromFeeAccount;
    return this;
  }

   /**
   * Get incomeFromFeeAccount
   * @return incomeFromFeeAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanIncomeFromFeeAccount getIncomeFromFeeAccount() {
    return incomeFromFeeAccount;
  }


  public void setIncomeFromFeeAccount(GetLoanIncomeFromFeeAccount incomeFromFeeAccount) {
    this.incomeFromFeeAccount = incomeFromFeeAccount;
  }


  public GetLoanAccountingMappings incomeFromPenaltyAccount(GetLoanIncomeFromPenaltyAccount incomeFromPenaltyAccount) {
    
    this.incomeFromPenaltyAccount = incomeFromPenaltyAccount;
    return this;
  }

   /**
   * Get incomeFromPenaltyAccount
   * @return incomeFromPenaltyAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanIncomeFromPenaltyAccount getIncomeFromPenaltyAccount() {
    return incomeFromPenaltyAccount;
  }


  public void setIncomeFromPenaltyAccount(GetLoanIncomeFromPenaltyAccount incomeFromPenaltyAccount) {
    this.incomeFromPenaltyAccount = incomeFromPenaltyAccount;
  }


  public GetLoanAccountingMappings writeOffAccount(GetLoanWriteOffAccount writeOffAccount) {
    
    this.writeOffAccount = writeOffAccount;
    return this;
  }

   /**
   * Get writeOffAccount
   * @return writeOffAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanWriteOffAccount getWriteOffAccount() {
    return writeOffAccount;
  }


  public void setWriteOffAccount(GetLoanWriteOffAccount writeOffAccount) {
    this.writeOffAccount = writeOffAccount;
  }


  public GetLoanAccountingMappings overpaymentLiabilityAccount(GetLoanOverpaymentLiabilityAccount overpaymentLiabilityAccount) {
    
    this.overpaymentLiabilityAccount = overpaymentLiabilityAccount;
    return this;
  }

   /**
   * Get overpaymentLiabilityAccount
   * @return overpaymentLiabilityAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanOverpaymentLiabilityAccount getOverpaymentLiabilityAccount() {
    return overpaymentLiabilityAccount;
  }


  public void setOverpaymentLiabilityAccount(GetLoanOverpaymentLiabilityAccount overpaymentLiabilityAccount) {
    this.overpaymentLiabilityAccount = overpaymentLiabilityAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoanAccountingMappings getLoanAccountingMappings = (GetLoanAccountingMappings) o;
    return Objects.equals(this.fundSourceAccount, getLoanAccountingMappings.fundSourceAccount) &&
        Objects.equals(this.loanPortfolioAccount, getLoanAccountingMappings.loanPortfolioAccount) &&
        Objects.equals(this.transfersInSuspenseAccount, getLoanAccountingMappings.transfersInSuspenseAccount) &&
        Objects.equals(this.interestOnLoanAccount, getLoanAccountingMappings.interestOnLoanAccount) &&
        Objects.equals(this.incomeFromFeeAccount, getLoanAccountingMappings.incomeFromFeeAccount) &&
        Objects.equals(this.incomeFromPenaltyAccount, getLoanAccountingMappings.incomeFromPenaltyAccount) &&
        Objects.equals(this.writeOffAccount, getLoanAccountingMappings.writeOffAccount) &&
        Objects.equals(this.overpaymentLiabilityAccount, getLoanAccountingMappings.overpaymentLiabilityAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundSourceAccount, loanPortfolioAccount, transfersInSuspenseAccount, interestOnLoanAccount, incomeFromFeeAccount, incomeFromPenaltyAccount, writeOffAccount, overpaymentLiabilityAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoanAccountingMappings {\n");
    sb.append("    fundSourceAccount: ").append(toIndentedString(fundSourceAccount)).append("\n");
    sb.append("    loanPortfolioAccount: ").append(toIndentedString(loanPortfolioAccount)).append("\n");
    sb.append("    transfersInSuspenseAccount: ").append(toIndentedString(transfersInSuspenseAccount)).append("\n");
    sb.append("    interestOnLoanAccount: ").append(toIndentedString(interestOnLoanAccount)).append("\n");
    sb.append("    incomeFromFeeAccount: ").append(toIndentedString(incomeFromFeeAccount)).append("\n");
    sb.append("    incomeFromPenaltyAccount: ").append(toIndentedString(incomeFromPenaltyAccount)).append("\n");
    sb.append("    writeOffAccount: ").append(toIndentedString(writeOffAccount)).append("\n");
    sb.append("    overpaymentLiabilityAccount: ").append(toIndentedString(overpaymentLiabilityAccount)).append("\n");
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
