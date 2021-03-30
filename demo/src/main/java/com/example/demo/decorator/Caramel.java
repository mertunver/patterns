package com.example.demo.decorator;

public class Caramel extends AddOnDecorator {

    public Caramel(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected int cost() {
        return this.beverage.cost() + 1;

    }

    @Override
    protected String getDesc() {
        return this.beverage.getDesc() + "addonDESC";
    }
}
