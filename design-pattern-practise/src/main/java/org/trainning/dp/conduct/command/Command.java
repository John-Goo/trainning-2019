package org.trainning.dp.conduct.command;

public abstract class Command {
	
	protected Receiver receiver;
	
	public Command(Receiver receiver) {
		this.receiver = receiver;
	}
	
	
	public abstract void execute();

}
