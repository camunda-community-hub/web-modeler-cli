#!/bin/sh

echo Download Spec

curl -O https://modeler.cloud.camunda.io/v3/api-docs/api

echo Download Code Generator

curl -O https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/4.2.3/openapi-generator-cli-4.2.3.jar

java -jar openapi-generator-cli-4.2.3.jar generate \
  -i api \
  --api-package org.camunda.community.webmodeler.client.api \
  --model-package org.camunda.community.webmodeler.client.model \
  --invoker-package org.camunda.community.webmodeler.client.invoker \
  --group-id com.baeldung \
  --artifact-id spring-openapi-generator-api-client \
  --artifact-version 0.0.1-SNAPSHOT \
  --skip-validate-spec \
  -g java \
  -p java8=true \
  --library okhttp-gson \
  -o generated