package org.trainning.dp.structure.decorator;

public class ConcreteDecorate2 extends Decorator {

	public ConcreteDecorate2(Component component) {
		super(component);
	}

	@Override
	public void sampleOperation(String id) {
		// 实现额外的职责部分
		System.out.println("***实现额外的职责部分 -- 上部分******");
		super.sampleOperation(id);
		// 实现额外的职责部分
		System.out.println("***实现额外的职责部分 -- 下部分******");
	}
	
	

}
