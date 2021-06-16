package com.example.demo.adapterPattern;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Adapter implements ITarget {
    /**
     * logic handeled in Adapter class by calling specific logic.
     * In this example our logic is Adaptee but it could be any library etc..
     */
    Adaptee adaptee;

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
