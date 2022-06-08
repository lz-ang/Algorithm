package com.ang;

public class LeetCode_876 {


    public ListNode middleNode(ListNode head) {
        int length = getLength(head);
        ListNode cur = head;
        for (int i = 0; i < length / 2; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public int getLength(ListNode head) {//统计结点个数
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }
}


