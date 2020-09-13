package com.headfirst.observer2;

import java.util.Observable;
import java.util.Observer;

import com.headfirst.observer.DisplayElement;
import com.headfirst.observer.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private double temperature;
	private double humidity;
	private Observable observable;
	
	
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and "
				+ humidity + "% humidity");
		
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temperature =  weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
		
	}

}
