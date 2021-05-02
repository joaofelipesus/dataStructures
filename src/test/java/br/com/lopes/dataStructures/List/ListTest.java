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
}
