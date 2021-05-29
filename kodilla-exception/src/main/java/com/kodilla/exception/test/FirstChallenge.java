package com.kodilla.exception.test;

public class FirstChallenge {

    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try{
            System.out.println("Addition result = " + firstChallenge.divide(3, 0));
        }
        catch (ArithmeticException e) {
            System.out.println("Don't divide by 0 \n Error occurred: " + e);
        }
        finally {
            System.out.println(" { \" Operation try..catch..finally - finished \"} ");
        }

    }
}