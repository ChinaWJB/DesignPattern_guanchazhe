package com.wjb.observer_impl;
import java.util.ArrayList;

import com.wjb.weather_interface.Observer;
import com.wjb.weather_interface.Subject;

/**
 * push���͸��۲�������
 */
public class WeatherData implements Subject{
	private ArrayList<Observer> observers;						//��Ź۲��ߵ���������
	private float temperature = 0;							//�¶�
	private float humidity = 0;								//ʪ��
	private float pressure = 0;								//ѹ��
	
	public WeatherData(){
		observers = new ArrayList<Observer>();					
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){					//����ƥ��Ҫɾ���Ĺ۲���
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}
	}
	
	public void notifyObservers(){							//���۲��߰���������Ϣ
		for(int i = 0; i < observers.size(); i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);//�ڹ۲����ж��壨������CurrentConditionsDisplay�У�
															//ֱ�ӽ��������͸��۲���
		}
	}
	
/*	public void measurementsChanged(){						//������վ�õ����¹۲�ֵʱ������֪ͨ�۲�ֵ
		notifyObservers();
	}
*/	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
//		measurementsChanged();								//�������ݺ���ø������ݵķ�����
		notifyObservers();
	}
																																																																																																																																																																																																																																																								
}
