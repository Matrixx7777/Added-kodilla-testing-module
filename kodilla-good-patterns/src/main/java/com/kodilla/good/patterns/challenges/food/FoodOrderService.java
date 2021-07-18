package com.kodilla.good.patterns.challenges.food;

import java.util.Map;

public interface FoodOrderService {
    boolean process(FoodOrderRequest foodOrderRequest, Map<String, Double> listProducts);
}
