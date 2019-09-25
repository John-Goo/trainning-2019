package org.trainning.dp.conduct.command;

public class Invoke {
	
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void execute() {
		command.execute();
	}
	

}
