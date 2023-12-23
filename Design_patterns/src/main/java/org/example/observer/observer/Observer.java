package org.example.observer.observer;

import org.example.observer.subject.Station;

public interface Observer<T> {

    void update(int humidity, int temperature, int pressure);

    void setObserver(T t);
}
