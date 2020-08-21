/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dagiac;

import java.util.Scanner;

/**
 *
 * @author Hoang Duy Nhat
 */
public class TamGiacApp {

    public static void main(String[] args) {
        TamGiac tg = new TamGiac();
        tg.nhap();
        if (tg.ktHopLe()) {
            System.out.println("Chu vi cua tam giac la: " + tg.tinhChuVi());
            System.out.println("Dien tich cua tam giac la: " + tg.tinhDienTich());
        } else {
            System.out.println("3 canh nhap vao khong phai la 3 canh cua mot tam giac");
        }
    }

}
