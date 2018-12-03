/*
makes assumptions about data (has same radix and width ex for the decimal system is 10, binary numbers is 2)
data must be integer or strings
sort based on individual digit or letter position
start at rightmost position
must use a stable sort algo at each stage
counting sort is used as the sort algorithm for the radix sort
O(n)
in-place depending on which sort is chosen
stable algo

we have the following array
4725  4586  1330  8792  1594  5729

first I will sort based on the 1's position (there are all decimal numbers of width 4)

0->2->4->5->6->9
1330  8792  1594  4725  4586  5729

next we move to the second position from the right or the 10's position
2->2->3->8->9->9
4725  5729  1330  4586  8792  1594

next sort based on the 100's position
3->5->5->7->7->7
1330  4586  1594  4725  5729  8792

finally we sort based on the 1000's position
1330  1594  4586  4725  5729  8792

Stable counting sort:
can calculate where values should be written back to the original array, writing into the array backwards order
ensures stability
compared to the previous situation, we have duplicate values in the 10's position
1594 must remain after 8792
5729 must remain after 4725
so:
1330  8792  1594  4725  4586  5729

will result in the count array:
0  0  2  1  0  0  0  0  1  2

I will create a temp array that matches the length of the array we're sorting and then we will traverse it backwards

 */
public class Main {

    public static void main(String[] args) {

        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        System.out.println("Unsorted Array: ");
        for (int i = 0; i < radixArray.length; i++) {
            System.out.print(radixArray[i] + " ");
        }
        System.out.println(" ");

        radixSort(radixArray, 10, 4);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < radixArray.length; i++) {
            System.out.print(radixArray[i] + " ");
        }
    }

    public static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {//starts at the rightmost position-from least sig to most
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix) {

        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value : input) {//for every value in the input array
            countArray[getDigit(position, value, radix)]++;//count how many values have a certain digit in position x
        }
        // Adjust the count array
        for (int j = 1; j < radix; j++) {//sum all the counts up to and including the working digit
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] =
                    input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }

    }


    public static int getDigit(int position, int value, int radix) {//counts how many digits in each position
        return value / (int) Math.pow(radix, position) % radix;//make sure it is not floating point
        //math.pow takes the position and raises it to the value, for example for the first value with will
        //be 472 and the remainder is going to be 5
        //for position 2,  handling the 100's we would have 10 to the power of 2 which is 100 4725/100 gets us 47
        //with a remainder of 7 and so on
    }

}
/*
output
Unsorted Array:
4725 4586 1330 8792 1594 5729
Sorted Array:
1330 1594 4586 4725 5729 8792
Process finished with exit code 0

 */