package main.java.lession_04;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        //Switch set tren tap du lieu nhieu ELEMENT, nhieu gia tri khac nhau
        //else if set tren cac RANGE gia tri khac nhau

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int userInput = scanner.nextInt();

        switch (userInput){
            case 1:
                System.out.println("Giai nhat!");
                break;
            case 2:
                System.out.println("Giai nhi!");
                break;
            case 3:
                System.out.println("Giai ba!");
                break;
            default:
                System.out.println("Chuc ban may man lan sau");
        }
    }
}
