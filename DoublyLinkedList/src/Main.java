/*
each item points to the next item on the list and the previous field
both the head and the tail point to null.
to insert or remove we can do it in constant time
working with nodes in the middle of the list is more complicated because we need to update the fields
that point to the next and the previous node

inserting at head:
create a new node
assign what used to be the head to the next field of the new node
assign the new node to the previous field
assign head to head to new node
this is O(1)

insert at tail
create new node
assign the current tail's next field to the new node
assign the new node's previous field to the former tail
assign tail to new node
O(1)
 */
public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());
        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());

    }
}
