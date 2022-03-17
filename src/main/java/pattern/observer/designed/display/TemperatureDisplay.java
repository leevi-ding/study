package pattern.observer.designed.display;

import pattern.observer.designed.Display;
import pattern.observer.designed.WeatherData;

public class TemperatureDisplay implements Display {

    private WeatherData weatherData;

    public TemperatureDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addRegister(this);
    }

    @Override
    public void show() {
        System.out.println("temperature is "+weatherData.getTemperature());
    }
}
