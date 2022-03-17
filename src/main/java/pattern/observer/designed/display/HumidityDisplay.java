package pattern.observer.designed.display;

import pattern.observer.designed.Display;
import pattern.observer.designed.WeatherData;

public class HumidityDisplay implements Display {

    private WeatherData weatherData;

    public HumidityDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addRegister(this);
    }

    @Override
    public void show() {
        System.out.println("humidity is "+weatherData.getHumidity());
    }
}
