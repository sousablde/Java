package com.sousablde;
/*
this particular algorithm's performance degrades very quickly with the growth of the data set
O(n^2)
 */

public class Main {

    public static void main(String[] args) {
        int[] intArray = {10, 35, -15, 7, 9, 40, -22};

        //now use the bubblesort-ascending sorting
        //for the outer loop we want to bubble the largest value to the end
        for (int lasUnsortedIndex = intArray.length - 1; lasUnsortedIndex > 0; lasUnsortedIndex--) {
            for (int i = 0; i < lasUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        //now to print out the sorted array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    //creating a swap method
    //i and j are the indexes of the elements I want to swap
    public static void swap(int[] array, int i, int j) {
        //first check if i==j (in this case nothing needs to be done
        if (i == j) {
            return;
        }

        //create a temporary variable to hold the value of the array we want to swap
        int temp = array[i];
        array[i] = array[j];//what used to be in position j is now in position i
        array[j] = temp;//assign what used to be in position i back to position j

    }
}
/*
output
 */
