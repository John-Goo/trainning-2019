package org.trainning.dp.structure.decorator;

public abstract class Decorator implements Component {
	
	private Component component;
	
	
	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void sampleOperation(String id) {
		component.sampleOperation(id);
	}

}
