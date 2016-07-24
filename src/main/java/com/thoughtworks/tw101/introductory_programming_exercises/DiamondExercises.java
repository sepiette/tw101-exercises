package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        // (2*n)-1 spaces per row
        // ((2*n)-1)/2 ... 0 whitespaces per side
        StringBuilder triangle = new StringBuilder();
        int numWhiteSpaces = ((2*n)-1)/2;
        //System.out.println(numWhiteSpaces);
        for(int row = 1; row <= n; row++){
            for(int col=1;col <= numWhiteSpaces;col++){
                triangle.append(" ");
            }
            for(int ast=1; ast<=(2*row)-1;ast++){
                triangle.append("*");
            }
            triangle.append("\n");
            numWhiteSpaces --;
        }
        System.out.println(triangle.toString());
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        StringBuilder triangle = new StringBuilder();
        int numWhiteSpaces = ((2*n)-1)/2;
        String [] rowMem = new String[n];

        for(int row = 0; row < n; row++){
            for(int col=1;col <= numWhiteSpaces;col++){
                triangle.append(" ");
            }
            for(int ast=1; ast<=(2*row)-1;ast++){
                triangle.append("*");
            }
            triangle.append("\n");
            rowMem[row] = triangle.toString();
            triangle.setLength(0);
            numWhiteSpaces --;
        }

        for(int row = 0; row <n; row++){
            triangle.append(rowMem[row]);
        }

        for(int row = n-2; row >=0; row--){
            triangle.append(rowMem[row]);
        }

        System.out.println(triangle.toString());

    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        StringBuilder triangle = new StringBuilder();
        int numWhiteSpaces = ((2*n)-1)/2;
        String [] rowMem = new String[n];

        for(int row = 0; row < n; row++){
            for(int col=1;col <= numWhiteSpaces;col++){
                triangle.append(" ");
            }
            for(int ast=1; ast<=(2*row)-1;ast++){
                triangle.append("*");
            }

            triangle.append("\n");
            rowMem[row] = triangle.toString();
            triangle.setLength(0);
            numWhiteSpaces --;
        }

        for(int row = 0; row < n; row++){
            triangle.append(rowMem[row]);
        }
        triangle.append("Sara\n");
        for(int row = n-1; row >=0; row--){
            triangle.append(rowMem[row]);
        }

        System.out.println(triangle.toString());
    }
}
