package com.ang;

//206. 反转链表
public class LeetCod_206 {

//    public static void main(String[] args) {
//        ListNode listNode = new ListNode(1);
//        listNode.next = new ListNode(2);
//        listNode.next.next = new ListNode(3);
//        listNode.next.next.next = new ListNode(4);
//        listNode.next.next.next.next = new ListNode(5);
//
//        System.out.println(reverseList(listNode));;
//    }

    public static ListNode reverseList2(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;//先存储下一个节点
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    public static ListNode reverseList(ListNode head) {
        if(head ==null || head.next ==null){//空链表或者只有一个节点的链表直接返回本身即可；
            return head;
        }
        ListNode pre = head;//第一个结点作为新链表的最后一个结点
        ListNode nex = head.next;//移到第二个结点，即指向第二个结点；
        ListNode cur = nex;//始终指向当前结点，指向第二节点；
        nex = nex.next;//下移一个节点，避免处理当前节点时，造成链表断裂；
        pre.next = null;//使新链表的最后一个节点不指向任何节点，从老的链表中取出单个节点，断开在老的链表中的连；
        while (cur != null) {
            cur.next = pre;
            pre = cur;//前移
            cur = nex;
            if (nex != null) {
                nex = nex.next;//后移
            }
        }
        return pre;
    }
}
