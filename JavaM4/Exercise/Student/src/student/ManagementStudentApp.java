/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.ArrayList;

/**
 *
 * @author Hoang Duy Nhat
 */
public class ManagementStudentApp {
    
    public static void main(String[] args) {
    
    }
    
    public Student addStudent(int studentID, String studentName, double math, double physic, double chemistry){
        Student st = new Student();
        st.setStudentID(studentID);
        st.setStudentName(studentName);
        st.setMath(math);
        st.setPhysic(physic);
        st.setChemistry(chemistry);
        return st;
    }
    public void viewStudent(Student st){
        System.out.println("Student ID" + st.getStudentID() + "\n" +
                            "Student Name" + st.getStudentName() + "\n" +
                            "Average Mark:" + st.getAverageMark() + "\n" +
                            "Rank: " + st.getRate()+ "\n");
    }
    public ArrayList addListOfStudent() {
        Student st1 = new Student(01, "Le Van A", 9, 8, 5);
        Student st2 = new Student(02, "Le Van B", 5, 8, 9);
        Student st3 = new Student(03, "Le Van C", 7, 8, 10);
        Student st4 = new Student(04, "Le Van D", 9, 8, 5);
        Student st5 = new Student(05, "Le Van E", 9, 8, 9);
        ArrayList<Student> st = new ArrayList<Student>();
        st.add(st1);
        st.add(st2);
        st.add(st3);
        st.add(st4);
        st.add(st5);
        return st;
    }
    
    public void printListOfStudent(ArrayList st) {
        for(int i=0;i < st.size(); i++) {
            System.out.println(st.get(i));
        }
    }
}
