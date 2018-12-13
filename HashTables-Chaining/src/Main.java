/*
simpler than linear probing
instead of storing the value directly into the array, each array position contains a linked list
for example if we were to add an employee and the key that we sue has a hash value that colides with the hash value for
another key that is ok because linked lists have no boundaries



 */
public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        ChainedHashtable ht = new ChainedHashtable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);

        ht.printHashtable();

//        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
//
//        ht.remove("Doe");
//        ht.remove("Jones");
//        ht.printHashtable();
//

    }
}
