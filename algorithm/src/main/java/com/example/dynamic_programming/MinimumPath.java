package com.example.dynamic_programming;

/**
 * Created by Wilber
 * on 23/10/2017.
 * 有一个矩阵map，它每个格子有一个权值。从左上角的格子开始每次只能向右或者向下走，
 * 最后到达右下角的位置，路径上所有的数字累加起来就是路径和，返回所有的路径中最小的路径和。
 * 给定一个矩阵map及它的行数n和列数m，请返回最小路径和。保证行列数均小于等于100.
 * 测试样例：
 * [[1,2,3],[1,1,1]],2,3
 * 返回：4
 */

public class MinimumPath {
    /**
     * 设dp[n][m]为走到n*m位置的路径长度，那么显而易见dp[n][m] = min(dp[n-1][m]+map[n][m],dp[n][m-1]+map[n][m])
     */
    public int getMin(int map[][], int n, int m) {
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i][0] += map[j][0];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                dp[0][i] += map[0][j];
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.min(dp[i][j - 1] + map[i][j], dp[i - 1][j] + map[i][j]);
            }
        }
        return dp[n - 1][m - 1];
    }

}
