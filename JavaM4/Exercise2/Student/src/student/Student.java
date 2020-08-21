/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Hoang Duy Nhat
 */
public class Student {
        private int studentID;
        private String studentName;
        private String Batch;
        private double firstMark;
        private double secondMark;

    public Student() {
    }

    public Student(int studentID, String studentName, String Batch, double firstMark, double secondMark) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.Batch = Batch;
        this.firstMark = firstMark;
        this.secondMark = secondMark;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String Batch) {
        this.Batch = Batch;
    }

    public double getFirstMark() {
        return firstMark;
    }

    public void setFirstMark(double firstMark) {
        this.firstMark = firstMark;
    }

    public double getSecondMark() {
        return secondMark;
    }

    public void setSecondMark(double secondMark) {
        this.secondMark = secondMark;
    }
        
        
    
}
