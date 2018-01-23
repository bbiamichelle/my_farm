package com.thoughtworks;


public class App 
{
    public static void main( String[] args ) {

        Dog dog = new Dog();
        System.out.println(dog.greeting());
        System.out.println(dog.run());

        Cow cow = new Cow();
        System.out.println(cow.greeting());
        System.out.println(cow.run());

        Pig pig = new Pig();
        System.out.println(pig.greeting());
        System.out.println(pig.run());

        Chicken chicken = new Chicken();
        System.out.println(chicken.greeting());
        System.out.println(chicken.run());

    }
}
