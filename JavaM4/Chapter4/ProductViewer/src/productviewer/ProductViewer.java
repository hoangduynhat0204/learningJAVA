/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productviewer;

/**
 *
 * @author Hoang Duy Nhat
 */
public class ProductViewer {

    public static void main(String[] args) {
        System.out.println("Welcome to Product Viewer Application");
        
        Product p1 = new Product("Java","Murach Java Programing", 52.5);
        Product p2 = new Product("HTML","HTML CSS Murach", 33);
        /*p1.setCode("Java");
        p1.setDescription("Murach Java Programing");
        p1.setPrice(52.5);*/
        
        /*String message ="code: " + p1.getCode() + "\n" +
                        "Description: " + p1.getPrice() + "\n" +
                        "Price Formatered: " + p1.getFormattedPrice() +"\n";*/
        System.out.println(p2.toPrint());
        Product p3 = ProductDB.getProduct("java");
        System.out.println(p3.toPrint());
    }
    
}
