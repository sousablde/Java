package com.example.sousa.traininginjava;
/*
find the greatest common divisor between two numbers
 */

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("result= " + getGreatestCommonDivisor(25, 15) + " expected = 5");
        System.out.println("result= " + getGreatestCommonDivisor(12, 30) + " expected = 6");
        System.out.println("result= " + getGreatestCommonDivisor(9, 18) + " expected = -1");
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int gcd = 0;
        if (first < 10 || second < 10) {
            return -1;
        } else {
            for (int i = 1; i <= first || i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    gcd = i;
                }
            }
            return gcd;
        }
    }
}
/*
output
result= 5 expected = 5
result= 6 expected = 6
result= -1 expected = -1

Process finished with exit code 0

 */
