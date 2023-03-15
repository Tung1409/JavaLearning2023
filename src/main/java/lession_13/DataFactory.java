package main.java.lession_13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {

    public static void saveEmployeeListToFile (List<Employee> employeeList, String filePath){
        System.out.println("[INFO] Writing file from ".concat(filePath));

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        ) {
            for (Employee employee : employeeList) {
                String dataLine = employee.getName() + ";" + employee.getAge() + ";" + employee.getSalary();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }




    public static void readFile(String filePath) {
        System.out.println("[INFO] Reading file from ".concat(filePath));
        // Stream ----- Lu ---- ca/ly

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        ) {
            // lay chai nuoc ra, nhin trong co nuoc khong
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                System.out.println(dataLine);
                dataLine = bufferedReader.readLine();
                // muc them mieng nuoc nua
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // FileInputStream: cai duong dan~ o? dau
        // InputSreamReader: dua duong dan~ vao ong nuoc
        // BufferedReader: cho nuoc vao cai Lu

    }

    public static List<Employee> getEmployeeListFromFile(String filePath){
        System.out.println("[INFO] Reading file from ".concat(filePath));
        List<Employee> employeeList = new ArrayList<>();

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        ) {
            // lay chai nuoc ra, nhin trong co nuoc khong
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                String [] employeeData = dataLine.split(";");
                String employeeName = employeeData[0];
                int employeeAge = Integer.parseInt(employeeData[1]);
                int employeeSalary = Integer.parseInt(employeeData[2]);
                Employee employee = new Employee(employeeName, employeeAge, employeeSalary);
                employeeList.add(employee);
                dataLine = bufferedReader.readLine();

                // muc them mieng nuoc nua
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employeeList;
    }
}
