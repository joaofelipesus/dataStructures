package br.com.lopes.dataStrctures.utils;

public class Array {
	
	/*
	 * Return a copy of the received array with one extra spot.
	 * 
	 * @return an array with one extra spot with null value;
	 * 
	 */
	public static Integer[] increase(Integer[] array) {
		Integer length = array.length;
		Integer[] increasedSizeArray = new Integer[length + 1];
		for(int index = 0; index < length; index++) {
			increasedSizeArray[index] = array[index];
		}
		return increasedSizeArray;
	}
}
