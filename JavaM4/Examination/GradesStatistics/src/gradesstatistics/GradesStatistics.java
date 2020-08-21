/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradesstatistics;

import java.util.Scanner;

/**
 *
 * @author Hoang Duy Nhat
 */
public class GradesStatistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter the grade for student " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("The average is " + average(arr));
        System.out.println("The minimum is " + minimum(arr));
        System.out.println("The maximum is " + maximum(arr));
    }
    public static double average(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }
    public static int maximum(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length;i++){
            if (arr[i] >= max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int minimum(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    
}