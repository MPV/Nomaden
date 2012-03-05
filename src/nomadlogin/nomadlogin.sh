#!/bin/sh

#	Get username from the first row in the file ~/.nomad-credentials.txt 
USERNAME=`tail +1 ~/.nomad-credentials.txt | head -n 1`

#	Get password from the second row in the file ~/.nomad-credentials.txt
PASSWORD=`tail +2 ~/.nomad-credentials.txt | head -n 1`

#	Send a HTTP REQUEST to NOMAD with your username and password:
curl -d "action=Login&login=$USERNAME&password=$PASSWORD&org=Radius" https://login.nomad.chalmers.se/