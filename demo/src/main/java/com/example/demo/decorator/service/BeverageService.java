package com.example.demo.decorator.service;

import com.example.demo.decorator.Beverage;
import com.example.demo.decorator.Caramel;

public class BeverageService {

    public int calculateBeverageCost(Beverage... s){
        new Caramel(s[0]);
        return 1;
    }
}
