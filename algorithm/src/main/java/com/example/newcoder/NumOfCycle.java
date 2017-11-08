package com.example.newcoder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Wilber
 * on 8/11/2017.
 */

public class NumOfCycle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String words[] = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = in.nextLine();
        }
        System.out.println();
    }

    private static int getNum(String words[]) {
        int result = 0;


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
