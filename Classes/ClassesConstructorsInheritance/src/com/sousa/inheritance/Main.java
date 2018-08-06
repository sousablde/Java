package com.sousa.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        //dog.run();


    }
}
/*
output with override move removed:
dog.eat() called
Dog.chew() called
Anima.eat() called
Dog.run() called
Animal is moving at: 10 //just searched for whatever was available in the parent class

output with the overrude move() method active
dog.eat() called
Dog.chew() called
Anima.eat() called
Dog.run() called
dog.move() called
Dog.moveLegs was called
Animal is moving at: 10

output using dog.walk
//even with a move method in the DOg class
//since it has super keyword it tells the compiler
//to check for it in the super class animal
dog.eat() called
Dog.chew() called
Anima.eat() called
Dog.walk() called
Animal is moving at: 5

 */