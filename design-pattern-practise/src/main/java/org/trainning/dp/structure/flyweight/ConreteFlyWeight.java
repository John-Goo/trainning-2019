package org.trainning.dp.structure.flyweight;

public class ConreteFlyWeight implements FlyWeight {

	@Override
	public void perform(String action) {
		System.out.println("参数值: " + action);
	}
	

}
