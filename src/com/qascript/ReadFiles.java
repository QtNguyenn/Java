package com.qascript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFiles {

    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("src/com/qascript/demo.txt");
            int c = fis.read();
            System.out.println((char) c);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
