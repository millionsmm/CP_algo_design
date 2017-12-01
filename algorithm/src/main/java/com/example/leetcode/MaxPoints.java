package com.example.leetcode;

/**
 * Created by Wilber
 * on 2017-12-01 .
 * Given n points on a 2D plane,
 * find the maximum number of points that lie on the same straight line.
 */

public class MaxPoints {
    public int maxPoints(Point[] points) {
        int length = points.length;
        if (length < 2) return length;
        int max = 2;
        for (int i = 0; i < points.length; i++) {
            int x = points[i].x;
            int y = points[i].y;
            int num = 1;
            int temp = 0;
            for (int j = i + 1; j < points.length; j++) {
                int gapx1 = x - points[j].x;
                int gapy1 = y - points[j].y;
                if (gapx1 == 0 && gapy1 == 0) {
                    temp++;
                } else {
                    num++;
                    for (int k = j + 1; k < points.length; k++) {
                        int gapx2 = x - points[k].x;
                        int gapy2 = y - points[k].y;
                        if (gapx1 * gapy2 == gapy1 * gapx2) {
                            num++;
                        }
                    }
                    if (max < num + temp) {
                        max = num + temp;
                    }
                }
                num = 1;
            }
            if (max < num + temp) {
                max = num + temp;
            }
        }
        return max;
    }

    class Point {
        int x;
        int y;

        Point() {
            x = 0;
            y = 0;
        }

        Point(int a, int b) {
            x = a;
            y = b;
        }
    }
}
