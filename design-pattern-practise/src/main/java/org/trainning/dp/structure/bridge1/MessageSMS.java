package org.trainning.dp.structure.bridge1;

public class MessageSMS implements MessageImplementor {

	public void send(String message, String toUser) {
		System.out.println(" 发送短信操作---> "+message);
	}

}
