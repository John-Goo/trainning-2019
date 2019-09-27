package org.trainning.dp.conduct.memento;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		// 初始化坦克状态
		TankWarOriginator two = new TankWarOriginator(5, "双发炮弹");
		CareTaker ct = new CareTaker();
		two.getCurrentState();
		ct.setTwm(two.createMemento());// 管理者创建备份
		two.play();
		two.restore(ct.getTwm());// 恢复备份
		two.getCurrentState();

	}

}
