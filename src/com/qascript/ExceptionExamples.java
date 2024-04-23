package com.qascript;

public class ExceptionExamples {
    public static void main(String[] args){
        handleArithmethicException(100);
        handleNullPointerException(null);
    }

    private static void handleArithmethicException(int number){
        try{
            int a = number/0;
        }
        catch(ArithmeticException exception){
            exception.printStackTrace();
        }
    }

    private static void handleNullPointerException(String s){
        try{
            System.out.println(s.length());
        }
        catch (NullPointerException ex){
            ex.printStackTrace();
        }
    }
}
