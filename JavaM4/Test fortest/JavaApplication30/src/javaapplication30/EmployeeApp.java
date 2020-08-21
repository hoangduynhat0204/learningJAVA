/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.Scanner;

/**
 *
 * @author Hoang Duy Nhat
 */
public class EmployeeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public void addNewEmployee(Employee employee){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Name");
        employee.setEmployeeName(scanner.nextLine());
        System.out.println("Input ID");
        employee.setEmployeeID(Integer.parseInt(scanner.nextLine()));
        
    }
    
    
    
}
