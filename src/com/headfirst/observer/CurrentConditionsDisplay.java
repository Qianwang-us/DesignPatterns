package com.headfirst.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private double temperature;
	private double humidity;
	private Subject weatherData;
	
	
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and "
				+ humidity + "% humidity");
		
	}

	@Override
	public void update(double temp, double humidity, double pressure) {
		this.temperature = temp;
		this.humidity = humidity;	
		display();
	}

}