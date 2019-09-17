package org.trainning.dp.structure.decorator;

public class DriverTest {

	public static void main(String[] args) {
		Decorator d = new ConcreteDecorate1(new ConcreteComponent());
		d.sampleOperation("9000000000XXF");
		d = new ConcreteDecorate2(new ConcreteComponent());
		d.sampleOperation("0xfffffffffffffff");

	}

}
