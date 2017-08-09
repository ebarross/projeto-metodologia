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

		WriterFile writerFile = new WriterFile(pathOutput);

		if (optionAlgorithm.equals("heapsort")) {
			MaxHeap<String> heap = new MaxHeap<String>(dataInput.length);

			for (String data : dataInput) {
				heap.insert(data);
			}

			startTime = System.currentTimeMillis();

			System.out.println(startTime);

			heap.heapsort(dataInput);

			finalTime = System.currentTimeMillis();
			System.out.println(finalTime);

			System.out.println("Tempo de execucao: " + (finalTime - startTime) + " ms");

			writerFile.writeLines(heap.toArray());

		} else if (optionAlgorithm.equals("mergesort")) {
			MergeSort mergeSort = new MergeSort();
			startTime = System.currentTimeMillis();

			System.out.println(startTime);

			mergeSort.sort(dataInput);

			finalTime = System.currentTimeMillis();
			System.out.println(finalTime);

			System.out.println("Tempo de execucao: " + (finalTime - startTime) + " ms");

			writerFile.writeLines(dataInput);

		} else if (optionAlgorithm.equals("quicksort")) {
			QuickSort quickSort = new QuickSort();
			startTime = System.currentTimeMillis();

			System.out.println(startTime);

			quickSort.sort(dataInput);

			finalTime = System.currentTimeMillis();
			System.out.println(finalTime);

			System.out.println("Tempo de execucao: " + (finalTime - startTime) + " ms");

			writerFile.writeLines(dataInput);

		}
		System.exit(0);
	}
}
