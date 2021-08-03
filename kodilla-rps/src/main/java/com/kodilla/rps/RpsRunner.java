package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        int counter = 0;
        boolean end = true;

        while (end) {

            boolean start = true;

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("""
                    |ROCK|PAPER|SCISSORS|
                    Hello what's your name ?""");
            String name = scanner.nextLine();

            System.out.println("To how many points do you want to play ?");
            int points = Integer.parseInt(scanner.nextLine());

            int computerScore = 0;
            int userScore = 0;

            while (counter == 0 && start) {

                int computerChoice = 1 + random.nextInt(3);

                System.out.println("\nHello " + name + "\nEnter -> 1 for rock | 2 for paper | 3 for scissors");
                String playerChoice = scanner.nextLine();

                if (playerChoice.equals("1") && computerChoice == 1 ||playerChoice.equals("2") && computerChoice == 2 ||playerChoice.equals("3") && computerChoice == 3) {
                    System.out.println("\nDraw. Computer and you get 0 points");

                } else if (playerChoice.equals("1")) {

                    if (computerChoice == 2) {
                        computerScore++;
                        System.out.println("Computer selected paper\n" +
                                name + " You lost this round\n" +
                                "Computer: " + computerScore + "\n" +
                                name + ": " + userScore);
                    } else {
                        userScore++;
                        System.out.println("Computer selected scissors\n" +
                                name + " You won this round\n" +
                                "Computer: " + computerScore + "\n" +
                                name + ": " + userScore);
                    }

                    if (userScore == points) {
                        counter++;
                        System.out.println("\nYou win the game\n" +
                                name + " has: " + userScore + " points");
                    } else if (computerScore == points) {
                        counter++;
                        System.out.println("\nYou lost the game\n" +
                                "Computer has: " + computerScore + " points");
                    }

                } else if (playerChoice.equals("2")) {

                    if (computerChoice == 1) {
                        userScore++;
                        System.out.println("Computer selected rock\n" +
                                name + " You won this round\n" +
                                "Computer: " + computerScore + "\n" +
                                name + ": " + userScore);
                    } else {
                        computerScore++;
                        System.out.println("Computer selected scissors\n" +
                                name + " You lost this round\n" +
                                "Computer: " + computerScore + "\n" +
                                name + ": " + userScore);
                    }

                    if (userScore == points) {
                        counter++;
                        System.out.println("\nYou win the game\n" +
                                name + " has: " + userScore + " points");

                    } else if (computerScore == points) {
                        counter++;
                        System.out.println("\nYou lost the game\n" +
                                "Computer has: " + computerScore + " points");
                    }

                } else if (playerChoice.equals("3")) {

                    if (computerChoice == 1) {
                        computerScore++;
                        System.out.println("Computer selected rock\n" +
                                name + " You lost this round\n" +
                                "Computer: " + computerScore + "\n" +
                                name + ": " + userScore);
                    } else {
                        userScore++;
                        System.out.println("Computer selected paper\n" +
                                name + " You won this round" + '\n' +
                                "Computer: " + computerScore + "\n" +
                                name + ": " + userScore);
                    }

                    if (userScore == points) {
                        counter++;
                        System.out.println("\nYou win the game\n" +
                                name + " has: " + userScore + " points");
                    } else if (computerScore == points) {
                        counter++;
                        System.out.println("\nYou lost the game\n" +
                                "Computer has: " + computerScore + " points");
                    }
                } else {
                    System.out.println("\nYou incorrectly enter");
                }

                if(computerScore == points || userScore == points ){
                    System.out.println("""
                            Do you want to play again ?
                            Enter -> N -> YES ||| Enter -> X -> NO\s""");
                    String answer = scanner.next().toUpperCase();
                    if (answer.equals("N")) {
                        counter = 0;
                        start = false;
                        end = true;

                    } else if (answer.equals("X")) {
                        System.out.println("End of the game");
                        end = false;
                        start = false;

                    } else {
                        System.out.println("End of the game");
                        end = false;
                        start = false;
                    }
                }
            }
        }
    }
}