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
    public static List<Student> getStudent() throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        List<Student> students = new ArrayList<>();
        String dbURL = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "vietnam0204";
        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM STUDENT");
            while (rs.next()){
                Student student = new Student();
                student.setStudentId(rs.getInt("studentId"));
                student.setName(rs.getString("name"));
                student.setMark(rs.getInt("mark"));
                student.setRank(rs.getString("rank"));
                students.add(student);
            }
            
        } catch (SQLException ex) {
            //Logger.getLogger(Demo_JDBC_App.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }
}
