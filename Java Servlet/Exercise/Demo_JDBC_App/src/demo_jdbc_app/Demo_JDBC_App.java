/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_jdbc_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;

/**
 *
 * @author Hoang Duy Nhat
 */
public class Demo_JDBC_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.jdbc.driver");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Demo_JDBC_App.class.getName()).log(Level.SEVERE, null, ex);
//        }
        String dbURL = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "vietnam0204";
        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);
            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery("SELECT * FROM STUDENT");
//            while (rs.next()){
//                System.out.println(rs.getString("name"));
//                System.out.println(rs.getString("rank"));
//            }
            ResultSet rs = statement.executeQuery("SELECT * FROM STUDENT");
            List<Student> studentList = new ArrayList<>();
            while (rs.next()){
                Student student = new Student();
                student.setStudentId(rs.getInt("studentId"));
                student.setName(rs.getString("name"));
                student.setMark(rs.getInt("mark"));
                student.setRank(rs.getString("rank"));
                studentList.add(student);
            }
            for(Student s : studentList){
                System.out.println(s.getName());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Demo_JDBC_App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
