package com.example.leetcode.easy;

/**
 * Created by Wilber
 * on 2017-12-16 .
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 * Note:
 * 0 ≤ x, y < 2^31.
 * Example:
 * <p>
 * Input: x = 1, y = 4
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * <p>    ↑   ↑
 * The above arrows point to positions where the corresponding bits are different.
 */

public class HammingDistance {
    public int hammingDistance1(int x, int y) {
        int result = 0;
        int temp = x ^ y;
        while (temp != 0) {
            result++;
            temp &= temp - 1;
        }
        return result;
    }

    public int hammingDistance2(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
