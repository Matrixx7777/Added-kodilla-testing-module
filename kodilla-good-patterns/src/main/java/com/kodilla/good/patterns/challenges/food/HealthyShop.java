package com.kodilla.good.patterns.challenges.food;

import java.util.Map;

public class HealthyShop implements FoodOrderService{

    public boolean process(FoodOrderRequest food, Map<String, Double> listProducts){
        System.out.println("Healty Shop");
        return true;
    }
}
