package com.csii.pattern.create.factorymethod;

public class DriverTest {

	public static void main(String[] args) {
		 // 实例工厂
		TVFactory tv = new ChangHongTVfactory();
		tv.getTV().open();
		tv.getTV().close();
		System.out.println("-------------------------");
		TVFactory tv1 = new KangJiaTVfactory();
		tv1.getTV().open();
		tv1.getTV().close();// 工厂-->产品 concrete product 
		
	}

}
