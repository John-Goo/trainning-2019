package org.trainning.dp.structure.decorator;

public class ConcreteComponent implements Component {

	@Override
	public void sampleOperation(String id) {
		System.out.println("----组件实现接口-------");
	}

}
