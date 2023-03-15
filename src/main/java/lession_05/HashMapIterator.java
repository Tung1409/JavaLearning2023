package main.java.lession_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterator {
    public static void main(String[] args) {

        Map<Integer, String> emergencyList = new HashMap<>();

        emergencyList.put(113, "Canh Sat");
        emergencyList.put(114, "Cap cuu");
        emergencyList.put(115, "Cuu hoa");
        emergencyList.put(116, "Others");

        for (Integer key : emergencyList.keySet()){
            if (emergencyList.get(key).equals("Others")){
                emergencyList.replace(key, "Something else");
            }
            //replace thi ok nhung remove thi xay ra loi~, phai chuyen ve Iterator
        }
        for (Integer key : emergencyList.keySet()){
            System.out.println(emergencyList.get(key));
        }
    }
}
