package br.com.lopes.dataStructures.List;

import static org.junit.Assert.assertEquals;
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
	public void addElementToAListWhichAlreadyHavOneElement() {
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
		list.get(51);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void itRaisesAnExceptionWhenIndexIsNegative() {
		list.add(1);
		list.get(-1);
	}
}

























