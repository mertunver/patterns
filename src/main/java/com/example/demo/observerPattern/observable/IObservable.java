package com.example.demo.observerPattern.observable;

import com.example.demo.observerPattern.observer.IObserver;

public interface IObservable {
    void add(IObserver observer);
    void remove(IObserver observer);
    void notifyAttachedObservers();
}
