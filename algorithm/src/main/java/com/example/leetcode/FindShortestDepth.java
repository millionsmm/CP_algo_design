package com.example.leetcode;

/**
 * Created by Wilber
 * on 2017-11-25 .
 * Given a binary tree, find its minimum depth.The minimum depth
 * is the number of nodes along the shortest path from the root
 * node down to the nearest leaf node.
 */

public class FindShortestDepth {
    public int run(TreeNode root) {
        if (root == null) return 0;
        int l = run(root.left);
        int r = run(root.right);
        if (l == 0 || r == 0) return 1 + l + r;
        return 1 + Math.min(l, r);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
