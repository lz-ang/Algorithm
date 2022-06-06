package com.ang;

//2. 两数相加
public class LeetCode_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode cur = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int num = 0;
            if (l1 != null && l2 != null) {
                num = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null && l2 == null) {
                num = l1.val + carry;
                l1 = l1.next;
            } else if (l1 == null && l2 != null) {
                num = l2.val + carry;
                l2 = l2.next;
            }
            if (num >= 10) {
                cur.next = new ListNode(num % 10);
                cur = cur.next;
                carry = 1;
            } else {
                cur.next = new ListNode(num % 10);
                cur = cur.next;
                carry = 0;
            }
        }
        if (carry == 1) {
            cur.next = new ListNode(carry);
        }
        return head.next;
    }
}
