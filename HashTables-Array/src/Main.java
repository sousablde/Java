/*
Hash tables are abstract data types they provide speedy retrieval of data
they provide access to data by using keys
the keys do not have to be integers
the key/value pairs don't have to have matching datatypes
they are optimized for retrieval-when we know the key
associative array is one type of hash table-example of using a string as a key
hash tables are also known as dictionaries or maps (like in the map class)

Hashing
maps keys of any data type to an integer
hash function maps keys to an int
in java hash function is Object.hashCode()
Collision occurs when more than one value has the hashed value

Load factor
-tells us how full a hash table is
-load factor = #of items/capacity = size/capacity
-load factor is used to decide when to resize the array backing the hash table
-don't want a load factor too low (lots of empty space)
-don't want  a load factor too high (will increase likelihood of collisions)
-can play a role in determining the time complexity for the retrieval
-helps decide when to resize an array for example

Adding to a hash table backed by an array
-provide key/value pair
-use hash function to hash the key to an int value
-store the value at the hashed key value-tjis is the index into the array

To retrieve a value from a hash table
-provide the key
-use the same hash function to hash the key to an int value
-retrieve the value stored at the hashed key value

Example:
adding jones to the key jones:
-use the hash funtion to map "jones" to an int (example value 4)
-store "jane "jones" at array[4]
-retrieve the value at array[4]->"jane jones"

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

    }
}
/*
output
Sorry, there's already an employee at position 5
null
null
null
Employee{firstName='John', lastName='Doe', id=4567}
null
Employee{firstName='Jane', lastName='Jones', id=123}
Employee{firstName='Mike', lastName='Wilson', id=3245}
null
null
null
Retrieve key Wilson: Employee{firstName='Mike', lastName='Wilson', id=3245}

 */