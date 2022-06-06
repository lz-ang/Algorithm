package com.ang;

import java.util.ArrayList;
import java.util.List;

//剑指 Offer 22. 链表中倒数第k个节点
public class LeetCode_Offer_22 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        List<ListNode> ls = new ArrayList<>();
        while (head != null) {
            ls.add(head);
            head = head.next;
        }
        ListNode mHead = new ListNode(0);
        ListNode cur = mHead;
        for (int i = ls.size() - k; i < ls.size(); i++) {
            cur.next = ls.get(i);
            cur = cur.next;
        }
        return mHead.next;
    }
}
