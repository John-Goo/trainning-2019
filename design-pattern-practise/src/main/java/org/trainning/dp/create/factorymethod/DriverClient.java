package org.trainning.dp.create.factorymethod;

public class DriverClient {

	public static void main(String[] args) {
		/**
		 * 产品系列：一厂生产产品
		 */
		AbstractFactory f1 = new Concrete1Factory();
		TV tv1 = f1.createTV();
		tv1.open();
		tv1.close();
		Computer computer1 = f1.createComputer();
		computer1.open();
		computer1.close();
		/**
		 * 产品系列：二厂生产产品
		 */
		AbstractFactory f2 = new Concrete2Factory();
		TV tv2 = f2.createTV();
		tv2.open();
		tv2.close();
		Computer c2 = f2.createComputer();
		c2.open();
		c2.close();
		
		
		
	}

}
