package weather.station;
public interface Subject {
       public void registerObserver (server o);
   public void removeserver (server o);
   public void notifyservers();

    public void registerObserver(CurrentConditionsDisplay aThis);
   
  
}
