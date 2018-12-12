
public class SimpleHashtable {

    private Employee[] hashtable;

    public SimpleHashtable() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);//hashedKey gives index in the array
        //this hash table does not handle collisions, hence the message
        if (hashtable[hashedKey] != null) {
            System.out.println("Sorry, there's already an employee at position " + hashedKey);
        } else {
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    //takes a string and hashes it to a an int
    //the key and the hashed value are not the same
    //we take the key and hash it- attribute it to an int the actual hash
    //a hashing function that evenly distributes all the values makes search and
    //retrieval more efficient-ideal case-one value per key
    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }

}
