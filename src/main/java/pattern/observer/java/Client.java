package pattern.observer.java;

import pattern.observer.java.observer.HumidityObserver;
import pattern.observer.java.observer.PressureObserver;
import pattern.observer.java.observer.TemperatureObserver;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new HumidityObserver(weatherData);
        new PressureObserver(weatherData);
        new TemperatureObserver(weatherData);
        weatherData.notifyChange(0.32,12.1,21.1);
    }
}
