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
}
