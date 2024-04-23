package com.qascript;

public class Car {

    String color;
    int size;
    double weight;

    Car(){}

    public static void start(){
        System.out.println("Press the key");
    }

    public static void accelerate(){
        System.out.println("Press the accelerator: ");
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setSize(int size){
        this.size= size;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void displayCar(){
        System.out.print(color+"\t"+size+"\t"+weight+"\n");
    }
}
