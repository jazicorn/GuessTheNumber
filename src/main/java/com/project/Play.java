package com.project;

import java.util.Scanner;

public class Play {

    // random
    public int random;
    public String randomRange;
    public String randomReturn;

    // name
    public String name;
    public String nameAsk;

    // guess
    public int guess;
    public int guessSet;
    public String guessReturn;
    public String guessPrompt;
    public String guessLow = "Your guess is too low";
    public String guessHigh = "Your guess is too high";
    public String guessAgain = "Guess Again";
    public String guessIncorrect;
    public String congrats;
    public String congrats2;
    public String gameOver;

    // play again
    public boolean replay;
    public String playAgain;
    public char answer;
    public char n;
    public int counter;
    public String counterCount = String.format("you have %1$s chances left", counter);

    // initiate scanner for user input
    Scanner scan = new Scanner(System.in);

    public void run() {
        start();
        setGuess();
    }

    // give game instructions and take user's name
    public void start() {
        counter = 6;
        // ask for name
        nameAsk = "Hello what is your name?";
        System.out.println(nameAsk);
        // assign input ot var name
        name = scan.nextLine();

        // return name
        // nameReturn = String.format("\nYour name is: %1$s", name);
        // System.out.println(nameReturn);

        // generate random number
        random = (int)(Math.random() * 21);
        randomReturn = String.format("Random number generated: %1$s", random);
        System.out.println(randomReturn);
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
        if (guess == random) {
            winner();
        }
        newGuess();
    }

    // user re-guess random number value;
    public void newGuess() {
        // user re-guess
        while(counter > 0) {
            if (guessSet > random) {
                counter--;
                System.out.println(guessHigh);
                System.out.println(guessAgain);
                guess = scan.nextInt();
                guessSet = guess;
                System.out.println("Your new guess: " + guessSet);
                counterCount = String.format("you have %1$s chances left", counter);
                System.out.println(counterCount);
                newGuess();
            } else if (guessSet < random) {
                counter--;
                System.out.println(guessLow);
                System.out.println(guessAgain);
                guess = scan.nextInt();
                guessSet = guess;
                System.out.println("Your new guess: " + guessSet);
                counterCount = String.format("you have %1$s chances left", counter);
                newGuess();
            } else{
                counter = 0;
            }
        }
        if (guessSet == random) {
            winner();
        }
        gameOver();
    }

    // if user picks correct number
    public void winner() {
        // reset counter;
        counter = 6;
        // congratulate user and confirm name
        congrats = String.format("Good job, %1$s!!!", name);
        System.out.println(congrats);
        // confirm generated random number, and loops needed guess number correctly
        congrats2 = String.format("You guessed the number, %1$s, in %2$s guesses!", random, counter);
        System.out.println(congrats2);
        // ask user to play again
        restart();
    }

    // if user runs out of chances
    public void gameOver() {
        guessIncorrect = String.format("Sorry, your guess: %1$s, was incorrect", guessSet);
        gameOver = String.format("The correct answer was: %1$s", random);
        System.out.println(guessIncorrect);
        System.out.println(gameOver);
        restart();
    }

    // ask user to play again
    public void restart() {
        while (replay) {
            playAgain = "would you like to play again? (y or n)";
            System.out.println(playAgain);
            // take in user answer
            Scanner scan = new Scanner(System.in);
            answer = scan.next().charAt(0);
            // set playAgain
            if (answer == n) {
                System.out.print("Goodbye!");
                replay = false;
            }
            start();
        }
        System.exit(0);
    }
}
