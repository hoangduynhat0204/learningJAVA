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
public class UserDB {
//    public static List<User> createUserList(){
//        List<User> users = new ArrayList<>();
//        User user1 = new User(1, "Hoang Duy Nhat", "hoangduynhat@gmail.com", "123");
//        User user2 = new User(2, "Hoang Duy Nhat A", "hoangduynhata@gmail.com", "456");
//        User user3 = new User(3, "Hoang Duy Nhat B", "hoangduynhatb@gmail.com", "789");
//        User user4 = new User(2, "Hoang Duy Nhat C", "hoangduynhatc@gmail.com", "123");
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        users.add(user4);
//        return users;
//    }

    public static User getUser(String email) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        String dbUrl = "jdbc:mysql://localhost:3306/userdb";
        String username = "root";
        String password = "vietnam0204";
        List<User> users = new ArrayList<>();
        try {

            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM user");
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setName(rs.getString("name"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                users.add(u);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        User user = new User();
        user.setEmail(email);
        for (User u : users) {
            if (user.getEmail().equals(u.getEmail())) {
                return u;
            }
        }
        return null;
    }
}
