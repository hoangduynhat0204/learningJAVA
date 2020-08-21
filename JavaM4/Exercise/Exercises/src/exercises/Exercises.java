/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.Scanner;

/**
 *
 * @author Hoang Duy Nhat
 */
public class Exercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input m");
        int m = sc.nextInt();
        System.out.println("Please input n");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = i * j;
            }
        }
        System.out.println("Please input the value which you are looking for: ");
        int a = sc.nextInt();
        boolean isExist = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == a) {
                    isExist = true;
                }
            }
        }
        if (isExist == true) {
            System.out.println("The value you look for is exist");
        } else {
            System.out.println("The value you look for is not exist");
        }
    }

}
