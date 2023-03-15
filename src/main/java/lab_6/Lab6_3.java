package main.java.lab_6;

public class Lab6_3 {
//    String myStr = "100 minutes";
//    NOT using REGEX, extract digit character from that String
//    Expected output: "100".
//    EX: "12345nabc678" -> "12345678"

    public static void main(String[] args) {
        String tuStr = "100 minutes";
        String digitNumber = "";
        char [] myStr = tuStr.toCharArray();
        System.out.println(myStr);
        for (char character : myStr){
            if (Character.isDigit(character)){
                digitNumber = digitNumber.concat(String.valueOf(character));

            }
        }
        System.out.println(digitNumber);
    }
}
