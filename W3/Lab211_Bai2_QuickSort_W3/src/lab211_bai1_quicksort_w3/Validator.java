/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211_bai1_quicksort_w3;

import java.util.Scanner;

public class Validator {
    private Scanner sc = new Scanner(System.in);

    public int getPositiveInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                int n = Integer.parseInt(sc.nextLine().trim());
                if (n > 0) return n;
                else System.out.println("nhap so nguyen duong!");
            } catch (NumberFormatException e) {
                System.out.println("nhap lai!");
            }
        }
    }
}

