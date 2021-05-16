package br.com.lopes.dataStructures.list;

import br.com.lopes.dataStrctures.utils.BubbleSort;
import br.com.lopes.dataStructures.services.IncreaseArraySizeService;

public class Set extends List {
	
	@Override
	public void add(Integer value) {
		if (!contains(value)) {
			this.elements = new IncreaseArraySizeService(elements).call();
			this.elements[this.size() - 1] = value;
			this.elements = new BubbleSort(elements).sort();
		}
	}

	@Override
	public void remove(Integer index) {
		// TODO Auto-generated method stub
		
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
