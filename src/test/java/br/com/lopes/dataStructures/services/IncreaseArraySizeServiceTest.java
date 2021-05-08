package br.com.lopes.dataStructures.services;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IncreaseArraySizeServiceTest {

	@Test
	public void increase_element_in_a_empty_array() {
		Integer[] array = new Integer[0];
		Integer[] increasedSizeArray = new IncreaseArraySizeService(array).call();
		assertEquals(increasedSizeArray.length, array.length + 1);
	}
	
	@Test
	public void increse_array_with_elements() {
		Integer[] array = new Integer[] { 1, 2, 3, 4, 5 };
		Integer[] increasedSizeArray = new IncreaseArraySizeService(array).call();
		assertArrayEquals(increasedSizeArray, new Integer[] { 1, 2, 3, 4, 5, null });
	}
}
