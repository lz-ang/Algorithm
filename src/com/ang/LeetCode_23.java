package com.ang;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//合并K个升序链表
public class LeetCode_23 {

    public com.ang.ListNode mergeKLists(com.ang.ListNode[] lists) {
        // ListNode cur = null;
        // for (int i = 0; i < lists.length; i++) {
        //     cur = margeLists(cur, lists[i]);
        // }
        // return cur;

        //利用Java中小顶堆PriorityQueue
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<com.ang.ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<com.ang.ListNode>() {
            @Override
            public int compare(com.ang.ListNode o1, com.ang.ListNode o2) {
                return o1.val-o2.val;
            }
        });
        com.ang.ListNode dummy = new com.ang.ListNode(0);
        com.ang.ListNode p = dummy;
        for (com.ang.ListNode node : lists) {
            if (node != null) queue.add(node);
        }
        while (!queue.isEmpty()) {
            p.next = queue.poll();
            p = p.next;
            if (p.next != null) queue.add(p.next);
        }
        return dummy.next;
    }

    private com.ang.ListNode margeLists(com.ang.ListNode a, com.ang.ListNode b) {//没两个合并一次，合并后的再和后续链表再次两两合并
        if (a == null || b == null) {
            return a != null ? a : b;
        }
        com.ang.ListNode head = new com.ang.ListNode(0);
        com.ang.ListNode cur = head;
        while (a != null && b != null) {
            if (a.val > b.val) {
                cur.next = b;
                b = b.next;
            } else {
                cur.next = a;
                a = a.next;
            }
            cur = cur.next;
        }
        cur.next = (a != null ?a : b);
        return head.next;
    }
}
