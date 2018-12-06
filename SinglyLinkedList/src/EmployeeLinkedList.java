
public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {//inserting the node at the front of the list
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {//if empty nothing to remove
            return null;
        }

        EmployeeNode removedNode = head;//store element that is going to be removed in a temp variable
        head = head.getNext();//make the second elemnent the new head
        size--;//update the size
        removedNode.setNext(null);
        return removedNode;//return the removed node
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
