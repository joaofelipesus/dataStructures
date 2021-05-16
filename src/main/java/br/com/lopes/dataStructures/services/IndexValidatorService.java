package br.com.lopes.dataStructures.services;

public class IndexValidatorService {
	private Integer[] array;
	private Integer index;
	
	public IndexValidatorService(Integer[] array, Integer index) {
		super();
		this.array = array;
		this.index = index;
	}

	/*
	 * Check if received index exist on elements array.
	 * 
	 * @param index: index which supposedly exists on elements array.
	 * 
	 * @throws IndexOutOfBounds when received index is bigger than elements size.
	 * @throws IndexOutOfBounds when received index is negative.
	 * 
	 */
	public void call() {
		if (index < 0)
			throw new IndexOutOfBoundsException("Negative value received.");
		
		if (index > this.array.length)
			throw new IndexOutOfBoundsException("Index bigger than current elements size.");
	}
}
