package main.java.lession_02;

public class BitwiseOperator {
    public static void main(String[] args) {
        if (firstMethod() || secondMethod()) {
            System.out.println("Inside the method");
        }
    }
    private static boolean firstMethod() {
        System.out.println("firstMethod");
        return true;
    }
    public static boolean secondMethod() {
        System.out.println("secondMethod");
        return false;
    }
}
//&& nghia la tui se xem xet thang ben trai co dung khong, sau do moi toi thang ben phai
//& thi du thang ben trai no sai, tui van xem thang ben phai
//&& co tac dung nhu dau chan,

