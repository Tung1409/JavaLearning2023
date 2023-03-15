package main.java.lession_05;

public class StringLearningCont {
    public static void main(String[] args) {
        String myCookingTime = "   105 mins   ";
        String cookingTimeNumStr = myCookingTime.replaceAll("[^0-9]", "");
        System.out.println(cookingTimeNumStr);

        int cookingTime = Integer.valueOf(cookingTimeNumStr);
        System.out.println("Cooking Time is: " + (cookingTime + 1));

        // Concatenation: nối chuỗi
        String s1 = "Hello, ";
        String s2 = "Teo";
        System.out.println(s1.concat(s2));


        // StringBuilder: mốt đọc thêm

    }
}
