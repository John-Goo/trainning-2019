package org.trainning.dp.conduct.observer;

public class WeatherDataSubject extends Subject {
	
	  //温度
    private float temperature;
    //湿度
    private float humidity;
    //气压
    private float airpressure;

	
    /**
     * 添加指定观察者对象
     * @param observer
     */
    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    /**
     * 删除指定观察者对象
     * @param observer
     */
    @Override
    public void deleteObserver(Observer observer) {
        int i;
        if((i = observerList.indexOf(observer)) != -1) {
            this.observerList.remove(i);
        }
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObservers() {
        for(Observer observer : this.observerList) {
            observer.update(this.temperature, this.humidity, this.airpressure);
        }
    }

    /**
     * 被观察者数据发生改变
     * @param temperature
     * @param humidity
     * @param airpressure
     */
    public void setMeasurements(float temperature, float humidity, float airpressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.airpressure = airpressure;
        this.measurementsChanged();
    }

    /**
     * 修改后，通知观察者
     */
    public void measurementsChanged() {
        this.notifyObservers();
    }

}
