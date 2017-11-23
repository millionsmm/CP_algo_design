package com.example.SwordRefersToOffer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Wilber
 * on 2017-11-23 .
 */

public class PrintMinNumber {
    private String printMinNumber(int[] numbers) {
        if (numbers == null || numbers.length < 1) return "";
        int len = numbers.length;
        String[] str = new String[len];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String str1 = s1 + s2;
                String str2 = s2 + s1;
                return str1.compareTo(str2);
            }
        });
        for (int i = 0; i < len; i++) {
            stringBuilder.append(str[i]);
        }
        return stringBuilder.toString();
    }
}
