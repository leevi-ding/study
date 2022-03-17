package pattern.observer.designed.display;

import pattern.observer.designed.Display;
import pattern.observer.designed.WeatherData;

public class PressureDisplay implements Display {

    private WeatherData weatherData;

    public PressureDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addRegister(this);
    }

    @Override
    public void show() {
        System.out.println("pressure is "+weatherData.getPressure());
    }
}
