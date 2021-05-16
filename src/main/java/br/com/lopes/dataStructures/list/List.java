package br.com.lopes.dataStructures.list;

import br.com.lopes.dataStructures.interfaces.Listable;
import br.com.lopes.dataStructures.services.ElementFinderService;
import br.com.lopes.dataStructures.services.IndexValidatorService;

public abstract class List implements Listable {
	protected Integer[] elements = new Integer[0];
	
	protected void validateIndex(Integer index) {
		new IndexValidatorService(elements, index);
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
		validateIndex(index);
		return elements[index];
	}
}
