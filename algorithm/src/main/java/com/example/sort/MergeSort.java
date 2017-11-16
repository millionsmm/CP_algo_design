package com.example.sort;

/**
 * Created by Wilber
 * on 2017/11/15.
 */

public class MergeSort {
    public void mergeSort(int a[]) {
        if (a == null || a.length < 2) return;
        mergeSort(a, 0, a.length - 1);
    }

    private void mergeSort(int a[], int l, int r) {
        if (l == r) return;
        int mid = l + ((r - 1) >> 1);
        mergeSort(a, l, mid);
        mergeSort(a, mid + 1, r);
        merge(a, l, mid, r);
    }

    private void merge(int[] a, int l, int mid, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= r) {
            help[i++] = a[p1] < a[p2] ? a[p1++] : a[p2++];
        }
        while (p1 <= mid) {
            help[i++] = a[p1++];
        }
        while (p2 <= r) {
            help[i++] = a[p2++];
        }
        for (i = 0; i < help.length; i++) {
            a[l + i] = help[i];
        }
    }
}
