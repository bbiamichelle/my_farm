package com.thoughtworks;

public class Cow extends Animal {

    private String name;
    private int age;
    private int speed;

    public Cow (String name, int age, int speed ){
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    public String greeting() {
        return "Mooom";
    }

    public String run() {
        return name + " is running at " +speed + "km/h";
    }

    public int run(int distance){
        return distance / speed;
    }


//    public String printInformationCow(){
//        String dados = "\n Name:" + this.name;
//        dados += "\n Idade:" + this.age +"years old";
//        dados += "\n" + this.greeting();
//        return dados;
//    }

    public int getAge() {
        return age;
    }
}
