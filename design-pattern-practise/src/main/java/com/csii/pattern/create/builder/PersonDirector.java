package com.csii.pattern.create.builder;

public class PersonDirector {
	
	public Person constructPerson(PersonBuilder builder) {
		/**
		 * 执行步骤
		 */
		builder.buildBody();
		builder.buildHead();
		builder.buildFoot();
		return builder.buildPerson();
	}

}
