package com.example.newcoder;

import java.util.HashMap;

/**
 * Created by Wilber
 * on 18/10/2017.
 */

public class isHaveLoop {
    //方法，两指针跑环
    public boolean hasLoop1(Node node) {
        Node temp1 = node;
        Node temp2 = node.next;
        while (temp2 != null) {
            if (temp1 == temp2) return true;
            temp1 = temp1.next;
            temp2 = temp2.next.next;
            if (temp2 == null) return false;
        }
        return true;
    }

    //hashmap匹配
    public boolean hasLoop2(Node node) {
        Node temp = node;
        HashMap<Node, Node> map = new HashMap<>();
        while (temp != null) {
            if (map.get(temp) != null) return true;
            else {
                map.put(temp, temp);
            }
            temp = temp.next;
            if (temp == null) return false;
        }
        return true;
    }

    class Node {
        Node next;
    }
}
