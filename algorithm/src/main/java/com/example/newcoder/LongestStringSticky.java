package com.example.newcoder;

import java.util.Scanner;

/**
 * Created by Wilber
 * on 8/11/2017.
 * 求最长公共连续子串的长度，可能包含空格
 */

public class LongestStringSticky {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println(getCommonCount(a, b));
    }

    private static int getCommonCount(String a, String b) {
        if (a == null || a.length() == 0 || b == null || b.length() == 0) return 0;
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        int matrix[][] = new int[ac.length][bc.length];
        int result = 0;
        for (int i = 0; i < ac.length; i++) {
            for (int j = 0; j < bc.length; j++) {
                if (ac[i] == bc[j]) {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < ac.length; i++) {
            for (int j = 0; j < bc.length; j++) {
                int temp = 0;
                int m = i;
                int n = j;
                while (m < ac.length && n < bc.length && matrix[m++][n++] == 1) {
                    temp++;
                }
                if (result < temp) {
                    result = temp;
                }
            }
        }
        return result;


    }
}
