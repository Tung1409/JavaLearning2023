package main.java.lession_09;

import java.util.List;

public class SalaryCalculator {

    public int getTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary() + employee.getsupportMoney();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Teo") {
            @Override
            public int getSalary() {
                return 0;
            }

            @Override
            public int getsupportMoney() {
                return 0;
            }
        };
    }
    // minh van co the tao 1 thang employee tu Class Employee neu nhu
    // minh them 1 cai body bao gom cac override
}
