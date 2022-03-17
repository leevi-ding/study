package pattern.observer.designed;

import pattern.observer.designed.display.HumidityDisplay;
import pattern.observer.designed.display.PressureDisplay;
import pattern.observer.designed.display.TemperatureDisplay;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new HumidityDisplay(weatherData);
        new TemperatureDisplay(weatherData);
        new PressureDisplay(weatherData);
        weatherData.change(0.37,1.33,18.2);
    }
}
