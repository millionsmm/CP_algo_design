package com.example.sort;

/**
 * Created by Wilber
 * on 2017/11/16.
 */

public class HeapSort {
    public void heapSort(int[] a) {
        if (a == null || a.length < 2) return;
        for (int i = 0; i < a.length; i++) {
            heapInsert(a, i);
        }
        int size = a.length;//剩余堆的尺寸
        swap(a, 0, --size);
        while (size > 0) {
            heapify(a, 0, size);
            swap(a, 0, --size);
        }
    }

    public void heapInsert(int[] a, int index) {
        while (a[index] > a[(index - 1) / 2]) {
            swap(a, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    public void heapify(int[] a, int index, int size) {
        int left = index * 2 + 1;
        while (left < size) {
            int largest = left + 1 < size && a[left + 1] > a[left] ? left + 1 : left;
            largest = a[largest] > a[index] ? largest : index;
            if (largest == index) break;
            swap(a, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }

    public void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
