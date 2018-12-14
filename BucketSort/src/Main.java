/*
uses hashing
makes assumptions about the data (like radix and counting sort)-can sort in O(n)
performs best when hashed values of items being sorted are evenly distributed so there aren't many collisions
not in-place
stable depending on the sort algorithm
to achieve O(n) must only have one item per bucket
insertion sort is a fast option i the number of items is small

-first we distribute items into buckets based on their hashed values(scattering phase)2-sort the items into each bucket

-merge the buckets-can just concatenate them(gathering phase)-for this step to work the values in bucket x must be
greater than the values in bucket x-1 and less than the values in bucket x+1 the hash function must meet these
requirements

it is a generalization of the counting sort
example:

54|46|83|66|95|92|43
they are going to be sorted into buckets based on the second significant value (tens)
54 will be hashed to 5, 46 will be hashed to 4 and so on

  |  |  |  |46->43|54||66|  |83|95->92

  |  |  |  |43->46|54||66|  |83|95->92

43|46|54|66|83|92|95
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];//10 buckets to do the scattering

        for (int i = 0; i < buckets.length; i++) {
            // using linked lists for the buckets
            //buckets[i] = new LinkedList<Integer>();

            // using arraylists as the buckets
            buckets[i] = new ArrayList<Integer>();//can also used linked list instead of array list
        }

        for (int i = 0; i < input.length; i++) {//traverse the input array
            buckets[hash(input[i])].add(input[i]);
        }

        for (List bucket : buckets) {//merge sort to sort the buckets
            Collections.sort(bucket);
        }

        int j = 0;//wil track where we are in the input array
        for (int i = 0; i < buckets.length; i++) {//now that the buckets are sorted to the merge and gathering
            for (int value : buckets[i]) {
                input[j++] = value;//traversing the array, outer loop traverses the buckets array, inner loop traverses
                // the array list
            }
        }
    }

    private static int hash(int value) {//ideally we mod based on the length of the array
        return value / 10 % 10;
    }


}
