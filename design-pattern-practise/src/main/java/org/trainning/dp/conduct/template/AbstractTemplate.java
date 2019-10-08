package org.trainning.dp.conduct.template;

public abstract class AbstractTemplate {
	
	protected abstract void  print();
	
	public void show() {
		for(int i=0;i<10;i++) {
			print();
		}
		
	}

}
