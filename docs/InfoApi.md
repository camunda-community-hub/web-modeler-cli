# InfoApi

All URIs are relative to *https://modeler.cloud.camunda.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInfo**](InfoApi.md#getInfo) | **GET** /api/beta/info | 

<a name="getInfo"></a>
# **getInfo**
> InfoDto getInfo()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InfoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InfoApi apiInstance = new InfoApi();
try {
    InfoDto result = apiInstance.getInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfoApi#getInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InfoDto**](InfoDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

