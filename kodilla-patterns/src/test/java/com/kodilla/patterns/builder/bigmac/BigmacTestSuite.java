package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    public void testBigMacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun("Big")
                .burgers(3)
                .sauce("mayonnaise")
                .ingredients("onion")
                .ingredients("cucumber")
                .ingredients("salad")
                .ingredients("chesse")
                .build();
        System.out.println(bigmac);

        //When
        String bun = bigmac.getBun();
        int burgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce();
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals("Big", bun);
        assertEquals(3, burgers);
        assertEquals("mayonnaise", sauce);
        assertEquals(4, howManyIngredients);
    }
}
