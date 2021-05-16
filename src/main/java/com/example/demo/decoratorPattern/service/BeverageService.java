package com.example.demo.decoratorPattern.service;

import com.example.demo.decoratorPattern.Beverage;
import com.example.demo.decoratorPattern.Caramel;
import com.example.demo.decoratorPattern.Soy;

public class BeverageService {

    public int calculateBeverageCost(Beverage beverage) {

        Soy soy = new Soy(new Caramel(beverage));

        return soy.cost();
    }
}
