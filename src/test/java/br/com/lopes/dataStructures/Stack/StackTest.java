package br.com.lopes.dataStructures.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.lopes.dataStructures.stack.Stack;

public class StackTest {
	private Stack stack;
	
	@Before
	public void beforeEach() {
		stack = new Stack();
	}
	
	@Test
	public void pushElementToAnEmptyStack() {
		stack.push(1);
		assertEquals(stack.getTop(), Integer.valueOf(1));
		assertFalse(stack.isEmpty());
	}
	
	@Test
	public void pushingAnElementToAStackWithElements() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(stack.getTop(), Integer.valueOf(3));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void popElementFromAnEmptyStack() {
		stack.pop();
	}
//	
	@Test
	public void popElementFromAListWithOnlyOneElement() {
		stack.push(1);
		Integer element = stack.pop();
		assertEquals(element, Integer.valueOf(1));
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void popElementFromAStackWithManyElements() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		Integer element = stack.pop();
		assertFalse(stack.isEmpty());
		assertEquals(element, Integer.valueOf(3));
		assertEquals(stack.getTop(), Integer.valueOf(2));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void getTopElementFromAnEmptyStack() {
		stack.getTop();
	}
}
