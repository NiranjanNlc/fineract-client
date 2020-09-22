package org.mifos.fineract.services;

import okhttp3.MultipartBody;
import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface FixedDepositAccountApi {
    /**
     * @param accountId accountId (required)
     * @param command   command (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("fixeddepositaccounts/{accountId}/template")
    Observable<String> accountClosureTemplate(
            @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Query("command") String command
    );

    /**
     * Delete a fixed deposit application
     * At present we support hard delete of fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the fixed deposit account.
     *
     * @param accountId accountId (required)
     * @return Observable&lt;DeleteFixedDepositAccountsAccountIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("fixeddepositaccounts/{accountId}")
    Observable<DeleteFixedDepositAccountsAccountIdResponse> delete(
            @retrofit2.http.Path("accountId") Long accountId
    );

    /**
     * @param officeId   (optional)
     * @param staffId    (optional)
     * @param dateFormat (optional)
     * @return Observable&lt;Void&gt;
     */
    @GET("fixeddepositaccounts/downloadtemplate")
    Observable<Void> getFixedDepositTemplate(
            @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("staffId") Long staffId, @retrofit2.http.Query("dateFormat") String dateFormat
    );

    /**
     * @param officeId   (optional)
     * @param dateFormat (optional)
     * @return Observable&lt;Void&gt;
     */
    @GET("fixeddepositaccounts/transaction/downloadtemplate")
    Observable<Void> getFixedDepositTransactionTemplate(
            @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("dateFormat") String dateFormat
    );

    /**
     * Approve fixed deposit application | Undo approval fixed deposit application | Reject fixed deposit application | Withdraw fixed deposit application | Activate a fixed deposit account | Close a fixed deposit account | Premature Close a fixed deposit account | Calculate Premature amount on Fixed deposit account | Calculate Interest on Fixed Deposit Account | Post Interest on Fixed Deposit Account
     * Approve fixed deposit application:  Approves fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval fixed deposit application:  Will move &#39;approved&#39; fixed deposit application back to &#39;Submitted and pending approval&#39; state.  Reject fixed deposit application:  Rejects fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw fixed deposit application:  Used when an applicant withdraws from the fixed deposit application. It must be in &#39;Submitted and pending approval&#39; state.  Close a fixed deposit account:  Results in a Matured fixed deposit account being converted into a &#39;closed&#39; fixed deposit account.  Premature Close a fixed deposit account:  Results in an Active fixed deposit account being converted into a &#39;Premature Closed&#39; fixed deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  Calculate Premature amount on Fixed deposit account:  Calculate premature amount on fixed deposit account till premature close date. Premature amount is calculated based on interest chart and penal interest applicable.  Calculate Interest on Fixed Deposit Account:  Calculates interest earned on a fixed deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Fixed Deposit Account:  Calculates and Posts interest earned on a fixed deposit account based on today&#39;s date and whether an interest posting or crediting event is due.  Showing request/response for Calculate Interest on Fixed Deposit Account
     *
     * @param accountId accountId (required)
     * @param body      body (required)
     * @param command   command (optional)
     * @return Observable&lt;PostFixedDepositAccountsAccountIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("fixeddepositaccounts/{accountId}")
    Observable<PostFixedDepositAccountsAccountIdResponse> handleCommands(
            @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Body PostFixedDepositAccountsAccountIdRequest body, @retrofit2.http.Query("command") String command
    );

    /**
     * @param file       (optional)
     * @param locale     (optional)
     * @param dateFormat (optional)
     * @return Observable&lt;String&gt;
     */
    @retrofit2.http.Multipart
    @POST("fixeddepositaccounts/uploadtemplate")
    Observable<String> postFixedDepositTemplate(
            @retrofit2.http.Part MultipartBody.Part file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
    );

    /**
     * @param file       (optional)
     * @param locale     (optional)
     * @param dateFormat (optional)
     * @return Observable&lt;String&gt;
     */
    @retrofit2.http.Multipart
    @POST("fixeddepositaccounts/transaction/uploadtemplate")
    Observable<String> postFixedDepositTransactionTemplate(
            @retrofit2.http.Part MultipartBody.Part file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
    );

    /**
     * List Fixed deposit applications/accounts
     * Lists Fixed Deposit Accounts  Example Requests:    fixeddepositaccounts    fixeddepositaccounts?fields&#x3D;name
     *
     * @param paged     paged (optional)
     * @param offset    offset (optional)
     * @param limit     limit (optional)
     * @param orderBy   orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return Observable&lt;List&lt;GetFixedDepositAccountsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("fixeddepositaccounts")
    Observable<List<GetFixedDepositAccountsResponse>> retrieveAll(
            @retrofit2.http.Query("paged") Boolean paged, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
    );

    /**
     * Retrieve a fixed deposit application/account
     * Retrieves a fixed deposit application/account  Example Requests :    fixeddepositaccounts/1  fixeddepositaccounts/1?associations&#x3D;all
     *
     * @param accountId                 accountId (required)
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @param chargeStatus              chargeStatus (optional, default to all)
     * @return Observable&lt;GetFixedDepositAccountsAccountIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("fixeddepositaccounts/{accountId}")
    Observable<GetFixedDepositAccountsAccountIdResponse> retrieveOne(
            @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly, @retrofit2.http.Query("chargeStatus") String chargeStatus
    );

    /**
     * Submit new fixed deposit application
     * Submits a new fixed deposit applicationMandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )
     *
     * @param body body (required)
     * @return Observable&lt;PostFixedDepositAccountsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("fixeddepositaccounts")
    Observable<PostFixedDepositAccountsResponse> submitApplication(
            @retrofit2.http.Body PostFixedDepositAccountsRequest body
    );

    /**
     * Retrieve Fixed Deposit Account Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for fixed deposit applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value ListsExample Requests:    fixeddepositaccounts/template?clientId&#x3D;1
     *
     * @param clientId                  clientId (optional)
     * @param groupId                   groupId (optional)
     * @param productId                 productId (optional)
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @return Observable&lt;GetFixedDepositAccountsTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("fixeddepositaccounts/template")
    Observable<GetFixedDepositAccountsTemplateResponse> template(
            @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("groupId") Long groupId, @retrofit2.http.Query("productId") Long productId, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly
    );

    /**
     * Modify a fixed deposit application
     * Fixed deposit application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
     *
     * @param accountId accountId (required)
     * @param body      body (required)
     * @return Observable&lt;PutFixedDepositAccountsAccountIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("fixeddepositaccounts/{accountId}")
    Observable<PutFixedDepositAccountsAccountIdResponse> update(
            @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Body PutFixedDepositAccountsAccountIdRequest body
    );

}
