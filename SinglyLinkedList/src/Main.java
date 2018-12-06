/*
in linked lists each item is called a node
the first item in the list is the head of the list
the last item on the list just points to null since there is nothing after it
each node points to the next one
if we have a reference to the head we will be able to traverse the entire list
so, in a linked list the only thing I truly have to store is the reference to the head/first node

Inserting an item in a list:
1/create a new node
2)assign what was the head to the next field
3) assign head to what will now be the new head
4)will be O(1) as long as inserting in from of the list
deleting again is more advantageous if it is doen from the front of the list
1)assign the head to a temporary variable (for example node2Remove
2)assign head to what was the second node
3)return the removed node
4)this way it will be O(1) time complexity
 */
public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

    }
}
