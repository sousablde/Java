package com.example.sousa.traininginjava;
/*
 the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
The method should return true if it is possible to make a package with goal kilos of flour.
If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example,
if goal = 9, bigCount = 2, and smallCount = 0, the method should return false because each bigCountbag
is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method
should return true because 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if
there are additional bags left over.
If any of the parameters are negative, return false.

 */

public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println("result= " + canPack(1, 0, 4) + " expected = false");
        System.out.println("result= " + canPack(1, 0, 5) + " expected = true");
        System.out.println("result= " + canPack(2, 1, 5) + " expected = true");
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int large = bigCount * 5;
        if ((large < 0) || (smallCount < 0) || goal < 0) {
            return false;
        } else if (large + smallCount >= goal) {
            return goal % 5 <= smallCount;
        }
        return false;
    }
}