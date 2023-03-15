package main.java.lession_04;

import java.security.SecureRandom;

public class FunctionLearning {
    public static void main(String[] args) {
/*
return la thoat khoi method (public static void main {})
 break thi thoat khoi hanh dong do thoi

 DRY: don't repeat yourself
 Solid:
 S: single responsibility moi~ function chi nen lam 1 chuc nang
*/
        printNumber();
    }

        public static int getARandomNumber (){



        int randomNumber = new SecureRandom().nextInt(Integer.MAX_VALUE);
        return randomNumber;
    }
    public static void printNumber(){
        for (int index = 0; index < 10; index++) {
            if (index == 8){
                System.out.println("You have reached the magic number");
                return;
            }
            else System.out.println(index);
        }
        System.out.println("End the program!");
    }
}
