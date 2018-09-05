/*
arraylists can't take ints because they are primitive types and not classes
what we can do is create an IntClass that makes the ints work as if they were classes
Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding
 object wrapper classes. For example, converting an int to an Integer, a double to a Double, and so on.
  If the conversion goes the other way, this is called unboxing.
  Consider the following code:
List<Integer> li = new ArrayList<>();
for (int i = 1; i < 50; i += 2)
    li.add(i);
Although you add the int values as primitive types, rather than Integer objects, to li, the code compiles.
 Because li is a list of Integer objects, not a list of int values, you may wonder why the Java compiler does not
  issue a compile-time error. The compiler does not generate an error because it creates an Integer object from i and
   adds the object to li. Thus, the compiler converts the previous code to the following at runtime:
List<Integer> li = new ArrayList<>();
for (int i = 1; i < 50; i += 2)
    li.add(Integer.valueOf(i));
Converting a primitive value (an int, for example) into an object of the corresponding wrapper class (Integer) is
called autoboxing. The Java compiler applies autoboxing when a primitive value is:

Passed as a parameter to a method that expects an object of the corresponding wrapper class.
Assigned to a variable of the corresponding wrapper class.
Consider the following method:
public static int sumEven(List<Integer> li) {
    int sum = 0;
    for (Integer i: li)
        if (i % 2 == 0)
            sum += i;
        return sum;
}
Because the remainder (%) and unary plus (+=) operators do not apply to Integer objects, you may wonder why the Java
compiler compiles the method without issuing any errors. The compiler does not generate an error because it invokes
the intValue method to convert an Integer to an int at runtime:

public static int sumEven(List<Integer> li) {
    int sum = 0;
    for (Integer i : li)
        if (i.intValue() % 2 == 0)
            sum += i.intValue();
        return sum;
}
Converting an object of a wrapper type (Integer) to its corresponding primitive (int) value is called unboxing.
The Java compiler applies unboxing when an object of a wrapper class is:
Passed as a parameter to a method that expects a value of the corresponding primitive type.
Assigned to a variable of the corresponding primitive type.
 */
public class Main {

    public static void main(String[] args) {
        // Your job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("National Australia Bank");

        if (bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");

        if (!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if (!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }


    }
}

