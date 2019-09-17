package org.trainning.dp.structure.facade;

public class Facade {
	
	private ServiceA serviceA;
	private ServiceB serviceB;
	private ServiceC serviceC;
	
	public Facade() {
		serviceA = new ServiceAImpl();
		serviceB = new ServiceBImpl();
		serviceC = new ServiceCImpl();
	}
	
	
	public void service() {
		serviceA.methodA();
		serviceB.methodB();
		serviceC.methodC();
	}
	

}
