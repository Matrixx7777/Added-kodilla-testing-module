package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("\n" + "NEXT TEST: " + "\n");

        Calculator calculator = new Calculator(10,17);
        calculator.adding();
        calculator.substract();

        int result2 = calculator.getA();
        int result3 = calculator.getB();

        if (result2 == 10 || result3 == 17) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Ended program testing");
    }
}
