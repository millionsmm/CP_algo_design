package com.example.twenty_seventeen;

import java.util.Scanner;

/**
 * 完美世界
 * Created by Wilber
 * on 1/11/2017.
 * <p>
 * AB两队进行PK，每队有n个英雄，每局一个英雄出战进行PK，（且每个英雄只能出战一次）
 * 每个英雄都有武力值，武力值大大英雄获胜，武力值相同平局，平局没有得失，每赢一局
 * 该队获得100个元宝，输一局损失100个元宝。求A队最多可以赢得多少元宝
 */

public class Pure1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        in.nextLine();
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        in.nextLine();
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        quickSort(a, 0, a.length - 1);
        quickSort(b, 0, b.length - 1);

        System.out.println(getAMax(n, a, b));
    }

//    public static void sortA(int[] a) {
//        for (int i = 0; i < a.length - 1; i++) {
//            for (int j = 0; j < a.length - i - 1; j++) {
//                if (a[j] < a[j + 1]) {
//                    int temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j] = temp;
//                }
//            }
//        }
//    }

    private static int getAMax(int n, int[] a, int[] b) {
        int result = 0;
        int temp = 0;
        int i = 0, j = 0;
        while (j < b.length) {
            if (a[i] > b[j]) {
                result += 100;
                i++;
                j++;
                if (j == b.length) break;
            }
            if (a[i] == b[j]) {
                continue;
            }
            if (a[i] < b[j]) {
                j++;
                temp++;
            }
        }

        return result + temp * (-100);
    }

    public static void quickSort(int a[], int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            quickSort(a, p, q - 1);
            quickSort(a, q + 1, r);
        }
    }

    public static int partition(int a[], int p, int r) {
        int i = p;
        int j = r;
        int x = a[p];
        while (i < j) {
            while (i < j && a[j] < x) j--;
            if (i < j) a[i] = a[j];
            while (i < j && a[i] > x) i++;
            if (i < j) a[j] = a[i];
        }
        a[i] = x;
        return i;
    }
}
