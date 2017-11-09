package com.example.twenty_seventeen;

import java.util.Scanner;

/**
 * 完美世界
 * Created by Wilber
 * on 1/11/2017.
 * <p>
 * 黄金圣斗士拯救雅典娜，雅典娜在右下角
 * 每次只能往右边或者下面走，每个位置的值代表遭遇的事件，如果是负数则扣血
 * 如果是正数则回血，走到任何一个位置，血量都不能少于1，为了保证救出雅典娜，
 * 初始血量至少是多少？
 * <p>
 * -2 　-3　 3
 * -5　-10　1
 * 0 　30　-5
 */

public class Pure2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = in.nextInt();
            }
        }
        System.out.print(getMin(n, m, map));
    }

    public static int getMin(int n, int m, int[][] map) {
        if (map == null || n == 0 || m == 0) return 1;
        int dp[][] = new int[n][m];
        //反方向的动态规划
        dp[n - 1][m - 1] = Math.max(-map[n - 1][m - 1] + 1, 1);
        for (int i = n - 2; i >= 0; i--) {
            dp[i][m - 1] = Math.max(dp[i + 1][m - 1] - map[i][m - 1], 1);
        }
        for (int i = m - 2; i >= 0; i--) {
            dp[n - 1][i] = Math.max(dp[n - 1][i + 1] - map[n - 1][i], 1);
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                dp[i][j] = Math.min(Math.max(dp[i][j + 1] - map[i][j], 1), Math.max(dp[i + 1][j] - map[i][j], 1));
            }
        }
        return dp[0][0];
    }
}
