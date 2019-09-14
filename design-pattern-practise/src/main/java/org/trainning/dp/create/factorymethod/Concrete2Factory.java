package org.trainning.dp.create.factorymethod;

public class Concrete2Factory implements AbstractFactory {

	public TV createTV() {
		return new F2TV();
	}

	public Computer createComputer() {
		return new Note2Computer();
	}

}
