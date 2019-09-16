package org.trainning.dp.structure.bridge1;

public class Client {

	public static void main(String[] args) {
		
		/**
		 * 发送邮件流程
		 */
		MessageImplementor smsImplementor = new MessageSMS();
		MessageAbstract messageAbstract = new CommonMessage(smsImplementor);
		messageAbstract.sendMessage("测试普通邮箱", "john@hotmail.com");
		
		messageAbstract = new UrgencyMessage(smsImplementor);
		messageAbstract.sendMessage("紧急邮箱测试", "");
		/**
		 * 发送短信流程
		 */
		MessageImplementor mailImplementor = new MessageMail();
		
		MessageAbstract mailMessageAbstract = new CommonMessage(mailImplementor);
		mailMessageAbstract.sendMessage("发送邮件消息", "");
		
		
		
	}

}
