/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Hoang Duy Nhat
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "Le Van An";
        String s2 = "aaaa";
        /*System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase("barry Allen"));
        System.out.println(s1.isEmpty());
        System.out.println(s1.startsWith("Harry"));
        System.out.println(s1.endsWith("Allen"));
        System.out.println(s1.trim());
        System.out.println(s1.length());
        System.out.println(s1.indexOf("y"));
        System.out.println(s1.substring(4));
        System.out.println(s1.substring(4, 7));
        System.out.println(s1.replace("l", "o"));
        
        System.out.println(s1.indexOf("a"));*/
        System.out.println(s1.substring((s1.lastIndexOf(" ")+1)));
        System.out.println(s1.substring(7));
    }
    
}
