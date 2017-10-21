package com.example;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Wilber
 * on 21/10/2017.
 * 给出数组n和目标数字s
 * 输出求所有和为s的组合
 */

public class SumOfTarget {
    private static final int TARGET_SUM = 15;
    private static final int[] DATA = {1, 3, 4, 5, 6, 7, 2, 8, 9, 10, 11, 15, 13, 14};
    private static Stack<Integer> stack = new Stack<>();
    private static int sumInStack = 0;

    public static void main(String args[]) {
        populateSubset(DATA, 0, DATA.length);
        populateSubset(DATA, 0, new int[DATA.length], 0, TARGET_SUM);
    }

    /**
     * 使用栈的方法
     *
     * @param data
     * @param fromIndex
     * @param endIndex
     */
    private static void populateSubset(final int[] data, int fromIndex, int endIndex) {
        if (sumInStack >= TARGET_SUM) {
            if (sumInStack == TARGET_SUM) {
                print(stack);
            }
            return;
        }
        for (int currentIndex = fromIndex; currentIndex < endIndex; currentIndex++) {
            if (sumInStack + data[currentIndex] <= TARGET_SUM) {
                stack.push(data[currentIndex]);
                sumInStack += data[currentIndex];
                populateSubset(data, currentIndex + 1, endIndex);
                sumInStack -= stack.pop();
            }
        }
    }

    private static void print(Stack<Integer> stack) {
        StringBuilder sb = new StringBuilder();
        sb.append(TARGET_SUM).append("=");
        for (Integer integer : stack) {
            sb.append(integer).append("+");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }

    /**
     * 不使用栈的方法
     *
     * @param data
     * @param fromIndex
     * @param stack
     * @param stack_len
     * @param target
     */
    private static void populateSubset(final int[] data, int fromIndex, final int[] stack,
                                       final int stack_len, final int target) {
        if (target == 0) {
            printResult(Arrays.copyOf(stack, stack_len));
            return;
        }
        while (fromIndex < data.length && data[fromIndex] > target) {
            fromIndex++;
        }
        while (fromIndex < data.length && data[fromIndex] <= target) {
            stack[stack_len] = data[fromIndex];
            populateSubset(data, fromIndex + 1, stack, stack_len + 1, target - data[fromIndex]);
            fromIndex++;
        }
    }

    private static void printResult(int[] copyOf) {
        StringBuilder sb = new StringBuilder();
        sb.append(TARGET_SUM).append("=");
        for (int i : copyOf) {
            sb.append(i).append("+");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }
}

