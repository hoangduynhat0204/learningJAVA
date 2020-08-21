/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author Hoang Duy Nhat
 */
public class Employee {
    private int employeeID;
    private String employeeName;
    private int age;
    private double salary;
    private Department department;

    public Employee() {
    }

    public Employee(int employeeID, String employeeName, int age, double salary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.age = age;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void toPrint(Employee employee){
        System.out.println(employee.getEmployeeName());
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getActualSalary(Employee employee) {
        return (1 + getDepartment().getAllowance())*getSalary();
    }
}
