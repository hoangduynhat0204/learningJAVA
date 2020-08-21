/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import static employee.EmployeeDB.addEmployeeToList;
import static employee.EmployeeDB.calculateTotalSalary;
import static employee.EmployeeDB.toPrintList;
import java.util.List;
import java.util.Scanner;

/**
 * Hoàng Duy Nhất
 * @author Hoang Duy Nhat
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Management Application");
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = EmployeeDB.addEmployeeToList();

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Select your action: ");
            System.out.println("1- View list of employees: ");
            System.out.println("2- Calculate total amount of salary: ");
            int action = sc.nextInt();
            switch (action) {
                case 1:
                    EmployeeDB.toPrintList(employees);
                    break;
                case 2:
                    System.out.println(EmployeeDB.calculateTotalSalary(employees));
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
            System.out.println("Continue? (Y/N)");
            choice = sc.next();
            System.out.println();

        }
    }
}
