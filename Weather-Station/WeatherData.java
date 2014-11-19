/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.station;

import java.util.ArrayList;

/**
 *
 * @author Stud_5
 */
public class WeatherData implements Subject {
    
private ArrayList observers;
private float temperature;
private float humidity;
private float pressure;

public WeatherData(){
    observers = new ArrayList();
}
public void registerObserver (Observer o){
    observers.add (o);
}
public void removeObserver (Observer o){
    int i = observers.indexOf (o);
    if (i>=0){
        observers.remove(i);
      
    }
}
public void notifyObservers (){
    for (int i=0; i<observers.size(); i++){
        Observer observer = (Observer)observers.get(i);
        observer.update(temperature, humidity, pressure);
    }
}
public void maesurementChanged(){
    notifyObservers();
    
}
public void setMeasurements(float temperature, float humidity, float pressure){
   this.temperature = temperature;
   this.humidity = humidity;
   this.pressure = pressure;
   maesurementChanged();
   
}
 //Другие методы WeatherStation   

    @Override
    public void registerObserver(CurrentConditionsDisplay aThis) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
