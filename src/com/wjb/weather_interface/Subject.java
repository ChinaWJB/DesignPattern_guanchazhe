package com.wjb.weather_interface;

public interface Subject {
	public void registerObserver(Observer o);	//ע��۲���
	public void removeObserver(Observer o);		//ɾ���۲���
	public void notifyObservers();				//������Ϣ���۲���
}
