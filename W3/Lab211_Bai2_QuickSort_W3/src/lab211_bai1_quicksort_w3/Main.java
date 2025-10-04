/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211_bai1_quicksort_w3;

/**
 *
 * @author dinhh
 */
public class Main {
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] array = qs.InputArray();

        System.out.println("Unorder Sort array:");
        qs.showArray(array);

        qs.quickSort(array, 0, array.length - 1);
        System.out.println("Order sort array:");
        qs.showArray(array);
    }
}

