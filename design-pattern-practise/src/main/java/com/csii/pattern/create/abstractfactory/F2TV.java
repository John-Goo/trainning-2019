package com.csii.pattern.create.abstractfactory;

public class F2TV implements TV {
	public void open() {
		System.out.println("F2TV：具体产品-->打开");
	}

	public void close() {
		System.out.println("F2TV：具体产品-->关闭");
		
	}
}
