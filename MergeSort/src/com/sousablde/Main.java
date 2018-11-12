package com.sousablde;
/*
 merge sort is a divide and conquer algorithm because it involves splitting the array.

You want to store it into a bunch of smaller arrays and it's usually implemented using recursion.

You can write the algorithm using loops but it's usually written recursively merge sort involves two

major phases.

The first phase is the splitting phase and the second phase is the merging phase.

We do the sorting during the merging phase the splitting phase is a preparation phase to make sorting

faster during the merging phase.
 */
/*
splitting phase start with unsorted array
divide array into 2 arrays which are unsorted (left array and right array
left and right array are split in two two arrays each(keep splitting until each arraay only has one element


merge phase
merge every left right into their pair in a sorted manner
after first merge the arrays will have 2 element sorted arrays
repeat until there is a single sorted array
it is not a in-place algorithm it uses temporary arrays

we create a temp array large enough to hold all the elements we are merging
we set i to the first index of the left array and j to the first index of the right array
compare left[i] to right[j] if left is smaller copy to temp array and increment i by one
if right is smaller copy to the temp array and increment by j

stable algorithm
 */

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }

}

