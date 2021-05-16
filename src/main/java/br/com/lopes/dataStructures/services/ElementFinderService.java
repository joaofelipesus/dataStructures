package br.com.lopes.dataStructures.services;

public class ElementFinderService {
	private Integer[] array;
	private Integer value;
	
	public ElementFinderService(Integer[] array, Integer value) {
		this.array = array;
		this.value = value;
	}
	
	/*
	 * Search an array for a specific value.
	 * 
	 * @param array -> array which will be searched.
	 * @param -> value searched
	 * 
	 * @return boolean -> returns true when element exist on array,
	 * and return false when element doesn't exist on array.
	 * 
	 */
	public boolean call() {
		for(int index = 0; index < this.array.length; index++) {
			if (this.array[index].equals(value))
				return true;
		}
		return false;
	}
	
}
