package org.trainning.dp.structure.proxy.staticproxy;

public class ProxyObject {
	
	//代理对象接口
	protected TargetObject target;
	
	public  ProxyObject(TargetObject target) {
		this.target = target;
	}
	
	public void execute() {
		System.out.println("---- 被代理执行之前");
		target.action();
		System.out.println("-----被代理执行之后");
	}

}
