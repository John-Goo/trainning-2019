package org.trainning.dp.conduct.strategy;

public class Test {

	public static void main(String[] args) {
		System.out.println(" 算法包裝類-Concrete1Strategy--------------");
		Context c1 = new Context(new Concrete1Strategy());
		c1.getStrategy().algorithm2();
		System.out.println(" 算法包裝類-Concrete2Strategy--------------");
		Context c2 = new Context(new Concrete2Strategy());
		c2.getStrategy().algorithm3();
		
	}

}
