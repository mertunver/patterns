package com.example.demo.observerPattern.observer;

import com.example.demo.observerPattern.observable.WeatherStation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PhoneDisplay implements IObserver {

    /**
     * reference of weatherStation is not compulsory you can inject the desired data to update(Data data) method as parameter
     */
    private final WeatherStation weatherStation;

    /**
     * Whenever weather condition changes, update method of observables call.
     */
    @Override
    public void update() {
        updateDisplay(weatherStation.getTemperature());
    }

    private void updateDisplay(int temperature) {
        System.out.println("TEMPERATURE IS " + temperature);
    }
}
