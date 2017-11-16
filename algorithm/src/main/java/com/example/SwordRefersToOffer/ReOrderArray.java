package com.example.SwordRefersToOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wilber
 * on 2017/11/16.
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */

public class ReOrderArray {
    public void reOrderArray(int[] array) {
        List<Integer> oldList = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                oldList.add(array[i]);
            }
            if (array[i] % 2 == 0) {
                newList.add(array[i]);
            }
        }
        oldList.addAll(newList);
        for (int i = 0; i < array.length; i++) {
            array[i] = oldList.get(i);
        }
    }
}
