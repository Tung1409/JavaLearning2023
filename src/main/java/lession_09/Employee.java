package main.java.lession_09;

public abstract class Employee {

    private String name;


    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getSalary();



    public abstract int getsupportMoney();
}
