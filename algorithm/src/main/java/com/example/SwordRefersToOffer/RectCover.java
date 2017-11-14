package com.example.SwordRefersToOffer;

/**
 * Created by WIlber
 * on 2017/11/14.
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
 * 总共有多少种方法？
 */

public class RectCover {
    private int rectCover(int target) {
        if (target <= 0) return 0;
        if (target <= 2) return target;
        return rectCover(target - 1) + rectCover(target - 2);
    }
}
