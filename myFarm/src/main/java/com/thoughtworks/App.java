package com.thoughtworks;


public class App 
{
    public static void main( String[] args ) {

        Cow cow1 = new Cow("Emma", 5, 8);
        cow1.calculateTime(40);
        System.out.println(cow1.printInformationCow());

        Cow cow2 = new Cow("Penelope", 8, 9);
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
