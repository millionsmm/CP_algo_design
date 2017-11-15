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
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
