package main.java.somewhere;



import java.util.Scanner;

public class Ontap {

    public static void main(String[] args) {
        boolean isContinuing = true;
        while (isContinuing){
            printSimpleMenu();
            Scanner scanner = new Scanner(System.in);
            int userOption = scanner.nextInt();
            switch (userOption){
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Please input your number");
                    int userInput = scanner1.nextInt();
                    if (userInput % 2 != 0){
                        System.out.println("Your number is odd");
                    } else System.out.println("Your number is even");
                    break;
                default:
                    isContinuing = false;
                    System.out.println("Goodbye");
            }
        }
    }

    private static void printSimpleMenu() {
        System.out.println("====Menu====");
        System.out.println("1. Find out your number is odd or even");
        System.out.println("2. Exit");
    }
}