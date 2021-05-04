package br.com.lopes.dataStructures.stack;

public class Stack {
	private Integer[] elements = new Integer[0];
	
	/*
	 * Adds a new element to the top of the stack.
	 * 
	 * @param value places on top on the stack
	 */
	public void push(Integer value) {
		increateArraySize();
		this.elements[headIndex()] = value;
	}
	
	/*
	 * Return element from top and remove it.
	 * 
	 * @throws IndexOutOfBoundsException when stack doesn't have any element
	 */
	public Integer pop() {
		containsValues();
		Integer element = this.elements[headIndex()];
		removeTopElementAndResize();
		return element;
	}
	
	/*
	 * Check if stack contains element
	 * 
	 * @returns boolean: return true if stack have at least one element otherwise 
	 * return false.
	 */
	public boolean isEmpty() {
		return this.elements.length == 0;
	}
	
	/*
	 * Return stack top element.
	 * 
	 * @return Integer value from stack top element.
	 * 
	 * @throws IndexOutOfBoundsException when stack doesn't have any element
	 */
	public Integer getTop() {
		containsValues();
		return this.elements[headIndex()];
	}
	
	/*
	 * Increase current elements array, and set this.elements an array
	 * with an extra empty position.
	 * 
	 */
	private void increateArraySize() {
		Integer currentLenght = this.elements.length;
		Integer[] increasedSizeArray = new Integer[currentLenght + 1];
		for(int index = 0; index < currentLenght; index++) {
			increasedSizeArray[index] = this.elements[index];
		}
		this.elements = increasedSizeArray;
	}
	
	/*
	 * Check if stack is empty and can't make operation.
	 */
	private void containsValues() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Empty stack.");
		}
	}
	
	/*
	 * Remove head element and decrease elements array size
	 */
	private void removeTopElementAndResize() {
		Integer[] resizedElements = new Integer[this.elements.length - 1];
		this.elements[headIndex()] = null;
		Integer index = 0;
		for(Integer value : this.elements) {
			if(value != null) {
				resizedElements[index] = value;
				index += 1;
			}
		}
		this.elements = resizedElements;
	}
	
	private Integer headIndex() {
		return this.elements.length - 1;
	}
}
