package org.example.observer.subject;

import org.example.observer.observer.Observer;
import org.example.observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class Station implements Subject<Observer> {

    private int humidity;
    private int temperature;
    private int pressure;

    private List<Observer> observers;

    public Station(int humidity, int temperature, int pressure) {
        observers = new ArrayList<>();
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        observer.setObserver(this);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers){
            observer.update(this.humidity, this.temperature, this.pressure);
        }
    }
}
