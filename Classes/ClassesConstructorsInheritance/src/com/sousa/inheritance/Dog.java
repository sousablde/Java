package com.sousa.inheritance;

//to inherit from another class we use the term extends
//need to have a default constructor to be able to extend the class

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //super calls the constructor frmo the class we are extending from
        //all dogs have brain so we remove the parameter and just pass 1 true
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {

        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run() {
        //since this method does not have the super keyword
        //the methods that do have super will be executed automatically
        System.out.println("Dog.run() called");
        move(10);

    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs was called");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
