#!/bin/sh

set username="blah" # otherwise bash seems to whinge that username is undefined on the next line
username="`sudo id -p | grep login | awk '{print $2}'`"
mv /Nomaden/NomadenInstaller.jar /Users/$username/Desktop/NomadenInstaller.jar
mv /Nomaden/Nomaden\ README.txt /Users/$username/Desktop/Nomaden\ README.txt
rm -r /Nomaden
java -jar /Users/$username/Desktop/NomadenInstaller.jar
open -a TextEdit /Users/$username/Desktop/Nomaden\ README.txt