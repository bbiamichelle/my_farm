package com.thoughtworks;

public class Dog extends Animal {
    private String name;
    private int age;
    private int speed;

    public Dog (String name, int age, int speed){
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    public String greeting() {
        return "Au au";
    }

    public String run () {
        return name + " is running at " + speed + "km/h";
    }

    public int run (int distance){
        return distance/speed;
    }

    public int getAge(){
        return age;
    }

    public int getSpeed() {
        return speed;
    }

    public String printInformationDog(){
        String dados = this.run() + "\n and ";
        dados += this.age + " years old";
        return dados;
    }
}
