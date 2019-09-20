package org.trainning.dp.conduct.command;

public class ConcreteComand extends Command {

	public ConcreteComand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		System.out.println("==执行具体的命令 ");
		receiver.receive();
	}

}
