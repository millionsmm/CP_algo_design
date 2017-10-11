package com.example;

import java.util.Scanner;

/**
 * Created by Wilber
 * on 11/10/2017.
 * 同学们，我们刚刚经历了十一和中秋双节假期，让我们一起预祝我们的祖国繁荣富强，
 * 同学们每个中秋与家人共赏明月，也期待同学们能够加入去哪儿网，为大家的出游和回家团圆尽一份力量。
 * 我们的第二题是这样的，给出一个以空格作为分隔符的字符串，求其与其空格分隔的逆序字符串的最长公共子序列长度。
 */

public class LongestString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String[] s = str1.split(" ");
        String str2 = "";
        for (int i = s.length - 1; i >= 0; i--) {
            str2 += s[i] + " ";
        }
        str2 = str2.trim();
        System.out.println(getLongestCommon(str1, str2));
    }

    public static int getLongestCommon(String str1, String str2) {
        int[][] kNum = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    kNum[i][j] = kNum[i - 1][j - 1] + 1;
                } else {
                    kNum[i][j] = Math.max(kNum[i][j - 1], kNum[i - 1][j]);
                }
            }
        }
        StringBuilder str = new StringBuilder();
        int i = str1.length(), j = i;
        while (i != 0 && j != 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                str.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (kNum[i][j - 1] > kNum[i - 1][j]) {
                j--;
            } else i--;
        }
        return str.toString().length();

    }

//        int[] kNum = new int[50];
//        int n = 0;
//        for (int i = 0; i < str1.length(); i++) {
//            for (int j = i; j < str2.length(); j++) {
//                if (str1.charAt(i) != str2.charAt(j)) continue;
//                int k = 0;
//                while (j + k < str1.length() && str1.charAt(i + k) == str2.charAt(j + k)) ++k;
//                kNum[n++] = k;
//            }
//        }
//        for (int i = 0; i < kNum.length; i++) {
//            for (int j = 0; j < kNum.length-1; j++) {
//                if (kNum[j] < kNum[j + 1]) {
//                    int temp = kNum[j];
//                    kNum[j] = kNum[j + 1];
//                    kNum[j + 1] = temp;
//                }
//            }
//        }
//        return kNum[0];

}
