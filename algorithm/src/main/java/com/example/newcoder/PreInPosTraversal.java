package com.example.newcoder;

import java.util.Stack;

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

    public void inOrderRecur(TreeNode root) {
        if (root == null) return;
        preOrderRecur(root.left);
        System.out.print(root.value + " ");
        preOrderRecur(root.right);
    }

    public void posOrderRecur(TreeNode root) {
        if (root == null) return;
        preOrderRecur(root.left);
        preOrderRecur(root.right);
        System.out.print(root.value + " ");
    }

    public void preOrderUnRecur(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.add(root);
            while (!stack.isEmpty()) {
                root = stack.pop();
                System.out.print(root.value + " ");
                if (root.right != null) {
                    stack.push(root.right);
                }
                if (root.left != null) {
                    stack.push(root.left);
                }
            }
        }
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
