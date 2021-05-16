package com.example.demo.observerPattern.observable;

import com.example.demo.observerPattern.observer.IObserver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
/**
 * When use:
 * 1) if you want to know changes immediately
 */
@Component
public class WeatherStation implements IObservable {

    private List<IObserver> observerList = new ArrayList<>();

    private int temperature;

    @Override
    public void add(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observerList.remove(observer);
    }

    /**
     * pushes changes to observers
     **/
    @Override
    public void notifyAttachedObservers() {
        observerList.forEach(IObserver::update);
    }

    public int getTemperature() {
        return temperature;
    }
}
