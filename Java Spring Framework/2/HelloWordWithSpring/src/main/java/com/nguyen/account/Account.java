package com.nguyen.account;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XV
 */
public class Account {
    private long id;
    private String ownerName;
    private double babance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBabance() {
        return babance;
    }

    public void setBabance(double babance) {
        this.babance = babance;
    }
    
    @Override
    public String toString() {
        return "Account Information - ID: " + this.id +
                " - Name: " + this.ownerName +
                " - balance: " + this.babance;
    }
    
}
