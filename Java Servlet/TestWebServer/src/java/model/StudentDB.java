/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iViettech
 */
public class StudentDB {
    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        String[] interests = {"swim"};
        Student student = new Student("Minh Huy", "Male", "12A1", "", interests);
        students.add(student);
        Student student2 = new Student("Quang Vinh", "Female", "12C10", "", interests);
        students.add(student2);
        Student student3 = new Student("Viet Hung", "Male", "12A1", "", interests);
        students.add(student3);
        return students;
    }
}
