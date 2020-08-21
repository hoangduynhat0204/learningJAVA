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
public class Employee extends Person {

    private double salary;
    private String role;

    public Employee() {
        super();
    }

    public Employee(double salary, String role, int personNo, String name, String email) {
        super(personNo, name, email);
        this.salary = salary;
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    

}
