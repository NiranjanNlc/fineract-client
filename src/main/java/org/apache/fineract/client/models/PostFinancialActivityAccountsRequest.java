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
 * PostFinancialActivityAccountsRequest
 */
@ApiModel(description = "PostFinancialActivityAccountsRequest")

public class PostFinancialActivityAccountsRequest {
  public static final String SERIALIZED_NAME_FINANCIAL_ACTIVITY_ID = "financialActivityId";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_ACTIVITY_ID)
  private Long financialActivityId;

  public static final String SERIALIZED_NAME_GL_ACCOUNT_ID = "glAccountId";
  @SerializedName(SERIALIZED_NAME_GL_ACCOUNT_ID)
  private Long glAccountId;


  public PostFinancialActivityAccountsRequest financialActivityId(Long financialActivityId) {
    
    this.financialActivityId = financialActivityId;
    return this;
  }

   /**
   * Get financialActivityId
   * @return financialActivityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "")

  public Long getFinancialActivityId() {
    return financialActivityId;
  }


  public void setFinancialActivityId(Long financialActivityId) {
    this.financialActivityId = financialActivityId;
  }


  public PostFinancialActivityAccountsRequest glAccountId(Long glAccountId) {
    
    this.glAccountId = glAccountId;
    return this;
  }

   /**
   * Get glAccountId
   * @return glAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Long getGlAccountId() {
    return glAccountId;
  }


  public void setGlAccountId(Long glAccountId) {
    this.glAccountId = glAccountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostFinancialActivityAccountsRequest postFinancialActivityAccountsRequest = (PostFinancialActivityAccountsRequest) o;
    return Objects.equals(this.financialActivityId, postFinancialActivityAccountsRequest.financialActivityId) &&
        Objects.equals(this.glAccountId, postFinancialActivityAccountsRequest.glAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialActivityId, glAccountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostFinancialActivityAccountsRequest {\n");
    sb.append("    financialActivityId: ").append(toIndentedString(financialActivityId)).append("\n");
    sb.append("    glAccountId: ").append(toIndentedString(glAccountId)).append("\n");
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

