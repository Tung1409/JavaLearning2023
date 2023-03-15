package main.java.lession_04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {

        List<Integer> myArrayList = new ArrayList<>();
        //CRUD
        myArrayList.add(1);
        myArrayList.add(2);


//        for (int index = 0; index < myArrayList.size(); index++) {
//            myArrayList.get(index);
//            System.out.println(myArrayList.get(index));
//        }

        for (int integer : myArrayList){
            System.out.println(myArrayList);;
        }
    }
}
