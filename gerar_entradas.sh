#!/bin/bash

for i in $(seq 100000); do
	echo $(($RANDOM % 100000)) >> E_100k.txt
done
