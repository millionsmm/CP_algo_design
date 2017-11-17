package com.example.SwordRefersToOffer;

/**
 * Created by Wilber
 * on 2017/11/17.
 * 输入一个整数数组，判断该数组是不是**某二叉搜索树**的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */

public class IsBackOrderTreeOfBST {
    public boolean verifySequenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        return isBackOrderTreeOfBST(sequence, 0, sequence.length - 1);
    }

    public boolean isBackOrderTreeOfBST(int[] sequence, int start, int end) {
        if (end <= start) return true;
        int i;
        for (i = 0; i < end; i++) {
            if (sequence[i] > sequence[end]) break;
        }
        for (int j = i; j < end; j++) {
            if (sequence[j] < sequence[end]) return false;
        }
        return isBackOrderTreeOfBST(sequence, 0, i - 1) && isBackOrderTreeOfBST(sequence, i, end - 1);
    }
}
