/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primetivereftypedemo;

/**
 *
 * @author Hoang Duy Nhat
 */
public class PrimetiveRefTypeDemo {

    
    public static void main(String[] args) {
        System.out.println("Demo Primitive Type and Reference Type");
        /*double price = 5;
        increasePrice(price);
        System.out.println("Price after in main:" + price);*/
        Product p = new Product("Java","Practice Java", 5.0);
        increasePrice2(p);
        System.out.println("Price after in main:" + p.getPrice());
    }
    private static void increasePrice2(Product p){
        p.setPrice(p.getPrice()+5);
        System.out.println("Price in sub"+ p.getPrice());
    }
    private static void increasePrice(double price){
        price+=5;
        System.out.println("Price in sub:" + price);
    }
    
}
