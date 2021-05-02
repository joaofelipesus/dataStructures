package br.com.lopes.dataStructures.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import br.com.lopes.dataStructures.list.List;

public class ListTest {
	private List list;
	
	@Before
	public void before() {
		this.list = new List();
	}
	
	@Test
	public void addElementWillIncreaseListSize() {
		list.add(1);
		assertEquals(list.size(), Integer.valueOf(1));
	}
	
	@Test
	public void addElementToAListWhichAlreadyHaveOneElement() {
		list.add(1);
		list.add(2);
		assertEquals(list.size(), Integer.valueOf(2));
	}
	
	@Test
	public void checkIfSizeOfAnEmptyListIsZero() {
		assertEquals(list.size(), Integer.valueOf(0));
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
	public void returnFalseWhenElementDoesntMatchWithAnyElement() {
		list.add(2);
		assertFalse(list.contains(42));
	}
	
	@Test
	public void returnsFalseWhenSearchigAnEmptyList() {
		assertFalse(list.contains(42));
	}
	
	@Test
	public void returnsTrueWhenElementReceivedDoExistOnArray() {
		list.add(42);
		assertTrue(list.contains(42));
	}
	
	@Test
	public void returnsTruewhenElementExistInAListWithManyElements() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		assertTrue(list.contains(3));
	}
	
	@Test
	public void returnsAnEmptyArrayWhenTryToSortAnEmptyList() {
		Integer[] sortedValues = new Integer[0];
		assertArrayEquals(list.sort(), sortedValues);
	}
	
	@Test
	public void whenListHasOnlyOneValues() {
		list.add(1);
		Integer[] sortedValues = new Integer[] { 1 };
		assertArrayEquals(list.sort(), sortedValues);
	}
	
	@Test
	public void whenListHasOddTwoValues() {
		list.add(3);
		list.add(1);
		Integer[] sortedValues = new Integer[] { 1, 3 };
		assertArrayEquals(list.sort(), sortedValues);
	}
	
	@Test
	public void whenAllValuesAreEquals() {
		list.add(1);
		list.add(1);
		list.add(1);
		Integer[] sortedValues = new Integer[] { 1, 1, 1 };
		assertArrayEquals(list.sort(), sortedValues);
	}
	
	@Test
	public void whenListHasEvenValues() {
		list.add(5);
		list.add(1);
		list.add(3);
		Integer[] sortedValues = new Integer[] { 1, 3, 5 };
		assertArrayEquals(list.sort(), sortedValues);
	}
}
