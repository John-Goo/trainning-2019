package org.trainning.dp.structure.bridge1;

public abstract class MessageAbstract {
	
	private MessageImplementor implementor;
	
	public MessageAbstract(MessageImplementor implementor) {
		this.implementor = implementor;
	}
	
	public void sendMessage(String message,String toUser) {
		this.implementor.send(message, toUser);
	}
	
	

	

}
