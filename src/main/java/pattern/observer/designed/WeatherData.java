package pattern.observer.designed;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class WeatherData {

    private double temperature;
    private double pressure;
    private double humidity;

    private final List<Display> displays = new ArrayList<>();

    public void change(double temperature, double pressure ,double humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyChange();
    }

    private void notifyChange() {
        this.displays.forEach(Display::show);
    }

    public void addRegister(Display display){
        this.displays.add(display);
    }

    public void removeRegister(Display display){
        this.displays.remove(display);
    }

}
