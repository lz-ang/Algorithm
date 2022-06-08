package com.ang;

public class LeetCode_19_2 {
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        int length = getLength(head);
        ListNode cur = head;
        if ((length % 2) == 0) {
            length = length + 1;
        }
        for (int i = 0; i < length - n - 1; i++) {//有多少个连接（指向或者箭头）就移动多少次
            cur = cur.next;
        }
        cur.next = cur.next.next;//删除倒数第N结点
        ListNode ans = head;
        return ans;
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
