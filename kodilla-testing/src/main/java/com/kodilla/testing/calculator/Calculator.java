package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA(){
        return a;
    }

    public int getB() {
        return b;
    }

    public void adding(){
        if(a<b){
            int equalsAdding1 = a + b;
            System.out.println("Result added = " + equalsAdding1);
        }
        else if(b<a){
            int equalsAdding2 = a + b;
            System.out.println("Result added = " + equalsAdding2);
        }
    }

    public void substract(){
        if(a>b){
            int equalsSubstract1 = a - b;
            System.out.println("Result subtracted = " + equalsSubstract1);
        }
        else{
            int equalsSubstract2 = b - a;
            System.out.println("Result subtracted = " + equalsSubstract2);
        }

    }
}
