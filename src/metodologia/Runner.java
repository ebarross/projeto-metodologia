package metodologia;

import java.io.IOException;

public class Runner {
	public static void main(String[] args) throws IOException, HeapException {
		String optionAlgorithm = args[0];
		String pathInput = args.length > 1 ? args[1] : "";
		String pathOutput = args.length > 2 ? args[2] : "output.txt";

		Long startTime = 0L;
		Long finalTime = 0L;
		Long totalTime;
		
		ReaderFile readerFile = new ReaderFile(pathInput);
		String[] dataInput = readerFile.readerLines();

		Integer[] intInput = new Integer[dataInput.length];

		for (int i = 0; i < dataInput.length; i++) {
			if (dataInput[i].length() <= 6 ) {
				intInput[i] = Integer.parseInt(dataInput[i]);
			}

		}

		WriterFile writerFile = new WriterFile(pathOutput);
		String[] escreve = new String[dataInput.length + 2];
		Integer[] orderedArray = {};

		if (optionAlgorithm.equals("heapsort")) {
			MaxHeap<Integer> heap = new MaxHeap<Integer>(intInput.length);

			for (Integer data : intInput) {
				heap.insert(data);
			}

			startTime = System.currentTimeMillis();

			heap.heapsort(intInput);

			finalTime = System.currentTimeMillis();

			orderedArray = heap.toArray();

		} else if (optionAlgorithm.equals("mergesort")) {
			MergeSort<Integer> mergeSort = new MergeSort<Integer>();

			startTime = System.currentTimeMillis();

			mergeSort.sort(intInput);

			finalTime = System.currentTimeMillis();

			orderedArray = intInput;


		} else if (optionAlgorithm.equals("quicksort")) {
			QuickSort<Integer> quickSort = new QuickSort<Integer>();

			startTime = System.currentTimeMillis();

			quickSort.sort(intInput);

			finalTime = System.currentTimeMillis();

			orderedArray = intInput;

		}

		totalTime = finalTime - startTime;
		escreve[0] = "Ordenado pelo algoritmo " + optionAlgorithm;
		escreve[1] = "Tempo de execucao: " + totalTime + " ms";
		for (int i = 2; i < escreve.length; i++) {
			escreve[i] = orderedArray[i - 2].toString();
		}
		writerFile.writeLines(escreve);
		System.exit(0);
	}
}
