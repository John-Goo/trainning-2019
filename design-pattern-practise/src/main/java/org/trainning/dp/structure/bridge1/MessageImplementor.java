package org.trainning.dp.structure.bridge1;

public interface MessageImplementor {
	
	/**
	 * 
	 * 抽象发送接口
	 * 
	 * @param message
	 * @param toUser
	 */
	public  void send(String message,String toUser);

}
