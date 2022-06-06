package com.ang;
//24. 两两交换链表中的节点
public class LeetCode_24 {

    public static void main(String[] args) {
        com.ang.ListNode head = new com.ang.ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.println(swapPairs(head));
        ;
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode listNode = new ListNode(0);
        ListNode cur = listNode;

        if(head.next ==null){
            return head;
        }
        while (head != null ) {
            if (head.next == null) {
                cur.next = head;
            }else {
                cur.next = head.next;
                cur = cur.next;
                cur.next = head;
                head = head.next.next;
            }
        }
        return listNode.next;
    }
}
