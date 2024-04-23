package com.qascript;

public class Huyndai  extends Car{

    public static void main(String[] args){
        start();
        accelerate();
        brakes();

    }

    public static void brakes(){
        System.out.println("Press the Brake");
    }

    public static void start(){
        String key = "ON";
        System.out.println("Turn on the key" + key);
    }
}
