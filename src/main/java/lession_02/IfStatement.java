package main.java.lession_02;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
        final int EXPECTED_TIME = 7;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the time(hr): ");
        int arriveTime = scanner.nextInt();

        boolean isHeOnTime = arriveTime == EXPECTED_TIME ;
        System.out.println("1. Going to the shop");

        //       if(isHeOnTime){
        //           System.out.println("Let's talk!");
        //       }else {
        //           System.out.println("Write a letter");
        //       }

        String outputMsg = isHeOnTime? "Let's talk" : "Write a letter";
        System.out.println(outputMsg);
        System.out.println("Going home");
    }
}
/*if(!isHeOnTime) nghia la dao gia tri cua isHeOnTime
 * == la so sanh 2 gia tri co = hay khong
 *
 * Ternary operator chi duoc su dung khi menh de chi duoc chia lam 2, dung hoac sai
 */
