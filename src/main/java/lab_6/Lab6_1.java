package main.java.lab_6;

public class Lab6_1 {
    //Given input string: "2hrs and 5 minutes"
    //Please calculate how many minutes in total
    public static void main(String[] args) {
        int totalMinutes = 0;
        String inputStr = "2hrs and 5 minutes";
        System.out.println(inputStr.indexOf("hrs"));
//        int indexBeforehrs = inputStr.indexOf("hrs") - 1;
//        System.out.println(indexBeforehrs);
//        int hrsNumber =  Integer.valueOf(indexBeforehrs);
//        System.out.println(hrsNumber);

        String hourNumStr = inputStr.substring(0, inputStr.indexOf("hrs"));
        System.out.println(hourNumStr);
        int hourNumber = Integer.valueOf(hourNumStr);
        // da xong 2hrs
        String minuteStr = inputStr.substring(inputStr.indexOf("minutes") - 2);
        System.out.println(minuteStr);
        String minuteNumStr = minuteStr.substring(0, 2);
        System.out.println(minuteNumStr);
        int minuteNumber = Integer.valueOf(minuteNumStr);

        totalMinutes = hourNumber + minuteNumber;
        System.out.println(totalMinutes);
        // bi loi~ khong hieu tai sao
    }
}
