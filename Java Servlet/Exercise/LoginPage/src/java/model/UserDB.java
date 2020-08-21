/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hoang Duy Nhat
 */
public class UserDB {
    
//    public static List<User> createUserList(){
//        List<User> users = new ArrayList<>();
//        User user1 = new User("hoangduynhat1@gmail.com", "123", "", "");
//        User user2 = new User("hoangduynhat2@gmail.com", "123", "", "");
//        User user3 = new User("hoangduynhat3@gmail.com", "123", "", "");
//        User user4 = new User("hoangduynhat4@gmail.com", "123", "", "");
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        users.add(user4);
//        return users;
//    }

    public static User getUser(String email) {
        String dbUrl = "jdbc:mysql://localhost:3306/userdb";
        String username = "root";
        String password = "vietnam0204";
        
         try {
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            Statement statement = connection.createStatement();
            List<User> user = new ArrayList<>();
            ResultSet rs = statement.executeQuery("SELECT * FROM user");
            while (rs.next()) {
                User u = new User();
                u.s(rs.getInt("id"));
                s.setName(rs.getString("name"));
                students.add(s);
            }
            for (Student s : students) {
                System.out.println(s.getName());
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        List<User> users = createUserList();
        User user = new User();
        user.setEmail(email);
        for(User u : users){
            if(user.getEmail().equals(u.getEmail())){
                return u;
            }
        }
        return null;
    }
}
