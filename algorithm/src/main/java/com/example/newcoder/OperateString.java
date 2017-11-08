package com.example.newcoder;

import java.util.Scanner;

/**
 * Created by Wilber
 * on 8/11/2017.
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
            length--;
        }
        String temp = b.toString();
        StringBuilder result = new StringBuilder();
        for (int i1 = 0; i1 < temp.length(); i1++) {
            result.append(temp.charAt(i1)).append(" ");
        }
        return result.toString().trim();
    }
}
