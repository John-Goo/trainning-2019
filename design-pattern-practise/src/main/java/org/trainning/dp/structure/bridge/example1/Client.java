package org.trainning.dp.structure.bridge.example1;

public class Client {
	
	public static void main(String[] args) {
		Abstraction  abst = new RefineAbstraction(new ConcreteImpltor2());
		abst.operation();
	}

}
