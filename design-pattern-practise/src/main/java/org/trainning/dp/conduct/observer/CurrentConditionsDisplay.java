package org.trainning.dp.conduct.observer;

public class CurrentConditionsDisplay extends Observer implements DisplayElement {

	public CurrentConditionsDisplay(Subject subject) {
		super(subject);
	}

	@Override
	public void display() {
		System.out.println("气温：" + this.temperature + "\t" + "湿度：" + this.humidity + "\t" + "气压：" + this.airpressure);
		

	}

	@Override
	public void update(float temperature, float humidity, float airpressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.airpressure = airpressure;
		this.display();
	}

}
