package br.com.lopes.dataStructures.services;

public class IncreaseArraySizeService {
	private Integer[] array;
	private Integer length;
	
	public IncreaseArraySizeService(Integer[] array) {
		this.array = array;
		this.length = array.length;
		
	}
	
	/*
	 * Return a copy of the received array with one extra spot.
	 * 
	 * @return an array with one extra spot with null value;
	 * 
	 */
	public Integer[] call() {
		Integer[] increasedSizeArray = new Integer[length + 1];
		for(int index = 0; index < length; index++) {
			increasedSizeArray[index] = array[index];
		}
		return increasedSizeArray;
	}
	
}
