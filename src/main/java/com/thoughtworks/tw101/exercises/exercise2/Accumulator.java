package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private int incrementCount;

    public Accumulator(){
        incrementCount = 0;
    }

    public void increment(){
        incrementCount++;
    }

    public void total(){
        System.out.println("Increment Count: "+incrementCount);
    }
}
