package com.qascript;

public class ModifyString {

    public static void main(String[]args)
    {
        String s1 = "learning Java";
        String s2 = "Basics";

        System.out.println("length of the string is: "+ s1.length());
        System.out.println("Upper case string:" +s1.toUpperCase());
        System.out.println("Lover case string: " + s1.toLowerCase());
        System.out.println("Get Char: " + s1.indexOf("n"));
        System.out.println("Get position: " + s1.charAt(3));
    }
}
