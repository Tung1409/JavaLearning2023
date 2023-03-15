package main.java.lab_6;

import java.util.Scanner;

public class Lab6_2 {
    //String myPassword = "password123";

    public static void main(String[] args) {
        String myPassword = "password123";
        int inputTime = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your password");
            String userPassword = scanner.next();
            if (userPassword.contains("password123") && myPassword.length() == userPassword.length()) {
                System.out.println("Your password is correct");
                break;
            } else System.out.println("Wrong password");

            inputTime++;

        } while (inputTime < 3);
        System.out.println("You can only input your password 3 times");
    }

}

