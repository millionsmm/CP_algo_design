package com.example.newcoder;

import java.util.Scanner;

/**
 * Created by Wilber
 * on 2017/11/15.
 * 输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
 */

public class CountTailZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(getTailZeroCount(n));
    }

    private static int getTailZeroCount(int n) {
        if (n == 0) return 1;
        int res = 0;
        for (int i = n; i >= 5; i--) {
            int temp = i;
            while (temp % 5 == 0) {
                res++;
                temp /= 5;
            }
        }
        return res;

    }
}
