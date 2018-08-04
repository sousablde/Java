package com.example.sousa.traininginjava;
/*
perfect number is a positive integer that is equal to the sum
of its proper positive divisors, that is, the sum of its positive
 divisors excluding the number itself
 */

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println("result= " + isPerfectNumber(6) + " expected = true");
        System.out.println("result= " + isPerfectNumber(28) + " expected = true");
        System.out.println("result= " + isPerfectNumber(5) + " expected = false");
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number < 1) {
            return false;
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    sum += i;
                    if (sum == number) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
/*
output
result= true expected = true
result= true expected = true
result= false expected = false

Process finished with exit code 0
 */
