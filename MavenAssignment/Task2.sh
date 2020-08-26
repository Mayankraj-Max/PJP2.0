#!/bin/bash
#Make Maven local for the project.
mvn dependency:go-offline
mvn –o clean package
