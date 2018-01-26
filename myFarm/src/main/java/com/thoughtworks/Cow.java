package com.thoughtworks;

public class Cow extends Animal {

    String name;
    int age;
    int time;


    public String greeting() {
        return "Mooom";
    }

    public String run() {
        return "Speed is 30km/h";
    }

    public void calculateTime(int distance){
        time = distance / 30;
    }

    public String printInformationCow(){
        String dados = "\n Name:" + this.name;
        dados += "\n Idade:" + this.age +"years old";
        dados += "\n Time is: " + this.time + " Km/h";
        dados += "\n" + this.greeting();
        return dados;
    }
}
