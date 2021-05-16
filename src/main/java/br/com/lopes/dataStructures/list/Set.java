package br.com.lopes.dataStructures.list;

import br.com.lopes.dataStrctures.utils.Array;
import br.com.lopes.dataStrctures.utils.BubbleSort;
import br.com.lopes.dataStructures.services.IndexValidatorService;

public class Set extends List {
	
	@Override
	public void add(Integer value) {
		if (!contains(value)) {
			this.elements = Array.increaseSize(elements);
			this.elements[this.size() - 1] = value;
			this.elements = new BubbleSort(elements).sort();
		}
	}

	@Override
	public void remove(Integer index) {
		new IndexValidatorService(elements, index);
		elements[index] = null;
		elements = Array.decreaseSize(elements);
	}

	@Override
	public Integer first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer last() {
		// TODO Auto-generated method stub
		return null;
	}

}
