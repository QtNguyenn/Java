package com.qascript;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[]args){
        int[] arr = {9,4,1,8,19};
        int[] arr2 = {4,5,6,7,1};
        Arrays.sort(arr);
        System.out.println("Length of array "+ Arrays.toString(arr));

        if(arr.equals(arr2)){
            System.out.println("Array are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
