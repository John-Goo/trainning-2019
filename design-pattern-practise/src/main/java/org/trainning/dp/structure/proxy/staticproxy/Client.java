package org.trainning.dp.structure.proxy.staticproxy;

public class Client {

	public static void main(String[] args) {
		
		ProxyObject proxy = new ProxyObject(new TargetObjectImpl());
		proxy.execute();
		
		proxy = new ProxyObject(new UserTagetObjectImpl());
		proxy.execute();
		
	}

}
