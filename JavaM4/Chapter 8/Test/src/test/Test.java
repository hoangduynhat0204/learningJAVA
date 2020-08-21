/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Hoang Duy Nhat
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*System.out.println("Input your choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addition");
                break;
            case 2:
                System.out.println("Multiplication");
                break;
            case 3:
                System.out.println("Division");
                break;
            case 4:
                System.out.println("Subtraction");
                break;
            default:
                System.out.println("Invalid choice");
        }*/
 /*int num = 1;
        do {
            System.out.println("AAA");
            num++;
        } while (num <= 5);*/

 /*for (int i = 1; i <= 5; i++) { // i =1, i =2, i =3
            for (int j = 1; j <= 4; j++) { // j=1, j=2, j=3 , j =4
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*int sum = 0;

        for (int i = 1; i <= 50; i++) {

            if (i == 35) {
                continue;
            }
            sum += i;
            //System.out.println(i);
        }
        while(i<=50){
            sum +=i;
            i++;
            if(sum>=100)
                break;
        }
        System.out.println(sum);*/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a");
        String aLine = sc.nextLine();
        try {
            double a = Double.parseDouble(aLine);
            System.out.println("a = " + a);
            int al = 10/0;
        } catch(NumberFormatException e){
            System.out.println("Please enter number value!!!!");
        } catch (ArithmeticException e) {
            System.out.println("Can not /0!!!!");
        } catch (Exception e) {
            System.out.println("Other error!!!");
        }

    }

}
