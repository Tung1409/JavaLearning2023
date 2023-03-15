package main.java.lab_03;

public class Lab3_3 {

    public static void main(String[] args) {

        int intArray [] = {12,34,1,16,28};

        for (int i = 0; i < intArray.length; i++) {

            for (int j = 0; j < intArray.length; j++) {

                if (intArray[i] > intArray[j]) {
                    int temp = intArray[i];
                    intArray [i] = intArray [j];
                    intArray [j] = temp;
                }
            }
        }
            }
}