package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        int counter = 0;
        boolean end = true;

        while (end) {

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("\n|ROCK|PAPER|SCISSORS|\n" +
                    "Hello what's your name ?");
            String name = scanner.nextLine();

            System.out.println("To how many points do you want to play ?");
            int points = scanner.nextInt();

            int computerScore = 0;
            int userScore = 0;

            boolean start = true;

            while (counter == 0 && start) {

                int computerChoice = 1 + random.nextInt(3);

                System.out.println("\nHello " + name + "\nEnter -> 1 for rock | 2 for paper | 3 for scissors");

                int playerChoice = scanner.nextInt();

                if (playerChoice == computerChoice) {
                    System.out.println("\nDraw. Computer and you get 0 points");

                } else if (playerChoice == 1) {

                    if (computerChoice == 2) {
                        computerScore++;
                        System.out.println("Computer selected paper\n" +
                                name + " You lost this round\n" +
                                "Computer: " + computerScore + "\n" +
                                name + ": " + userScore);
                    } else if (computerChoice == 3) {
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

                } else if (playerChoice == 2) {

                    if (computerChoice == 1) {
                        userScore++;
                        System.out.println("Computer selected rock\n" +
                                name + " You won this round\n" +
                                "Computer: " + computerScore + "\n" +
                                name + ": " + userScore);
                    } else if (computerChoice == 3) {
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

                } else if (playerChoice == 3) {

                    if (computerChoice == 1) {
                        computerScore++;
                        System.out.println("Computer selected rock\n" +
                                name + " You lost this round\n" +
                                "Computer: " + computerScore + "\n" +
                                name + ": " + userScore);
                    } else if (computerChoice == 2) {
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
                } else if (playerChoice != random.nextInt(3)) {
                    System.out.println("\nYou incorrectly enter");
                }

                if(computerScore == points || userScore == points ){
                    System.out.println("\nDo you want to play again ?\n" +
                        "Enter -> N -> YES ||| Enter -> X -> NO ");
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