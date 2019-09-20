package org.trainning.dp.conduct.command;

public class Invoke {
	
	private Command command;

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	
	public void execute() {
		command.execute();
	}
	

}
