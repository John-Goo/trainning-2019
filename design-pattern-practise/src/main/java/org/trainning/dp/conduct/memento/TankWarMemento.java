package org.trainning.dp.conduct.memento;

public class TankWarMemento {
	/*
	 * 可以看出这是发起人里面状态的复制版
	 * 因此可以存储需要备份的状态
	 */
	int life;
	String state;
	
	
	public TankWarMemento(int life,String state) {
		this.life=life;
		this.state=state;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
