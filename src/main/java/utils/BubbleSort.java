package utils;


public class BubbleSort {
	private Integer[] elements;
	private Integer size;
	
	public BubbleSort(Integer[] elements) {
		this.elements = elements;
		this.size = elements.length;
	}
	
	/*
	 * Run bubble sort algorithm on array received.
	 * 
	 * @return array elements sorted.
	 * 
	 */
	public Integer[] sort() {
		for(int iteration = 0; iteration < this.size; iteration++) {
			sortValue(iteration);
		}
		return elements;
	}	
	
	/*
	 * Run an iteration to sort a single value.
	 * 
	 * @param iteration: value used as reference to iterate on values array.
	 * 
	 */
	private void sortValue(Integer iteration) {
		for(int index = 0; index < (this.size - iteration - 1); index++) {
			int currentValue = elements[index];
			int nextValue = elements[index + 1];
			if (currentValue > nextValue) {
				switchValues(index);
			}
		}
	}
	
	/*
	 * Change values, set value from index i on i + 1 and value from index i + 1
	 * on i.
	 * 
	 * @param index: index used as reference to switch values.
	 * 
	 */
	private void switchValues(Integer index) {
		int temporary = elements[index];
		elements[index] = elements[index + 1];
		elements[index + 1] = temporary;
	}
	
}
