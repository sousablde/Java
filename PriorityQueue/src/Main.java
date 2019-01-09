
import java.util.PriorityQueue;

/*
a priority queue is an abstract data type that is commonly implemented as a max heap.
for this particular java class it kinda works like a mean heap in the sense that, the lowest the number
the highest the priority will be 
 */

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(25);
        pq.add(-22);
        pq.add(1343);
        pq.add(54);
        pq.add(0);
        pq.add(-3492);
        pq.add(429);

//        System.out.println(pq.peek());
//        System.out.println(pq.remove());
//        System.out.println(pq.peek());
//        System.out.println(pq.poll());
//        System.out.println(pq.peek());
        System.out.println(pq.remove(54));

        Object[] ints = pq.toArray();
        for (Object num : ints) {
            System.out.println(num);
        }

        //System.out.println(pq.peek());
        pq.add(-1);
        //System.out.println(pq.peek());
    }
}
