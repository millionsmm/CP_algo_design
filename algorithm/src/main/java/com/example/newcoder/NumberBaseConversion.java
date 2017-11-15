package com.example.newcoder;

import java.util.Scanner;

/**
 * Created by Wilber
 * on 2017/11/15.
 * 给定一个十进制数M，以及需要转换的进制数N。将十进制数M转化为N进制数
 * <p>
 * input:
 * 输入为一行，M(32位整数)、N(2 ≤ N ≤ 16)，以空格隔开。
 * output:
 * 为每个测试实例输出转换后的数，每个输出占一行。如果N大于9，则对应的数字规则参考16进制（比如，10用A表示，等等）
 */

public class NumberBaseConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println(getConversionNumber(m, n));
    }

    private static String getConversionNumber(int m, int n) {
        if (n < 2 || n > 16 || m == 0) return null;
        StringBuilder sb = new StringBuilder();
        char[] arr = {'A', 'B', 'C', 'D', 'E', 'F'};
        boolean fs = false;
        if (m < 0) {
            fs = true;
            m = -m;
        }
        int temp = 0;
        while (m != 0) {
            temp = m % n;
            if (temp > 9) {
                sb.append(arr[temp - 9 - 1]);
            } else {
                sb.append(temp);
            }
            m /= n;
        }
        if (fs) sb.append("-");
        return sb.reverse().toString();
    }
}
