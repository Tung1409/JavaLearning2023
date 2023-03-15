package main.java.lab_07;

import java.util.ArrayList;
import java.util.List;

public class Lab7_1 {
//    Create a class Employee with a method salary to return employee’s salar
//    There are 2 types of employee: Full time employee and contract employee
//    Full time employee has salary is 50000 and contract employee has salary 40000
//    Write a method to accept a list of Employee and calculate total salary
//    For example, company has 3 FTE and 2 contractor

    public static void main(String[] args) {
        Employee firstFTE = new FullTimeEmployee("firstFTE", 50000);
        Employee secondFTE = new FullTimeEmployee("secondFTE", 50000);
        Employee thirdFTE = new FullTimeEmployee("thirdFTE", 50000);
        Employee firstCE = new ContractEmployee("firstCE", 40000);
        Employee secondCE = new ContractEmployee("secondCE", 40000);
        List<Employee> EmployeeList = new ArrayList<>();
        EmployeeList.add(firstFTE);
        EmployeeList.add(secondFTE);
        EmployeeList.add(thirdFTE);
        EmployeeList.add(firstCE);
        EmployeeList.add(secondCE);

        SalaryController salaryController = new SalaryController();
        System.out.println(salaryController.getTotalSalary(EmployeeList));

    }

//    private static int getTotalSalary(List<Employee> employeeList) {
//        int totalSalary = 0;
//
//        for (Employee employee : employeeList) {
//            totalSalary = totalSalary + employee.getSalary();
//        }
//        System.out.println(totalSalary);
//        return totalSalary;
//    }
}
