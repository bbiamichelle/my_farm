package com.thoughtworks;


public class App
{
    public static void main( String[] args ) {

        Cow cow1 = new Cow("Emma", 5, 8);
        System.out.println(cow1.printInformationCow());

        Cow cow2 = new Cow("Penelope", 8, 9);
        System.out.println(cow2.printInformationCow());

        Dog dog1 = new Dog("Max", 8,20);
        System.out.println(dog1.printInformationDog());

        Dog dog2 = new Dog("Buddy", 10, 18);
        System.out.println(dog2.printInformationDog());

        Pig pig1 = new Pig("Baby",1,10);
        System.out.println(pig1.printInformationPig());

        Pig pig2 = new Pig("Kevin Bacon", 5,8);
        System.out.println(pig2.printInformationPig());

        Pig pig3 = new Pig("John Hamm", 10,6);

        Chicken chicken1 = new Chicken("Tilda", 2, 5);
        System.out.println(chicken1.printInformationChicken());

        Chicken chicken2 = new Chicken("Chico Liro",2,6);
        System.out.println(chicken2.printInformationChicken());

        Chicken chicken3 = new Chicken("Eggsy", 4,3);
        System.out.println(chicken3.printInformationChicken());

    }
}
