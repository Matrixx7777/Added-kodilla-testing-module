package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Mushrooms extends AbstractPizzaOrderDecorator{

    public Mushrooms(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getAdditives(){
        return super.getAdditives() + " + mushrooms";
    }
}
