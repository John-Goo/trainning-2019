package org.trainning.dp.conduct.observer;

public class WeatherReporter {
	public static void main(String[] args) throws InterruptedException {
		//被观察者
		WeatherDataSubject weatherData = new WeatherDataSubject();
		
		//观察者对象
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		weatherData.setMeasurements(80, 85, 90);
		Thread.sleep(5*1000);
		System.out.println("------------------");
		weatherData.setMeasurements(30, 40, 50);
		
	}
   

}
