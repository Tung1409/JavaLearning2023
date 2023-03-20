package main.java.lab_07;

public class Employee {

    private String name;

    private int salary;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
