package main.java.lession_09;

//import lab_07.SalaryController;

import java.util.ArrayList;

import java.util.List;

public class TestEmployee {

    public static void main(String[] args) {
        Employee firstFTE = new FTE("Teo");
        Employee firstCon = new Contractor("Ti");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(firstFTE);
        employeeList.add(firstCon);

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        System.out.println(salaryCalculator.getTotalSalary(employeeList));
//        int totalSalary = 0;
//        for (Employee employee : employeeList) {
//            totalSalary = totalSalary + employee.getSalary() + employee.getsupportMoney();
//        }
//        System.out.println(totalSalary);

    }
}
