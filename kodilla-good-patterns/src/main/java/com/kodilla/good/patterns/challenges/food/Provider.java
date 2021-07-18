package com.kodilla.good.patterns.challenges.food;

import java.util.Map;

public class Provider extends  FoodOrderRequestRetriever{

    private String name;
    private String surname;
    private Map<String, Double> listProducts;

    public Provider(String name, String surname, Map<String, Double> listProducts) {
            this.name = name;
            this.surname = surname;
            this.listProducts = listProducts;
    }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

    public Map<String, Double> getListProducts() {
        return listProducts;
    }
}

