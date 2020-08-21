/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

/**
 *
 * @author Hoang Duy Nhat
 */
public class CastObject {
    public static void main(String[] args) {
       
        /*Product p1 = new Product();
        Product p2 = new Product();
        System.out.println(p1.equals(p2));*/
        
        Product p1 = new Product();
        Product p2 = p1;
        System.out.println(p1.equals(p2));
                
    }
}
