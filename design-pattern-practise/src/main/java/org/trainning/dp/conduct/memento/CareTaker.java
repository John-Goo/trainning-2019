package org.trainning.dp.conduct.memento;

public class CareTaker {
	/*
	 * 专门用来管理备忘录对象的类
	 */
	TankWarMemento twm;
	public TankWarMemento getTwm() {
		return twm;
	}
 
	public void setTwm(TankWarMemento twm) {
		this.twm = twm;
	}
}
