package com.example.newcoder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Wilber
 * on 8/11/2017.
 * 求循环单词的种数
 */

public class NumOfCycle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String words[] = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = in.nextLine();
        }
        System.out.println(getNum(words));
    }

    private static int getNum(String words[]) {
        int result = 0;
        HashMap<String, Set<String>> map = new HashMap<>();
        for (String word : words) {
            Set<String> set = getStrings(word);
            if (!map.containsValue(set)) {
                result++;
            } else {
                map.put(word, set);
            }
        }
        return result;
    }


    private static Set<String> getStrings(String word) {
        Set<String> set = new HashSet<>();
        for (int i = 1; i <= word.length(); i++) {
            String s = word.substring(i, word.length()) + word.substring(0, i);
            set.add(s);
        }
        return set;
    }
}
