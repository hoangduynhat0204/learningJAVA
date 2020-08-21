/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author iViettech
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student = new Student();
        addStudent(student);
        viewStudent(student);
        ////////////////
        List<Student> students = addListStudent();
        printListStudent(students);
        
    }
    
    public static void addStudent(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        student.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter name: ");
        student.setName(scanner.nextLine());
        System.out.println("Enter math: ");
        student.setMath(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter physic: ");
        student.setPhysic(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter chemistry: ");
        student.setChemistry(Double.parseDouble(scanner.nextLine()));
    }
    
    public static void viewStudent(Student student) {
        System.out.println(student.toString());
    }
    
    public static List<Student> addListStudent() {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        System.out.println("Enter number of student: ");
        int numberOfStudent = Integer.parseInt(scanner.nextLine());
        for (int i = 0;i < numberOfStudent; i ++) {
            Student student = new Student();
            addStudent(student);
            students.add(student);
        }
        return students;
    }
    
    public static void printListStudent(List<Student> students) {
        for(Student student : students) {
            viewStudent(student);
        }
        
        for (int i = 0; i < students.size(); i ++) {
            viewStudent(students.get(i));
        }
    }
}
