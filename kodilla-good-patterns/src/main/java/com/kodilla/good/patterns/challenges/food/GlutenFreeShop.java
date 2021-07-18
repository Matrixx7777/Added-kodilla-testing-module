package com.kodilla.good.patterns.challenges.food;

import java.util.Map;

public class GlutenFreeShop implements FoodOrderService {
    public boolean process(FoodOrderRequest food, Map<String, Double> listProducts){
        System.out.println("Gluten Free Shop");
        return true;
    }
}
