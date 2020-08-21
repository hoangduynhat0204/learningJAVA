/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;

/**
 *
 * @author Hoang Duy Nhat
 */
public class User {
    private int id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String address;

    public User() {
    }

    public User(int id, String userName, String password, String firstName, String lastName, String address) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public boolean checkLogin(String username, String password){
        boolean isLogined;
        if(this.userName.equals(username) && this.password.equals(password)){
            isLogined = true;
        }
        else isLogined = false;
        return isLogined;
    }
    
    
}
