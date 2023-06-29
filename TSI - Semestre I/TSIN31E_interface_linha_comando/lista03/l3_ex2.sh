#!/usr/bin/bash
read -p "Filename? " filename
if [ ! -e $filename ]; then
	echo "Aborted: file doesn't exist!"
	exit 1
else 
	echo "File exist!"
	exit 0
fi
