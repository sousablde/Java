package com.sousa.challenges.arrays;

import java.util.Scanner;

/*
-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to
 enter.

-The method needs to read from the console until all the numbers are entered, and then return an array containing the
 numbers entered.

-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.

-In the main() method read the count from the console and call the method readIntegers() with the count parameter.

-Then call the findMin() method passing the array returned from the call to the readIntegers() method.

-Finally, print the minimum element in the array.

Tips:
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name eMinElementChallengef
 */
public class MinimumElementChallenge {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //I need a method to determine how many ints are to be read
        System.out.println("enter number of elements: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);

        //return the min value found in the findMin method
        //passe the values entered by the user
        int returnedMin = findMin(returnedArray);

        //print out the found min value
        System.out.println("min is= " + returnedMin);


    }

    //Write a method called readIntegers() with a parameter called count that represents how many integers the user
    // needs to enter
    private static int[] readIntegers(int count) {
        int[] array = new int[count];

        //need a for loop to read the numbers
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;

    }

    //-Write a method findMin() with the array as a parameter. The method needs to return the minimum
    // value in the array.
    private static int findMin(int[] array) {
        //set min variable to the highest int that it can hold
        int min = Integer.MAX_VALUE;

        //cycle through array to find smallest number
        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value < min) {
                min = value;
            }
        }
        return min;

    }
}
