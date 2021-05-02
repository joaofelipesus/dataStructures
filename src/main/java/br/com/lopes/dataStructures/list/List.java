package br.com.lopes.dataStructures.list;

public class List {
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
	
	public Integer size() {
		return size;
	}
	
	/*
	 * Increase current elements array, and set this.elements an array
	 * with an extra empty position.
	 */
	private void increateArraySize() {
		Integer[] increasedSizeArray = new Integer[this.size + 1];
		for(int index = 0; index < this.size; index++) {
			increasedSizeArray[index] = this.elements[index];
		}
		this.elements = increasedSizeArray;
	}
	
	private void increaseSize() {
		this.size += 1;
	}

}
