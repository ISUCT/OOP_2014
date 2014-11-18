package weather.station;
public class Display implements server,DisplayElement {
    private float temperature;
    private float humidity;
  public void update (float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
        
    }  
public void display (){
System.out.println("Вывести  информацию на основании  данных");
 
    }

}
