/*
-we know the root has the largest value
-swap root with last element of the array
-heapify the tree but exclude the last node
-after heapify second largest element is at the rooth
repeat until fixed

                         80
                       /    \
                    75        60
                  /    \    /    \
                68     55   40     52
              /
             67

 | 0| 1| 2| 3| 4| 5| 6| 7|
 |80|75|60|68|55|40|52|67|
 lastHeapIndex = 7
 swap heap[0] with [lastHeapIndex]

                        80->67
                       /    \
                    75        60
                  /    \    /    \
                68     55   40     52
              /
           67->80

 | 0| 1| 2| 3| 4| 5| 6| 7|
 |67|75|60|68|55|40|52|80|
 at this point after the swap we need to heapify
 lastHeapIndex = 6
 swap heap[0] with [lastHeapIndex]

                        67->75
                       /    \
                  75->68      60
                  /    \    /    \
              68->67   55  40     52
              /
             80
 | 0| 1| 2| 3| 4| 5| 6| 7|
 |75|68|60|67|55|40|52|80|

  lastHeapIndex = 5
 swap heap[0] with [lastHeapIndex]
 at this point the third largest value will be at the root and 75 and 80 will be sorted and not part of the heap

                       75->68
                       /    \
                  68->67      60
                  /    \    /    \
              67->52   55  40     52->75
              /
             80

 | 0| 1| 2| 3| 4| 5| 6| 7|
 |68|67|60|52|55|40|75|80|
 */

public class Main {

    public static void main(String[] args) {
        Heap heap = new Heap(10);

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();

        //System.out.println(heap.peek());

        heap.delete(0);
        heap.printHeap();

        //System.out.println(heap.peek());

        heap.sort();
        heap.printHeap();
    }
}
