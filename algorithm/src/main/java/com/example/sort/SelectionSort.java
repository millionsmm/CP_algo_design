package com.example.sort;

/**
 * Created by Wilber
 * on 2017/11/15.
 */

public class SelectionSort {
    public void selectionSort(int a[]) {
        if (a == null || a.length < 2) return;
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                minIndex = a[j] < a[minIndex] ? j : minIndex;
            }
            swap(a, i, minIndex);
        }
    }

    public void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
