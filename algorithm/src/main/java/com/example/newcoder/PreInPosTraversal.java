package com.example.newcoder;

/**
 * Created by Wilber
 * on 2017-11-27 .
 * 树的遍历。
 * 前序，中序，后序，递归，非递归遍历
 */

public class PreInPosTraversal {
    public void preOrderRecur(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrderRecur(root.left);
        preOrderRecur(root.right);
    }

    public class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.value = data;
        }
    }
}
