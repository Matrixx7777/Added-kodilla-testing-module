package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> list = new ArrayList<>();

    public void addFigure(Shape shape){

        list.add(shape);

    }

    public void removeFigure(Shape shape){

        list.remove(shape);
    }

    public Shape getFigure(int n){

       return list.get(n);

    }

    public Shape showFigure(int a){

        return list.get(a);

    }

    public String showFigures(){

            return list.toString();

    }

    public int getShapestListQuantity(){
        return list.size();
    }
}
