package main.java.lession_09;

public class Contractor extends Employee {

    public Contractor(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return 40000;
    }

    @Override
    public int getsupportMoney() {
        return 0;
    }
}
