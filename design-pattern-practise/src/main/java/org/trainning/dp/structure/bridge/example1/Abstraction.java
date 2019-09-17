package org.trainning.dp.structure.bridge.example1;

public abstract class Abstraction {
	
	// 聚合-关联实现抽象
	private Implementor implementor;
	
	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}
	
	/**
	 * 执行操作者实现模式
	 */
	public void operation() {
		implementor.work();
	}
	
	

}
