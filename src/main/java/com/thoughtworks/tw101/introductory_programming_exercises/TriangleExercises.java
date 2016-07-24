package com.thoughtworks.tw101.introductory_programming_exercises;

public class TriangleExercises {
    public static void main(String[] args) {
        drawAnAsterisk();
        System.out.print("\n");
        drawAHorizontalLine(8);
        System.out.print("\n");
        drawAVerticalLine(3);
        System.out.print("\n");
        drawARightTriangle(3);
    }

//    Easiest exercise ever
//    Print one asterisk to the console.
//    Example: *
    private static void drawAnAsterisk() {
        System.out.println("*");

    }

//    Draw a horizontal line
//    Given a number n, print n asterisks on one line.
//    Example when n=8:  ********
    private static void drawAHorizontalLine(int n) {
        StringBuilder astLine = new StringBuilder();
        for(int asterisk=0; asterisk < n;asterisk++){
            astLine.append("*");
        }
        System.out.println(astLine.toString());

    }

//    Draw a vertical line
//    Given a number n, print n lines, each with one asterisks
//    Example when n=3:
//            *
//            *
//            *
    private static void drawAVerticalLine(int n) {
        for(int asterisk=0; asterisk < n;asterisk++){
            System.out.println("*");
        }
    }

//    Draw a right triangle
//    Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
//    Example when n=3:
//            *
//            **
//            ***
    private static void drawARightTriangle(int n) {
        StringBuilder triangle = new StringBuilder();
        for(int row=0; row < n;row++){
            for(int col=0; col<=row; col++){
                triangle.append("*");
            }
            triangle.append("\n");
        }
        System.out.println(triangle.toString());
    }
}
