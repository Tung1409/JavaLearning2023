package main.java.lession_04;

public class ArrayPostfixPrefix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = ++a + b;
        int[] myIntArray = new int[5];

//        for (int index = 0; index < 5; ) {
//            myIntArray[index++] = index + 1;
//        }
//        for (int i : myIntArray) {
//            System.out.println(i);
//        }
        // postfix gan cho ben trai truoc roi moi ++

        for (int index = 0; index < 5; ) {
            myIntArray[index++] = index;
        }
        // vong lap nay cho ra array 1 2 3 4 5
        for (int value : myIntArray) {
            System.out.println(value);
        }
    }
}



