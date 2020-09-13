package com.headfirst.observer2;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class WeatherData extends Observable{
	private double temperature;
	private double humidity;
	private double pressure;
	
	public WeatherData() {}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChanged();
	}

	public double getTemperature() {
		return temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public double getPressure() {
		return pressure;
	}
	
	
}
