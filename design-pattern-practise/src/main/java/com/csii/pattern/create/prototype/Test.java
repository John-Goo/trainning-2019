package com.csii.pattern.create.prototype;

public class Test {

	public static void main(String[] args) {
		Prototype p1 = new ConcreteProtype("John");
		Prototype p2 = (Prototype) p1.clone();
		p2.setName("Tom");
		System.out.println(p1.getName()+",	&addr:"+p1);
		System.out.println(p2.getName()+",	&addr:"+p2);
		

	}

}
