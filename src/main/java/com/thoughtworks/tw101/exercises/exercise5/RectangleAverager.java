package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {

        float totalArea = 0;
        float avgArea = 0;
        for(Rectangle rect: rectangles){
            totalArea += rect.area();
        }
        avgArea = totalArea/rectangles.length;
        return avgArea;

    }
}
