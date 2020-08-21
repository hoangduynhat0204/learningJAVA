/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

/**
 *
 * @author iViettech
 */
public class Student {
    private int id;
    private String name;
    private double math;
    private double physic;
    private double chemistry;

    public Student() {
    }

    public Student(int id, String name, double math, double physic, double chemistry) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return (this.math + this.physic + this.chemistry) / 3;
    }
    
    public String getRate() {
        String rank = "";
        double averageMark = this.getAverageMark();
        if (averageMark >= 8.5) {
            rank = "A";
        } else if (averageMark >= 6.5) {
            rank = "B";
        } else if (averageMark >= 5.0) {
            rank = "C";
        } else {
            rank = "D";
        }
        return rank;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID   : " + this.id + "\n");
        sb.append("Student Name : " + this.name + "\n");
        sb.append("Math         : " + this.math + "\n");
        sb.append("Physics      : " + this.physic + "\n");
        sb.append("Chemistry    : " + this.chemistry + "\n");
        sb.append("Average Mark : " + this.getAverageMark() + "\n");
        sb.append("Rate         : " + this.getRate() + "\n");
        
        return sb.toString();
    }
    
    
    
}
