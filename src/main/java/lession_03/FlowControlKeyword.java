package main.java.lession_03;

public class FlowControlKeyword {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if ( i == 3 ) break;
            System.out.println(i);
        }
//break la thoat ra khoi vong lap, continue là skip các bước còn lại của vòng lặp

    }
}
