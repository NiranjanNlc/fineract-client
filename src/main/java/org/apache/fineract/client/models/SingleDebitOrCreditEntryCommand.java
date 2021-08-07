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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * SingleDebitOrCreditEntryCommand
 */

public class SingleDebitOrCreditEntryCommand {
  public static final String SERIALIZED_NAME_GL_ACCOUNT_ID = "glAccountId";
  @SerializedName(SERIALIZED_NAME_GL_ACCOUNT_ID)
  private Long glAccountId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_PARAMETERS_PASSED_IN_REQUEST = "parametersPassedInRequest";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_PASSED_IN_REQUEST)
  private List<String> parametersPassedInRequest = null;

  public static final String SERIALIZED_NAME_GL_ACCOUNT_ID_CHANGED = "glAccountIdChanged";
  @SerializedName(SERIALIZED_NAME_GL_ACCOUNT_ID_CHANGED)
  private Boolean glAccountIdChanged;

  public static final String SERIALIZED_NAME_GL_AMOUNT_CHANGED = "glAmountChanged";
  @SerializedName(SERIALIZED_NAME_GL_AMOUNT_CHANGED)
  private Boolean glAmountChanged;

  public static final String SERIALIZED_NAME_COMMENTS_CHANGED = "commentsChanged";
  @SerializedName(SERIALIZED_NAME_COMMENTS_CHANGED)
  private Boolean commentsChanged;


  public SingleDebitOrCreditEntryCommand glAccountId(Long glAccountId) {
    
    this.glAccountId = glAccountId;
    return this;
  }

   /**
   * Get glAccountId
   * @return glAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGlAccountId() {
    return glAccountId;
  }


  public void setGlAccountId(Long glAccountId) {
    this.glAccountId = glAccountId;
  }


  public SingleDebitOrCreditEntryCommand amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public SingleDebitOrCreditEntryCommand comments(String comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComments() {
    return comments;
  }


  public void setComments(String comments) {
    this.comments = comments;
  }


  public SingleDebitOrCreditEntryCommand parametersPassedInRequest(List<String> parametersPassedInRequest) {
    
    this.parametersPassedInRequest = parametersPassedInRequest;
    return this;
  }

  public SingleDebitOrCreditEntryCommand addParametersPassedInRequestItem(String parametersPassedInRequestItem) {
    if (this.parametersPassedInRequest == null) {
      this.parametersPassedInRequest = new ArrayList<String>();
    }
    this.parametersPassedInRequest.add(parametersPassedInRequestItem);
    return this;
  }

   /**
   * Get parametersPassedInRequest
   * @return parametersPassedInRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getParametersPassedInRequest() {
    return parametersPassedInRequest;
  }


  public void setParametersPassedInRequest(List<String> parametersPassedInRequest) {
    this.parametersPassedInRequest = parametersPassedInRequest;
  }


  public SingleDebitOrCreditEntryCommand glAccountIdChanged(Boolean glAccountIdChanged) {
    
    this.glAccountIdChanged = glAccountIdChanged;
    return this;
  }

   /**
   * Get glAccountIdChanged
   * @return glAccountIdChanged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGlAccountIdChanged() {
    return glAccountIdChanged;
  }


  public void setGlAccountIdChanged(Boolean glAccountIdChanged) {
    this.glAccountIdChanged = glAccountIdChanged;
  }


  public SingleDebitOrCreditEntryCommand glAmountChanged(Boolean glAmountChanged) {
    
    this.glAmountChanged = glAmountChanged;
    return this;
  }

   /**
   * Get glAmountChanged
   * @return glAmountChanged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGlAmountChanged() {
    return glAmountChanged;
  }


  public void setGlAmountChanged(Boolean glAmountChanged) {
    this.glAmountChanged = glAmountChanged;
  }


  public SingleDebitOrCreditEntryCommand commentsChanged(Boolean commentsChanged) {
    
    this.commentsChanged = commentsChanged;
    return this;
  }

   /**
   * Get commentsChanged
   * @return commentsChanged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCommentsChanged() {
    return commentsChanged;
  }


  public void setCommentsChanged(Boolean commentsChanged) {
    this.commentsChanged = commentsChanged;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleDebitOrCreditEntryCommand singleDebitOrCreditEntryCommand = (SingleDebitOrCreditEntryCommand) o;
    return Objects.equals(this.glAccountId, singleDebitOrCreditEntryCommand.glAccountId) &&
        Objects.equals(this.amount, singleDebitOrCreditEntryCommand.amount) &&
        Objects.equals(this.comments, singleDebitOrCreditEntryCommand.comments) &&
        Objects.equals(this.parametersPassedInRequest, singleDebitOrCreditEntryCommand.parametersPassedInRequest) &&
        Objects.equals(this.glAccountIdChanged, singleDebitOrCreditEntryCommand.glAccountIdChanged) &&
        Objects.equals(this.glAmountChanged, singleDebitOrCreditEntryCommand.glAmountChanged) &&
        Objects.equals(this.commentsChanged, singleDebitOrCreditEntryCommand.commentsChanged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(glAccountId, amount, comments, parametersPassedInRequest, glAccountIdChanged, glAmountChanged, commentsChanged);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleDebitOrCreditEntryCommand {\n");
    sb.append("    glAccountId: ").append(toIndentedString(glAccountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    parametersPassedInRequest: ").append(toIndentedString(parametersPassedInRequest)).append("\n");
    sb.append("    glAccountIdChanged: ").append(toIndentedString(glAccountIdChanged)).append("\n");
    sb.append("    glAmountChanged: ").append(toIndentedString(glAmountChanged)).append("\n");
    sb.append("    commentsChanged: ").append(toIndentedString(commentsChanged)).append("\n");
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

