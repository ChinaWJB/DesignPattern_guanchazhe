package com.wjb.observer_impl;
import java.util.ArrayList;

import com.wjb.weather_interface.Observer;
import com.wjb.weather_interface.Subject;

/**
 * push推送给观察者数据
 */
public class WeatherData implements Subject{
	private ArrayList<Observer> observers;						//存放观察者的数组链表
	private float temperature = 0;							//温度
	private float humidity = 0;								//湿度
	private float pressure = 0;								//压力
	
	public WeatherData(){
		observers = new ArrayList<Observer>();					
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){					//查找匹配要删除的观察者
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}
	}
	
	public void notifyObservers(){							//给观察者挨个发布消息
		for(int i = 0; i < observers.size(); i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);//在观测者中定义（本例在CurrentConditionsDisplay中）
															//直接将数据算送给观察者
		}
	}
	
/*	public void measurementsChanged(){						//当气象站得到更新观测值时，我们通知观测值
		notifyObservers();
	}
*/	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
//		measurementsChanged();								//设置数据后调用更新数据的方法，
		notifyObservers();
	}
																																																																																																																																																																																																																																																								
}
