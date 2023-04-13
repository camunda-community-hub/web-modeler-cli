# FilesApi

All URIs are relative to *https://modeler.cloud.camunda.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFile**](FilesApi.md#createFile) | **POST** /api/beta/files | 
[**deleteFile**](FilesApi.md#deleteFile) | **DELETE** /api/beta/files/{fileId} | 
[**getFile**](FilesApi.md#getFile) | **GET** /api/beta/files/{fileId} | 
[**listFiles**](FilesApi.md#listFiles) | **GET** /api/beta/projects/{projectId}/files | 
[**patchFile**](FilesApi.md#patchFile) | **PATCH** /api/beta/files/{fileId} | 

<a name="createFile"></a>
# **createFile**
> FileMetadataDto createFile(body)



This endpoint creates a file.&lt;br/&gt; To create a file, specify &lt;em&gt;projectId&lt;/em&gt; and/or &lt;em&gt;folderId&lt;/em&gt;: &lt;ul&gt;   &lt;li&gt;When only &lt;em&gt;folderId&lt;/em&gt; is given, the file will be created in that       folder. The folder can be in any project of the same organization.&lt;/li&gt;   &lt;li&gt;When &lt;em&gt;projectId&lt;/em&gt; is given and &lt;em&gt;parentId&lt;/em&gt; is either       null or omitted altogether, the file will be created in the root of the project.&lt;/li&gt;   &lt;li&gt;When &lt;em&gt;projectId&lt;/em&gt; and &lt;em&gt;folderId&lt;/em&gt; are both given,       they must be consistent - i.e. the folder is in the project.&lt;/li&gt; &lt;/ul&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilesApi apiInstance = new FilesApi();
CreateFileDto body = new CreateFileDto(); // CreateFileDto | 
try {
    FileMetadataDto result = apiInstance.createFile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#createFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateFileDto**](CreateFileDto.md)|  |

### Return type

[**FileMetadataDto**](FileMetadataDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

<a name="deleteFile"></a>
# **deleteFile**
> deleteFile(fileId)



Deletion of resources is recursive and cannot be undone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilesApi apiInstance = new FilesApi();
UUID fileId = new UUID(); // UUID | 
try {
    apiInstance.deleteFile(fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#deleteFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | [**UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFile"></a>
# **getFile**
> FileDto getFile(fileId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilesApi apiInstance = new FilesApi();
UUID fileId = new UUID(); // UUID | 
try {
    FileDto result = apiInstance.getFile(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#getFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | [**UUID**](.md)|  |

### Return type

[**FileDto**](FileDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFiles"></a>
# **listFiles**
> List&lt;FileMetadataDto&gt; listFiles(projectId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilesApi apiInstance = new FilesApi();
UUID projectId = new UUID(); // UUID | 
try {
    List<FileMetadataDto> result = apiInstance.listFiles(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#listFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**UUID**](.md)|  |

### Return type

[**List&lt;FileMetadataDto&gt;**](FileMetadataDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchFile"></a>
# **patchFile**
> FileMetadataDto patchFile(body, fileId)



This endpoint updates the content, name, or location of a file, or all at the same time.&lt;br/&gt; &lt;br/&gt;&lt;strong&gt;Warning&lt;/strong&gt; This beta does &lt;em&gt;not&lt;/em&gt; implement all safeguards that are present in the UI: &lt;ul&gt;   &lt;li&gt;When updating the content of an element template, make sure to not change the       element template id.&lt;/li&gt; &lt;/ul&gt; To move a file, specify &lt;em&gt;projectId&lt;/em&gt; and/or &lt;em&gt;parentId&lt;/em&gt;: &lt;ul&gt;   &lt;li&gt;When only &lt;em&gt;parentId&lt;/em&gt; is given, the file will be moved to that       folder. The folder can be in another project of the same organization.&lt;/li&gt;   &lt;li&gt;When &lt;em&gt;projectId&lt;/em&gt; is given and &lt;em&gt;parentId&lt;/em&gt; is either       null or omitted altogether, the file will be moved to the root of the project.&lt;/li&gt;   &lt;li&gt;When &lt;em&gt;projectId&lt;/em&gt; and &lt;em&gt;parentId&lt;/em&gt; are both given,       hey must be consistent - i.e. the new parent folder is in the new project.&lt;/li&gt; &lt;/ul&gt; The field &lt;em&gt;revision&lt;/em&gt; holds the current revision of the file. This is used for detecting and preventing concurrent modifications. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilesApi apiInstance = new FilesApi();
UpdateFileDto body = new UpdateFileDto(); // UpdateFileDto | 
UUID fileId = new UUID(); // UUID | 
try {
    FileMetadataDto result = apiInstance.patchFile(body, fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#patchFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateFileDto**](UpdateFileDto.md)|  |
 **fileId** | [**UUID**](.md)|  |

### Return type

[**FileMetadataDto**](FileMetadataDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

