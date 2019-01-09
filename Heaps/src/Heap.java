
public class Heap {

    private int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    /*
    Inserting into heap
     */
    public void insert(int value) {
        if (isFull()) {
            //no need to resize array, just throw exception
            throw new IndexOutOfBoundsException("Heap is full");
        }
        //at this point we might have to heapify
        //for example in the case of value being bigger than its parents
        heap[size] = value;

        fixHeapAbove(size);
        size++;
    }

    //since we insert at the bottom of a tree
    //when heapifying we are looking up the tree
    private void fixHeapAbove(int index) {
        int newValue = heap[index];//value we just inserted

        //if we haven't hit the root compare new value
        //to the value of its parent
        while (index > 0 && newValue > heap[getParent(index)]) {
            //in this portion of the code
            //any parents with smaller value than what we are inserting
            //will be swapped down in the tree
            heap[index] = heap[getParent(index)];//assign parent to where the new value is
            index = getParent(index);
        }

        heap[index] = newValue;
    }

    /*
    deleting from the heap
     */
    public int getChild(int index, boolean left) {
        //if we want the left child we add one, if we want the right child we
        //add 2
        return 2 * index + (left ? 1 : 2);
    }

    public int delete(int index) {
        //we can't sort this array because it will affect the tree
        //structure
        //so we will have to use linear search
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("heap is empty");

        }
        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index] = heap[size - 1];//right most value replaces what was at index

        if (index == 0 || heap[index] < heap[parent]) {
            fixHeapBelow(index, size - 1);
        } else {
            fixHeapAbove(index);
        }
        size--;
        return deletedValue;

    }

    private void fixHeapBelow(int index, int lastHeapIndex) {
        int child2swap;

        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);

            if (leftChild <= lastHeapIndex) {
                if (rightChild > lastHeapIndex) {
                    child2swap = leftChild;
                } else {
                    //heap leftchild is greater than right child
                    //we assign the index of left child to child to swap
                    child2swap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }

                //compare heap index to the child2swap
                //we only need to swap if value is less than
                //child2swap
                if (heap[index] < heap[child2swap]) {
                    int temp = heap[index];
                    heap[index] = heap[child2swap];
                    heap[child2swap] = temp;
                } else {
                    break;
                }
                index = child2swap;
            } else {
                break;
            }
        }

    }

    public boolean isFull() {
        return size == heap.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //no need to use floor since there will be truncation of the int
    //for the smallest value
    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            System.out.print(", ");
        }
        System.out.println();
    }

}
