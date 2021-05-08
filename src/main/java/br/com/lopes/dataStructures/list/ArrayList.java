package br.com.lopes.dataStructures.list;

import br.com.lopes.dataStrctures.utils.BubbleSort;
import br.com.lopes.dataStructures.services.ElementFinderService;

public class ArrayList {
	private Integer[] elements = new Integer[0];
	private Integer size = 0;
	
	/*
	 * Adds a value on the end of the list.
	 * 
	 * @param value integer value that will be added on the list
	 * */
	public void add(Integer value) {
		increateArraySize();
		this.elements[size] = value;
		increaseSize();
	}
	
	/*
	 * Return element of received index.
	 * 
	 * @param index: index used to get element.
	 * 
	 * @return Integer: value from index received.
	 * 
	 * @throws IndexOutOfBounds when received index is bigger than elements size.
	 * @throws IndexOutOfBounds when list doesn't have any element.
	 */
	public Integer get(Integer index) {
		listHasElements();
		isIndexValid(index);
		
		return this.elements[index];
	}
	
	public Integer size() {
		return size;
	}
	
	/*
	 * Check if any element from list matches with received value
	 * 
	 * @param value: value used to iterate on list and check if it exists
	 * 
	 * @return true if element is present on list or false case it doesn't.
	 * 
	 */
	public boolean contains(Integer value) {
		return new ElementFinderService(elements, value).call();
	}
	
	/*
	 * Sort elements
	 * 
	 * @return an array with elements sorted
	 * 
	 */
	public Integer[] sort() {
		return new BubbleSort(this.elements).sort();
	}
	
	/*
	 * Remove element from the list.
	 * 
	 * @param index: position which will be removed
	 * 
	 * @throws IndexOutOfBoundsException when received index is bigger than list
	 * @throws IndexOutOfBoundsException when received index is negative
	 * 
	 */
	public void remove(Integer index) {
		isIndexValid(index);
		decreaseSize();
		this.elements[index] = null;
		this.elements = removeNilElements(this.elements);		
	}
	
	/*
	 * Remove null elements from a array and return a smaller array
	 * 
	 * @param elements: array of Integer values with at least one null value.
	 * 
	 * @return an array with all values which isn't null. 
	 */
	private Integer[] removeNilElements(Integer[] elements) {
		Integer[] array = new Integer[this.size];
		Integer index = 0;
		for(Integer value : elements) {
			if(value != null) {
				array[index] = value;
				index += 1;
			}
		}
		return array;
	}
	
	/*
	 * Increase current elements array, and set this.elements an array
	 * with an extra empty position.
	 * 
	 */
	private void increateArraySize() {
		Integer[] increasedSizeArray = new Integer[this.size + 1];
		for(int index = 0; index < this.size; index++) {
			increasedSizeArray[index] = this.elements[index];
		}
		this.elements = increasedSizeArray;
	}
	
	/*
	 * Increase size attribute
	 */
	private void increaseSize() {
		this.size += 1;
	}
	
	private void decreaseSize() {
		this.size -= 1;
	}
	
	/*
	 * Check if received index exist on elements array.
	 * 
	 * @param index: index which supposedly exists on elements array.
	 * 
	 * @throws IndexOutOfBounds when received index is bigger than elements size.
	 */
	private void isIndexValid(Integer index) {
		if (index < 0)
			throw new IndexOutOfBoundsException("Negative value received.");
		
		if (index > this.size)
			throw new IndexOutOfBoundsException("Index bigger than current elements size.");
	}
	
	/*
	 * Check if list doesn't have any element, used as a guard clause.
	 * 
	 * @throws IndexOutOfBounds when list is empty
	 */
	private void listHasElements() {
		if (this.size == 0)
			throw new IndexOutOfBoundsException("List doesn't have elements.");
	}
	
	public Integer[] getElements() {
		return elements;
	}
}
