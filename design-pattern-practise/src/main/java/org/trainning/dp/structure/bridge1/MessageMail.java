package org.trainning.dp.structure.bridge1;

public class MessageMail implements MessageImplementor {

	public void send(String message, String toUser) {
		System.out.println(" 发送邮件操作---> "+message);
	}

}
