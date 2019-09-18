package org.trainning.dp.structure.proxy.dynproxy;

public class Client {

	public static void main(String[] args) {
		LogHandler logHandler = new LogHandler();
		UserManager userManager = (UserManager) logHandler.newProxyInstance(new UserManagerImpl());
		String name = userManager.findUser("0003");
		System.out.println("=========" + name);

	}

}
