package main.java.lab_6;

public class Lab6_1 {
    public static void main(String[] args) {
        int totalMinutes;
        String inputStr = "2hrs and 5 minutes";
        String[] splitStr = inputStr.split("and");

        String hourStr = splitStr[0].substring(0, splitStr[0].indexOf("hrs")).trim();
        int hourNumber = Integer.parseInt(hourStr);

        String minuteStr = splitStr[1].substring(0, splitStr[1].indexOf("minutes")).trim();
        int minuteNumber = Integer.parseInt(minuteStr);

        totalMinutes = hourNumber*60 + minuteNumber;
        System.out.println(totalMinutes);
    }
}
