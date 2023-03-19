package main.java.lab_03;

import java.util.Arrays;

public class Lab3_4 {

    public static void main(String[] args) {
        int[] arrayA = {1, 12, 16, 28, 34};
        int[] arrayB = {1, 13, 16, 27, 99};

        int arrayALength = arrayA.length;
        int arrayBLength = arrayB.length;
        int[] mergedArray = new int[arrayALength + arrayBLength];

        int arrayAIndex = 0;
        int arrayBIndex = 0;
        int mergedArrayIndex = 0;

        while (arrayAIndex < arrayALength && arrayBIndex < arrayBLength) {
            if (arrayA[arrayAIndex] < arrayB[arrayBIndex]) {
                mergedArray[mergedArrayIndex] = arrayA[arrayAIndex];
                arrayAIndex++;
            } else {
                mergedArray[mergedArrayIndex] = arrayB[arrayBIndex];
                arrayBIndex++;
            }
            mergedArrayIndex++;
        }
        while (arrayAIndex < arrayALength) {
            mergedArray[mergedArrayIndex] = arrayA[arrayAIndex];
            arrayAIndex++;
            mergedArrayIndex++;
        }
        while (arrayBIndex < arrayBLength) {
            mergedArray[mergedArrayIndex] = arrayB[arrayBIndex];
            arrayBIndex++;
            mergedArrayIndex++;
        }
        System.out.println(Arrays.toString(mergedArray));
    }
}

