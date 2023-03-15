package main.java.lession_07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndObject {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person teo = new Person();
        Person teo2 = new Person();
        teo.setName("Teo");
        teo.setAge(18);

        personList.add(teo);
        personList.add(teo2);

        System.out.println(personList);

        for (Person person : personList){
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
        personList.get(1).setName("Ti");
        System.out.println(personList);
        // doi ten ca 2 thang vi khi minh add 1 thang teo, sau do them 1 thang nua
        // thi no se tham chieu 2 thang vo 1 vung nho vi ten giong nhau
        // khi personList.get(1).setName("Ti") thi no se thay doi vung nho, lam thay doi ca 2 thang
    }
}
