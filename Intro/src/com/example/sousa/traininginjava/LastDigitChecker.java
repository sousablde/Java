package com.example.sousa.traininginjava;/*
write method hasSameDigit with 3 parameters type int
each number should be in range 10-1000 inclusive
if not in range return false
if at least 2 numbers share the same rightmost digit return true,
otherwise return false
 */

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println("result= " + hasSameLastDigit(41, 22, 71) + " expected = true");
        System.out.println("result= " + hasSameLastDigit(23, 32, 42) + " expected = true");
        System.out.println("result= " + hasSameLastDigit(9, 99, 999) + " expected = false");
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {

        if ((n1 < 10 || n1 > 1000) || (n2 < 10 || n2 > 1000) || (n3 < 10 || n3 > 1000)) {
            return false;
        } else {
            int lastDigit1 = n1 % 10;
            int lastDigit2 = n2 % 10;
            int lastDigit3 = n3 % 10;
            if (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3) {
                return true;
            } else return lastDigit2 == lastDigit3 || lastDigit2 == lastDigit1;
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