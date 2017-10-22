package com.example.sort;

/**
 * Created by Wilber
 * on 22/10/2017.
 */

public class quickSort {
    /**
     * 普通快排
     *
     * @param a 数组
     * @param p 左边的数
     * @param r 右边的数
     */
    public static void quickSort(int a[], int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            quickSort(a, p, q - 1);
            quickSort(a, q + 1, r);
        }
    }

    public static int partition(int a[], int p, int r) {
        int i = p;
        int j = r;
        int x = a[p];
        while (i < j) {
            while (i < j && a[j] > x) j--;
            if (i < j) a[i] = a[j];
            while (i < j && a[i] < x) i++;
            if (i < j) a[j] = a[i];
        }
        a[i] = x;
        return i;
    }
}
