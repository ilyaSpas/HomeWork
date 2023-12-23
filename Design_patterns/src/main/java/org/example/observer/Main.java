package org.example.observer;

import org.example.observer.observer.Observer;
import org.example.observer.observer.ObserverStation;
import org.example.observer.subject.Station;

public class Main {
    public static void main(String[] args) {
        Station station = new Station(210, 210, 210);
        ObserverStation observerStation = new ObserverStation();

        station.setHumidity(100);
        station.setTemperature(100);
        station.setPressure(100);

        station.addObserver(observerStation);
        station.notifyAllObservers();

        System.out.println("Влажность " + observerStation.getHumidity());
        System.out.println("Температура " + observerStation.getTemperature());
        System.out.println("Давление " + observerStation.getPressure());
    }
}
