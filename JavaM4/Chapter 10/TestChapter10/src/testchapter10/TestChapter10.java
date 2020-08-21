/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testchapter10;

import java.util.Scanner;

/**
 *
 * @author Hoang Duy Nhat
 */
public class TestChapter10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int size = 5;
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = i*10;
        }
        for(int j=0;j<size;j++) {
            System.out.println(arr[j]);
        }
        int[] scores = {2,4,5,6,5};
        for(int score : scores)
            System.out.println(score);*/
        int[][] arr = new int[10][10];
        /*arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 1;
        arr[2][0] = 1;
        arr[2][1] = 1;*/
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = i * j;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("Please input the value which you are looking for: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i][j] == a) {
                    System.out.println("The value " + a + " is in " + "arr[" + i + "]" + "[" + j + "]");
                }

            }
        }
    }

}
