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
            Circle circle = new Circle("Circle1", 13.7);
            //When
            collector.addFigure(circle);
            Shape a2 = collector.getFigure(0);
            //Then
            Assertions.assertEquals(a2, circle);
    }

    @Test
    void testRemoveFigure(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square("Square", 12);
        collector.addFigure(square);
        //When
        collector.removeFigure(square);
        int a = collector.getShapestListQuantity();
        //Then
        Assertions.assertEquals(0,a);
    }

    @Test
    void testShowFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Triangle triangle = new Triangle("Triangle", 21);
        collector.addFigure(triangle);
        //When
        Shape a1 = collector.showFigure(0);
        //Then
        Assertions.assertEquals(a1,triangle);
    }

    @Test
    void testShowFigures() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Triangle triangle1 = new Triangle("Triangle-1", 9);
        Triangle triangle2 = new Triangle("Triangle-2", 18);
        Triangle triangle3 = new Triangle("Triangle-3", 27);
        collector.addFigure(triangle1);
        collector.addFigure(triangle2);
        collector.addFigure(triangle3);
        //When
        Shape a1 = collector.showFigures(2);
        Shape a2 = collector.getFigure(2);
        //Then
        Assertions.assertEquals(a1,a2);
    }

}
