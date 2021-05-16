package com.kodilla.testing.shape;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {


    @DisplayName("when create SimpleUser with name, " +
            "then getUsername should return correct name"
    )

    @Test
    void testAddFigure(){

            //Given
            ShapeCollector collector = new ShapeCollector();
            Circle circle = new Circle("Circle", 13.7);
            //When
            collector.addFigure(circle);

            Shape expected = collector.getFigure(0);

            //Then
            Assertions.assertEquals(expected, circle);

    }



}
