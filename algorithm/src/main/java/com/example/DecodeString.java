package com.example;

import java.util.Scanner;

/**
 * 滴滴出行的一道编程题。
 * 给定一个非空字符串, 按照如下方式编码, 使得编码后长度最小,返回编码后的长度:
 * 编码规则为: k[encoding_string], 表示重复k次encoding_strng,
 * 例如'abcdefabcdefabc'可表示为'2[abcdef]abc', 但是'aaa'仅能编码成'aaa',
 * 因为len('3[a]')>len('aaa').
 *
 * @ 补充:
 * 1. k为正整数, []内的encoding_string不得含有空格不得为空;
 * 2. []内的encoding_string 本身可以为编码过的字符串, 例如'abcdabcdeabcdabcde' 可以编码为 '2[abcdabcde]'(编码后长度从18减少到12),
 * []内的'abcdabcde'又可以编码为 '2[abcd]e', 最终编码为 '2[2[abcd]e]', 编码后长度为11, 应返回11;
 * 这个编码路径也能是: 'abcdabcdeabcdabcde' -> '2[abcd]e2[abcd]e' -> '2[2[abcd]e]';
 * 3. 输入字符串为全小写英文字母, 长度<=160;
 * 4. 如果编码后长度没有更小, 则保留原有字符串;
 */
public class DecodeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if (s.length() < 5) System.out.println(s.length());
        else {
            System.out.println(decodeString(s).length());
        }
    }

    public static String decodeString(String str) {
        if (str.length() <= 4) return str;
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length() - 1; j > i; j--) {
                if (str.charAt(j) != str.charAt(i)) continue;
                int k = 0;
                while (j + k < str.length() && str.charAt(i + k) == str.charAt(j + k)) ++k;
                String base = str.substring(i, i + k);
                int len = j - i;
                if (len % k != 0) continue;
                int num = len / k + 1;
                if (3 + k >= j - i + k) continue;
                int n = num - 1;
                while (--n != 0) {
                    if (base.equals(str.substring(i + n * k, i + n * k + k))) continue;
                    else break;
                }
                if (n != 0) {
                    continue;
                } else {
                    String res = str.substring(0, i);
                    String numstr = String.valueOf(num);
                    res += numstr;
                    res += '[';
                    res += decodeString(base);
                    res += ']';
                    res += str.substring(j + k);
                    return res;
                }

            }
        }
        return str;
    }
    //    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String str = in.next();
//        int len = str.length();
//        if (len < 5) System.out.println(len);
//        else {
//            int cur;
//            int ret = len;
//            String newStr = str;
//            while (true) {
//                boolean changed = false;
//                for (cur = 0; cur < str.length() - 4; ++cur) {
//                    for (int i = 1; i <= str.length() / 2; ++i) {
//                        String res = decodeString(str, cur, i, ret);
//                        if (!res.equals("")) {
//                            ret = res.length();
//                            newStr = res;
//                            changed = true;
//                        }
//                    }
//                }
//                str = newStr;
//                if (!changed || str.length() < 5) break;
//            }
//            System.out.println(ret);
//        }
//    }
//
//    public static String decodeString(String string, int cur, int len, int minLen) {
//        int m = 1;
//        String s = string.substring(cur, len);
//        for (int i = len + cur; i < string.length() - len; i += len) {
//            String temp = string.substring(i, len);
//            if (!s.equals(temp)) break;
//            ++m;
//        }
//        int ret = string.length() - m * len + len + 3;
//        if (ret < minLen) {
//            String res = string.substring(0, cur);
//            res += String.valueOf(m);
//            res += '[';
//            res += s;
//            res += ']';
//            res += string.substring(cur + m * len, string.length());
//            return res;
//        }
//        return string;
//    }
}
