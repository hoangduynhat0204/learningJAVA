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
public class Department {
    private int departmentID;
    private String departmentName;
    private double allowance;

    public Department() {
    }

    public Department(int departmentID, String departmentName, double allowance) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.allowance = allowance;
    }
    
    

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    
    
}
