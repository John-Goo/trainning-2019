package org.trainning.dp.conduct.observer;

import java.util.ArrayList;

public abstract class Subject {
	
	//观察者列表
    protected ArrayList<Observer> observerList;
    
    public Subject() {
    	this.observerList = new ArrayList<Observer>();
    }


    /**
     * 添加观察者
     * @param observer
     */
    public abstract void addObserver(Observer observer);
 
    /**
     * 删除指定观察者
     * @param observer
     */
    public abstract void deleteObserver(Observer observer);
 
    /**
     * 通知所有观察者
     */
    public abstract void notifyObservers();

}
