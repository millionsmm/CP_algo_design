package com.example.SwordRefersToOffer;

/**
 * Created by Wilber
 * on 2017-11-22 .
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
 */

public class NumberOf1Between1AndN {
    public int numberOf1Between1AndN(int n) {
        int result = 0;
        while (n > 0) {
            String s = String.valueOf(n);
            char[] c = s.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (c[i] == '1') {
                    result++;
                }
            }
            n--;
        }
        return result;
    }
}
