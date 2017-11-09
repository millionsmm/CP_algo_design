package com.example.SwordRefersToOffer;

import java.util.ArrayList;

/**
 * Created by Wilber
 * on 9/11/2017.
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */

public class PrintListFromTailToHead {
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            this.printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
