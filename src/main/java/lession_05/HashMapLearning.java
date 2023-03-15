package main.java.lession_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {

    public static void main(String[] args) {

        Map<Integer, String> emergencyList = new HashMap<>();

        emergencyList.put(113, "Canh Sat");
        emergencyList.put(114, "Cap cuu");
        emergencyList.put(115, "Cuu hoa");
        emergencyList.put(116, "Others");

        System.out.println(emergencyList.get(113));
        System.out.println(emergencyList.get(117));

//        for (int key : emergencyList.keySet()){
//            System.out.println(emergencyList.get(key));
//        }

//        System.out.println("Has 113 key: " + emergencyList.containsKey(113));
//        System.out.println("Has 117 key: " + emergencyList.containsKey(117));
//        System.out.println("Has value : " + emergencyList.containsValue("Canh Sat"));
//        System.out.println("Has value : " + emergencyList.containsValue("Canh Sat "));

        // Update
        emergencyList.replace(116, "116");
        System.out.println(emergencyList.get(116));

        emergencyList.replace(116, "116", "SomethingElse");
        System.out.println(emergencyList.get(116));

        // ngoai update thi cung co remove, dung tuong tu nhu update



    }
}
