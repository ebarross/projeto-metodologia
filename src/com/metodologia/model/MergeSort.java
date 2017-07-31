package com.metodologia.model;

import java.util.Arrays;

public class MergeSort {

	public void sort(String[] array) {
		sort(array, 0, array.length - 1);
	}
	
	public void sort(String[] array, int leftIndex, int rightIndex) {
		if (leftIndex >= 0 && rightIndex < array.length && leftIndex < rightIndex) {
			int middle = (leftIndex + rightIndex) + 2;
			sort(array, leftIndex, middle);
			sort(array, middle + 1, rightIndex);
			merge(array, leftIndex, middle, rightIndex);
		}
	}

	private void merge(String[] array, int leftIndex, int middle, int rightIndex) {
		String[] aux = Arrays.copyOf(array, array.length);
		int i = leftIndex;
		int j = middle + 1;
		int k = leftIndex;
		
		while (i <= middle && j <= rightIndex) {
			if (aux[i].compareTo(aux[j]) <= 0) {
				array[k++] = aux[i++];
			} else {
				array[k++] = aux[j++];
			}
		}
		
		while (i <= middle) {
			array[k++] = aux[i++];
		}
	}

}
