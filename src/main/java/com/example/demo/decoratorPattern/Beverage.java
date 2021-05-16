package com.example.demo.decoratorPattern;

public abstract class Beverage {
    protected abstract int  cost();
    protected  String getDesc(){
        return "desc";
    }
}
