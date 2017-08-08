#! /bin/bash

while getopts a:i:o: OPCAO; do
     case "${OPCAO}" in
     	a) ALGORITHM=${OPTARG} ;;
        i) INPUTFILE=${OPTARG} ;;
        o) OUTPUTFILE=${OPTARG} ;;
        ?) echo "Please read the file README.md"; exit 1; ;;
     esac
 done
  
if [ -z $ALGORITHM ] 
then
	echo "Value invalid algorithm. Read the file README.md"
	exit
fi 
  
# --- Clean
rm -rf out/*

# --- Build
echo "Compiling files..."
javac -d ./out/production/projeto-metodologia/metodologia/ ./src/*/*.java
echo "Compiled files"

# --- Run
if [ ! -z $INPUTFILE ] 
then
	if [ ! -f $INPUTFILE ]
	then 
		echo "Input file does not exist"
		exit
	fi
	#cp -R $INPUTFILE bin/
fi

#cd bin
echo $INPUTFILE $OUTPUTFILE
case $ALGORITHM in 
1)
    echo "Running parallel algorithm..."
	java -cp out/production/projeto-metodologia/ metodologia/Runner par $INPUTFILE $OUTPUTFILE
    echo "Algorithm finalized" 
;;
2)
    echo "Running sequential algorithm..."
	java -cp out/production/projeto-metodologia/ metodologia/Runner heap $INPUTFILE $OUTPUTFILE
    echo "Algorithm finalized"
;;
*)
	echo "Something wrong happened. Please open the README.md file and check." 
	exit
;;
esac
