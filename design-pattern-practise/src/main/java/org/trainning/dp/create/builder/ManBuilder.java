package org.trainning.dp.create.builder;

public class ManBuilder implements PersonBuilder {
	
	private ManPerson person;
	
	public ManBuilder() {
		person = new ManPerson();
	}

	public void buildBody() {
		person.setBody("(1)--->[man]组装body part.");
	}

	public void buildHead() {
		person.setHead("(2)--->[man]组装head part.");
		
	}

	public void buildFoot() {
		person.setFoot("(3)--->[man]组装foot part.");
	}

	public Person buildPerson() {
		return person;
	}

}
