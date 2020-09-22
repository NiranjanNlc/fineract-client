package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface SelfThirdPartyTransferApi {
    /**
     * Add TPT Beneficiary
     * Api to add third party beneficiary linked to current user.  Parameter Definitions  name : Nick name for beneficiary, should be unique for an self service user  officeName : Office Name of beneficiary(not id)  accountNumber : Account Number of beneficiary(not id)  transferLimit : Each transfer initiated to this account will not exceed this amount  Example Requests:  /self/beneficiaries/tpt  Mandatory Fields: name, officeName, accountNumber, accountType  Optional Fields: transferLimit
     *
     * @param body body (required)
     * @return Observable&lt;PostSelfBeneficiariesTPTResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("self/beneficiaries/tpt")
    Observable<PostSelfBeneficiariesTPTResponse> add(
            @retrofit2.http.Body PostSelfBeneficiariesTPTRequest body
    );

    /**
     * Delete TPT Beneficiary
     * Api to delete third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}
     *
     * @param beneficiaryId (required)
     * @return Observable&lt;DeleteSelfBeneficiariesTPTBeneficiaryIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("self/beneficiaries/tpt/{beneficiaryId}")
    Observable<DeleteSelfBeneficiariesTPTBeneficiaryIdResponse> delete(
            @retrofit2.http.Path("beneficiaryId") Long beneficiaryId
    );

    /**
     * Get All TPT Beneficiary
     * Api to get all third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt
     *
     * @return Observable&lt;List&lt;GetSelfBeneficiariesTPTResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/beneficiaries/tpt")
    Observable<List<GetSelfBeneficiariesTPTResponse>> retrieveAll();


    /**
     * Beneficiary Third Party Transfer Template
     * Returns Account Type enumerations. Self User is expected to know office name and account number to be able to add beneficiary.  Example Requests:  /self/beneficiaries/tpt/template
     *
     * @return Observable&lt;GetSelfBeneficiariesTPTTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/beneficiaries/tpt/template")
    Observable<GetSelfBeneficiariesTPTTemplateResponse> template();


    /**
     * Update TPT Beneficiary
     * Api to update third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}  Optional Fields: name, transferLimit
     *
     * @param beneficiaryId beneficiaryId (required)
     * @param body          body (required)
     * @return Observable&lt;PutSelfBeneficiariesTPTBeneficiaryIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("self/beneficiaries/tpt/{beneficiaryId}")
    Observable<PutSelfBeneficiariesTPTBeneficiaryIdResponse> update(
            @retrofit2.http.Path("beneficiaryId") Long beneficiaryId, @retrofit2.http.Body PutSelfBeneficiariesTPTBeneficiaryIdRequest body
    );

}
