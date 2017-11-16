package com.example.SwordRefersToOffer;

/**
 * Created by Wilber
 * on 2017/11/16.
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 二叉树的镜像定义：源二叉树
 * 8
 * /  \
 * 6   10
 * / \  / \
 * 5  7 9 11
 * 镜像二叉树
 * 8
 * /  \
 * 10   6
 * / \  / \
 * 11 9 7  5
 */

public class MirrorTree {
    private void mirror(TreeNode root) {
        if (root == null) return;
        TreeNode tempNode;
        tempNode = root.right;
        root.right = root.left;
        root.left = tempNode;
        mirror(root.left);
        mirror(root.right);
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
