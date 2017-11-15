package com.example.newcoder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Wilber
 * on 2017/11/15.
 * 某餐馆有n张桌子，每张桌子有一个参数：a 可容纳的最大人数；
 * 有m批客人，每批客人有两个参数:b人数，c预计消费金额。 在不允许拼桌的情况下，
 * 请实现一个算法选择其中一部分客人，使得总预计消费金额最大
 * <p>
 * input:
 * 输入包括m+2行。
 * 第一行两个整数n(1 <= n <= 50000),m(1 <= m <= 50000)
 * 第二行为n个参数a,即每个桌子可容纳的最大人数,以空格分隔,范围均在32位int范围内。
 * 接下来m行，每行两个参数b,c。分别表示第i批客人的人数和预计消费金额,以空格分隔,范围均在32位int范围内。
 * <p>
 * output:
 * 输出一个整数,表示最大的总预计消费金额
 */

public class MaxMoney {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[] = new int[n];
        in.nextLine();
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int bc[][] = new int[m][2];
        for (int i = 0; i < m; i++) {
            in.nextLine();
            bc[i][0] = in.nextInt();
            bc[i][1] = in.nextInt();
        }
        System.out.println(getMaxMoney(n, m, a, bc));

    }

    private static int getMaxMoney(int n, int m, int[] a, int[][] bc) {
        Arrays.sort(a);
        Arrays.sort(bc, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        int res = 0;
        int index = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < m; i++) {
            if (bc[i][0] > a[n - 1]) continue;
            index = binarySearch(a, bc[i][0]);
            while (index < n && visited[index]) {
                index++;
            }
            if (index < n) {
                res += bc[i][1];
                visited[index] = true;
            }
        }
        return res;

    }

    private static int binarySearch(int[] a, int peo) {
        int low = 0;
        int high = a.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + ((high - low) >> 1);
            if (a[mid] >= peo) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
