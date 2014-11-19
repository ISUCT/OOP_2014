/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.station;

/**
 *
 * @author Stud_5
 */
public class ForecastDisplay implements Observer,DisplayElement{
     private float temperature;
    private float humidity;
  public void update (float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
        
    }  
public void display (){
        System.out.println("Вывод прогноза");
 
    }


}   
