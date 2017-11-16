package com.example.SwordRefersToOffer;

/**
 * Created by Wilber
 * on 2017/11/16.
 * 输入一个链表，输出该链表中倒数第k个结点。
 */

public class FindKthToTail {
    public ListNode findKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) return null;
        ListNode last = head;
        for (int i = 1; i < k; i++) {
            last = last.next;
            if (last == null) return null;
        }
        while (last.next != null) {
            head = head.next;
            last = last.next;
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
