package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
    //Given
        World world = new World();
        //When
        world.addContinent(new Continent(new Country("Poland", 38000000)));

    }
}
