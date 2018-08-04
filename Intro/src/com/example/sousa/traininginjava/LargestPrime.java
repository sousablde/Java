package com.example.sousa.traininginjava;
/*
Write a method named getLargestPrime with one parameter of type int named number.
If the number is negative or does not have any prime numbers, the method should return -1 to indicate
an invalid value.
The method should calculate the largest prime of a given number and return it.
 */

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21)
                + "expected = 7");
        System.out.println(getLargestPrime(217) + "expected = 31");
        System.out.println(getLargestPrime(-222) + " expected = -1");
        System.out.println(getLargestPrime(45) + " expected = 5");
        System.out.println(getLargestPrime(-2) + " expected = -1");
    }

    public static int getLargestPrime(int number) {


        if (number <= 1) {
            return -1;
        }

        int largestPrime = 0;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                number /= i;
                largestPrime = (number > i) ? number : i;
                if (i == number) {
                    return number;
                }
            }
        }
        return largestPrime;

    }
}