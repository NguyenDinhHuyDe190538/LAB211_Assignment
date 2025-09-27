/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211_bai4_stack_w3;

import java.util.Scanner;

/**
 *
 * @author dinhh
 */
class Validator {
    private Scanner sc = new Scanner(System.in);

    public int getInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println(">> Invalid format, please enter again!");
            }
        }
    }
}
