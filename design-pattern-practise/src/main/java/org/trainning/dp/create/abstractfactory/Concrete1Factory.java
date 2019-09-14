package org.trainning.dp.create.abstractfactory;

public class Concrete1Factory implements AbstractFactory {

	public TV createTV() {
		return new F1TV();
	}

	public Computer createComputer() {
		return new Note1Computer();
	}

}
