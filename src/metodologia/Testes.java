package metodologia;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

public class Testes {

	@Test
	public void testeStrings() {
		String[] array = { "Bala", "Cadeira", "Aviao" };
		String[] array2 = { "Bala", "Cadeira", "Aviao" };
		MergeSort<String> sorter = new MergeSort<String>();

		Arrays.sort(array);
		sorter.sort(array2);

		assertArrayEquals(array, array2);
	}

	@Test
	public void testSortT1() {
		Integer array[] = {};
		Integer ordered[] = {};
		MergeSort<Integer> mysort = new MergeSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT2() {
		Integer array[] = { 1 };
		Integer ordered[] = { 1 };
		MergeSort<Integer> mysort = new MergeSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT3() {
		Integer array[] = { 2, 1 };
		Integer ordered[] = { 1, 2 };
		MergeSort<Integer> mysort = new MergeSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT4() {
		Integer array[] = { 2, 1, -4 };
		Integer ordered[] = { -4, 1, 2 };
		MergeSort<Integer> mysort = new MergeSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT5() {
		Integer array[] = { -24, 200, 1956, 94, 4 };
		Integer ordered[] = { -24, 4, 94, 200, 1956 };
		MergeSort<Integer> mysort = new MergeSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT6() {
		Integer array[] = { -66, 9, 1, -53, 790, 5, 3567 };
		Integer ordered[] = { -66, -53, 1, 5, 9, 790, 3567 };
		MergeSort<Integer> mysort = new MergeSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT7() {
		Integer array[] = { 5, 1, 7, 4, 6 };
		Integer ordered[] = { 1, 4, 5, 6, 7 };
		MergeSort<Integer> mysort = new MergeSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT8() {
		Integer array[] = { -1, 3, 7, -6, 5, 10, 20 };
		Integer ordered[] = { -6, -1, 3, 5, 7, 10, 20 };
		MergeSort<Integer> mysort = new MergeSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT9() {
		Integer array[] = { -100, 3, 246, -6, 125, -156, 2000, 1, 5678, 4 };
		Integer ordered[] = { -156, -100, -6, 1, 3, 4, 125, 246, 2000, 5678 };
		MergeSort<Integer> mysort = new MergeSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT10() {
		Integer array[] = { 5, 4, -7, 2, 8, 9, -1, 1, 4, 6 };
		Integer ordered[] = { 5, 4, -7, 2, 8, 9, -1, 1, 4, 6 };
		MergeSort<Integer> mysort = new MergeSort<Integer>();

		mysort.sort(array, 5, 4);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT11() {
		Integer array[] = { 15, -17, 29, 40, 6645, 3, 1, 563, -987 };
		Integer ordered[] = { 15, -17, 29, -987, 1, 3, 40, 563, 6645 };
		MergeSort<Integer> mysort = new MergeSort<Integer>();

		mysort.sort(array, 3, 8);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT12() {
		Integer array[] = { 30, -18, 1, 42, 1, 3, 1, 569, -900 };
		Integer ordered[] = { 30, -18, 1, 1, 1, 3, 42, 569, -900 };
		MergeSort<Integer> mysort = new MergeSort<Integer>();

		mysort.sort(array, 2, 7);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT13() {
		Integer array[] = { 0, -5, 10, -15, 20, -25, 30, -35, 40, -45, 50, -55, 60 };
		Integer ordered[] = { 0, -5, 10, -15, 20, -35, -25, 30, 40, -45, 50, -55, 60 };
		MergeSort<Integer> mysort = new MergeSort<Integer>();

		mysort.sort(array, 5, 8);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT14() {
		Integer array[] = {};
		Integer ordered[] = {};
		QuickSort<Integer> mysort = new QuickSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT15() {
		Integer array[] = { 1 };
		Integer ordered[] = { 1 };
		QuickSort<Integer> mysort = new QuickSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT16() {
		Integer array[] = { 2, 1 };
		Integer ordered[] = { 1, 2 };
		QuickSort<Integer> mysort = new QuickSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT17() {
		Integer array[] = { 2, 1, -4 };
		Integer ordered[] = { -4, 1, 2 };
		QuickSort<Integer> mysort = new QuickSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT18() {
		Integer array[] = { -24, 200, 1956, 94, 4 };
		Integer ordered[] = { -24, 4, 94, 200, 1956 };
		QuickSort<Integer> mysort = new QuickSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT19() {
		Integer array[] = { -66, 9, 1, -53, 790, 5, 3567 };
		Integer ordered[] = { -66, -53, 1, 5, 9, 790, 3567 };
		QuickSort<Integer> mysort = new QuickSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT20() {
		Integer array[] = { 5, 1, 7, 4, 6 };
		Integer ordered[] = { 1, 4, 5, 6, 7 };
		QuickSort<Integer> mysort = new QuickSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT21() {
		Integer array[] = { -1, 3, 7, -6, 5, 10, 20 };
		Integer ordered[] = { -6, -1, 3, 5, 7, 10, 20 };
		QuickSort<Integer> mysort = new QuickSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT22() {
		Integer array[] = { -100, 3, 246, -6, 125, -156, 2000, 1, 5678, 4 };
		Integer ordered[] = { -156, -100, -6, 1, 3, 4, 125, 246, 2000, 5678 };
		QuickSort<Integer> mysort = new QuickSort<Integer>();

		mysort.sort(array);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT23() {
		Integer array[] = { 5, 4, -7, 2, 8, 9, -1, 1, 4, 6 };
		Integer ordered[] = { 5, 4, -7, 2, 8, 9, -1, 1, 4, 6 };
		QuickSort<Integer> mysort = new QuickSort<Integer>();

		mysort.sort(array, 5, 4);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT24() {
		Integer array[] = { 15, -17, 29, 40, 6645, 3, 1, 563, -987 };
		Integer ordered[] = { 15, -17, 29, -987, 1, 3, 40, 563, 6645 };
		QuickSort<Integer> mysort = new QuickSort<Integer>();

		mysort.sort(array, 3, 8);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT25() {
		Integer array[] = { 30, -18, 1, 42, 1, 3, 1, 569, -900 };
		Integer ordered[] = { 30, -18, 1, 1, 1, 3, 42, 569, -900 };
		QuickSort<Integer> mysort = new QuickSort<Integer>();

		mysort.sort(array, 2, 7);

		assertArrayEquals(ordered, array);
	}

	@Test
	public void testSortT26() {
		Integer array[] = { 0, -5, 10, -15, 20, -25, 30, -35, 40, -45, 50, -55, 60 };
		Integer ordered[] = { 0, -5, 10, -15, 20, -35, -25, 30, 40, -45, 50, -55, 60 };
		QuickSort<Integer> mysort = new QuickSort<Integer>();

		mysort.sort(array, 5, 8);

		assertArrayEquals(ordered, array);
	}

}