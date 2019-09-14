package com.csii.pattern.create.factorymethod;

public class KangJiaTVfactory implements TVFactory {

	public TV getTV() {
		// 可以从SpringUtil里面获得所需要BEAN
		// SpringUtil.getBean("");
		return new KangJiaTV();
	}

}
