package com.kodilla.good.patterns.challenges.food;

import java.util.Map;

public class FoodOrderRequest {

    private Provider provider;
    private Map<String, Double> listProducts;


    public FoodOrderRequest(Provider provider,  Map<String, Double> listProducts) {
        this.provider = provider;
        this.listProducts = listProducts;
    }

    public Provider getProvider() { return provider; }

    public Map<String, Double> getListProducts() {
        return listProducts;
    }
}
