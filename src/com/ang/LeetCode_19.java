package com.ang;

import java.util.ArrayList;
import java.util.List;

//19. 删除链表的倒数第 N 个结点
public class LeetCode_19 {
    //注释1，是一种实现方式，注释2是另一种实现方式；
    public ListNode removeNthFromEnd(ListNode head, int n) {
//        List<ListNode> list = new ArrayList<>();//注释1
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
//            list.add(new ListNode(head.val));//注释2：取出链表中的单个结点，解除链
//            list.add(head);
            head = head.next;
        }
        list.remove(list.size() - n);
        ListNode node = new ListNode();
        ListNode cur = node;
//        for (ListNode ln : list) {//注释2：重新组成链表
        for (Integer ln : list) {//注释1：重新组成链表
            // ln.next = null;//注释2：确保List中每个元素都是单个结点，不能是一个链表
            cur.next = new ListNode(ln);
            cur = cur.next;
        }
        return node.next;
    }



}
