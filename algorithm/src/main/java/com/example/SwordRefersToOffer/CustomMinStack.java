package com.example.SwordRefersToOffer;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by Wilber
 * on 2017/11/17.
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */

public class CustomMinStack {
    Stack<Integer> stack = new Stack<>();

    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        int min = stack.peek();
        int temp = 0;
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            temp = iterator.next();
            if (temp < min) min = temp;
        }
        return min;
    }
}
