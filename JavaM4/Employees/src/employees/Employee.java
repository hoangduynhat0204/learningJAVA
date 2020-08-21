/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author Hoang Duy Nhat
 */
public class Employee {

    private int employeeID;
    private String employeeName;
    private int age;
    private double salary;
    private String department;

    Employee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(int employeeID, String employeeName, int age, double salary, String department) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String toPrint() {
        String message = "Employee ID: " + employeeID + "\n"
                + "Employee Name: " + employeeName + "\n"
                + "Age: " + age + "\n"
                + "Salary: " + salary + "\n"
                + "Department: " + department + "\n";
        return message;
    }

    public double getActualSalary() {
        Department department1 = new Department();
        double actualSalary = (1 + department1.getAllowance()) * getSalary();
        return actualSalary;
    }
}
