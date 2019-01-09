/*
heaps are a special type of binary tree
it is a complete binary tree
must satisfy heap property-depends if it is max or min heap
max heap-every parent is greater than or equal than its children
min heap-every parent is less than or equal to its children
children are added from left to right
usually implemented with arrays
max or min will be at root
heapify-process of converting a binary tree into a heap-done after insertion
or deletion
no required ordering between children
we access the root in constant time
we insert at bottom level which requires traversal

we can store binary heaps as arrays
root is at array[0]
we traverse each level from left to right and so left child of the root
would fo into array[1] and right child would go to array[2]


                         22
                       /    \
                    19        18
                  /    \    /    \
                15     3   14     4
              /
             12
     this tree would look like this in an array:
     | 0| 1| 2| 3| 4| 5| 6| 7|
     |22|19|18|15| 3|14| 4|12|

     for the node at array[i]:
     leftchild = 2i+1
     rightchild = 2i+2

     parent  = floor((i-1)/2)

Insert into Heap
-always add new items to the end of the array
-heapify
-compare new items against its parent
- if item greater than its parent swap it with the parent
 */
public class Main {

    public static void main(String[] args) {

    }
}
