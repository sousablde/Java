package com.example.sousa.traininginjava;
/*
write method numbertowords(int number)
passed numbers need to be printed out in words for the digits

 */

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        System.out.println("expected = One two three");
        numberToWords(1010);
        System.out.println("expected = one zero one zero");
        numberToWords(-222);
        System.out.println(" expected = Invalid Number");
        numberToWords(-22);
        System.out.println(" expected = Invalid Number");
        numberToWords(-2);
        System.out.println(" expected = Invalid Number");
    }

    public static void numberToWords(int number) {
        int lastDigit = 0;
        int parsingNumber = reverse(number);
        int numOfDigits = getDigitCount(number);
        System.out.println("test" + reverse(number));
        if (number < 0) {
            System.out.println("Invalid Number");
        } else {
            for (int i = numOfDigits; i > 0; i--) {
                lastDigit = parsingNumber % 10;
                parsingNumber /= 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("it was none of these");
                        break;
                }

            }
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        int posConv = Math.abs(number);
        int numOfDigits = getDigitCount(posConv);

        for (int i = numOfDigits; i > 0; i--) {
            reversedNumber = reversedNumber * 10 + posConv % 10;
            posConv /= 10;
        }
        System.out.println("test all pos " + reversedNumber);
        if (number > 0) {
            return reversedNumber;
        } else {
            System.out.println("test neg rev" + (0 - reversedNumber));
            return 0 - reversedNumber;
        }

    }

    public static int getDigitCount(int number) {
        int digitCount = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            while (number != 0) {
                number /= 10;
                digitCount++;
            }
            //System.out.println(digitCount);
            return digitCount;
        }

    }
}
