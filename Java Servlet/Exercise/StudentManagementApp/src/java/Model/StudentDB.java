/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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

    public static List<Student> getStudent() {
        List<Student> students = new ArrayList<>();
        String dbURL = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "vietnam0204";
        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setTel_number(rs.getString("tel_number"));
                student.setAvg_mark(rs.getDouble("avg_mark"));
                student.setLevel(rs.getString("level"));
                students.add(student);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return students;
    }
    public static List<Student> getStudentByName(String searching) {
        List<Student> students = new ArrayList<>();
        String dbURL = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "vietnam0204";
        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM student WHERE name LIKE '%" + searching + "%'");
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setTel_number(rs.getString("tel_number"));
                student.setAvg_mark(rs.getDouble("avg_mark"));
                student.setLevel(rs.getString("level"));
                students.add(student);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return students;
    }
    public static int addNewStudent(Student student) {
        String dbURL = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "vietnam0204";
        Connection connection;
        int rowCount = 0;
        try {
            connection = DriverManager.getConnection(dbURL, username, password);
            String query = "INSERT INTO student (id, `name`, avg_mark, level) VALUES (" 
                        + student.getId() + "," + "'" + student.getName() + "," 
                        + student.getAvg_mark() + "," 
                        + "'" + student.getLevel() + "')";
        Statement statement = connection.createStatement();
        rowCount = statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowCount;
    }
    public static int deleteStudent(Student student) {
        String dbURL = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "vietnam0204";
        Connection connection;
        int rowCount = 0;
        try {
            connection = DriverManager.getConnection(dbURL, username, password);
            String deleteQuery = "DELETE FROM student WHERE id = ";
        Statement statement = connection.createStatement();
        rowCount = statement.executeUpdate(deleteQuery);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowCount;
    }
}
