package com.qascript;

import java.util.Scanner;
public class DiceGameWhile {
    public static void main(String[] arg){
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while(number < 10){
            if(number>6){
                System.out.println("You won the game");
            }
            else{
                System.out.println("You lost the game");
            }
        }
    }

}
