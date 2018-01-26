package com.thoughtworks;


public class App 
{
    public static void main( String[] args ) {

        Cow cow1 = new Cow();
        cow1.name = "Emma";
        cow1.age = 5;
        cow1.calculateTime(40);
        System.out.println(cow1.printInformationCow());

        Cow cow2 = new Cow();
        cow2.name = "Penelope";
        cow2.age = 8;
        cow2.calculateTime(80);
        System.out.println(cow2.printInformationCow());

        Dog dog = new Dog();
        System.out.println(dog.greeting());
        System.out.println(dog.run());

        Pig pig = new Pig();
        System.out.println(pig.greeting());
        System.out.println(pig.run());

        Chicken chicken = new Chicken();
        System.out.println(chicken.greeting());
        System.out.println(chicken.run());

    }
}
