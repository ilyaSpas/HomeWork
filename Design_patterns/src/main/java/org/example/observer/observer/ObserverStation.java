package org.example.observer.observer;

import org.example.observer.subject.Subject;

public class ObserverStation implements Observer<Subject>{
    private Subject subject;
    private int humidity;
    private int temperature;
    private int pressure;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
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
    public void update(int humidity, int temperature, int pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
    }

    @Override
    public void setObserver(Subject subject) {
        this.subject = subject;
    }
}
