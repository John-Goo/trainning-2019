package com.csii.pattern.create.factorymethod;

public class ChangHongTVfactory implements TVFactory {

	public TV getTV() {
		return new ChangHongTV();
	}

}
