package com.kodilla.good.patterns.challenges.food;

import java.util.HashMap;
import java.util.Map;

public class FoodOrderRequestRetriever {
    public FoodOrderRequest retrieve() {

        Map<String, Double> listProducts = new HashMap<>();
        listProducts.put("Small pizza",20.5);
        listProducts.put("Medium pizza",28.0);
        listProducts.put("Big pizza",35.5);
        listProducts.put("Small kebab",10.0);
        listProducts.put("Medium kebab",13.5);
        listProducts.put("Big kebab",18.5);

        Provider provider = new Provider("Marek", "Grason", listProducts);

        Map<String, Double> orderedProducts = new HashMap<>();
        orderedProducts.put("Big pizza", 35.5);
        orderedProducts.put("Small kebab", 10.0);


        return new FoodOrderRequest(provider, orderedProducts);
    }
}
