#!/bin/bash

echo "Compiling your code..."
javac -cp $1/ $1/*.java
if [ $? -ne 0 ]
then
    echo
    echo "Errors while trying to compile your code. Tests could not be run."
    exit 0
else
    echo "Success!"
    echo
fi


echo "Compiling your code with my tests..."
javac -cp junit-platform-console-standalone-1.8.2.jar:$1/ tests/*.java

if [ $? -ne 0 ]
then
    echo
    echo "Errors while trying to compile your code with my tests. Tests could not be run. Make sure that your classes and methods are all named according to the assignment instructions."
    exit 0
else
    echo "Success!"
    echo
fi

echo "Below is the output from testing your code."

java -jar junit-platform-console-standalone-1.8.2.jar -cp .:tests:$1/ --scan-classpath --disable-ansi-colors --disable-banner

if [ $? -eq 124 ]
then
    echo "Tests time out, perhaps you have an infinite loop?"
    exit 0
fi

exit 0

