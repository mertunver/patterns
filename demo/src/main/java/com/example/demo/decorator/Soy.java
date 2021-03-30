package com.example.demo.decorator;


public class Soy extends AddOnDecorator{

    @Override
    protected int cost() {
        return this.beverage.cost() + 2;

    }

    @Override
    protected String getDesc() {
        return this.beverage.getDesc()+ "addonDESC";
    }
}
