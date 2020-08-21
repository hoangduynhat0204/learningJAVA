/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Hoang Duy Nhat
 */
public class Account {
    private String accountNo;
    private String ownerName;
    private double amount;
    private String accountType;
    
    public Account() {
        accountNo="";
        ownerName="";
        amount=0;
        accountType="";
    }
    
    

    public Account(String accountNo, String ownerName, double amount, String accountType){
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.amount = amount;
        this.accountType = accountType;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
}
