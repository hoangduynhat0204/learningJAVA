/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author Hoang Duy Nhat
 */
public class ATM {

    public static void main(String[] args) {
        Account acc1 = new Account("01", "Barry", 100, "Saving account");
        Account acc2 = new Account("02", "Allen", 500, "Transaction account");

        Scanner sc = new Scanner(System.in);
        System.out.println("Select your action: ");
        System.out.println("1-Withdraw");
        System.out.println("2-Deposit");
        System.out.println("3-Tranfer");
        System.out.println("4-View Amount");
        int select = sc.nextInt();
        switch (select) {
            //withdraw
            case 1:
                withdraw(acc1);
                System.out.println(acc1.getAmount());
                break;
            //depoisit
            case 2:
                deposit(acc1);
                System.out.println(acc1.getAmount());
                break;
            //tranfer
            case 3:
                transfer(acc1, acc2);
                System.out.println(acc1.getAmount());
                System.out.println(acc2.getAmount());
                break;
            //view amount
            case 4:
                viewAmount(acc1);
                break;
        }
    }

    public static boolean withdraw(Account acc) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your amount to withdraw:");

        double amount = sc.nextDouble();
        if (amount <= acc.getAmount()) {
            acc.setAmount(acc.getAmount() - amount);
            return true;
        } else {
            System.out.println("Not enough money");
        }
        return false;
    }

    public static void deposit(Account acc) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your amount to deposit:");

        double amount = sc.nextDouble();
        acc.setAmount(acc.getAmount() + amount);
    }

    public static boolean transfer(Account acc1, Account acc2) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your amount to transfer:");

        double amount = sc.nextDouble();
        if (acc1.getAmount() >= amount) {
            acc1.setAmount(acc1.getAmount() - amount);
            acc2.setAmount(acc2.getAmount() + amount);
            return true;
        } else {
            return false;
        }
    }

    public static void viewAmount(Account acc) {
        System.out.println("Account Number: " + acc.getAccountNo());
        System.out.println("Owner Name: " + acc.getOwnerName());
        System.out.println("Amount: " + acc.getAmount());
        System.out.println("Account Type: " + acc.getAccountType());
    }
}
