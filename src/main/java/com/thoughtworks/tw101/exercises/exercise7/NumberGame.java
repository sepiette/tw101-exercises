package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

/**
 * Created by sarapiette on 7/21/16.
 */
public class NumberGame {

    private int answer;
    private boolean hasWon;
    private int guess;

    public NumberGame(){
        Random rn = new Random();
        answer = rn.nextInt(100)+1;
        hasWon = false;
    }
    public void makeGuess(int guess){
        this.guess = guess;
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
}
