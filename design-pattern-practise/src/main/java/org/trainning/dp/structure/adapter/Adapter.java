package org.trainning.dp.structure.adapter;

public class Adapter implements Target{
	
	// 引入被适配者
	private Adaptee adptee;
	
	

	public Adapter(Adaptee adptee) {
		super();
		this.adptee = adptee;
	}

	public void adapteeMethod() {
		adptee.adapteeMethod();
	}

	public void adapterMethod() {
		System.out.println(" I am adapter method!");
		
	}

}
