package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int computerScore = 0;
        int userScore = 0;
        int counter = 0;

        System.out.println("\n|ROCK|PAPER|SCISSORS|\n" +
                "Hello what's your name ?");
        String name = scanner.nextLine();

        while(counter ==0){

            int computerChoice = 1 + random.nextInt(3);

            System.out.println("\nHello " + name + "\nEnter -> 1 for rock | 2 for paper | 3 for scissors");
            int playerChoice = scanner.nextInt();

            if(playerChoice == computerChoice){
                System.out.println("\nDraw. Computer and you get 0 points");

            } else if(playerChoice == 1){

                if(computerChoice == 2){
                    computerScore++;
                    System.out.println("Computer selected paper\n" +
                            name +" You lost this round\n" +
                            "Computer: " + computerScore + "\n" +
                            name + ": " + userScore);
                }
                else if(computerChoice == 3){
                    userScore++;
                    System.out.println("Computer selected scissors\n" +
                            name +" You won this round\n" +
                            "Computer: " + computerScore + "\n" +
                            name + ": " + userScore);
                }

                if(userScore == 5){
                    counter++;
                    System.out.println("\nYou win the game\n" +
                            name  + " has: " + userScore + " points");
                }
                else if(computerScore == 5){
                    counter++;
                    System.out.println("\nYou lost the game\n" +
                            "Computer has: " + computerScore + " points");
                }

            }
            else if(playerChoice == 2) {

                if (computerChoice == 1) {
                    userScore++;
                    System.out.println("Computer selected rock\n" +
                            name + " You won this round\n" +
                            "Computer: " + computerScore + "\n" +
                            name + ": " + userScore);
                }
                else if(computerChoice == 3){
                    computerScore++;
                    System.out.println("Computer selected scissors\n" +
                            name +" You lost this round\n" +
                            "Computer: " + computerScore + "\n" +
                            name + ": " + userScore);
                }

                if(userScore == 5){
                    counter++;
                    System.out.println("\nYou win the game\n" +
                            name  + " has: " + userScore + " points");
                }
                else if(computerScore == 5){
                    counter++;
                    System.out.println("\nYou lost the game\n" +
                            "Computer has: " + computerScore + " points");
                }
            }
            else if(playerChoice == 3){

                if(computerChoice == 1){
                    computerScore++;
                    System.out.println("Computer selected rock\n" +
                            name +" You lost this round\n" +
                            "Computer: " + computerScore + "\n" +
                            name + ": " + userScore);
                }
                else if(computerChoice == 2){
                    userScore++;
                    System.out.println("Computer selected paper\n" +
                            name + " You won this round" + '\n' +
                            "Computer: " + computerScore + "\n" +
                            name + ": " + userScore);
                }

                if(userScore == 5){
                    counter++;
                    System.out.println("\nYou win the game\n" +
                            name  + " has: " + userScore + " points");
                }
                else if(computerScore == 5){
                    counter++;
                    System.out.println("\nYou lost the game\n" +
                            "Computer has: " + computerScore + " points");
                }
            }
            else{
                System.out.println("\nYou selected incorrect click");
            }
        }
    }
}
