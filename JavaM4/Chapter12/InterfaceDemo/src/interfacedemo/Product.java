/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemo;

/**
 *
 * @author Hoang Duy Nhat
 */
public class Product implements Printable{
    @Override
    public void print(){
        System.out.println("This is an implementation of Printable Interface");
    }
    
}
