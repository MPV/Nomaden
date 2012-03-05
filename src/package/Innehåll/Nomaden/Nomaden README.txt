##	GENERAL INFO	##

Name:		Nomaden
Version:	1.0
Made by:	Victor Sollerhed and Ivan Perisa

Purpose:	
Nomaden is an application that automates the task of logging in to the Chalmers NOMAD wireless network, without requiring the user to start a web browser and type his username and password. 


##	INSTALLATION	##

1. Should have been done nicely by our installer. Otherwise, try again or contact us. 
2. Configuration of your username and password is done with the NomadenInstaller.jar file, which is executed automagically after the installer. Also found on your desktop if needed. Otherwise you can just delete it. 
3. Run Nomaden.app and voila!


##	HOW DOES IT WORK?	##

Nomaden loads your username and password from the file ~/.nomad-credentials.txt and sends a HTTP REQUEST to https://login.nomad.chalmers.se/ with your username and password to log in. 


##	HELP!	##

"Where are my login credentials saved?"
They are saved in the "~/.nomad-credentials.txt" file. If you want to edit them, either run the NomadenInstaller.jar file or this command in a Terminal.app window:

	open -a TextEdit ~/.nomad-credentials.txt

"I have another question, where can I reach you?"
Email your questions, feedback or love to victor@sollerhed.se


##	THANKS TO...	##

McB:
Who made a script for logging in to the NOMAD network and inspired me to do a "premade" version for OS X.
http://wiki.ituniv.org/index.php/User:Mcb

The script that inspired me:
http://wiki.ituniv.org/index.php/Login_script

Platypus for OS X:
An OS X application that makes it possible to make applications (.App's) from shell scripts. 
http://www.sveinbjorn.org/platypus

Ivan – my beta tester and co-developer!


##	LICENSING	##

This software is and should be distributed with no associated cost. 

You are free to share, distribute and adapt this software to your needs, all according to the Creative Commons "Share Alike" license. 

Read more at: http://creativecommons.org/licenses/by-sa/2.5/