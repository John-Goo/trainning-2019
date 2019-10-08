package org.trainning.dp.conduct.strategy;

public class Context {
	
	AbstractStrategy strategy;

	public Context(AbstractStrategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	
	public AbstractStrategy getStrategy() {
		return strategy;
	}
	
	
	public void doMethod() {
		strategy.algorithm1();
		strategy.algorithm2();
		strategy.algorithm3();
	}
	
	
	

}
