package com.sousablde;

/*
makes assumptions about the data-all the values are discrete (no floating point numbers/strings)
doesn't use comparisons
counts number of occurences of each value
(only works with non-negative discrete values, no floats or strings)
values must be within a specific range
not an in-place algorithm
O(n)
can be used to sort stable but would need a few extra steps (instead of just incrementing a counter I could use a
linked list)
example:
2  5  9  8  2  8  7  10  4  3
when i=0 arr[0]=2 so, +1 at coutArr[1] because we know values are between 1 and 10
(position 0 will hold number of ones, position 2 will hold number of 2's, etc
0  1  0  0  0  0  0  0  0  0
when i=1 [1]=5 so arrCount[4]=1
0  1  0  0  1  0  0  0  0  0
when i=2 [2]=9 so arrCount[8]=1
0  1  0  0  1  0  0  0  1  0
when i=3 [3]=8 so arrCount[8]=1
0  1  0  0  1  0  0  1  1  0
when i=4 [4]=2 so arrCount[1]=2
0  2  0  0  1  0  0  1  1  0

and so on

now we write back to the original input array
0  2  1  1  1  0  1  2  1  1

will be
2  2  3  4  5  7  8  8  9  10
*/

public class Main {

    public static void main(String[] args) {
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        System.out.println("Unsorted Array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        System.out.println(" ");
        countingSort(intArray, 1, 10);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    public static void countingSort(int[] input, int min, int max) {

        int[] countArray = new int[(max - min) + 1];//possible 10 values one to 10 with 10 inclusive

        System.out.println("Count Array: ");
        for (int i = 0; i < input.length; i++) {//traverse array and count each one of the values we count
            countArray[input[i] - min]++;
            System.out.print(countArray[input[i] - min] + " ");//we subtract the min here to we tale into account
            //the max value in the array, in this case min is 2
            //max is 10, so correct so we don't end up with 11 indeces
        }

        System.out.println(" ");
        int j = 0;
        for (int i = min; i <= max; i++) {//here we will write the values back into the input array
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }

    }
}

/*
output
Unsorted Array:
2 5 9 8 2 8 7 10 4 3
Count Array:
1 1 1 1 2 2 1 1 1 1
Sorted Array:
2 2 3 4 5 7 8 8 9 10
Process finished with exit code 0
 */