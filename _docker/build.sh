#!/usr/bin/env bash

cd ./../gateway-service/ && mvn clean install -Dmaven.test.skip=true
cd ./../article-service/ && mvn clean install -Dmaven.test.skip=true
cd ./../storage-service/ && mvn clean install -Dmaven.test.skip=true
