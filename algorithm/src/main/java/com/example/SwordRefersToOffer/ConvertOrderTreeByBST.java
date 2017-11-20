package com.example.SwordRefersToOffer;

/**
 * Created by Wilber
 * on 2017-11-20 .
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向
 */

public class ConvertOrderTreeByBST {
    private TreeNode leftHead = null;
    private TreeNode rightHead = null;

    private TreeNode convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        convert(pRootOfTree.left);
        if (rightHead == null) {
            leftHead = rightHead = pRootOfTree;
        } else {
            rightHead.right = pRootOfTree;
            pRootOfTree.left = rightHead;
            rightHead = pRootOfTree;
        }
        convert(pRootOfTree.right);
        return leftHead;
    }

    private class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

}
