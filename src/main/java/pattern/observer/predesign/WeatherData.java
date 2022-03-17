package pattern.observer.predesign;

import pattern.observer.predesign.displayer.HumidityDisplay;
import pattern.observer.predesign.displayer.PressureDisplay;
import pattern.observer.predesign.displayer.TemperatureDisplay;

public class WeatherData {

    private double temperature;
    private double pressure;
    private double humidity;

    private HumidityDisplay humidityDisplay;
    private PressureDisplay pressureDisplay;
    private TemperatureDisplay temperatureDisplay;

    public WeatherData(HumidityDisplay humidityDisplay, PressureDisplay pressureDisplay, TemperatureDisplay temperatureDisplay){
        this.humidityDisplay = humidityDisplay;
        this.pressureDisplay = pressureDisplay;
        this.temperatureDisplay = temperatureDisplay;
    }

    public void change(double temperature, double pressure ,double humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyChange();
    }

    private void notifyChange() {
        humidityDisplay.execute(humidity);
        pressureDisplay.alert(pressure);
        temperatureDisplay.show(temperature);
    }
}
