package com.example;

import java.util.Scanner;

/**
 * Created by Wilber
 * on 1/11/2017.
 * <p>
 * 黄金圣斗士拯救雅典娜，雅典娜在右下角
 * 每次只能往右边或者下面走，每个位置的值代表遭遇的事件，如果是负数则扣血
 * 如果是正数则回血，走到任何一个位置，血量都不能少于1，为了保证救出雅典娜，
 * 初始血量至少是多少？
 */

public class Pure2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] row = new int[n][m];
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < row[0].length; j++) {
                row[i][j] = in.nextInt();
            }
        }
    }

    public int getMin(int n, int m, int[][] row) {
        int[][] dp = new int[n][m];
        return 0;
    }
}
