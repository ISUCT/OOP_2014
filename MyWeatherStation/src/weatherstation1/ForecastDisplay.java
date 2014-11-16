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

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.2f;  
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
                lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public void display() {
		if (currentPressure > lastPressure) {
			System.out.println("Forecast: Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("Forecast: More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Forecast: Watch out for cooler, rainy weather");
		}
	}
}