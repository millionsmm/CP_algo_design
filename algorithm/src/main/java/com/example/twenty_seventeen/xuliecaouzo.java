package com.example.twenty_seventeen;

import java.util.Scanner;

/**
 * 美团点评
 * Created by Wilber
 * on 11/10/2017.
 * 有一天你得到了一个长度为 n 的序列，序列中的元素分别是 1,2,3,…,n。接下来你想对这个序列进行一些操作。
 * 每一次操作你会选择一个数然后将它从序列中原来的位置取出并放在序列的最前面。
 * 你想知道经过一系列操作后这个序列长什么样。
 *
 * @ 输入
 * 第一行包含两个整数n,m，分别表示序列的长度和操作的个数。1 ≤ n,m≤ 105
 * 接下来m行每行包含一个整数ki，表示你要把ki放到序列的最前面。1 ≤ ki ≤ n
 * @ 输出
 * 从前往后输出序列中的每个元素，每个元素占一行。
 */
//超出时间限制
public class xuliecaouzo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = in.nextInt();
        String string = "";
        for (int i = 1; i <= n; i++) {
            string += i;
        }
        int num[] = new int[count];
        for (int i = 0; i < count; i++) {
            num[i] = in.nextInt();
        }


        for (int i = 0; i < count; i++) {
            String[] temp = string.split(String.valueOf(num[i]));
            string = String.valueOf(num[i]);
//            for (int j = 0; j < temp.length; j++) {
//                string += temp[j];
//            }
            for (String s : temp) {
                string += s;
            }
        }
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }

    }
}
