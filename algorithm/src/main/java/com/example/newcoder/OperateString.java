package com.example.newcoder;

import java.util.Scanner;

/**
 * Created by Wilber
 * on 8/11/2017.
 * 40%
 */

public class OperateString {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int n[] = new int[length];
        for (int i = 0; i < length; i++) {
            n[i] = in.nextInt();
        }
        System.out.println(getOperateString(length, n));
    }

    private static String getOperateString(int length, int[] n) {
        StringBuilder b = new StringBuilder();
        int i = 0;
        while (length > 0) {
            b.append(n[i]);
            i++;
            b.reverse();
            b.append(" ");
            length--;
        }
        return b.toString().trim();
    }
}
