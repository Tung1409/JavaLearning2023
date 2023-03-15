package main.java.lession_13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestDataFactory {

    public static void main(String[] args) {
        // READING
        String relativeFilePath = "\\src\\lession_13\\Persons.txt";
        String absoluteFilePath = System.getProperty("user.dir").concat(relativeFilePath);

        List<Employee> employeeList = DataFactory.getEmployeeListFromFile(absoluteFilePath);
        Collections.sort(employeeList);
        System.out.println(employeeList);


        // windown thi them \\, mac thi them /

        // WRITING
//        Employee teo = new Employee("Teo", 18, 100000);
//        Employee ti = new Employee("Ti", 19, 200000);
//        Employee tun = new Employee("Tun", 15, 50000);
        Employee toan = new Employee("Toan", 16, 70000);
        List<Employee> employeeList1 = Arrays.asList(toan);
        String employeeDataFile = System.getProperty("user.dir").concat("\\src\\lession_13\\EmployeeDB.txt");
        DataFactory.saveEmployeeListToFile(employeeList1, employeeDataFile);

    }
}
