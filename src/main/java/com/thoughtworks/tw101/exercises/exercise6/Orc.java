package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by sarapiette on 7/21/16.
 */
public class Orc implements Monster{
    private int hitPoints;
    private String name;

    public Orc(){
        hitPoints = 20;
        name = "Orc";
    }
    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.println("Monster Name: "+name+"\t\tStatus: "+hitPoints+" hit points");
    }
}
