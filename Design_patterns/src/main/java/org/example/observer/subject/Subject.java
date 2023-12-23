package org.example.observer.subject;

import org.example.observer.observer.Observer;

public interface Subject<T> {

    void addObserver(T t);
    void removeObserver(T t);
    void notifyAllObservers();
}
