package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface ClientIdentifierApi {
    /**
     * Create an Identifier for a Client
     * Mandatory Fields documentKey, documentTypeId
     *
     * @param clientId clientId (required)
     * @param body     body (required)
     * @return Observable&lt;PostClientsClientIdIdentifiersResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("clients/{clientId}/identifiers")
    Observable<PostClientsClientIdIdentifiersResponse> createClientIdentifier(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body PostClientsClientIdIdentifiersRequest body
    );

    /**
     * Delete a Client Identifier
     * Deletes a Client Identifier
     *
     * @param clientId     clientId (required)
     * @param identifierId identifierId (required)
     * @return Observable&lt;DeleteClientsClientIdIdentifiersIdentifierIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("clients/{clientId}/identifiers/{identifierId}")
    Observable<DeleteClientsClientIdIdentifiersIdentifierIdResponse> deleteClientIdentifier(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("identifierId") Long identifierId
    );

    /**
     * Retrieve Client Identifier Details Template
     * This is a convenience resource useful for building maintenance user interface screens for client applications. The template data returned consists of any or all of:   Field Defaults  Allowed Value Lists   Example Request: clients/1/identifiers/template
     *
     * @return Observable&lt;GetClientsClientIdIdentifiersTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("clients/{clientId}/identifiers/template")
    Observable<GetClientsClientIdIdentifiersTemplateResponse> newClientIdentifierDetails();


    /**
     * List all Identifiers for a Client
     * Example Requests: clients/1/identifiers   clients/1/identifiers?fields&#x3D;documentKey,documentType,description
     *
     * @param clientId clientId (required)
     * @return Observable&lt;List&lt;GetClientsClientIdIdentifiersResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("clients/{clientId}/identifiers")
    Observable<List<GetClientsClientIdIdentifiersResponse>> retrieveAllClientIdentifiers(
            @retrofit2.http.Path("clientId") Long clientId
    );

    /**
     * Retrieve a Client Identifier
     * Example Requests: clients/1/identifier/2   clients/1/identifier/2?template&#x3D;true  clients/1/identifiers/2?fields&#x3D;documentKey,documentType,description
     *
     * @param clientId     clientId (required)
     * @param identifierId identifierId (required)
     * @return Observable&lt;GetClientsClientIdIdentifiersResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("clients/{clientId}/identifiers/{identifierId}")
    Observable<GetClientsClientIdIdentifiersResponse> retrieveClientIdentifiers(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("identifierId") Long identifierId
    );

    /**
     * Update a Client Identifier
     * Updates a Client Identifier
     *
     * @param clientId     clientId (required)
     * @param identifierId identifierId (required)
     * @param body         body (required)
     * @return Observable&lt;PutClientsClientIdIdentifiersIdentifierIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("clients/{clientId}/identifiers/{identifierId}")
    Observable<PutClientsClientIdIdentifiersIdentifierIdResponse> updateClientIdentifer(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("identifierId") Long identifierId, @retrofit2.http.Body PutClientsClientIdIdentifiersIdentifierIdRequest body
    );

}
