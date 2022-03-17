package pattern.observer.java.observer;

import pattern.observer.java.Measurement;

import java.util.Observable;
import java.util.Observer;

public class PressureObserver implements Observer, Measurement {

    private Observable observable;
    private double[] measurements;

    public PressureObserver(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.measurements = (double[]) arg;
        show();
    }

    @Override
    public void show() {
        System.out.println("pressure is "+ measurements[1]);
    }
}
