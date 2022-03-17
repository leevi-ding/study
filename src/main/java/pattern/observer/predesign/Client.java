package pattern.observer.predesign;

import pattern.observer.predesign.displayer.HumidityDisplay;
import pattern.observer.predesign.displayer.PressureDisplay;
import pattern.observer.predesign.displayer.TemperatureDisplay;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(new HumidityDisplay(), new PressureDisplay(), new TemperatureDisplay());
        weatherData.change(0.18,123.3,32.7);
    }
}
