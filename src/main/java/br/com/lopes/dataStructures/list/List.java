package br.com.lopes.dataStructures.list;

import br.com.lopes.dataStrctures.utils.Array;
import br.com.lopes.dataStructures.interfaces.Listable;
import br.com.lopes.dataStructures.services.ElementFinderService;
import br.com.lopes.dataStructures.services.IndexValidatorService;

public abstract class List implements Listable {
	protected Integer[] elements = new Integer[0];
	
	@Override
	public void add(Integer value) {
		this.elements = Array.increaseSize(elements);
		this.elements[this.size() - 1] = value;
	}
	
	@Override
	public boolean contains(Integer value) {
		return new ElementFinderService(elements, value).call();
	}
	
	@Override
	public Integer size() {
		return elements.length;
	}
	
	@Override
	public Integer get(Integer index) {
		isIndexValid(index);
		return elements[index];
	}
	
	@Override
	public Integer first() {
		return getValue(0);
	}
	
	@Override
	public Integer last() {
		return getValue(elements.length - 1);
	}
	
	private Integer getValue(Integer index) {
		if (elements.length == 0) 
			return null;
		else
			return elements[index];
	}
		
	/*
	 * Check if received index exist on elements array, if it doesn't raise an exception.
	 * 
	 * @param index: index which supposedly exists on elements array.
	 * 
	 * @throws IndexOutOfBounds when received index is bigger than elements size.
	 * @throws IndexOutOfBounds when received index is negative.
	 */
	protected void isIndexValid(Integer index) {
		new IndexValidatorService(elements, index).call();
	}
}
