package com.example.sort;

/**
 * Created by Wilber
 * on 2017/11/16.
 */

public class BucketSort {
    public void bucketSort(int[] a) {
        if (a == null || a.length < 2) return;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        int[] bucket = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            bucket[a[i]]++;
        }
        int i = 0;
        for (int j = 0; j < bucket.length; j++) {
            while (bucket[j]-- > 0) {
                a[i++] = j;
            }
        }

    }
}
