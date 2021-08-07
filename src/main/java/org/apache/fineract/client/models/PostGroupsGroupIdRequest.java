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
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.PostGroupsGroupIdClients;

/**
 * PostGroupsGroupIdRequest
 */
@ApiModel(description = "PostGroupsGroupIdRequest")

public class PostGroupsGroupIdRequest {
  public static final String SERIALIZED_NAME_DESTINATION_GROUP_ID = "destinationGroupId";
  @SerializedName(SERIALIZED_NAME_DESTINATION_GROUP_ID)
  private Integer destinationGroupId;

  public static final String SERIALIZED_NAME_CLIENTS = "clients";
  @SerializedName(SERIALIZED_NAME_CLIENTS)
  private List<PostGroupsGroupIdClients> clients = null;


  public PostGroupsGroupIdRequest destinationGroupId(Integer destinationGroupId) {
    
    this.destinationGroupId = destinationGroupId;
    return this;
  }

   /**
   * Get destinationGroupId
   * @return destinationGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getDestinationGroupId() {
    return destinationGroupId;
  }


  public void setDestinationGroupId(Integer destinationGroupId) {
    this.destinationGroupId = destinationGroupId;
  }


  public PostGroupsGroupIdRequest clients(List<PostGroupsGroupIdClients> clients) {
    
    this.clients = clients;
    return this;
  }

  public PostGroupsGroupIdRequest addClientsItem(PostGroupsGroupIdClients clientsItem) {
    if (this.clients == null) {
      this.clients = new ArrayList<PostGroupsGroupIdClients>();
    }
    this.clients.add(clientsItem);
    return this;
  }

   /**
   * Get clients
   * @return clients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PostGroupsGroupIdClients> getClients() {
    return clients;
  }


  public void setClients(List<PostGroupsGroupIdClients> clients) {
    this.clients = clients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostGroupsGroupIdRequest postGroupsGroupIdRequest = (PostGroupsGroupIdRequest) o;
    return Objects.equals(this.destinationGroupId, postGroupsGroupIdRequest.destinationGroupId) &&
        Objects.equals(this.clients, postGroupsGroupIdRequest.clients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationGroupId, clients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostGroupsGroupIdRequest {\n");
    sb.append("    destinationGroupId: ").append(toIndentedString(destinationGroupId)).append("\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
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

