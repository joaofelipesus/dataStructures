package br.com.lopes.dataStructures.list;

import br.com.lopes.dataStrctures.utils.Array;
import br.com.lopes.dataStrctures.utils.BubbleSort;
import br.com.lopes.dataStructures.services.IndexValidatorService;

public class Set extends List {
	
	@Override
	public void add(Integer value) {
		if (!contains(value)) {
			super.add(value);
			this.elements = new BubbleSort(elements).sort();
		}
	}

	@Override
	public void remove(Integer index) {
		new IndexValidatorService(elements, index);
		elements[index] = null;
		elements = Array.decreaseSize(elements);
	}
}
