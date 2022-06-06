package src.com.ang;

import java.util.ArrayList;
import java.util.List;

//链表 合并零之间的节点
public class LeetCode_237 {

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(0);

        System.out.println(mergeNodes(head));
    }

    public static int mergeNodes(ListNode head) {
        if (head == null) {
            return 0;
        }
        ListNode rev = new ListNode();
        List<Integer> list = new ArrayList<>();
        while (head.next != null) {
            list.add(head.val);
            head = head.next;
        }
        Integer[] ts = (Integer[]) list.toArray();  //new Integer[list.size()]
        int result = 0;
        for (int i = 0; i < ts.length / 2; i++) {
//            if (ts[i] + ts[ts.length - 1 - i] > result) {
//                result = ts[i] + ts[ts.length - 1 - i];
//            }
            result = Math.max(ts[i] + ts[ts.length - 1 - i], result);
        }

        return result;
    }

//    static class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int x) {
//            val = x;
//        }
//
//        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//    }
}
