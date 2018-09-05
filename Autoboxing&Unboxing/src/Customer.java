import java.util.ArrayList;


public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    //constructor taking 2 parameters
    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    //store the transaction in the array list
    public void addTransaction(double amount) {
        this.transactions.add(amount);//converts the primitive to the object wrapper
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
