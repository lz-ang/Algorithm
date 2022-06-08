package com.ang;

import com.sun.org.apache.xpath.internal.objects.XNull;

//61. 旋转链表
public class LeetCode_61 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
//        head.next.next.next.next.next.next = new ListNode(7);
//        head.next.next.next.next.next.next.next = new ListNode(8);
//        head.next.next.next.next.next.next.next.next = new ListNode(9);
        ListNode cur = head;
        for (int i = 2; i <= 9; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
//        new LeetCode_19_2().removeNthFromEnd2(head,2);
        System.out.println(new LeetCode_876().middleNode(head));;
        System.out.println(rotateRight(head, 2));
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        int num = 1;
        while (head.next != null) {
            num++;
            head = head.next;
        }
        int size = num - k % num;
        head.next = pre; //组成一个环形链表
        while (size-- > 0) {//后移size个节点
            head = head.next;
        }
        ListNode ret = head.next;//指向向右偏移k节点后的头节点
        head.next = null;//断开环形链表
        return ret;
    }

    private static int getSize(ListNode head) {
        int num = 1;
        while (head.next != null) {
            num++;
            head = head.next;
        }
        return num;
    }
}
