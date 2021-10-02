package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Cheese extends  AbstractPizzaOrderDecorator{

    public Cheese(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getAdditives(){
        return super.getAdditives() + " + cheese";
    }
}
