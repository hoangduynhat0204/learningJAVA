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
public class EmployeeApp {
    public static void main(String[] args) {
    
    }
    public Employee addNewEmployee(int employeeID, String employeeName, int age, double salary, String department){
        Employee person = new Employee();
        person.setEmployeeID(employeeID);
        person.setEmployeeName(employeeName);
        person.setAge(age);
        person.setSalary(salary);
        person.setDepartment(department);
        return person;
   }
    public String printEmployeeDetails(Employee person) {
        return person.toPrint();
    }
}
