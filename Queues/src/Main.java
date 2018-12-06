import java.util.LinkedList;

/*
they are an abstract data type
FIFO-first in first out
add-also called enqueue-adds item to end of queue
remove - also called dequeue, removes item at from of the queue
peek - get the item at the front of the queue without removing it
 */
public class Main {

    public static void main(String[] args) {
//
//        Employee janeJones = new Employee("Jane", "Jones", 123);
//        Employee johnDoe = new Employee("John", "Doe", 4567);
//        Employee marySmith = new Employee("Mary", "Smith", 22);
//        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
//        Employee billEnd = new Employee("Bill", "End", 78);
//
//        ArrayQueue queue = new ArrayQueue(10);
//        queue.add(janeJones);
//        queue.add(johnDoe);
//        queue.add(marySmith);
//        queue.add(mikeWilson);
//        queue.add(billEnd);
//        //queue.printQueue();
//
//        queue.remove();
//        queue.remove();
//        //queue.printQueue();
//
//        //System.out.println(queue.peek());
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        //queue.remove();
//
//        queue.add(mikeWilson);
//
//
//        queue.printQueue();

        //using queue with linked list
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 123);
        Employee spiderMan = new Employee("Spider", "Man", 123);
        Employee wonderWoman = new Employee("Wonder", "Woman", 123);
        Employee peterParker = new Employee("Peter", "Parker", 123);


        LinkedStack stack = new LinkedStack();
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(spiderMan);
        stack.push(wonderWoman);
        stack.push(peterParker);

        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());

        //practical use of a stack: check if word is a palindrome
        System.out.println(checkForPalindrome("radar"));
        System.out.println(checkForPalindrome("plant"));
        System.out.println(checkForPalindrome("I did, did I?"));

    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;
    }
}

