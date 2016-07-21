package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           NumberGame game = new NumberGame();
           int tempGuess = 0;
           Scanner in = new Scanner(System.in);
           System.out.println("Guess a Number:");

           while (!game.checkWin()) {
               try {
                   tempGuess = Integer.parseInt(in.next());
                   game.makeGuess(tempGuess);
                   game.checkGuess();
               }
               catch (NumberFormatException e){
                   System.out.println("Invalid. Enter a number.");
               }

           }
            game.printGuesses();


    }
}
