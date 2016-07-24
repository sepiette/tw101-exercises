package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class PrimeFactors {
    public static void main(String[] args) {

        List<Integer> primeFactors = generate(315);
        for(Integer factor: primeFactors){
            System.out.print(factor+" ");
        }
    }

    private static List<Integer> generate(int n) {
        Set<Integer> primeSet = new HashSet<>();
        if(n==1){
            return new LinkedList<>();
        }
        while(n%2==0){
            primeSet.add(2);
            n /= 2;
        }
        for(int i=3; i<Math.sqrt(n);i+=2){
            while(n%i==0){
                primeSet.add(i);
                n /= i;
            }
        }

        if(n>2){
            primeSet.add(n);
        }
        LinkedList<Integer> primes =  new LinkedList<Integer>();
        primes.addAll(primeSet);
        return primes;
    }
}
