import java.util.ArrayList;

/*
Linked List are linear data structures where the elements are not stored in contiguous locations and every element is
a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element
 is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays.
 It also has few disadvantages like the nodes cannot be accessed directly instead we need to start from the head and
 follow through the link to reach to a node we wish to access.
To store the elements in a linked list we use a doubly linked list which provides a linear data structure and also used
to inherit an abstract class and implement list and deque interfaces.

In Java, LinkedList class implements the list interface. The LinkedList class also consists of various constructors
and methods like other java collections.

Constructors for Java LinkedList:

LinkedList(): Used to create an empty linked list.
LinkedList(Collection C): Used to create a ordered list which contains all the elements of a specified collection,
 as returned by the collection’s iterator.
 */
public class Main {

    public static void main(String[] args) {
        //new instance of the class
        Customer customer = new Customer("Tim", 54.96);
        //second instance of the class
        Customer anotherCustomer;
        anotherCustomer = customer;
        //changing balance for the second instance of the class
        anotherCustomer.setBalance(12.18);
        //this is printing the value of the second instance of the class
        //we made the second instance point to the first one
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        //creating array list of integers
        ArrayList<Integer> intList = new ArrayList<Integer>();
/*
to insert and element we have to move all the other entires after the insert position
if we delete an element all the other elements need to be moved up
 */
        intList.add(1);
        intList.add(3);
        intList.add(4);
//outputting each element in the array
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

    }
}
