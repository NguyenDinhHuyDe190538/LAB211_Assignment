/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab211_bai3_binarysearch_w3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author dinhh
 */
class BinarySearchArray {
    private int[] arr;

    public void generateArray(int size) {
        arr = new int[size];
        Random rd = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(size) + 1; // random từ 1 đến size
        }
        Arrays.sort(arr); // sắp xếp mảng
    }

    public void displayArray() {
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public int binarySearch(int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) return mid;
            else if (arr[mid] < x) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}