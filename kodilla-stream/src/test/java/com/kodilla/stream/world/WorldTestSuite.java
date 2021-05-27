package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
    //Given
        Country country1 = new Country("Poland", 38000000);
        Country country2 = new Country("Germany", 83000000);
        Country country3 = new Country("England", 66650000);

        Country country4 = new Country("USA", 328000000);
        Country country5 = new Country("Canada", 37000000);
        Country country6 = new Country("Mexico", 127000000);

        Country country7 = new Country("Russia", 144000000);
        Country country8 = new Country("China",  1398000000);
        Country country9 = new Country("Japan", 126000000);

        Continent europe = new Continent("Europe");
        europe.addCountry(country1);
        europe.addCountry(country2);
        europe.addCountry(country3);

        Continent northAmerica = new Continent("North America: ");
        northAmerica.addCountry(country4);
        northAmerica.addCountry(country5);
        northAmerica.addCountry(country6);

        Continent asia = new Continent("Asia: ");
        asia.addCountry(country7);
        asia.addCountry(country8);
        asia.addCountry(country9);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(asia);

        //Then
        BigDecimal totalSumPeople = world.getPeopleQuantity();

        //Then
        BigDecimal theResultOfThePeopleInTheWorld = new BigDecimal(2347650000L);
        assertEquals(theResultOfThePeopleInTheWorld, totalSumPeople);

    }
}
