package com.csii.pattern.create.abstractfactory;

public class F1TV implements TV {

	public void open() {
		System.out.println("F1TV：具体产品-->打开");
	}

	public void close() {
		System.out.println("F1TV：具体产品-->关闭");
		
	}

}
