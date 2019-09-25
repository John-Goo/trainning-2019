package org.trainning.dp.conduct.iterator;

public interface AbstractIterator<T> {
	
	T first();
	T next();
	T last();
	boolean hasNext();

}
