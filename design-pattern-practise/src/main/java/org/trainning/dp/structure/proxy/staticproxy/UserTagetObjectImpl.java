package org.trainning.dp.structure.proxy.staticproxy;

public class UserTagetObjectImpl implements TargetObject {

	@Override
	public void action() {
		System.out.println("【UserTagetObjectImpl】--- 执行了目标对象-");
	}

}
