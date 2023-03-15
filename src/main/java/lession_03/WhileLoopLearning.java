package main.java.lession_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoopLearning {
//WhileLoop khi minh khong biet minh phai lap bao nhieu vong
// tuy nhien phai luu y control cai dieu kien de khong bi unreachable statement

    public static void main(String[] args) {


        /* ====GameMenu===
        1. Generate random number
        0. Exit
         */


        boolean isContinuing = true;
        while (isContinuing) {
            printSimpleMenu();

            int option = getUserOption();

            if (option == 0){
                isContinuing = false;
                System.out.println("Goodbye");
            } else if (option == 1) {
                System.out.println("Your number is " + new SecureRandom().nextInt(1000));
            } else {
                System.out.println("Only select 0 or 1");
            }

        }

    }

    private static int getUserOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select option");
        return scanner.nextInt();
    }

    private static void printSimpleMenu() {
        System.out.println("===GameMenu===");
        System.out.println("1. Generate random number(less than 1000)");
        System.out.println("0. Exit");
    }
}