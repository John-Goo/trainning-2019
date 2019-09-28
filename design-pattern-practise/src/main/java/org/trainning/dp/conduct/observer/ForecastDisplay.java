package org.trainning.dp.conduct.observer;

public class ForecastDisplay extends Observer implements DisplayElement {

	public ForecastDisplay(Subject subject) {
		super(subject);
	}

	@Override
	public void display() {
		this.temperature = temperature;
		this.humidity = humidity;
		this.airpressure = airpressure;
		this.display();

	}

	@Override
	public void update(float temperature, float humidity, float airpressure) {
		System.out.println("气温：" + this.temperature + "\t" + "湿度：" + this.humidity + "\t" + "气压：" + this.airpressure);

	}

}
