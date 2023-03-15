package main.java.lession_05;

import java.util.*;

public class RemovingDuplicatingValues {
    public static void main(String[] args) {

        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(7);
        myArrayList.add(1);
        myArrayList.add(5);
        myArrayList.add(2);
        myArrayList.add(3);

        /* Lay 3 gia tri nhỏ nhất nhung khong trung = cua myArrayList
        = cach xoa gia tri duplicate sau do sort roi lay ra 3 gia tri
        * */

        List<Integer> withoutDuplicateValuesList = new ArrayList<>();

        for (Integer number : myArrayList){
            if (!withoutDuplicateValuesList.contains(number)){
                withoutDuplicateValuesList.add(number);
            }
        }
        System.out.println(myArrayList);
        Collections.sort(withoutDuplicateValuesList);
        System.out.println(withoutDuplicateValuesList);


        //cách 2: dùng collection Set : tự động xóa duplicate values và tự động sort

//        Set<Integer> set = new HashSet<>(myArrayList);
//        myArrayList = new ArrayList<>(set);
//        System.out.println(myArrayList);

        // giả sử không dùng set thì dùng collections.sort

//        SubList
        List<Integer> first3minValues = withoutDuplicateValuesList.subList(0, 3);
//        3 la bien, no se khong lay so 3
        System.out.println(first3minValues);
    }
}
