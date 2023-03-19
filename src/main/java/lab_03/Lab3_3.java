package main.java.lab_03;

import java.util.Arrays;

public class Lab3_3 {

    public static void main(String[] args) {

        int intArray[] = {12, 34, 1, 16, 28};
        int arrayLength = intArray.length;
        // Max to min
        for (int unsortedIndex = arrayLength - 1; unsortedIndex > 0; unsortedIndex--) {
            for (int index = 0; index < unsortedIndex; index++) {
                if (intArray[index] < intArray[index + 1]) {
                    int temp = intArray[index];
                    intArray[index] = intArray[index + 1];
                    intArray[index + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(intArray));

        // Min to Max
        for (int unsortedIndex = arrayLength - 1; unsortedIndex > 0; unsortedIndex--) {
            for (int index = 0; index < unsortedIndex; index++) {
                if (intArray[index] > intArray[index + 1]) {
                    int temp = intArray[index];
                    intArray[index] = intArray[index + 1];
                    intArray[index + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
}