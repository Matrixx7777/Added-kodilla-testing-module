package com.kodilla.good.patterns.challenges.food;

import java.util.Map;

public class Food2Door {

    private final FoodOrderService foodOrderService;

    public Food2Door(final FoodOrderService foodOrderService) {
        this.foodOrderService = foodOrderService;
    }

        public ProviderOrder process(final FoodOrderRequest foodOrderRequest){

            Provider provider = foodOrderRequest.getProvider();
            Map<String, Double> listProducts = provider.getListProducts();

            boolean isOrdered = foodOrderService.process(foodOrderRequest, listProducts);

            if (isOrdered) {
                return new ProviderOrder(foodOrderRequest.getProvider(), true);
            } else {
                return new ProviderOrder(foodOrderRequest.getProvider(), false);
            }
    }

    public static void main(String[] args) {

        FoodOrderRequestRetriever orderRequestRetriever = new FoodOrderRequestRetriever();
        FoodOrderRequest result = orderRequestRetriever.retrieve();

        Food2Door food2Door = new Food2Door(new GlutenFreeShop());
        food2Door.process(result);
    }
}
