package com.wjb.observer_impl;
import com.wjb.weather_interface.*;

/**
 * 此布告板根据WeatherData对象显示当前观测值
 * 目前状况的布告（其中一个布告，或一个观察者）
 * @author hp
 * 
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temperature=0;
	private float humidity=0;
//	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData){
//		this.weatherData = weatherData;
		weatherData.registerObserver(this);				//为什么要注册？ 因为这个观察者中有update和display方法，
														//主题（可观察者）要通过update方法给观察者发送通知
														//只是添加到了数组链表中
														//要注册的是一个观察者或子类（布告板）.
	}
	
	public void update (float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display(){
		System.out.println("Current conditions: " + temperature + "F deprees and " + humidity + "% humidity" );
	}
}
