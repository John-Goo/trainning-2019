package org.trainning.dp.conduct.iterator;

import java.util.List;

@SuppressWarnings("rawtypes")
public class ConcreteIterator<T> implements AbstractIterator{
	
	private AbstractAggregate<T> aggregate;
	
	private int index;
	
	public ConcreteIterator(AbstractAggregate<T> aggregate) {
		this.index=0;
		this.aggregate = aggregate;
	}

	@Override
	public T first() {
		return aggregate.get(0);
	}

	@Override
	public T next() {
		return aggregate.get(index++);
	}

	@Override
	public T last() {
		if(aggregate.size() <=0) {
			return null;
		}
		return aggregate.get(aggregate.size()-1);
	}

	@Override
	public boolean hasNext() {
		return index < aggregate.size();
	}

}
