package org.trainning.dp.create.builder;

public class WomanBuilder implements PersonBuilder {
	
	private WomanPerson person;
	
	public WomanBuilder() {
		person = new WomanPerson();
	}

	public void buildBody() {
		person.setBody("(1)--->[woman]组装body part.");
	}

	public void buildHead() {
		person.setHead("(2)--->[woman]组装head part.");
		
	}

	public void buildFoot() {
		person.setFoot("(3)--->[woman]组装foot part.");
	}

	public Person buildPerson() {
		return person;
	}


}
