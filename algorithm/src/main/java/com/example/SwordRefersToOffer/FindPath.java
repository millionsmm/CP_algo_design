package com.example.SwordRefersToOffer;

import java.util.ArrayList;

/**
 * Created by Wilber
 * on 2017-11-20 .
 */

public class FindPath {
    private ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        if (root == null) return lists;
        searchPath(new ArrayList<Integer>(), root, target);
        return lists;
    }

    private void searchPath(ArrayList<Integer> list, TreeNode root, int target) {
        if (root == null) return;
        target = target - root.val;
        list.add(root.val);
        if (root.left == null && root.right == null) {
            if (target == 0) lists.add(list);
            return;
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        searchPath(list, root.left, target);
        searchPath(list2, root.right, target);
    }

    private class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}
