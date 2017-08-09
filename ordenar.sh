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
rm -rf ./bin/*

# --- Build
echo "Compilando arquivos..."
javac -d ./bin ./src/*/*.java
echo "Arquivos compilados com sucesso!"

# --- Run
if [ ! -z $INPUTFILE ] 
then
	if [ ! -f $INPUTFILE ]
	then 
		echo "Input file does not exist"
		exit
	fi
fi

echo $INPUTFILE $OUTPUTFILE
case $ALGORITHM in 
1)
	echo "Ordenando com MergeSort..."
	java -cp bin/ metodologia/Runner mergesort $INPUTFILE $OUTPUTFILE
	echo "Ordenado com sucesso!"
;;
2)
	echo "Ordenando com HeapSort..."
	java -cp bin/ metodologia/Runner heapsort $INPUTFILE $OUTPUTFILE
	echo "Ordenado com sucesso!"
;;
3)
	echo "Ordenando com QuickSort..."
	java -cp bin/ metodologia/Runner quicksort $INPUTFILE $OUTPUTFILE
	echo "Ordenado com sucesso!"
;;
*)
	echo "Something wrong happened. Please open the README.md file and check." 
	exit
;;

esac
