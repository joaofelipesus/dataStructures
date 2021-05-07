package br.com.lopes.dataStructures.utils;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import br.com.lopes.dataStrctures.utils.BubbleSort;

public class BubbleSortTest {
	private Integer[] values;
	
	@Test
	public void returnsAnEmptyArrayWhenTryToSortAnEmptyList() {
		Integer[] sortedValues = new Integer[0];
		values = new Integer[0];
		assertArrayEquals(new BubbleSort(values).sort(), sortedValues);
	}
	
	
	@Test
	public void whenListHasOnlyOneValues() {
		values = new Integer[] { 1 };
		Integer[] sortedValues = new Integer[] { 1 };
		assertArrayEquals(new BubbleSort(values).sort(), sortedValues);
	}
	
	@Test
	public void whenListHasOddTwoValues() {
		values = new Integer[] { 3, 1 };
		Integer[] sortedValues = new Integer[] { 1, 3 };
		assertArrayEquals(new BubbleSort(values).sort(), sortedValues);
	}
	
	@Test
	public void whenAllValuesAreEquals() {
		values = new Integer[] { 1, 1, 1};
		Integer[] sortedValues = new Integer[] { 1, 1, 1 };
		assertArrayEquals(new BubbleSort(values).sort(), sortedValues);
	}
	
	@Test
	public void whenListHasEvenValues() {
		values = new Integer[] { 5, 1, 3 };
		Integer[] sortedValues = new Integer[] { 1, 3, 5 };
		assertArrayEquals(new BubbleSort(values).sort(), sortedValues);
	}
}
