/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab211_bai1_bubblesort_w3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author dinhh
 */
class BubbleSortArray {
    private int[] arr;

    public void generateArray(int size, int range) {
        arr = new int[size];
        Random rd = new Random();
        for (int i = 0; i < size; i++) {
            // Sinh số ngẫu nhiên trong khoảng 1..range
            arr[i] = rd.nextInt(range) + 1;
        }
    }

    public void displayArray(String msg) {
        System.out.println(msg + Arrays.toString(arr));
    }

    public void bubbleSort() {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
