package org.mifos.fineract.services;

import org.mifos.fineract.models.GetReportNameResponse;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import rx.Observable;

public interface RunReportsApi {
    /**
     * Running a Report
     * This resource allows you to run and receive output from pre-defined Apache Fineract reports.  Reports can also be used to provide data for searching and workflow functionality.  The default output is a JSON formatted \&quot;Generic Resultset\&quot;. The Generic Resultset contains Column Heading as well as Data information. However, you can export to CSV format by simply adding \&quot;&amp;exportCSV&#x3D;true\&quot; to the end of your URL.  If Pentaho reports have been pre-defined, they can also be run through this resource. Pentaho reports can return HTML, PDF or CSV formats.  The Apache Fineract reference application uses a JQuery plugin called stretchy reporting which, itself, uses this reports resource to provide a pretty flexible reporting User Interface (UI).    Example Requests:  runreports/Client%20Listing?R_officeId&#x3D;1   runreports/Client%20Listing?R_officeId&#x3D;1&amp;exportCSV&#x3D;true   runreports/OfficeIdSelectOne?R_officeId&#x3D;1&amp;parameterType&#x3D;true   runreports/OfficeIdSelectOne?R_officeId&#x3D;1&amp;parameterType&#x3D;true&amp;exportCSV&#x3D;true   runreports/Expected%20Payments%20By%20Date%20-%20Formatted?R_endDate&#x3D;2013-04-30&amp;R_loanOfficerId&#x3D;-1&amp;R_officeId&#x3D;1&amp;R_startDate&#x3D;2013-04-16&amp;output-type&#x3D;HTML&amp;R_officeId&#x3D;1   runreports/Expected%20Payments%20By%20Date%20-%20Formatted?R_endDate&#x3D;2013-04-30&amp;R_loanOfficerId&#x3D;-1&amp;R_officeId&#x3D;1&amp;R_startDate&#x3D;2013-04-16&amp;output-type&#x3D;XLS&amp;R_officeId&#x3D;1   runreports/Expected%20Payments%20By%20Date%20-%20Formatted?R_endDate&#x3D;2013-04-30&amp;R_loanOfficerId&#x3D;-1&amp;R_officeId&#x3D;1&amp;R_startDate&#x3D;2013-04-16&amp;output-type&#x3D;CSV&amp;R_officeId&#x3D;1   runreports/Expected%20Payments%20By%20Date%20-%20Formatted?R_endDate&#x3D;2013-04-30&amp;R_loanOfficerId&#x3D;-1&amp;R_officeId&#x3D;1&amp;R_startDate&#x3D;2013-04-16&amp;output-type&#x3D;PDF&amp;R_officeId&#x3D;1
     *
     * @param reportName              reportName (required)
     * @param isSelfServiceUserReport isSelfServiceUserReport (optional, default to false)
     * @return Observable&lt;GetReportNameResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("runreports/{reportName}")
    Observable<GetReportNameResponse> runReport(
            @retrofit2.http.Path("reportName") String reportName, @retrofit2.http.Query("isSelfServiceUserReport") Boolean isSelfServiceUserReport
    );

}
