package com.example.sousa.traininginjava;

import java.util.Scanner;
/*
Minimum And Maximum Challenge
Read the numbers from the console entered by the user and print the minimum and
maximum number the user has entered.
Before the user enters the number, print the message "Enter number:"
If the user enters an invalid number, break out of the loop and print the minimum and
maximum number.
Hint:
Use an endless while loop.
Bonus:
Create a project with the name MinAndMaxInputChaIIenge.
 */

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int maxNumber = 0;
        int minNumber = 0;

        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number # " + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if (counter == 1) {
                    minNumber = number;
                    maxNumber = number;
                }
                counter++;
                if (number > maxNumber) {
                    maxNumber = number;
                }
                if (number < minNumber) {
                    minNumber = number;
                }

            } else {
                System.out.println("invalid number");
            }
            scanner.nextLine();//handle end of line
        }
        System.out.println("Max Number is: " + maxNumber + " Min number is :" + minNumber);
        scanner.close();
    }
}


