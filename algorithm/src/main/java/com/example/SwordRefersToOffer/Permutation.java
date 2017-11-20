package com.example.SwordRefersToOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by Wilber
 * on 2017-11-20 .
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * input:
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */

public class Permutation {
    private static ArrayList<String> permutation(String str) {
        ArrayList<String> resList = new ArrayList<>();
        if (str == null || str.length() < 1) return resList;
        HashSet<String> set = new HashSet<>();
        fun(set, str.toCharArray(), 0);
        resList.addAll(set);
        Collections.sort(resList);
        return resList;
    }

    private static void fun(HashSet<String> set, char[] str, int k) {
        if (k == str.length) {
            set.add(new String(str));
            return;
        }
        for (int i = k; i < str.length; i++) {
            swap(str, i, k);
            fun(set, str, k + 1);
            swap(str, i, k);
        }
    }

    private static void swap(char[] str, int i, int j) {
        if (i != j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
    }

    private static void print(ArrayList<String> resList) {
        for (String s : resList) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        print(permutation("abc"));
    }
}
