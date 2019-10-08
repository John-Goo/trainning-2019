package org.trainning.dp.conduct.strategy;

public class Concrete1Strategy extends AbstractStrategy {

	@Override
	public void algorithm1() {
		System.out.println("[Concrete1Strategy--> algorithm1] 調用了算法接口");

	}

	@Override
	public void algorithm2() {
		System.out.println("[Concrete1Strategy--> algorithm2] 調用了算法接口");

	}

	@Override
	public void algorithm3() {
		System.out.println("[Concrete1Strategy--> algorithm3] 調用了算法接口");

	}

}
