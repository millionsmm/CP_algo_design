package com.example.newcoder;

import java.util.Scanner;

/**
 * Created by Wilber
 * on 9/11/2017.
 * 给定一个句子（只包含字母和空格）， 将句子中的单词位置反转，单词用空格分割,
 * 单词之间只有一个空格，前后没有空格。 比如：
 * （1） “hello xiao mi”-> “mi xiao hello”
 */

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        String[] arr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
