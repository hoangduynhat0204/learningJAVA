/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import helpers.ConnectionPool;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
    
    public static User getUser(String username) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        List<User> users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM user");
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setUserName("username");
                u.setPassword("password");
                u.setFirstName("firstname");
                u.setLastName("lastname");
                u.setAddress("address");
                users.add(u);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        User user = new User();
        user.setUserName(username);
        for (User u : users) {
            if (user.getUserName().equals(u.getUserName())) {
                return u;
            }
        }
        return null;
    }
    
    public static List<User> getUsers() {
        List<User> users = new ArrayList<>();
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM user");
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setUserName(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setFirstName(rs.getString("firstname"));
                u.setLastName(rs.getString("lastname"));
                u.setAddress(rs.getString("address"));
                users.add(u);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            pool.freeConnection(connection);
        }
        return users;
    }

    public static void deleteUser(int userID) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement statement = connection.createStatement();
            String prepareSQL = "DELETE FROM user WHERE id = " + userID;
            PreparedStatement ps = connection.prepareStatement(prepareSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            pool.freeConnection(connection);
        }
    }
}
