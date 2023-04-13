# FoldersApi

All URIs are relative to *https://modeler.cloud.camunda.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFolder**](FoldersApi.md#createFolder) | **POST** /api/beta/folders | 
[**deleteFolder**](FoldersApi.md#deleteFolder) | **DELETE** /api/beta/folders/{folderId} | 
[**getFolder**](FoldersApi.md#getFolder) | **GET** /api/beta/folders/{folderId} | 
[**patchFolder**](FoldersApi.md#patchFolder) | **PATCH** /api/beta/folders/{folderId} | 

<a name="createFolder"></a>
# **createFolder**
> FolderMetadataDto createFolder(body)



Creates a new folder.&lt;br/&gt; &lt;ul&gt;   &lt;li&gt;When only &lt;em&gt;parentId&lt;/em&gt; is given, the folder will be created in that       folder. The folder can be in any project of the same organization.&lt;/li&gt;   &lt;li&gt;When &lt;em&gt;projectId&lt;/em&gt; is given and &lt;em&gt;parentId&lt;/em&gt; is either       null or omitted altogether, the folder will be created in the root of the project.&lt;/li&gt;   &lt;li&gt;When &lt;em&gt;projectId&lt;/em&gt; and &lt;em&gt;parentId&lt;/em&gt; are both given,       they must be consistent - i.e. the parent folder is in the project.&lt;/li&gt; &lt;/ul&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FoldersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FoldersApi apiInstance = new FoldersApi();
CreateFolderDto body = new CreateFolderDto(); // CreateFolderDto | 
try {
    FolderMetadataDto result = apiInstance.createFolder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FoldersApi#createFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateFolderDto**](CreateFolderDto.md)|  |

### Return type

[**FolderMetadataDto**](FolderMetadataDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFolder"></a>
# **deleteFolder**
> deleteFolder(folderId)



Deletion of resources is recursive and cannot be undone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FoldersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FoldersApi apiInstance = new FoldersApi();
UUID folderId = new UUID(); // UUID | 
try {
    apiInstance.deleteFolder(folderId);
} catch (ApiException e) {
    System.err.println("Exception when calling FoldersApi#deleteFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folderId** | [**UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFolder"></a>
# **getFolder**
> FolderDto getFolder(folderId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FoldersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FoldersApi apiInstance = new FoldersApi();
UUID folderId = new UUID(); // UUID | 
try {
    FolderDto result = apiInstance.getFolder(folderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FoldersApi#getFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folderId** | [**UUID**](.md)|  |

### Return type

[**FolderDto**](FolderDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchFolder"></a>
# **patchFolder**
> FolderMetadataDto patchFolder(body, folderId)



This endpoint updates the name or location of a folder, or both at the same time.&lt;br/&gt; To move a folder, specify &lt;em&gt;projectId&lt;/em&gt; and/or &lt;em&gt;parentId&lt;/em&gt;: &lt;ul&gt;   &lt;li&gt;When only &lt;em&gt;parentId&lt;/em&gt; is given, the file will be moved to that       folder. The folder must keep in the same organization.&lt;/li&gt;   &lt;li&gt;When &lt;em&gt;projectId&lt;/em&gt; is given and &lt;em&gt;parentId&lt;/em&gt; is either       null or omitted altogether, the file will be moved to the root of the project.&lt;/li&gt;   &lt;li&gt;When &lt;em&gt;projectId&lt;/em&gt; and &lt;em&gt;parentId&lt;/em&gt; are both given,       they must be consistent - i.e. the new parent folder is in the new project.&lt;/li&gt; &lt;/ul&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FoldersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FoldersApi apiInstance = new FoldersApi();
UpdateFolderDto body = new UpdateFolderDto(); // UpdateFolderDto | 
UUID folderId = new UUID(); // UUID | 
try {
    FolderMetadataDto result = apiInstance.patchFolder(body, folderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FoldersApi#patchFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateFolderDto**](UpdateFolderDto.md)|  |
 **folderId** | [**UUID**](.md)|  |

### Return type

[**FolderMetadataDto**](FolderMetadataDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

