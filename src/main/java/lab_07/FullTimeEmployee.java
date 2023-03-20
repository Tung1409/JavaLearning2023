package main.java.lab_07;

public class FullTimeEmployee extends Employee {
    private static int salary = 50000;

    public FullTimeEmployee(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return salary;
    }

}
