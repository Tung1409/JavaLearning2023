package main.java.lession_02;

import java.util.Scanner;

public class ScannerLearning {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//nhap tu ban phim
        System.out.print("Please input your number: ");
        int inputNumber = scanner.nextInt();
        System.out.printf("Your input number is: %d\n",inputNumber);

    }
}
