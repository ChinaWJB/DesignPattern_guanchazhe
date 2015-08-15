package com.wjb.observer_impl;
import com.wjb.weather_interface.*;

/**
 * �˲�������WeatherData������ʾ��ǰ�۲�ֵ
 * Ŀǰ״���Ĳ��棨����һ�����棬��һ���۲��ߣ�
 * @author hp
 * 
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temperature=0;
	private float humidity=0;
//	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData){
//		this.weatherData = weatherData;
		weatherData.registerObserver(this);				//ΪʲôҪע�᣿ ��Ϊ����۲�������update��display������
														//���⣨�ɹ۲��ߣ�Ҫͨ��update�������۲��߷���֪ͨ
														//ֻ����ӵ�������������
														//Ҫע�����һ���۲��߻����ࣨ����壩.
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
