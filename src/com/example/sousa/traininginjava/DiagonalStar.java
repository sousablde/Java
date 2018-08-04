package com.example.sousa.traininginjava;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(8);
//        printSquareStar(-1);
//        printSquareStar(5);
    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {//rows

                for (int j = 1; j <= number; j++) {//columns
                    if ((i == 1 || i == number)) {//first and last row
                        System.out.print("*");
                    } else if (j == 1 || j == number) {//last column
                        System.out.print("*");
                    } else if (i == j) {//midpoint of figure
                        System.out.print("*");
                    } else if (i == (number - j) + 1) {//diagonal
                        System.out.print("*");
                    } else {
                        System.out.print(" ");//space introduction
                    }
//                    if (i==1||i==number||j==1||j==number) {
//                        System.out.print("*");
//                    } else if (i==j||j==number+1-i) {
//                        System.out.print("*");
//                    }else{
//                        System.out.print(" ");
//                    }
                }
                System.out.println();//row change
            }
        }

    }
}
/*
 *****
 ** **
 * * *
 ** **
 *****

 ********
 **    **
 * *  * *
 *  **  *
 * *  * *
 **    **
 ********
 */