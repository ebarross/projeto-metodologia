package metodologia;

import java.io.IOException;

public class Runner {
	public static void main(String[] args) throws IOException, HeapException {
		String optionAlgorithm = args[0];
		String pathInput = args.length > 1 ? args[1] : "";
		String pathOutput = args.length > 2 ? args[2] : "output.txt";

		Long startTime;
		Long finalTime;
		
		ReaderFile readerFile = new ReaderFile(pathInput);
		String[] dataInput = readerFile.readerLines();

		Integer[] intInput = new Integer[dataInput.length];

		for (int i = 0; i < dataInput.length; i++) {
			intInput[i] = Integer.parseInt(dataInput[i]);
		}

		WriterFile writerFile = new WriterFile(pathOutput);

		if (optionAlgorithm.equals("heapsort")) {
			MaxHeap<Integer> heap = new MaxHeap<Integer>(dataInput.length);

			for (Integer data : intInput) {
				heap.insert(data);
			}

			startTime = System.currentTimeMillis();

			heap.heapsort(intInput);

			finalTime = System.currentTimeMillis();

			Long totalTime = finalTime - startTime;
			String[] escreve = new String[heap.toArray().length + 2];

			escreve[0] = "Ordenado pelo algoritmo HeapSort.";
			escreve[1] = "Tempo de execucao: " + totalTime + " ms";
/*			for (int i = 2; i < escreve.length; i++) {
				escreve[i] = heap.toArray()[i - 2];
			}
*/
			writerFile.writeLines(escreve);

		} else if (optionAlgorithm.equals("mergesort")) {
			MergeSort<String> mergeSort = new MergeSort<String>();

			startTime = System.currentTimeMillis();

			mergeSort.sort(dataInput);

			finalTime = System.currentTimeMillis();

			Long totalTime = finalTime - startTime;
			String[] escreve = new String[dataInput.length + 2];

			escreve[0] = "Ordenado pelo algoritmo MergeSort.";
			escreve[1] = "Tempo de execucao: " + totalTime + " ms";
			for (int i = 2; i < escreve.length; i++) {
				escreve[i] = dataInput[i - 2];
			}

			writerFile.writeLines(escreve);

		} else if (optionAlgorithm.equals("quicksort")) {
			QuickSort<String> quickSort = new QuickSort<String>();

			startTime = System.currentTimeMillis();

			quickSort.sort(dataInput);

			finalTime = System.currentTimeMillis();

			Long totalTime = finalTime - startTime;
			String[] escreve = new String[dataInput.length + 2];

			escreve[0] = "Ordenado pelo algoritmo QuickSort.";
			escreve[1] = "Tempo de execucao: " + totalTime + " ms";
			for (int i = 2; i < escreve.length; i++) {
				escreve[i] = dataInput[i - 2];
			}

			writerFile.writeLines(escreve);

		}
		System.exit(0);
	}
}
