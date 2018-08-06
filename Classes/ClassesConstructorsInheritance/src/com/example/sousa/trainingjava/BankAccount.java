package com.example.sousa.trainingjava;
/*
Create :
a new class for a bank account
fields for the account number, balance, customer name, email and phone number.
getters and setters for each field
two additional methods
allow the customer to deposit funds (this should increment the balance field)
at tow the customer to withdraw funds. This should deduct from the balance field,
but not allow the withdrawal to complete if their are insufficient funds.
You wilt want to create various code in the Main class (the one created by IntelliJ) to
confirm your code is working.
Add some System.out.println in the two methods above as well.
 */


public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    //creating our own constructor
    public BankAccount() {
        //this(1234, 2.50, "default name", "default address"+9876);        //calling constructor from inside another constructor
        System.out.println("Empty constructor call");
    }

    //creating a constructor to initialize all fields
    public BankAccount(int accountNumber, double balance, String name, String email, int phoneNumber) {
        System.out.println("constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String name, String email, int phoneNumber) {
        this(1234, 2.50, name, email, phoneNumber);//calling constructor from inside another constructor

    }

    //creating method to deposit money
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("deposit made of: " + depositAmount + " current balance: " + this.balance);
    }

    //creating method to withdraw money
    public void withdraw(double withdrawAmount) {

        if (this.balance - withdrawAmount < 0) {
            System.out.println("You have insuficient funds, balance: " + balance);
        } else {
            this.balance -= withdrawAmount;
            System.out.println("withdrawal of " + withdrawAmount + " remaining balance =" + balance);
        }

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
