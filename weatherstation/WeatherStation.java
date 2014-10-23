/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author Stud_5
 */
public class WeatherStation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
WeatherData weatherData = new WeatherData ();

CurrentConditionsDisplay currentDisplay = 
        new CurrentConditionsDisplay (weatherData);


weatherData.setMeasurements (80, 65, 30.4f);
weatherData.setMeasurements (82, 70, 29.2f);
weatherData.setMeasurements (78, 90, 29.2f);
        // TODO code application logic here
    }
}
