/*
open addressing to handle collisions
-if we attempt to put an employee into the table and there is already an employee
 at the selected slot then we look for an alternate position in the array
-with linear probing when we find a position for a hashed key value that is already occupied
ew increment the hashed value by one and then we check the resulting index
-for example since mary already occupies position 5 we increment to 6/7 until
 a non-occupied spot was to be found
 -if the hash table is full we can't add the employee to the hashed table
 -each increment of the index is called a probe
 -the lower number of probes we have to use the better

 */
public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashtable ht = new SimpleHashtable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);

        ht.printHashtable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve key Smith: " + ht.get("Smith"));

        ht.remove("Wilson");
        ht.remove("Jones");
        ht.printHashtable();

        System.out.println("Retrieve key Smith: " + ht.get("Smith"));


    }

}
