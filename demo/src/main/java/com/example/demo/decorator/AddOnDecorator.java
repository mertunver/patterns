package com.example.demo.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AddOnDecorator extends Beverage{

    protected final Beverage beverage;

    @Override
    protected int cost() {
return 1;

    }

    @Override
    protected String getDesc() {
        return "";
    }
}
