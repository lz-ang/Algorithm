package com.ang;

import com.sun.org.apache.xpath.internal.objects.XNull;

//61. 旋转链表
public class LeetCode_61 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next = new ListNode(6);
        listNode.next.next.next.next.next.next = new ListNode(7);
        listNode.next.next.next.next.next.next.next = new ListNode(8);
        listNode.next.next.next.next.next.next.next.next = new ListNode(9);

        System.out.println(rotateRight(listNode, 2));
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
