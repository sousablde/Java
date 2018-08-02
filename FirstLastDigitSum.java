package com.example.sousa.sumfirstandlastdigit;
/*
write method sumFirstAndLastDigitSum(int number)
if he number is negative have the method return 0
 */

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println("result= " + sumFirstAndLastDigit(252) + " expected = 4");
        System.out.println("result= " + sumFirstAndLastDigit(257) + " expected = 9");
        System.out.println("result= " + sumFirstAndLastDigit(0) + " expected = 0");
        System.out.println("result= " + sumFirstAndLastDigit(-10) + " expected = -1");
    }

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = 0;
        int firstDigit = 0;
        int originalNumber = number;

        if (originalNumber < 0) {
            return -1;
        }

        while (originalNumber > 0) {

            if (originalNumber < 10) {
                firstDigit = originalNumber;
                lastDigit = number % 10;
            }
            originalNumber /= 10;
        }
        return firstDigit + lastDigit;
    }

}
/*
output:
result= 4 expected = 4
result= 9 expected = 9
result= 0 expected = 0
result= -1 expected = -1
*/