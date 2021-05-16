package com.example.demo.decoratorPattern;


public class Soy extends AddOnDecorator{

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 2;

    }

    @Override
    public String getDesc() {
        return this.beverage.getDesc()+ "addonDESC";
    }
}
