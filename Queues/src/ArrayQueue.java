
import java.util.NoSuchElementException;

public class ArrayQueue {

    //3 fields needed, the one for the array, something to keep track of the front and to keep track of the back
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    //the front doesn't really change, it is the back of the queue that needs to be updated
    public void add(Employee employee) {
//        if (back == queue.length) {//this is a bit ineficient because what is the point of resizing if for instance we
//            //only have 2 employees?
//            //updating the size of the array in case it is full
//            Employee[] newArray = new Employee[2 * queue.length];
//            System.arraycopy(queue, 0, newArray, 0, queue.length);
//            queue = newArray;
//        }
//        //to prevent resizing when not needed we will adjust the previous bit of code
//        if(size() == queue.length-1){
//            Employee[] newArray = new Employee[2 * queue.length];//this resizing does not work for a wrapped queue
//            System.arraycopy(queue, 0, newArray, 0, queue.length);
//            queue = newArray;
//        }
        //for a wrapped queue we need to copy all the elements from the back to front of the array
        if (size() == queue.length - 1) {
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];//this resizing does not work for a wrapped queue
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back);//back == number of items in
            //front
            front = 0;
            back = numItems;

            queue = newArray;
        }

        queue[back] = employee;
        //to actually wrap the queue and make it circular we need to adjust it

        if (back < queue.length - 1) {//one element short to make sure we can wrap the queue
            back++;
        } else {
            back = 0;
        }
    }

    //we always remove the first item on the queue so, no need to pass anything
    public Employee remove() {
        //size is obtained by subtracting front from back
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        //if front was one and an employee was removed then the next employee is in the next position
        front++;
        if (size() == 0) {
            //if after the removal there are no more employees we can reset the queue to 0, the empty state
            front = 0;
            back = 0;
        }
        //added code to consider the wrapping around of the queue
        else if (front == queue.length) {
            front = 0;
        }

        return employee;
    }

    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    //this mehtod also needs to be adapted to a circular queue
    public int size() {
        if (front <= back) {//means queue is not wrapped
            return back - front;
        }
        return back - front + queue.length;
    }

    public void printQueue() {
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        } else {

            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);

            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);


            }
        }
    }
}
