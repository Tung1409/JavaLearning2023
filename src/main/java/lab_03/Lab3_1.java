package main.java.lab_03;

public class Lab3_1 {

    public static void main(String[] args) {

        int [] intArray = {1,2,3,4,5};
        int evenNumber = 0;
        int oddNumber = 0;
        for (int index = 0; index < intArray.length; index++) {
            if (intArray[index] % 2 == 0) {
                evenNumber = evenNumber + 1;
            } else oddNumber = oddNumber + 1;
        }
            System.out.printf("Even Number: %d\n", evenNumber);
            System.out.printf("Odd Number: %d\n", oddNumber);
            
        }
    }
