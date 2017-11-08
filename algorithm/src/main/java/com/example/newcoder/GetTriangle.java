package com.example.newcoder;

import java.util.Scanner;

/**
 * Created by Wilber
 * on 8/11/2017.
 * 有N个木棒，编号为1～N，从中取出3根，构成一个三角形
 * 请问有多少种取法
 */

public class GetTriangle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int length[] = new int[n];
        for (int i = 0; i < n; i++) {
            length[i] = in.nextInt();
        }
        System.out.println(getNum(length));
    }

    private static int getNum(int[] length) {
        int result = 0;
        for (int i = 0; i < length.length; i++) {
            for (int j = i + 1; j < length.length; j++) {
                for (int k = j + 1; k < length.length; k++) {
                    if (length[i] + length[j] > length[k] && length[i] + length[k] > length[j] && length[j] + length[k] > length[i]) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}
