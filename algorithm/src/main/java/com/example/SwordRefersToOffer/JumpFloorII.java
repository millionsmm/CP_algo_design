package com.example.SwordRefersToOffer;

/**
 * Created by Wilber
 * on 2017/11/14.
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */

public class JumpFloorII {
    public int jumpFloorII(int target) {
        if (target <= 1) return 1;
        return 2 * jumpFloorII(target - 1);
    }
}