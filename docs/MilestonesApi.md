# MilestonesApi

All URIs are relative to *https://modeler.cloud.camunda.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMilestone**](MilestonesApi.md#createMilestone) | **POST** /api/beta/milestones | 
[**deleteMilestone**](MilestonesApi.md#deleteMilestone) | **DELETE** /api/beta/milestones/{milestoneId} | 
[**getMilestone**](MilestonesApi.md#getMilestone) | **GET** /api/beta/milestones/{milestoneId} | 
[**listMilestones**](MilestonesApi.md#listMilestones) | **GET** /api/beta/files/{fileId}/milestones | 

<a name="createMilestone"></a>
# **createMilestone**
> MilestoneMetadataDto createMilestone(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MilestonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MilestonesApi apiInstance = new MilestonesApi();
CreateMilestoneDto body = new CreateMilestoneDto(); // CreateMilestoneDto | 
try {
    MilestoneMetadataDto result = apiInstance.createMilestone(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MilestonesApi#createMilestone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateMilestoneDto**](CreateMilestoneDto.md)|  |

### Return type

[**MilestoneMetadataDto**](MilestoneMetadataDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMilestone"></a>
# **deleteMilestone**
> deleteMilestone(milestoneId)



Deletion of resources is recursive and cannot be undone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MilestonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MilestonesApi apiInstance = new MilestonesApi();
UUID milestoneId = new UUID(); // UUID | 
try {
    apiInstance.deleteMilestone(milestoneId);
} catch (ApiException e) {
    System.err.println("Exception when calling MilestonesApi#deleteMilestone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **milestoneId** | [**UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMilestone"></a>
# **getMilestone**
> MilestoneDto getMilestone(milestoneId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MilestonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MilestonesApi apiInstance = new MilestonesApi();
UUID milestoneId = new UUID(); // UUID | 
try {
    MilestoneDto result = apiInstance.getMilestone(milestoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MilestonesApi#getMilestone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **milestoneId** | [**UUID**](.md)|  |

### Return type

[**MilestoneDto**](MilestoneDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMilestones"></a>
# **listMilestones**
> List&lt;MilestoneMetadataDto&gt; listMilestones(fileId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MilestonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MilestonesApi apiInstance = new MilestonesApi();
UUID fileId = new UUID(); // UUID | 
try {
    List<MilestoneMetadataDto> result = apiInstance.listMilestones(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MilestonesApi#listMilestones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | [**UUID**](.md)|  |

### Return type

[**List&lt;MilestoneMetadataDto&gt;**](MilestoneMetadataDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

