package com.thoughtworks.tw101.exercises.exercise6;

import java.io.PrintStream;

/**
 * Created by sarapiette on 7/21/16.
 */
public class Troll implements Monster {
    private int hitPoints;
    private String name;

    public Troll(){
        hitPoints = 40;
        name = "Troll";
    }
    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount/2;
    }

    @Override
    public void reportStatus() {
        System.out.println("Monster Name: "+name+"\t\tStatus: "+hitPoints+" hit points");
    }
}
