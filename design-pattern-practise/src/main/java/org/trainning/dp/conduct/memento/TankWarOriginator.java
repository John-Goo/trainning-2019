package org.trainning.dp.conduct.memento;

public class TankWarOriginator {
	int life;//有几条命
	String state;//坦克装备
 
 	public TankWarOriginator(int life, String state) {
		this.life = life;
		this.state = state;
	}
 
	public void getCurrentState() {// 显示塔克当前状态
		System.out.println("剩余" + life + "条命，" + "炮弹状态为" + state);
	}
 
	/**
	 * 模拟玩家玩游戏，抛出异常是由于线程休眠的缘故，可以忽略
	 * 
	 * @throws InterruptedException
	 */
	public void play() throws InterruptedException {
		System.out.println("开始战斗.......");
		Thread.sleep(3000);
		life = life - 1;
		state = "单发炮弹";
		System.out.println("你被击中了,剩余" + life + "条命，" + "炮弹变为" + state);
	}
 
	/*
	 * 创建备份
	 */
	public TankWarMemento createMemento() throws InterruptedException {
		System.out.println("正在存储当前状态....");
		Thread.sleep(4000);
		TankWarMemento twm = new TankWarMemento(life, state);
		System.out.println("存储完成");
		return twm;
	}
 
	/*
	 * 恢复备份
	 */
	public void restore(TankWarMemento twm) throws InterruptedException {
		System.out.println("正在恢复存档....");
		life = twm.getLife();
		state = twm.getState();
		Thread.sleep(4000);
		System.out.println("恢复完成");
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
