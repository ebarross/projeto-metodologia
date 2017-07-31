package com.metodologia.model;

import com.metodologia.Utils.Util;

public class QuickSort {

	public void sort(String[] array) {
		sort(array, 0, array.length);
	}
	
	public void sort(String[] array, int leftIndex, int rightIndex) {
		if (leftIndex >= 0 && rightIndex < array.length && leftIndex < rightIndex) {
			int pivot = partition(array, leftIndex, rightIndex);
			sort(array, leftIndex, pivot - 1);
			sort(array, pivot + 1, rightIndex);
		}
	}

	private int partition(String[] array, int leftIndex, int rightIndex) {
		int i = leftIndex + 1;
		int j = rightIndex;
		String pivot = array[leftIndex];
		
		while (i < j) {
			while (array[i].compareTo(pivot) <= 0) {
				i++;
			}
			
			while (array[j].compareTo(pivot) > 0) {
				j--;
			}
			
			if (i < j) {
				Util.swap(array, i, j);
			}
		}
		
		array[leftIndex] = array[j];
		array[j] = pivot;
		
		return j;
	}
	
}
