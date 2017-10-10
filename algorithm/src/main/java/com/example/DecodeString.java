package com.example;

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
        System.out.print(1);
    }

}
