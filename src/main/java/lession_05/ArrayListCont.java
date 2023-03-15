package main.java.lession_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCont {

    public static void main(String[] args) {

        List<Integer> myArrayList = Arrays.asList(1,2,3,4);
        List<Integer> myArrayList2 = new ArrayList<>();
        myArrayList2.add(1);
        myArrayList2.add(2);
        myArrayList2.add(3);
        myArrayList2.add(4);

//        for (int index = 0; index < myArrayList.size(); index++) {
//            boolean isElementOddNumber = myArrayList.get(index) % 2 != 0;
//            if (isElementOddNumber){
//                myArrayList.set(index, myArrayList.get(index) + 1);
//            }
//        }


        myArrayList2.remove(1);
        //remove index
        myArrayList2.remove(new Integer(1));
        //remove object, remove cai thang nao co gia tri la 1
        System.out.println(myArrayList2);

        if (myArrayList.isEmpty());
        System.out.println("List's size: " + myArrayList.size());

        //check element's existence thi se tra ve true false
        System.out.println(myArrayList.contains(1)); //boxing: tự động đóng gói dữ liệu
        System.out.println(myArrayList.contains(5)); //boxing: tự động đóng gói dữ liệu
        System.out.println(myArrayList.indexOf(4));

    }
}
