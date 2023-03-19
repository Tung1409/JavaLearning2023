package main.java.lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab4 {
    ////    =====MENU======
//////1. Add number into ArrayList
//////2. Print numbers
//////3. Get maximum number
//////4. Get minimum number
    public static void main(String[] args) {
        boolean exitOption = true;
        List<Integer> userList = new ArrayList<>();
        while (exitOption) {
            printSimpleMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please choose your option");
            int userOption = scanner.nextInt();
            switch (userOption) {
                case 1:
                    addNumberintoArrayList(userList);
                    break;
                case 2:
                    printNumber(userList);
                    break;
                case 3:
                    getMaximumNumber(userList);
                    break;
                case 4:
                    getMinimumNumber(userList);
                    break;
                case 5:
                    findUserNumber(userList);
                    break;
                default:
                    System.out.println("Goodbye");
                    exitOption = false;
            }
        }
    }

    private static void findUserNumber(List<Integer> userList) {
        if (userList.isEmpty()) {
            System.out.println("You haven't input any number");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number u wanna find");
            int findNumber = scanner.nextInt();
            for (int i = 0; i < userList.size(); i++) {
                if (findNumber == userList.get(i)) {
                    System.out.printf("Your number is on element %d\n", i);
                    break;
                }
            }
        }
    }


    private static void getMinimumNumber(List<Integer> userList) {
        if (userList.isEmpty()) {
            System.out.println("Your list is empty");
        } else {
            int minimumNumber = userList.get(0);
            for (int i = 0; i < userList.size(); i++) {
                if (minimumNumber > userList.get(i)) {
                    minimumNumber = userList.get(i);
                }
            }
            System.out.printf("Your minimum number is: %d\n", minimumNumber);
        }
    }

    private static void getMaximumNumber(List<Integer> userList) {
        if (userList.isEmpty()) {
            System.out.println("Your list is empty");
            return;
        } else {
            int maximumNumber = userList.get(0);
            for (int i = 0; i < userList.size(); i++) {
                if (maximumNumber < userList.get(i)) {
                    maximumNumber = userList.get(i);
                }
            }
            System.out.printf("Your Maximum Number is: %d\n", maximumNumber);
        }
    }

    private static void printNumber(List<Integer> userList) {
        if (userList.size() == 0) {
            System.out.println("Please choose option 1 to add your number or list");
        } else System.out.println(userList);
    }

    private static void addNumberintoArrayList(List<Integer> userList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers u want to add");
        int totalNumber = scanner.nextInt();
        for (int i = 0; i < totalNumber; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Input your number: ");
            int elementNumber = scanner1.nextByte();
            userList.add(elementNumber);
        }
    }

    private static void printSimpleMenu() {
        System.out.println("====MENU====");
        System.out.println("1. Add number");
        System.out.println("2. Print number");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Find number in your ArrayList5");
    }
}
