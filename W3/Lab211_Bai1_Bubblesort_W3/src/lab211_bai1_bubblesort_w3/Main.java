/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab211_bai1_bubblesort_w3;

/**
 *
 * @author dinhh
 */
public class Main {

    public static void main(String[] args) {
        Validator val = new Validator();
        BubbleSortArray bubble = new BubbleSortArray();

        int size = val.getPositiveInt("Enter number of array: ");
        int range = 10;
        bubble.generateArray(size, range);
        bubble.displayArray("Unsorted array: ");
        bubble.bubbleSort();
        bubble.displayArray("Sorted array: ");
    }
}
