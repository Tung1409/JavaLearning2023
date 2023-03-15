package main.java.lession_06;

public class Calculator {


    // Method overLoading: la ky thuat khi o do method name giong nhau nhung khac parameter
    public int sum(int num1, int num2){
        return num1 + num2;
    }

    public int sum(int num1, int num2, int num3){
        return num1 + num2;
    }

    // Varagrs | Rest parameters
    public int sum(int num1, int num2, int... restNumbers) {

        int arrTotal = 0;
        for (int number : restNumbers){
            arrTotal = arrTotal + number;
        }
        return num1 + num2 + arrTotal;
    }
    // When overloading happens: Compile Time
    // When overriding: Run time
    // Khong co kieu overloading khi khac kieu tra ve(vd int va String)
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(1, 2);
        System.out.println(calculator.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    }
    // 2 method hay function duoc goi la cung signature khi cung` ten, giong ve parameter (so luong va kieu du lieu)
}
