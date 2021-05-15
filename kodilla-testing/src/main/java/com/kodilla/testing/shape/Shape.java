package com.kodilla.testing.shape;

class Application{
    public static  void main(String[] args){
        Square square = new Square(5, 5);
        square.fieldFigure();
        Circle circle = new Circle(3,3.14);
        circle.fieldFigure();
        Triangle triangle = new Triangle(3,4,2);
        triangle.fieldFigure();

    }
}


interface Shape{

    void getShapeName();

     int getField = 0;

}


class  ShapeCollector {

    public void addFigure(Shape shape){

    }

    public void removeFigure(Shape shape){

    }

    public void getFigure(int n){

    }

    public void showFigures(){

    }
}

class  Square {


    private int a;
    private int b;

    public Square(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void fieldFigure(){
        int resultFieldSquare = a * b;
        System.out.println("Field Square = " +resultFieldSquare);
    }
}


class Circle {

    private int r;
    private double pi;

    public Circle(int r, double pi){
        this.r =r;
        this.pi = pi;
    }

    public int getR() {
        return r;
    }

    public double getPi() {
        return pi;
    }

    public void fieldFigure(){
        double resultFieldCircle = pi * (r*r);
        System.out.println("Field Circle = " + resultFieldCircle);
    }
}

class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void fieldFigure(){
        int resultFieldTriangle = a * b * c;
        System.out.println("Field Triange = " +resultFieldTriangle);
    }
}

