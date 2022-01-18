package com.project;

import java.util.Scanner;

public class Play {

    // random
    public int random;
    public String randomRange;
    public String randomReturn;

    // name
    public String name;
    public String nameReturn;
    public String nameAsk;

    // guess
    public int guess;
    public int guessSet;
    public String guessReturn;
    public String guessPrompt;
    public String guessLow = "Your guess is too low";
    public String guessHigh = "Your guess is too high";
    public String guessCorrect;
    public String congrats;
    public String congrats2;

    // play again
    public boolean replay;
    public String playAgain;
    public char answer;
    public char y;
    public char n;
    public int counter = 0;

    // initiate scanner for user input
    Scanner scan = new Scanner(System.in);

    public void run() {
        // pseudocode
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
        start();

    }

    // give game instructions and take user's name
    public void start() {
        // ask for name
        nameAsk = "Hello what is your name?";
        System.out.println(nameAsk);
        // assign input ot var name
        name = scan.nextLine();

        // return name
        nameReturn = String.format("\nYour name is: %1$s", name);
        System.out.println(nameReturn);

        // random
        int random;
        String randomReturn;
        // generate random number
        random = (int)(Math.random() * 21);
        randomReturn = String.format("Random number generated: %1$s", random);
        System.out.println(randomReturn);
    }

    // user re-guess random number value;
    public void newGuess() {
        // user re-guess
        if (guessSet > random) {
            System.out.println(guessHigh);
            guess = scan.nextInt();
            guessSet = guess;
        } else if(guess < random) {
            System.out.println(guessLow);
            guess = scan.nextInt();
            guessSet = guess;
        }
    }

    // set number value for first guess;
    public void setGuess() {
        // ask for a guess
        randomRange = String.format("\nWell, %1$s, I am thinking of a number 1 and 20", name);
        guessPrompt = "Take a guess";
        System.out.println(randomRange);
        System.out.println(guessPrompt);

        // take guess
        guess = scan.nextInt();
        guessReturn = String.format("You guessed: %1$s", guess);
        System.out.println(guessReturn);
        guessSet = guess;
    }

    // congratulate user, confirm random number, & ask to play again
    public void restart() {
        // confirm user guess
        guessCorrect = String.format("Your guess: %1$s", guessSet);
        System.out.println(guessCorrect);
        // congratulate user and confirm name
        congrats = String.format("Good job, %1$s", name);
        // confirm generated random number, and loops needed guess number correctly
        congrats2 = String.format("You guessed the number, %1$s, in %2$s guesses!", random, counter);
        // ask user to play again
        playAgain = "would you like to play again? (y or n)";
        // take in user answer
        Scanner scan = new Scanner(System.in);
        answer = scan.next().charAt(0);
        // set playAgain
        if (answer == n) {
            replay = false;
        }
    }
}
