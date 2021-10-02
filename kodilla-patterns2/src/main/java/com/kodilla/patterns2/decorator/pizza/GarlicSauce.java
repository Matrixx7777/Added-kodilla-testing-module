package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class GarlicSauce extends AbstractPizzaOrderDecorator{

    public GarlicSauce(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getAdditives(){
        return super.getAdditives() + " + garlic sauce";
    }
}

