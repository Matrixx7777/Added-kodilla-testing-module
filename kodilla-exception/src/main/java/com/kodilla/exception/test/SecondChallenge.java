package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws Exception {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
        }
        return "Done! ";
    }

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

