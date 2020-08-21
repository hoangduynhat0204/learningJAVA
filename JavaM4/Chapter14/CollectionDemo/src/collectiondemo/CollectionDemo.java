/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;

import java.util.ArrayList;

/**
 *
 * @author Hoang Duy Nhat
 */
public class CollectionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> codes = new ArrayList<String>();
        codes.add("mcb2");
        codes.add("java");
        codes.add("jsps");
        //codes.clear();
        System.out.println(codes.get(0));
        System.out.println(codes.indexOf("java"));
        System.out.println(codes.isEmpty());
        System.out.println(codes.size());
        /*for (String s : codes)
            System.out.println(s);*/
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
    }
    
}
