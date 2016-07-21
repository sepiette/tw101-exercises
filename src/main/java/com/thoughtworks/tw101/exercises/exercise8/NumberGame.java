package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by sarapiette on 7/21/16.
 */
public class NumberGame {
    private int answer;
    private boolean hasWon;
    private int guess;
    private ArrayList<Integer> guesses;
    public NumberGame(){
        Random rn = new Random();
        answer = rn.nextInt(100)+1;
        hasWon = false;
        guesses = new ArrayList<Integer>();
    }
    public void makeGuess(int guess){

        this.guess = guess;
        guesses.add(this.guess);
    }

    public void checkGuess(){
        if(guess == answer){
            hasWon = true;
            System.out.println("You Win");
        }
        else if (guess < answer){
            System.out.println("Too Low");
        }
        else if (guess > answer) {
            System.out.println("Too High");
        }
    }

    public boolean checkWin(){
        return hasWon;
    }

    public void printGuesses(){
        StringBuilder guessStr = new StringBuilder();
        for(Integer num: guesses){
            guessStr.append(num+", ");
        }
        guessStr.delete(guessStr.length()-2,guessStr.length()-1);
        System.out.println("Your Guesses: "+guessStr.toString());
    }

}
