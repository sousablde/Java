package com.example.sousa.traininginjava;
/*
print all factors of a number
 */

public class AllFactors {
    public static void main(String[] args) {
        System.out.println(" expected = 1 2 3 6");
        printFactors(6);
        System.out.println(" expected = 1 2 4 8 16 32");
        printFactors(32);
        System.out.println(" expected = 1 2 5 10");
        printFactors(10);
        System.out.println(" expected = Invalid");
        printFactors(-1);

    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
/*
output
 expected = 1 2 3 6
1
2
3
6
 expected = 1 2 4 8 16 32
1
2
4
8
16
32
 expected = 1 2 5 10
1
2
5
10
 expected = Invalid
Invalid Value

Process finished with exit code 0
 */