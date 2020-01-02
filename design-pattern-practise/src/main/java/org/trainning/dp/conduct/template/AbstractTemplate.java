package org.trainning.dp.conduct.template;

public abstract class AbstractTemplate {
	
	/**
	 * 具体实现算法（行为）
	 */
	protected abstract void  print();
	
	/**
	 * 规则流程约束
	 */
	public final void show() {
		for(int i=0;i<10;i++) {
			print();
		}
		
	}

}
