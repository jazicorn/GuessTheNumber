package com.project;

import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void run() {
        // generate random number
        // user guess the number
        // after each guess determine if too high or too low
        // user wins if guess within 6 tries

        // ask username
        // return instructions with username included
        // take user input
        // too high or too low
        // ask user to guess again
        // create counter to keep track of user tries
        // if user guess number they win, ask to play again
        // if user doesn't guess within 6 tries user looses ask to play again
        // either way reset counter and generate new random number;

        int random;
        String returnRandom;
        // boolean playAgain;
        // int counter;
        String name;
        String returnName;
        // String welcome;
        String range;
        String guess;

        // function user input
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello what is your name?");
        name = scan.nextLine();
        returnName = String.format("\nYour name is: %1$s", name);
        System.out.println(returnName);

        // random number
        random = (int)(Math.random() * 21);
        returnRandom = String.format("Your guess is: %1$s", random);
        System.out.println(returnRandom);

        // ask for a guess
        range = String.format("\nWell, %1$s, I am thinking of a number 1 and 20", name);
        guess = "Take a guess";
        System.out.println(range);
        System.out.println(guess);

        // Your guess is too low.
        // Take a guess

        // Your guess is too high.
        // Take a guess

        // function try again

        // Good job, {Jasmine}! You guessed my number in {counter} guesses!
        // would you like to play again? (y or n)


    }

    public static void main(String[] args) {

        run();

    }
}
