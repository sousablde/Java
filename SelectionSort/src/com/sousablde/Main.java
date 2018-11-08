package com.sousablde;
/*
stable vs unstable sort
when we have duplicate values in a data set will the original ordering of the duplicates be retained?
if it is unstable the duplicate ordering will not be preserved
if it is stable their ordering is preserved
it is important if we are sorting objects (names and ages would cause ages to no longer match the correct name for
example)
in the case of bubble sort - it is a stable algorithm, we only swap if there are difference in the values

selection sort divides data set in sorted and unsorted partitions
we set a largest field to 0 for example and we compare elements to this value
in each traversal we are selecting the highest element and moving it to the end

selection sort is an unstable algorithm, in each pass there are elements being moved
based on this, selection sort would be a poor choice for a case requiring a stable algorithm

 */

public class Main {

    public static void main(String[] args) {


        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //when lastUnsorted reaches 0 it means all elements have been sorted
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;//in unsorted partition largest element is in position 0, compare others to 0

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;//update value of largest in case a largest element is found
                }
            }

            swap(intArray, largest, lastUnsortedIndex);

        }


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}

