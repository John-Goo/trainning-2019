package org.trainning.dp.conduct.visitor;

public class ConcreteElementA implements Element{
	
	String name;
	
	
	
	

	public ConcreteElementA(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}
	
	

}
