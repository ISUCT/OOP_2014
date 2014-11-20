/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.station;

/**
 *
 * @author Stud_5
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherStation;
    
    public CurrentConditionsDisplay (Subject weatherStation){
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }
 
    public void update (float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
        
    }
    public void display (){
        System.out.println("Current conditions: "+ temperature +"F derees and"+humidity+"% humidity");
        
    }
}
