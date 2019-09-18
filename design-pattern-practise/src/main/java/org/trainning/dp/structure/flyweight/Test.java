package org.trainning.dp.structure.flyweight;

public class Test {

	public static void main(String[] args) {
		FlyWeight fly1 = FlyWeightFactory.getFlyWeight("a");
		fly1.perform("1");
		FlyWeight fly2 = FlyWeightFactory.getFlyWeight("a");
		System.out.println(fly1 == fly2);
		FlyWeight fly3 = FlyWeightFactory.getFlyWeight("b");
		fly3.perform("2");
		FlyWeight fly4 = FlyWeightFactory.getFlyWeight("c");
		fly4.perform("3");
		FlyWeight fly5 = FlyWeightFactory.getFlyWeight("d");
		fly4.perform("4");
		System.out.println("=======>工厂存储对象数："+FlyWeightFactory.factorySize());
	}

}
