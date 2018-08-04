package com.example.sousa.traininginjava;

import java.util.Scanner;
/*
read 10 numbers from the console entered by the user and print the sum of the numbers
use the hasNextInt method from the scanner to check if the user has entered an
int value
if hasNextInt returns false print message "invalid Number" continue reading
until I have read the 10 numbers
use nextInt() method to get the number and add it to the sum
 */

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number # " + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;

                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("invalid number");
            }
            scanner.nextLine();//handle end of line
        }
        System.out.println("sum is: " + sum);
        scanner.close();
    }
}

