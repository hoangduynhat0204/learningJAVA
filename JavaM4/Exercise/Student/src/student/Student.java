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
    private double math;
    private double physic;
    private double chemistry;
    
    public Student() {
        studentID = 0;
        studentName = "";
        math = 0;
        physic = 0;
        chemistry = 0;
    }
    
    public Student(int studentID, String studentName, double math, double physic, double chemistry) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.math = math;
        this.physic = physic; 
        this.chemistry = chemistry;
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

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysic() {
        return physic;
    }

    public void setPhysic(double physic) {
        this.physic = physic;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }
    public double getAverageMark() {
        return (math + physic + chemistry)/3;
    }
    public String getRate() {
        String rank;
        if(getAverageMark()>=8){
            rank ="Rank A";
        } else if(getAverageMark()>=6.5){
            rank ="Rank B";
        } else if (getAverageMark() >= 5) {
           rank ="Rank C";
        } else rank ="Rank D";
        return rank;
    }
    
}
