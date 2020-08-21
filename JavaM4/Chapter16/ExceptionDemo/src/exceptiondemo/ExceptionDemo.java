/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondemo;

import java.util.Scanner;

/**
 *
 * @author Hoang Duy Nhat
 */
public class ExceptionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*boolean again = true;
        while(again)
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter value first number: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter value second number: ");
            int b = Integer.parseInt(scanner.nextLine());
            int div = a / b;
            System.out.println("Sum value: " + div);
            again = false;
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid data");
        } catch (ArithmeticException e) {
            System.out.println("Can not /0");
        } finally {
            System.out.println("Thank you. Good bye");
        }*/
        try {
            divTwoNumber();
        } catch(NumberFormatException e){
            System.out.println("Please check your data");
        }
        
    }
    
    public static void divTwoNumber() throws NumberFormatException{
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter value first number: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter value second number: ");
            int b = Integer.parseInt(scanner.nextLine());
            int div = a / b;
            System.out.println("Sum value: " + div);
    }

}
