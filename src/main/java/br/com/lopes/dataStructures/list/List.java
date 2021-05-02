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
		
		Integer[] newElements = new Integer[this.size + 1];
		for(int index = 0; index < this.size; index++) {
			newElements[index] = this.elements[index];
		}
		newElements[size] = value;
		this.elements = newElements;
		this.size += 1;
	}
	
	public Integer size() {
		return size;
	}

}
