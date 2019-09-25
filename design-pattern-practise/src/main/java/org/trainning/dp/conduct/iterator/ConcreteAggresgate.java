package org.trainning.dp.conduct.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggresgate<T> implements AbstractAggregate<T> {
	
	private List<T> list;;

	private int index;
	
	private int size;
	
    public ConcreteAggresgate() {
    	this.index = 0;
    	this.size = 0;
    	list = new ArrayList<T>();
	}

	@Override
	public AbstractIterator iterator() {
		return new ConcreteIterator(this);
	}

	@Override
	public T get(int index) {
		this.index++;
		return list.get(index++);
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public void add(T t) {
		list.add(t);
	}

}
