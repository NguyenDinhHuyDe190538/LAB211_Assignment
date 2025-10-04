/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab211_bai3_binarysearch_w3;

/**
 *
 * @author dinhh
 */
public class Main {
    public static void main(String[] args) {
        Validator val = new Validator();
        BinarySearchArray app = new BinarySearchArray();

        int size = val.getPositiveInt("Enter number of array: ");
        app.generateArray(size);
        int target = val.getPositiveInt("Enter search value: ");

        app.displayArray();
        int index = app.binarySearch(target);

        if (index == -1)
            System.out.println(target + " not found!");
        else
            System.out.println("Found " + target + " at index: " + index);
    }
}
