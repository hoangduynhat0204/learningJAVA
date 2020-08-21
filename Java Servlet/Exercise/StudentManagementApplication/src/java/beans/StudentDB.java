/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hoang Duy Nhat
 */
public class StudentDB {
    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        String dbUrl = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "vietnam0204";
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setAvgMark(rs.getDouble("avg_mark"));
                s.setLevel(rs.getString("level"));
                students.add(s);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
       // } catch (ClassNotFoundException ex) { 
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }
    
    public static List<Student> getStudentsByName(String name) {
        List<Student> students = new ArrayList<>();
        String dbUrl = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "vietnam0204";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM student WHERE name like '%"+name+"%'");
            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setAvgMark(rs.getDouble("avg_mark"));
                s.setLevel(rs.getString("level"));
                students.add(s);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }
    
    public static int registStudent(Student student) {
        String dbUrl = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "vietnam0204";
        int rowCount = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO student (`name`, `avg_mark`, `level`) "
                    + "VALUES ('" + student.getName() +  "'," 
                                + student.getAvgMark()+ ",'"
                                + student.getLevel()+"')";
            rowCount = statement.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowCount;
    }
    
    public static int deleteStudent(int studentId) {
        String dbUrl = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "vietnam0204";
        int rowCount = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM student WHERE id = " + studentId;
            rowCount = statement.executeUpdate(sql);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowCount;
    }
    
    public static Student getStudentsById(int studentId) {
        Student student = new Student();
        String dbUrl = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "vietnam0204";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM student WHERE id = "+studentId);
            while (rs.next()) {
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAvgMark(rs.getDouble("avg_mark"));
                student.setLevel(rs.getString("level"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }
    
    public static int updateStudent(Student student) {
        String dbUrl = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "vietnam0204";
        int rowCount = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            Statement statement = connection.createStatement();
            String sql = "UPDATE student "
                    + "SET name = '" +student.getName()+ "',"
                    + "avg_mark = " +student.getAvgMark()+ ","
                    + "level = '" +student.getLevel()+ "'"
                    + "WHERE id = " +student.getId();
            rowCount = statement.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowCount;
    }
}
