/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hoang Duy Nhat
 */
public class EmployeeDB {
    public static void addEmployee(Employee employee) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input person No: ");
        employee.setPersonNo(Integer.parseInt(scanner.nextLine()));
        System.out.println("Input Employee Name: ");
        employee.setName(scanner.nextLine());
        System.out.println("Input Employee's email: ");
        employee.setEmail(scanner.nextLine());
        System.out.println("Input Emloyee's salary: ");
        employee.setSalary(Double.parseDouble(scanner.nextLine()));
        System.out.println("Input Employee's Role: ");
        employee.setRole(scanner.nextLine());
    }

    public static List<Employee> addEmployeeToList() {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.println("Enter number of Employee: ");
        int numberOfEmployee = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfEmployee; i++) {
            Employee employee = new Employee();
            addEmployee(employee);
            employees.add(employee);
        }
        return employees;
    }

    public static void toPrintList(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Person No: " + employees.get(i).getPersonNo() + "\n"
                    + "Name:  " + employees.get(i).getName() + "\n"
                    + "Email: " + employees.get(i).getEmail() + "\n"
                    + "Role:  " + employees.get(i).getRole());
        }
    }

    public static double calculateTotalSalary(List<Employee> employees) {
        double totalSalary = 0;
        for (int i = 0; i < employees.size(); i++) {
            totalSalary = totalSalary + employees.get(i).getSalary();
        }
        return totalSalary;
    }
}
