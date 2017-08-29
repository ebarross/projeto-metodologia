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

		Long[] longInput = new Long[dataInput.length];

		for (int i = 0; i < dataInput.length; i++) {
			if (!dataInput[i].equals("")) {
				longInput[i] = Long.parseLong(dataInput[i]);
			}

		}

		WriterFile writerFile = new WriterFile(pathOutput);
		String[] escreve = new String[dataInput.length + 2];
		Long[] orderedArray = {};

		if (optionAlgorithm.equals("heapsort")) {
			MaxHeap<Long> heap = new MaxHeap<Long>(longInput.length);

			for (Long data : longInput) {
				heap.insert(data);
			}

			startTime = System.currentTimeMillis();

			heap.heapsort(longInput);

			finalTime = System.currentTimeMillis();

			orderedArray = heap.toArray();

		} else if (optionAlgorithm.equals("mergesort")) {
			MergeSort<Long> mergeSort = new MergeSort<Long>();

			startTime = System.currentTimeMillis();

			mergeSort.sort(longInput);

			finalTime = System.currentTimeMillis();

			orderedArray = longInput;


		} else if (optionAlgorithm.equals("quicksort")) {
			QuickSort<Long> quickSort = new QuickSort<Long>();

			startTime = System.currentTimeMillis();

			quickSort.sort(longInput);

			finalTime = System.currentTimeMillis();

			orderedArray = longInput;

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
