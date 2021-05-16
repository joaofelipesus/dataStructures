package br.com.lopes.dataStructures.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ListTest {
	private DummyListClass list;

	@Before
	public void before_each() {
		list = new DummyListClass();
	}

	@Test
	public void return_true_when_received_value_is_present_on_elements_array() {
		list.add(1);
		assertFalse(list.contains(42));
	}

	@Test
	public void return_false_when_received_value_isnt_present_on_elements_array() {
		list.add(42);
		assertTrue(list.contains(42));
	}

	@Test
	public void return_zero_when_structure_doesnt_have_any_element() {
		assertEquals(list.size(), Integer.valueOf(0));
	}

	@Test
	public void return_one_when_structure_have_only_one_element() {
		list.add(42);
		assertEquals(list.size(), Integer.valueOf(1));
	}

	@Test
	public void return_the_lenght_of_elements_when_structure_has_many_elements() {
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals(list.size(), Integer.valueOf(3));
	}

	@Test
	public void getElementFromAValidIndex() {
		this.list.add(1);
		assertEquals(list.get(0), Integer.valueOf(1));
	}

	@Test
	public void getElementFromAListWithManyElements() {
		this.list.add(1);
		this.list.add(2);
		this.list.add(3);
		assertEquals(list.get(2), Integer.valueOf(3));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void getElementFromAListWithoutElements() {
		list.get(0);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void getElementFromAListWithElementsButPassingAIndexInvalid() {
		list.add(1);
		list.add(2);
		list.get(42);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void itRaisesAnExceptionWhenIndexIsNegative() {
		list.add(1);
		list.get(-1);
	}

	@Test
	public void add_element_will_increase_list_size() {
		list.add(1);
		assertEquals(list.size(), Integer.valueOf(1));
	}

	@Test
	public void add_element_to_a_list_which_already_have_one_element() {
		list.add(1);
		list.add(2);
		assertEquals(list.size(), Integer.valueOf(2));
	}

	@Test
	public void return_null_when_call_first_of_a_empty_list() {
		assertNull(list.first());
	}

	@Test
	public void return_an_integer_when_call_first_of_a_list_with_elements() {
		list.add(42);
		list.add(26);
		assertEquals(list.first(), Integer.valueOf(42));
	}

	@Test
	public void return_null_when_call_last_of_a_empty_list() {
		assertNull(list.last());
	}

	@Test
	public void return_an_integer_when_call_last_of_a_list_with_elements() {
		list.add(42);
		list.add(26);
		list.add(12);
		assertEquals(list.last(), Integer.valueOf(12));
	}

}
