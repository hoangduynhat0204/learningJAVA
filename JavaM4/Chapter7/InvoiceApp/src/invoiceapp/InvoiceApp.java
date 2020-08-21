/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceapp;

import java.util.Scanner;

/**
 *
 * @author Hoang Duy Nhat
 */
public class InvoiceApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to ....");
        System.out.println("");
        
        Scanner sc = new Scanner (System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter the subtotal value: ");
            String subTotalLine = sc.nextLine();
            double subTotal = Double.parseDouble(subTotalLine);
            
            double discountPercent;
            if(subTotal>= 200)
                discountPercent = 0.2;
            else if(subTotal>=100)
                discountPercent = 0.1;
            else
                discountPercent = 0;
            
            double discountAmount = subTotal*discountPercent;
            
        }
    }
    
}
