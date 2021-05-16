package br.com.lopes.dataStructures.services;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ElementFinderServiceTest {

	@Test
	public void it_returns_false_when_search_an_empty_array() {
		Integer[] array = new Integer[0];
		Integer element = 42;
		assertFalse(new ElementFinderService(array, element).call());
	}
	
	@Test
	public void returns_true_when_element_has_element() {
		Integer[] array = new Integer[] { 42 };
		Integer element = 42;
		assertTrue(new ElementFinderService(array, element).call());
	}
	
	@Test
	public void return_false_when_element_doesnt_exist_on_array() {
		Integer[] array = new Integer[] { 4, 8, 15 };
		Integer element = 42;
		assertFalse(new ElementFinderService(array, element).call());
	}
}
