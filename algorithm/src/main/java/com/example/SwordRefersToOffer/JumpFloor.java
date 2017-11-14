package com.example.SwordRefersToOffer;

/**
 * Created by Wilber
 * on 2017/11/14.
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上
 * 一个n级的台阶总共有多少种跳法。
 */

public class JumpFloor {
    public int jumpFloor(int target) {
        if (target <= 0) return 0;
        if (target <= 2) return target;
        int i = 1;
        int j = 2;
        for (; target > 2; target--) {
            j = j + i;
            i = j - i;
        }
        return j;
    }
}
