package com.example.demo.decorator;

public abstract class Beverage {
    protected abstract int  cost();
    protected  String getDesc(){
        return "desc";
    }
}
