/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productviewer;

import java.util.Scanner;

/**
 *
 * @author Hoang Duy Nhat
 */
public class ProductViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Product Viewer");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter product code: ");
            String productCode = sc.nextLine();
            
            ProductReader reader = new ProductDB();
            Product product = reader.getProduct(productCode);
            
            String message = "\nPRODUCT\n" + 
                    product.getCode() + "\n" + 
                    product.getDescription() + "\n" +
                    product.getFormattedPrice();
            
            System.out.println("Continue? (y/n):");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("Bye");
    }
}
