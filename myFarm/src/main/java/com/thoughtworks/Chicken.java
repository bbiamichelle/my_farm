package com.thoughtworks;

public class Chicken extends Animal {
    private String name;
    private int age;
    private int speed;

    public Chicken (String name, int age, int speed){
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    public String greeting() {
        return "Cocoricó";
    }

    public String run() {
        return name + " is running at " + speed + "km/h";
    }

    public int run(int distance){
        return distance/speed;
    }

    public String printInformationChicken(){
        String dados = this.run() + "\n and ";
        dados += this.age + " yearls old";
        return dados;
    }

    public int getAge() {
        return age;
    }

    public int getSpeed() {
        return speed;
    }
}

