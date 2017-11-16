package com.example.SwordRefersToOffer;

/**
 * Created by Wilber
 * on 2017/11/16.
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 */

public class HasSubtree {
    private boolean hasSubtree(TreeNode root1, TreeNode root2) {
//        if (root1 == null || root2 == null) return false;
//        return isSubtree(root1, root2)
//                || hasSubtree(root1.left, root2)
//                || hasSubtree(root1.right, root2);
        return !(root1 == null || root2 == null)
                && (isSubtree(root1, root2)
                || hasSubtree(root1.left, root2)
                || hasSubtree(root1.right, root2));
    }

    private boolean isSubtree(TreeNode root1, TreeNode root2) {
//        if(root2==null) return true;
//        if(root1==null) return false;
//        if(root2.val==root1.val){
//            return isSubtree(root1.left,root2.left)&&isSubtree(root1.right,root2.right);
//        }else{
//            return false;
//        }
        return root2 == null
                || root1 != null
                && root2.val == root1.val
                && isSubtree(root1.left, root2.left)
                && isSubtree(root1.right, root2.right);
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
