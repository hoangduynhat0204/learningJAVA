/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import helper.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hoang Duy Nhat
 */
public class EmployeeDB {

    public static List<Employee> getEmployee() {
        List<Employee> employees = new ArrayList<>();
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employee");
            while (rs.next()) {
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setEmail(rs.getString("email"));
                e.setRole(rs.getString("role"));
                employees.add(e);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            pool.freeConnection(connection);
        }
        return employees;
    }

    public static void addEmployee(Employee employee) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        try {

            Statement statement = connection.createStatement();
            String prepareSQL = "INSERT INTO employee (`id`, `name`, `email`, `role`)"
                    + "VALUES( ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(prepareSQL);
            ps.setInt(1, employee.getId());
            ps.setString(2, employee.getName());
            ps.setString(3, employee.getEmail());
            ps.setString(4, employee.getRole());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            pool.freeConnection(connection);
        }
    }

    public static void deleteEmployee(int employeeId) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement statement = connection.createStatement();
            String prepareSQL = "DELETE FROM employee WHERE id = " + employeeId;
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

    public static Employee getEmployeeById(int employeeId) {
        Employee employee = new Employee();
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employee WHERE id = " + employeeId);
            while (rs.next()) {
                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));
                employee.setEmail(rs.getString("email"));
                employee.setRole(rs.getString("role"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            pool.freeConnection(connection);
        }
        return employee;
    }
    
    public static void updateEmployee(Employee employee) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        try {
            Statement statement = connection.createStatement();
            String prepareSQL = "UPDATE employee SET"
                    + " name = ? , "
                    + " email = ?, "
                    + " role = ? "
                    + " WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(prepareSQL);
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getEmail());
            ps.setString(3, employee.getRole());
            ps.setInt(4, employee.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            pool.freeConnection(connection);
        }
    }
    
    public static List<Employee> getEmployeeByNameAndRole(String name, String role) {
        List<Employee> employees = new ArrayList<>();
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employee WHERE name like '%" + name + "%' AND role like '%" + role + "%'" );
            while (rs.next()) {
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setEmail(rs.getString("email"));
                e.setRole(rs.getString("role"));
                employees.add(e);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            pool.freeConnection(connection);
        }
        return employees;
    }

}
