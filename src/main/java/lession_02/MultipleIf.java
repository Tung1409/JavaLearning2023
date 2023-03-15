package main.java.lession_02;

import java.util.Scanner;

public class MultipleIf {
    public static void main(String[] args) {
        // <18 || 18-55 || 56 ->

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int clientAge = scanner.nextInt();

        if (clientAge < 18) {
            System.out.println("Khong ban!");
        } else if (clientAge <= 55) {
            System.out.println("Unlimited");
            //co the viet la else if (clientAge >=18 && clientAge <=55) nhung ma bi thua, khong can
        } else {
            System.out.println("2 chai!");
            //co the viet la else ( clientAge > 55) nhung bi thua, khong can boi vi code se chay tu tren xuong duoi
        }
    }
}
