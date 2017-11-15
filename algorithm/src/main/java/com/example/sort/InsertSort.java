package com.example.sort;

/**
 * Created by Wilber
 * on 2017/11/15.
 */

public class InsertSort {
    public void insertSort(int a[]) {
        if (a == null || a.length < 2) return;
        for (int i = 1; i < a.length; i++) {
            for (int j = i - 1; j >= 0 && a[j] > a[j + 1]; j--) {
                swap(a, j, j + 1);
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

}
