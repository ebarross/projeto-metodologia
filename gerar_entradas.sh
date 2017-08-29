#!/bin/bash

for i in $(seq 1000); do
	echo $(($RANDOM % 100000)) >> E_1k.txt
done
