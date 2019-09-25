package org.trainning.dp.conduct.iterator;

public interface AbstractAggregate<T> {
	
	AbstractIterator iterator();
	
	T get(int index);
	
	int size();
	
	void add(T t);

	
}
