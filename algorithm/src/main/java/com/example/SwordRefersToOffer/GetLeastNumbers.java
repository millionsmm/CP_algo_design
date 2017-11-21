package com.example.SwordRefersToOffer;

import java.util.ArrayList;

/**
 * Created by Wilber
 * on 2017-11-21 .
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,
 */

public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input == null && input.length == 0 || k > input.length) return list;
        quickSort(input, 0, input.length - 1);
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    public void quickSort(int input[], int p, int r) {
        if (p < r) {
            int q = partition(input, p, r);
            quickSort(input, p, q - 1);
            quickSort(input, q + 1, r);
        }
    }

    public int partition(int input[], int p, int r) {
        int i = p;
        int j = r;
        int x = input[p];
        while (i < j) {
            while (i < j && input[j] >= x) j--;
            if (i < j) input[i] = input[j];
            while (i < j && input[i] < x) i++;
            if (i < j) input[j] = input[i];
        }
        input[i] = x;
        return i;
    }
}
