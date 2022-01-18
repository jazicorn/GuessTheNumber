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
        String randomReturn;
        String randomRange;
        // boolean playAgain;
        // int counter;
        String name;
        String nameReturn;
        String nameAsk;
        // guess
        int guess;
        String guessReturn;
        String guessPrompt;
        String guessLow = "Your guess is too low";
        String guessHigh = "Your guess is too high";

        // function user input
        Scanner scan = new Scanner(System.in);

        // ask for name
        nameAsk = "Hello what is your name?";
        System.out.println(nameAsk);
        name = scan.nextLine();
        // return name
        nameReturn = String.format("\nYour name is: %1$s", name);
        System.out.println(nameReturn);

        // generate random number
        random = (int)(Math.random() * 21);
        randomReturn = String.format("Random number generated: %1$s", random);
        System.out.println(randomReturn);

        // ask for a guess
        randomRange = String.format("\nWell, %1$s, I am thinking of a number 1 and 20", name);
        guessPrompt = "Take a guess";
        System.out.println(randomRange);
        System.out.println(guessPrompt);

        // take guess
        guess = scan.nextInt();
        guessReturn = String.format("You guessed: %1$s", guess);
        System.out.println(guessReturn);

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
