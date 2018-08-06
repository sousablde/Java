package com.example.sousa.trainingjava;

public class Main {

    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount();//calls empty constructor
        bobsAccount.setAccountNumber(12345);
        bobsAccount.setBalance(0.0);
        bobsAccount.setName("Bob");
        bobsAccount.setEmail("my@mail.com");
        bobsAccount.setPhoneNumber(123456789);

        //calling the second overloaded constructor
        BankAccount anaAccount = new BankAccount(9876, 90.0, "Ana", "ana@mail.com", 987654321);
        System.out.println("Ana's details: " + anaAccount.getAccountNumber() + "" + anaAccount.getBalance());

        bobsAccount.withdraw(100.0);
        bobsAccount.deposit(1000);
        bobsAccount.withdraw(230.0);

        anaAccount.withdraw(100.0);
        anaAccount.deposit(1000);
        anaAccount.withdraw(230.0);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Tim", 25000);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Joe", 10000.0, "Joe@email.com");
        System.out.println(person3.getName());


    }


}
