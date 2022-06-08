package com.ang;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//合并两个有序链表
public class LeetCode_21 {

    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        List<Integer> list = new ArrayList<>();
        while (head1 != null) {
            list.add(head1.val);
            head1 = head1.next;
        }

        while (head2 != null) {
            list.add(head2.val);
            head2 = head2.next;
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        ListNode listNode = new ListNode(0);
        ListNode cur = listNode;
        for (int i = 0; i < list.size(); i++) {
            cur.next = new ListNode(list.get(i));
            cur = cur.next;
        }

        return listNode.next;
    }
}
