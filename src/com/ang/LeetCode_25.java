package com.ang;


import java.util.ArrayList;
import java.util.List;

//25. K 个一组翻转链表
public class LeetCode_25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        if (list.size() < k) {
            return head;
        }

        int num = list.size() % k;
        int cy = list.size() / k;

        List<Integer> temporaryList = new ArrayList<>();
        for (int i = 0; i < cy; i++) {
            int temporary = 0;
            if (i != 0) {
                temporary = k;
            }
            for (int j = k + i * temporary; j > i * temporary; j--) {
                temporaryList.add(list.get(j - 1));
            }
        }
        if (num != 0) {
            for (int i = list.size() - num; i < list.size(); i++) {
                temporaryList.add(list.get(i));
            }
        }
        ListNode node = new ListNode();
        ListNode cur = node;
        for (Integer ln : temporaryList) {//重新组成链表
            cur.next = new ListNode(ln);
            cur = cur.next;
        }
        return node.next;
    }
}
