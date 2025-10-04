/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab211_bai1_quicksort_w3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dinhh
 */
public class QuickSort {

    private int[] arr;
    private int size;
    private Validator v = new Validator();

    public void SwapElement(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int Partion(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];
        int i = left;
        int j = right;

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                SwapElement(arr, i, j);
                i++;
                j--;
            }
        }
        return i;
    }

    public void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int index = Partion(arr, left, right);
            if (left < index - 1) {
                quickSort(arr, left, index - 1);

            }
            if (index < right) {
                quickSort(arr, index, right);
            }

        }
    }

    public void showArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int[] InputArray() {
        Scanner sc = new Scanner(System.in);
        size = v.getPositiveInt("Enter number of array ");
        arr = new int[size];

        arr = new int[size];
        Random rd = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(size + 1);
        }

        return arr;
    }
}
