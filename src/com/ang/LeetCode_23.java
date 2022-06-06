package com.ang;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//合并K个升序链表
public class LeetCode_23 {

    public ListNode mergeKLists(ListNode[] lists) {
        // ListNode cur = null;
        // for (int i = 0; i < lists.length; i++) {
        //     cur = margeLists(cur, lists[i]);
        // }
        // return cur;

        //利用Java中小顶堆PriorityQueue
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        for (ListNode node : lists) {
            if (node != null) queue.add(node);
        }
        while (!queue.isEmpty()) {
            p.next = queue.poll();
            p = p.next;
            if (p.next != null) queue.add(p.next);
        }
        return dummy.next;
    }

    private ListNode margeLists(ListNode a, ListNode b) {//没两个合并一次，合并后的再和后续链表再次两两合并
        if (a == null || b == null) {
            return a != null ? a : b;
        }
        ListNode head = new ListNode(0);
        ListNode cur = head;
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
