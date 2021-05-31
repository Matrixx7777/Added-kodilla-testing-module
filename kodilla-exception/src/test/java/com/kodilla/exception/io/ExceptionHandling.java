package com.kodilla.exception.io;

public class ExceptionHandling {
    public static void main(String[] args){

        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            System.out.println("probablyIWillThrowException result = " + secondChallenge.probablyIWillThrowException(2.0,3.0));
        }
        catch (Exception e) {
            System.out.println("Don't probablyIWillThrowException \n Error occurred" + e);
        }
        finally {
                System.out.println("Done !");
        }
    }
}
