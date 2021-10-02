package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizza() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        //When
        BigDecimal cost = pizzaOrder.getCost();
        String additives = pizzaOrder.getAdditives();
        //Then
        assertEquals(new BigDecimal(15),cost);
        assertEquals("Basic pizza",additives);
    }

    @Test
    public void testBasicPizzaWithHamMushroomsCheese(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new Ham(pizzaOrder);
        pizzaOrder = new Mushrooms(pizzaOrder);
        pizzaOrder = new Cheese(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        String additives = pizzaOrder.getAdditives();
        //Then
        assertEquals(new BigDecimal(28),cost);
        assertEquals("Basic pizza + ham + mushrooms + cheese",additives);
    }

    @Test
    public void testBasicPizzaWithAllAdditives(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new Cheese(pizzaOrder);
        pizzaOrder = new ChilliPepper(pizzaOrder);
        pizzaOrder = new GarlicSauce(pizzaOrder);
        pizzaOrder = new Ham(pizzaOrder);
        pizzaOrder = new Mushrooms(pizzaOrder);
        pizzaOrder = new Salami(pizzaOrder);
        pizzaOrder = new TomatoSauce(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();
        String additives = pizzaOrder.getAdditives();

        //Then
        assertEquals(new BigDecimal(39),cost);
        assertEquals("Basic pizza + cheese + chilli pepper + garlic sauce" +
                    " + ham + mushrooms + salami + tomato sauce",additives);
    }

    @Test
    public void testBasicPizzaMyFavourite(){    // ;)
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new Salami(pizzaOrder);
        pizzaOrder = new Mushrooms(pizzaOrder);
        pizzaOrder = new Cheese(pizzaOrder);
        pizzaOrder = new ChilliPepper(pizzaOrder);
        pizzaOrder = new TomatoSauce(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        String additives = pizzaOrder.getAdditives();
        //Then
        assertEquals(new BigDecimal(31),cost);
        assertEquals("Basic pizza + salami + mushrooms + cheese + chilli pepper + tomato sauce",additives);
    }
}
