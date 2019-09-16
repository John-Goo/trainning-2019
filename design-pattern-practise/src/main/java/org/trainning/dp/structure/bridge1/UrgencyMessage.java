package org.trainning.dp.structure.bridge1;

public class UrgencyMessage extends MessageAbstract {

	public UrgencyMessage(MessageImplementor implementor) {
		
		super(implementor);
	}
	
	
	@Override
	public void sendMessage(String message, String toUser) {
		System.out.println("发送了紧急邮件---");
	    super.sendMessage(message, toUser);
	}


	public String watch(String messageId) {
		return null;
	}

	

}
