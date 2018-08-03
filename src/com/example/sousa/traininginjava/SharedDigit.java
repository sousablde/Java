package com.example.sousa.traininginjava;/*
each number should be within range 10 inclusive and 99 inclusive, if number is
not in range return false
if in range determine if the two number share any of the same digit
 */

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println("result= " + hasSharedDigit(12, 23) + " expected = true");
        System.out.println("result= " + hasSharedDigit(9, 99) + " expected = false");
        System.out.println("result= " + hasSharedDigit(15, 55) + " expected = true");
        System.out.println("result= " + hasSharedDigit(10, 100) + " expected = false");
    }

    public static boolean hasSharedDigit(int start, int end) {
        int loopingStart = start;
        int loopingEnd = end;
        int parsingStart;
        int parsingEnd;
        boolean found = false;

        if ((start <= 10 || start >= 99) && (end <= 10 || end >= 99)) {
            return false;
        } else {
            do {
                parsingStart = loopingStart % 10;
                loopingStart /= 10;
                while (loopingEnd != 0) {
                    parsingEnd = loopingEnd % 10;
                    loopingEnd /= 10;
                    found = parsingStart == parsingEnd;
                }

            } while (loopingStart != 0);

        }
        return found;
    }
}
/*
output
result= true expected = true
result= false expected = false
result= true expected = true
result= false expected = false

Process finished with exit code 0

 */
