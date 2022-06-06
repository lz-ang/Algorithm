package com.ang;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_141 {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (!set.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
