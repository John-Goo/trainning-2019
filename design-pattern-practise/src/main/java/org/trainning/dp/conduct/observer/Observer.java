package org.trainning.dp.conduct.observer;

public abstract class Observer {
	
	protected float temperature;
	protected float humidity;
	protected float airpressure;
	protected Subject subject;
    
    public Observer(Subject subject) {
    	this.subject = subject;
    	subject.addObserver(this);
    	
    }
	
    /**
     * 调用观察者者更新接口
     * @param temperature
     * @param humidity
     * @param airpressure
     */
    public abstract void update(float temperature, float humidity, float airpressure);

}
