package com.example.SwordRefersToOffer;

import java.util.Stack;

/**
 * Created by Wilber
 * on 2017/11/17.
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
