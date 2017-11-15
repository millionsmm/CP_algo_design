package com.example.sort;

/**
 * Created by Wilber
 * on 2017/11/15.
 */

public class BubbleSort {
    public void bubbleSort(int a[]) {
        if (a == null || a.length == 0) return;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
