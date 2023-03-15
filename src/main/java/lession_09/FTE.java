package main.java.lession_09;

public class FTE extends Employee {

    public FTE(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public int getsupportMoney() {
        return 5000;
    }
}
