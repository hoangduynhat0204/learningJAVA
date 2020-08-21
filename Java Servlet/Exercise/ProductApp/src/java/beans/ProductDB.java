/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import helper.ConnectionPool;
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
public class ProductDB {

    public static List<Product> getProduct() {
        List<Product> products = new ArrayList<>();
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM product");
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setAmount(rs.getInt("amount"));
                p.setPrice(rs.getDouble("price"));
                products.add(p);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            pool.freeConnection(connection);
        }
        return products;
    }

    public static List<Product> getProductByName(String name) {
        List<Product> products = new ArrayList<>();
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM product WHERE name like '%" + name + "%'");
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setAmount(rs.getInt("amount"));
                p.setPrice(rs.getDouble("price"));
                products.add(p);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            pool.freeConnection(connection);
        }
        return products;
    }

    public static Product getProductById(int productId) {
        Product product = new Product();
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM product WHERE id = " + productId);
            while (rs.next()) {
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setAmount(rs.getInt("amount"));
                product.setPrice(rs.getDouble("price"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            pool.freeConnection(connection);
        }
        return product;
    }

    public static void addProduct(Product product) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        try {

            Statement statement = connection.createStatement();
            String prepareSQL = "INSERT INTO product (`id`, `name`, `amount`, `price`)"
                    + "VALUES( ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(prepareSQL);
            ps.setInt(1, product.getId());
            ps.setString(2, product.getName());
            ps.setInt(3, product.getAmount());
            ps.setDouble(4, product.getPrice());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            pool.freeConnection(connection);
        }
    }

    public static void updateProduct(Product product) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        try {
            Statement statement = connection.createStatement();
            String prepareSQL = "UPDATE product SET"
                    + " name = ? , "
                    + " amount = ?, "
                    + " price = ? "
                    + " WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(prepareSQL);
            ps.setString(1, product.getName());
            ps.setInt(2, product.getAmount());
            ps.setDouble(3, product.getPrice());
            ps.setInt(4, product.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            pool.freeConnection(connection);
        }
    }
    
    public static void deleteStudent(int productId) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement statement = connection.createStatement();
            String prepareSQL = "DELETE FROM product WHERE id = " + productId;
            PreparedStatement ps = connection.prepareStatement(prepareSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        finally {
            pool.freeConnection(connection);
        }
    }
}
