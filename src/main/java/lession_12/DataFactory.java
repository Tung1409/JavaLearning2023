package main.java.lession_12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataFactory {

    public static void readFile(String filePath){
        System.out.println("Reading file from ".concat(filePath));

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);

        } catch (FileNotFoundException e){
            throw new IllegalArgumentException("The file path ".concat(filePath).concat("is not found"));
        }
    }

    public static void main(String[] args) {

    }
}
// IO Exception (input output) la checked Exception
