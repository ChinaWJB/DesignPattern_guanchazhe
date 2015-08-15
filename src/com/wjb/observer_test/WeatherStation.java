package com.wjb.observer_test;
import com.wjb.observer_impl.CurrentConditionsDisplay;
import com.wjb.observer_impl.WeatherData;


public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay =
				new CurrentConditionsDisplay(weatherData);	//���ȣ����۲���ע�ᵽ������
//		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(89, 67, 34);			//Ȼ�󣬶Թ۲��߲������ݣ���������
		weatherData.setMeasurements(78, 56, 12);
		weatherData.setMeasurements(76, 36, 58);
	}
}
