package main.java.lab_02;

import java.util.Scanner;

public class Lab_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your height(m): ");
        float userHeight = scanner.nextFloat();
        System.out.println("Please input your weight(kg): ");
        float userWeight = scanner.nextFloat();
        float userBMI = userWeight/( userHeight * 2 );
    //<18.5 || 18.5 - 24.9 || 25 -29.9 || > 30
        System.out.printf("Your BMI is: %f\n", userBMI);

        if (userBMI <= 18.5) {
            System.out.println("You are Underweight, you should increase your weight");
        } else if (userBMI <= 24.9) {
            System.out.println("You are Normalweight");
        } else if (userBMI <= 29.9) {
            System.out.println("You are Overweight, you should decrease your weight");
        } else {
            System.out.println("You are Obesity, you should decrease your weight");
        }
    }
}
