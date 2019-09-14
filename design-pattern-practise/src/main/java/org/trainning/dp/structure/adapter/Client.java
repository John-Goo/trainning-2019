package org.trainning.dp.structure.adapter;

public class Client {

	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());
		target.adapteeMethod();
		target.adapterMethod();
	}

}
