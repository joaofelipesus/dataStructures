package br.com.lopes.dataStructures.utils;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.lopes.dataStrctures.utils.Array;

public class ArrayTest {
	@Test
	public void increase_element_in_a_empty_array() {
		Integer[] array = new Integer[0];
		Integer[] increasedSizeArray = Array.increaseSize(array);
		assertEquals(increasedSizeArray.length, array.length + 1);
	}
	
	@Test
	public void increse_array_with_elements() {
		Integer[] array = new Integer[] { 1, 2, 3, 4, 5 };
		Integer[] increasedSizeArray = Array.increaseSize(array);
		assertArrayEquals(increasedSizeArray, new Integer[] { 1, 2, 3, 4, 5, null });
	}
	
	@Test
	public void return_an_empty_array_when_decrease_an_array_with_one_value() {
		Integer[] array = new Integer[] { null };
		assertArrayEquals(Array.decreaseSize(array), new Integer[0]);
	}
	
	@Test
	public void when_decreasing_an_array_with_zero_elements() {
		Integer[] emptyArray = new Integer[0];
		Integer[] decreasedSizeArray = Array.decreaseSize(emptyArray);
		assertArrayEquals(decreasedSizeArray, emptyArray);
	}
	
	@Test
	public void when_removing_first_element() {
		Integer[] array = new Integer[] { null, 42, 51 };
		Integer[] decreasedSizeArray = Array.decreaseSize(array);
		assertArrayEquals(decreasedSizeArray, new Integer[] { 42, 51 });
	}
	
	@Test
	public void when_removing_last_element() {
		Integer[] array = new Integer[] { 42, 51, null };
		Integer[] decreasedSizeArray = Array.decreaseSize(array);
		assertArrayEquals(decreasedSizeArray, new Integer[] { 42, 51 });
	}
	
	@Test
	public void when_removing_element_which_isnt_first_nor_last() {
		Integer[] array = new Integer[] { 42, null, 51 };
		Integer[] decreasedSizeArray = Array.decreaseSize(array);
		assertArrayEquals(decreasedSizeArray, new Integer[] { 42, 51 });
	}
}
