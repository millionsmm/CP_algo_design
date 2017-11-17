package com.example.SwordRefersToOffer;

import java.util.Stack;

/**
 * Created by Wilber
 * on 2017/11/17.
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */

public class IsPopOrder {
    public boolean isPopOrder(int[] push, int[] pop) {
        if (push == null || pop == null || push.length == 0 || pop.length == 0 || push.length != pop.length)
            return false;
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pop.length; i++) {
            stack.push(push[i]);
            while (j < pop.length && stack.peek() == pop[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
