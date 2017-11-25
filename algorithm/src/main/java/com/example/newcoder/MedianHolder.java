package com.example.newcoder;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Wilber
 * on 2017-11-25 .
 * 随时找到数据流的中位数
 * 题目：
 * 有一个源源不断地吐出整数的数据流，假设你有足够的空间来保存吐出的数。
 * 请设计一个名叫MedianHolder的结构，MedianHolder可以随时取得之前吐出所有数的中位数。
 * 要求：
 * 1.如果MedianHolder已经保存了吐出的N个数，那么任意时刻将一个新数加入到
 * MedianHolder的过程，其时间复杂度是O(logN);
 * 2.取得已经吐出的N个数整体的中位数的过程，时间复杂度为O(1).
 */

public class MedianHolder {
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new MaxHeapComparator());
    

    public class MaxHeapComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o2 > o1) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public class MinHeapComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o2 < o1) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
