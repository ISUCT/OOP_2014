/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation1;
import java.util.*;
/**
 *
 * @author dns
 */
public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemperature = 0.0f;
	private float minTemperature = 100;
	private float avgTemperature= 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		avgTemperature += temperature;
		numReadings++;

		if (temperature > maxTemperature) {
			maxTemperature = temperature;
		}
 
		if (temperature < minTemperature) {
			minTemperature = temperature;
		}

		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (avgTemperature / numReadings)
			+ "/" + maxTemperature + "/" + minTemperature);
	}
}
