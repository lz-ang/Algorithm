package com.ang;
import com.ang.ListNode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeetCode_21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list = new ArrayList<>();
        while (list1 != null) {
            list.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            list.add(list2.val);
            list2 = list2.next;
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
