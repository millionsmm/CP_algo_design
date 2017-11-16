package com.example.SwordRefersToOffer;

import java.util.ArrayList;

/**
 * Created by Wilber
 * on 2017/11/16.
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，
 * 如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字:  1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */

public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null) return null;
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0, right = col - 1, up = 0, down = row - 1;
        while (left <= right && up <= down) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[up][i]);
            }
            for (int i = up + 1; i <= down; i++) {
                list.add(matrix[i][right]);
            }
            if (up != down) {
                for (int i = right - 1; i >= left; i--) {
                    list.add(matrix[down][i]);
                }
            }
            if (left != right) {
                for (int i = down - 1; i >= up + 1; i--) {
                    list.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            up++;
            down--;
        }
        return list;
    }
}
