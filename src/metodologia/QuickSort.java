package metodologia;

public class QuickSort<T extends Comparable<T>> {

	public void sort(T[] array) {
		sort(array, 0, array.length - 1);
	}

	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int pivot = partition(array, leftIndex, rightIndex);
			sort(array, leftIndex, pivot - 1);
			sort(array, pivot + 1, rightIndex);
		}
	}

	private int partition(T[] array, int leftIndex, int rightIndex) {
		int i = leftIndex + 1;
		int j = rightIndex;
		T pivot = array[leftIndex];

		while (i <= j) {
			if (array[i].compareTo(pivot) <= 0) {
				i++;
			} else if (pivot.compareTo(array[j]) < 0) {
				j--;
			} else {
				Util.swap(array, i, j);
			}
		}

		Util.swap(array, leftIndex, j);

		return j;
	}

}
