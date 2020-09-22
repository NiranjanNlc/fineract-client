# RunReportsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**runReport**](RunReportsApi.md#runReport) | **GET** runreports/{reportName} | Running a Report


<a name="runReport"></a>
# **runReport**
> GetReportNameResponse runReport(reportName, isSelfServiceUserReport)

Running a Report

This resource allows you to run and receive output from pre-defined Apache Fineract reports.  Reports can also be used to provide data for searching and workflow functionality.  The default output is a JSON formatted \&quot;Generic Resultset\&quot;. The Generic Resultset contains Column Heading as well as Data information. However, you can export to CSV format by simply adding \&quot;&amp;exportCSV&#x3D;true\&quot; to the end of your URL.  If Pentaho reports have been pre-defined, they can also be run through this resource. Pentaho reports can return HTML, PDF or CSV formats.  The Apache Fineract reference application uses a JQuery plugin called stretchy reporting which, itself, uses this reports resource to provide a pretty flexible reporting User Interface (UI).    Example Requests:  runreports/Client%20Listing?R_officeId&#x3D;1   runreports/Client%20Listing?R_officeId&#x3D;1&amp;exportCSV&#x3D;true   runreports/OfficeIdSelectOne?R_officeId&#x3D;1&amp;parameterType&#x3D;true   runreports/OfficeIdSelectOne?R_officeId&#x3D;1&amp;parameterType&#x3D;true&amp;exportCSV&#x3D;true   runreports/Expected%20Payments%20By%20Date%20-%20Formatted?R_endDate&#x3D;2013-04-30&amp;R_loanOfficerId&#x3D;-1&amp;R_officeId&#x3D;1&amp;R_startDate&#x3D;2013-04-16&amp;output-type&#x3D;HTML&amp;R_officeId&#x3D;1   runreports/Expected%20Payments%20By%20Date%20-%20Formatted?R_endDate&#x3D;2013-04-30&amp;R_loanOfficerId&#x3D;-1&amp;R_officeId&#x3D;1&amp;R_startDate&#x3D;2013-04-16&amp;output-type&#x3D;XLS&amp;R_officeId&#x3D;1   runreports/Expected%20Payments%20By%20Date%20-%20Formatted?R_endDate&#x3D;2013-04-30&amp;R_loanOfficerId&#x3D;-1&amp;R_officeId&#x3D;1&amp;R_startDate&#x3D;2013-04-16&amp;output-type&#x3D;CSV&amp;R_officeId&#x3D;1   runreports/Expected%20Payments%20By%20Date%20-%20Formatted?R_endDate&#x3D;2013-04-30&amp;R_loanOfficerId&#x3D;-1&amp;R_officeId&#x3D;1&amp;R_startDate&#x3D;2013-04-16&amp;output-type&#x3D;PDF&amp;R_officeId&#x3D;1

### Example
```java

RunReportsApi apiService = defaultClient.createService(RunReportsApi.class);

// Initialize these parameters earlier.
Call<GetReportNameResponse> call = apiService.runReport(reportName, isSelfServiceUserReport);
call.enqueue(new Callback<GetReportNameResponse>() {
    @Override
    public void onResponse(Call<GetReportNameResponse> call, Response<GetReportNameResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetReportNameResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **reportName** | **String**| reportName |
 **isSelfServiceUserReport** | **Boolean**| isSelfServiceUserReport | [optional] [default to false]

### Return type

[**GetReportNameResponse**](GetReportNameResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/csv, application/vnd.ms-excel, application/pdf, text/html

