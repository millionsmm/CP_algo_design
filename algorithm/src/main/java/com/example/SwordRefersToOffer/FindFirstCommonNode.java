package com.example.SwordRefersToOffer;

/**
 * Created by Wilber
 * on 2017-11-24 .
 * 输入两个链表，找出它们的第一个公共结点。
 */

public class FindFirstCommonNode {
    private ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = getListLength(pHead1);
        int len2 = getListLength(pHead2);
        if (len1 > len2) {
            pHead1 = walkStep(pHead1, len1 - len2);
        } else {
            pHead2 = walkStep(pHead2, len2 - len1);
        }
        while (pHead1 != null) {
            if (pHead1 == pHead2) return pHead1;
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;
    }

    private ListNode walkStep(ListNode pHead, int i) {
        while (i-- > 0) {
            pHead = pHead.next;
        }
        return pHead;
    }

    private int getListLength(ListNode pHead) {
        if (pHead == null) return 0;
        int sum = 1;
        while (pHead.next != null) {
            sum++;
            pHead = pHead.next;
        }
        return sum;
    }

    private class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
