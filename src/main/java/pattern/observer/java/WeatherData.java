package pattern.observer.java;

import java.util.Observable;

public class WeatherData extends Observable {
    private double humidity;
    private double pressure;
    private double temperature;

    public void notifyChange(double humidity, double pressure, double temperature){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        double[] measurements = {humidity,pressure,temperature};
        setChanged();
        notifyObservers(measurements);
    }
}
