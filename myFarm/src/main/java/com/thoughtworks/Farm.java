package com.thoughtworks;

import java.util.ArrayList;

public class Farm {

    private final ArrayList<Pig> pigS;
    private final ArrayList<Dog> dogS;
    private final ArrayList<Chicken> chickensS;
    private final ArrayList<Cow> cowS;

    public Farm(ArrayList<Pig> pigS, ArrayList<Dog> dogS, ArrayList<Chicken> chickensS, ArrayList<Cow> cowS){
        this.pigS = pigS;
        this.dogS = dogS;
        this.chickensS = chickensS;
        this.cowS = cowS;
    }

    public int aspeedAverageAnimal() {
        int sumSpeed = 0;
        for (Pig pig : pigS) {
            sumSpeed += pig.getSpeed();
        }
        for (Dog dog : dogS){
            sumSpeed += dog.getSpeed();
        }
        for (Chicken chicken : chickensS){
            sumSpeed += chicken.getSpeed();
        }
        for (Cow cow : cowS){
            sumSpeed += cow.getSpeed();
        }
        int numberSpeed = pigS.size()+dogS.size()+chickensS.size()+cowS.size();
        return sumSpeed/numberSpeed;
    }


    public int ageAverageForType() {
        int sumAge = 0;
        for (Pig pig : pigS) {
           sumAge += pig.getAge();
        }
        for (Dog dog : dogS){
            sumAge += dog.getAge();
        }
        for (Chicken chicken : chickensS){
            sumAge += chicken.getAge();
        }
        for (Cow cow : cowS){
            sumAge += cow.getAge();
        }
        int numberAge = pigS.size()+dogS.size()+chickensS.size()+cowS.size();
        return sumAge/numberAge;
    }

    public int ageAveragePig() {
        int sumAge = 0;
        for (Pig pig : pigS) {
            sumAge += pig.getAge();
        }
        int numberAge = pigS.size();
        return sumAge/numberAge;

    }public int ageAverageDog() {
        int sumAge = 0;
        for (Dog dog : dogS){
            sumAge += dog.getAge();
        }
        int numberAge = dogS.size();
        return sumAge/numberAge;
    }

    public int ageAverageChicken() {
        int sumAge = 0;
        for (Chicken chicken : chickensS){
            sumAge += chicken.getAge();
        }
        int numberAge = chickensS.size();
        return sumAge/numberAge;
    }

    public int ageAverageCow() {
        int sumAge = 0;
        for (Cow cow : cowS){
            sumAge += cow.getAge();
        }
        int numberAge = cowS.size();
        return sumAge/numberAge;
    }


}
