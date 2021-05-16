package br.com.lopes.dataStructures.List;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.lopes.dataStructures.list.Set;

public class SetTest {
	private Set set;
	
	@Before
	public void beforeEach() {
		set = new Set();
	}

	@Test
	public void add_new_element_to_empty_set() {
		set.add(1);
		assertEquals(set.size(), Integer.valueOf(1));
	}
	
	@Test
	public void add_new_element_to_an_set_with_elements() {
		set.add(1);
		set.add(2);
		assertEquals(set.size(), Integer.valueOf(2));
	}
	
	@Test
	public void try_add_element_with_value_that_already_exists_on_set() {
		set.add(1);
		set.add(1);
		assertEquals(set.size(), Integer.valueOf(1));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void raises_exception_when_get_element_of_an_empty_set() {
		set.get(0);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void raises_exception_when_get_a_value_of_a_invalid_index() {
		set.add(1);
		set.get(42);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void raises_exception_when_receive_an_negative_index() {
		set.add(1);
		set.add(2);
		set.add(3);
		set.get(-1);
	}
	
	@Test
	public void get_value_from_a_valid_index() {
		set.add(1);
		set.add(2);
		set.add(3);
		Integer value = set.get(1);
		assertEquals(value, Integer.valueOf(2));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void remove_value_from_a_empty_set() {
		set.remove(1);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void remove_value_using_a_negative_index() {
		set.add(1);
		set.remove(-42);
	}
	
	@Test
	public void remove_element_from_a_set_with_elements() {
		set.add(1);
		set.add(2);
		set.add(3);
		set.remove(1);
		assertEquals(set.size(), Integer.valueOf(2));
		assertEquals(set.get(0), Integer.valueOf(1));
		assertEquals(set.get(1), Integer.valueOf(3));
	}
}





















