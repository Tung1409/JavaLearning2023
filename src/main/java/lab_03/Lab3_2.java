package main.java.lab_03;

public class Lab3_2 {

    public static void main(String[] args) {

        int[] intArray = {23, 1, 77, 82, 3,90,2};
        int minimum = intArray[0];
        int maximum = intArray[0];
        // min || number || max
        for (int index = 0; index < intArray.length; index++) {
            if (intArray[index] >= maximum) {
                maximum = intArray[index];
            } else if (intArray[index] <= minimum) {
                minimum = intArray[index];
            }
        }
        System.out.printf("Maximum is : %d\n", maximum);
        System.out.printf("Minimum is : %d\n", minimum);
    }
}
