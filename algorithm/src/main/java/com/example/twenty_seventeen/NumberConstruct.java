package com.example.twenty_seventeen;

import java.util.Scanner;

/**
 * 美团点评
 * Created by Wilber
 * on 11/10/2017.
 * 对于一个十进制数而言，它的数位和等于将它各位数字相加得到的和。比如 231 的数位和是 6，3179 的数位和是 20。
 * 现在你知道某个十进制数的数位和等于 s，并且这个数不包含 0，且任意相邻的数位是不同的，
 * 比如 112 或者 102 都是不满足条件的。现在你想知道满足这样的条件的最大的数是多少？
 */

public class NumberConstruct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print(getCount(num));
    }

    public static String getCount(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        while (num > 0) {
            if (num % 3 == 0) {
                stringBuilder.append(1);
                num -= 1;
            }
            if (num % 3 == 2) {
                stringBuilder.append(2);
                num -= 2;
            }
        }

        return stringBuilder.toString();
    }
}
