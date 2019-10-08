package org.trainning.dp.conduct.template;

public class Test {

	public static void main(String[] args) {
		AbstractTemplate template = new Concrete1Template();
		template.show();
		template = new Concrete2Template();
		template.show();
		
	}

	
}
