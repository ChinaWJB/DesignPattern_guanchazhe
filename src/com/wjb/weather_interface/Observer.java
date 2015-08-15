package com.wjb.weather_interface;

public interface Observer {
	public void update(float temp, float humidity, float pressure);//观察者更新消息
}
