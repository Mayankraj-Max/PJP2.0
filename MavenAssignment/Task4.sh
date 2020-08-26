#!/bin/bash
#Go to the project that you want to build offline.
mvn dependency:go-offline
mvn -o clean package
