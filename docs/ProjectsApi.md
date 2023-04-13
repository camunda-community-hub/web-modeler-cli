# ProjectsApi

All URIs are relative to *https://modeler.cloud.camunda.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProject**](ProjectsApi.md#createProject) | **POST** /api/beta/projects | 
[**deleteProject**](ProjectsApi.md#deleteProject) | **DELETE** /api/beta/projects/{projectId} | 
[**getProject**](ProjectsApi.md#getProject) | **GET** /api/beta/projects/{projectId} | 
[**listProjects**](ProjectsApi.md#listProjects) | **GET** /api/beta/projects | 
[**updateProject**](ProjectsApi.md#updateProject) | **PATCH** /api/beta/projects/{projectId} | 

<a name="createProject"></a>
# **createProject**
> ProjectMetadataDto createProject(body)



Creates a new project. This project will be created without any collaborators, so it will by default not be visible. To assign collaborators, the org owner can enable super-user mode and assign collaborators to it. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProjectsApi apiInstance = new ProjectsApi();
CreateProjectDto body = new CreateProjectDto(); // CreateProjectDto | 
try {
    ProjectMetadataDto result = apiInstance.createProject(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#createProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateProjectDto**](CreateProjectDto.md)|  |

### Return type

[**ProjectMetadataDto**](ProjectMetadataDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProject"></a>
# **deleteProject**
> deleteProject(projectId)



Deletion of resources is recursive and cannot be undone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProjectsApi apiInstance = new ProjectsApi();
UUID projectId = new UUID(); // UUID | 
try {
    apiInstance.deleteProject(projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#deleteProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProject"></a>
# **getProject**
> ProjectDto getProject(projectId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProjectsApi apiInstance = new ProjectsApi();
UUID projectId = new UUID(); // UUID | 
try {
    ProjectDto result = apiInstance.getProject(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**UUID**](.md)|  |

### Return type

[**ProjectDto**](ProjectDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listProjects"></a>
# **listProjects**
> List&lt;ProjectMetadataDto&gt; listProjects()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProjectsApi apiInstance = new ProjectsApi();
try {
    List<ProjectMetadataDto> result = apiInstance.listProjects();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#listProjects");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ProjectMetadataDto&gt;**](ProjectMetadataDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProject"></a>
# **updateProject**
> ProjectMetadataDto updateProject(body, projectId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProjectsApi apiInstance = new ProjectsApi();
UpdateProjectDto body = new UpdateProjectDto(); // UpdateProjectDto | 
UUID projectId = new UUID(); // UUID | 
try {
    ProjectMetadataDto result = apiInstance.updateProject(body, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#updateProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateProjectDto**](UpdateProjectDto.md)|  |
 **projectId** | [**UUID**](.md)|  |

### Return type

[**ProjectMetadataDto**](ProjectMetadataDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

