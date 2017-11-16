package com.example.SwordRefersToOffer;

/**
 * Created by Wilber
 * on 2017/11/16.
 * 给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方。
 */

public class Power {
    public double power(double base, int exponent) {
        if (exponent == 0) return 1;
        boolean flag = true;
        if (exponent < 0) {
            flag = false;
            exponent = -exponent;
            if (base == 0) throw new RuntimeException("分母不为0");
        }
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return flag ? result : 1 / result;
    }
}
