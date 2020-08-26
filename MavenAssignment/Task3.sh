#!/bin/bash
echo "Enter the name of a file"
read outputFile
mvn install:help --log-file $outputFile
echo "Log saved to file"
