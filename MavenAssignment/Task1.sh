#!/bin/bash
echo "Enter the plugin name : "
read pluginName
echo "Enter the the plugin groupid"
read pluginLoc
echo "Enter the version"
read version
mvn help:describe -DgroupId=org.$pluginLoc -DartifactId=maven-$pluginName-plugin -Dversion=$version

