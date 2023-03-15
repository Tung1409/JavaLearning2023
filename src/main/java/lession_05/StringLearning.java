package main.java.lession_05;

import java.util.Arrays;


public class StringLearning {
    public static void main(String[] args) {
//        String myName1 = "Tung";
//        String myName2 = "Tung";
//        String myName3 = new String("Tung");
//        System.out.println("myName1 == myName2: " + (myName1.equals(myName2)));
//        System.out.println("myName1 == myName3: " + (myName1.equals(myName3)));

//        //so sanh string thi chi nen dung equals
//
//
//        //check lower case, upper case, digit...
//        int totalDigit = 0;
//        int totalUppercase = 0;
//        int totalLowercase = 0;
//        String myPassword = "123myPassword";
//        char[] myCharacters = myPassword.toCharArray();
//        for (char character : myCharacters) {
//            if (Character.isDigit(character)) totalDigit++;
//            else if (Character.isUpperCase(character)) totalUppercase++;
//            else if (Character.isLowerCase(character)) totalLowercase++;
//        }
//            if (totalDigit > 0 && totalLowercase > 0 && totalUppercase > 0){
//                System.out.println("You are all set");
//            } else {
//                System.out.println("Password format is wrong");
//            }
//
//            // Immutable: 1 khi da tao ra thi khong duoc thay doi
//            // Replacement | Immutable
//            String badWordContainer = " bad, very bad, sth else, bad";
//            String filteredStr =  badWordContainer.replace("bad", "b**");
//        System.out.println(badWordContainer);
//        System.out.println(filteredStr);

        //SubString, indexOf, Split
        String url = "https://google.com";
        System.out.println(url.length());
        System.out.println(url.indexOf("h"));
        System.out.println(url.indexOf("https"));

        System.out.println(url.substring(0, 3));
        System.out.println(url.substring(2));

        //Split
        String [] splitStr = url.split("://");
        System.out.println(Arrays.toString(splitStr));

        // Regex | Regular Expression
        // [] tat ca, ^: khong phai
        String myCookingTime = "  105 mins  ";
//         Todo: Pattern and Matcher

        String cookingTimeNumStr = myCookingTime.replaceAll("[^0-9]", "");
        System.out.println(cookingTimeNumStr);

        System.out.println(Integer.valueOf(cookingTimeNumStr));
        //dong tren la chuyen tu String thanh Integer

//        int cookingTime = Integer.valueOf(cookingTimeNumStr);
//
//        System.out.println(cookingTimeNumStr + 1);
    }
    }

