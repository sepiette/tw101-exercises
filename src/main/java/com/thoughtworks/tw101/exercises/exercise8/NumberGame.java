package com.thoughtworks.tw101.exercises.exercise8;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by sarapiette on 7/21/16.
 */
public class NumberGame {
    private int answer;
    private boolean hasWon;
    private int guess;
    private ArrayList<Integer> guesses;
    private InputStream inputStream;
    private PrintStream printStream;
    private Scanner input;

    public NumberGame(InputStream inputStream, PrintStream printStream){
        this.inputStream = inputStream;
        this.printStream = printStream;
        input = new Scanner(inputStream);

        Random randNum = new Random();
        answer = randNum.nextInt(100)+1;

        hasWon = false;
        guesses = new ArrayList<Integer>();
    }

    public void playGame(){
        int tempGuess = 0;
        printStream.println("Guess a Number:");

        while (!checkWin()) {
            try {
                tempGuess = Integer.parseInt(input.next());
                makeGuess(tempGuess);
                checkGuess();
            }
            catch (NumberFormatException e){
                System.out.println("Invalid. Enter a number.");
            }

        }
        printGuesses();
    }

    private void makeGuess(int guess){
        this.guess = guess;
        guesses.add(this.guess);
    }

    private void checkGuess(){
        if(guess == answer){
            hasWon = true;
            printStream.println("You Win");
        }
        else if (guess < answer){
           printStream.println("Too Low");
        }
        else if (guess > answer) {
            printStream.println("Too High");
        }
    }

    private boolean checkWin(){
        return hasWon;
    }

    private void printGuesses(){
        StringBuilder guessStr = new StringBuilder();
        for(Integer num: guesses){
            guessStr.append(num+", ");
        }
        guessStr.delete(guessStr.length()-2,guessStr.length()-1);
       printStream.println("Your Guesses: "+guessStr.toString());
    }

}
