package main.java.lession_08;

public class Person {
    // khong cho set de read-only
    // khong cho get va print de write-only
    // private de control input output vd nhu age thi khong cho nhap so am
    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        if (age < 0){
            throw new IllegalArgumentException("Age can't be negative number");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
