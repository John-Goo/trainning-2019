package org.trainning.dp.conduct.visitor;

public class VisitorB implements Visitor {
	
	
	
	String name;
	
	
	

	public VisitorB(String name) {
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
	public void visitConcreteElementA(ConcreteElementA A) {
		 System.out.println(this.getName()+"尝试研究"+A.getName());
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB B) {
		 System.out.println(this.getName()+"尝试研究"+B.getName());

	}

}
