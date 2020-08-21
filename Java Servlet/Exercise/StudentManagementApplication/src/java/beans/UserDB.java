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
public class UserDB {

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
