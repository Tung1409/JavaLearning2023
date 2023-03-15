package main.java.lab_02;

import java.util.Scanner;

public class Lab_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please in put your number: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.println("Your input number is even");
        } else {
            System.out.println("Your input number is odd");
        }
    }
}
