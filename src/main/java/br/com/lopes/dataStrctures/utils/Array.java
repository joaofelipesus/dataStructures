package br.com.lopes.dataStrctures.utils;

public class Array {
	
	/*
	 * Return a copy of the received array with one extra spot.
	 * 
	 * @return an array with one extra spot with null value;
	 * 
	 */
	public static Integer[] increaseSize(Integer[] array) {
		Integer length = array.length;
		Integer[] increasedSizeArray = new Integer[length + 1];
		for(int index = 0; index < length; index++) {
			increasedSizeArray[index] = array[index];
		}
		return increasedSizeArray;
	}
	
	/*
	 * Remove null elements from a array and return a smaller array
	 * 
	 * @param elements: array of Integer values with at least one null value.
	 * 
	 * @return an array with all values which isn't null. 
	 *  
	 */
	public static Integer[] decreaseSize(Integer[] array) {
		if (array.length <= 1) {
			return new Integer[0];
		}
		Integer length = array.length;
		Integer[] decreasedSizeArray = new Integer[length - 1];
		Integer index = 0;
		for(Integer value : array) {
			if(value != null) {
				decreasedSizeArray[index] = value;
				index += 1;
			}
		}
		return decreasedSizeArray;
	}
}
