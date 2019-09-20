package org.trainning.dp.conduct.command;

public class Client {

	public static void main(String[] args) {
		Command command  = new ConcreteComand(new Receiver());
		Invoke invoke = new Invoke(command);
		invoke.execute();
		
	}

}
