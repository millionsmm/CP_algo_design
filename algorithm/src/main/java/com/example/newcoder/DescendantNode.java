package com.example.newcoder;

/**
 * Created by Wilber
 * on 2017-11-30 .
 * 在二叉树中找到一个节点的后继节点
 * 在二叉树的中序遍历的序列中，node的下一个节点叫做node的后继节点
 */

public class DescendantNode {
    public Node getNextNode(Node node) {
        if (node == null) {
            return node;
        }
        if (node.right != null) {
            return getLeftMost(node.right);
        } else {
            Node parent = node.parent;
            while (parent != null && parent.left != node) {
                node = parent;
                parent = node.parent;
            }
            return parent;
        }
    }

    public Node getLeftMost(Node node) {
        if (node == null) {
            return node;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public class Node {
        public int value;
        public Node left;
        public Node right;
        public Node parent;

        public Node(int data) {
            this.value = data;
        }
    }


}
