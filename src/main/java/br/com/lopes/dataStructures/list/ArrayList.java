package br.com.lopes.dataStructures.list;

import br.com.lopes.dataStrctures.utils.Array;
import br.com.lopes.dataStrctures.utils.BubbleSort;

public class ArrayList extends List {
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
	@Override
	public void remove(Integer index) {
		isIndexValid(index);
		elements[index] = null;
		elements = Array.decreaseSize(elements);
	}
	
	public Integer[] getElements() {
		return elements;
	}
}
