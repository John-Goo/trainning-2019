package org.trainning.dp.create.singleton;

public class XSingleton {

	private static XSingleton xSingleton;

	// 闭合
	private XSingleton() {
	}

	public static XSingleton instance() {
		if (xSingleton == null) {
			// 防止多线程并发
			synchronized (XSingleton.class) {
				if (xSingleton == null) {
					xSingleton = new XSingleton();
				}
			}
		}
		return xSingleton;
	}
	
	public void print() {
		System.out.println("&："+xSingleton+" ,Singleton Method ---> print()");
	}

}
