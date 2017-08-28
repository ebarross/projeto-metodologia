#!/bin/bash



for i in $(seq 100000); do
	echo $RANDOM >> E_100k.txt
done
