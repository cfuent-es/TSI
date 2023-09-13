#!/usr/bin/bash
read -p "Filename? " filename
if [ ! -w $filename ]; then
	echo "File can't be written!"
	exit 1
fi
