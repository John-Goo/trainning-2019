package org.trainning.dp.structure.proxy.staticproxy;

public class TargetObjectImpl implements TargetObject {

	@Override
	public void action() {
		System.out.println("【TargetObjectImpl】--- 执行了目标对象-");
	}

}
