package src.com.ang;

//链表 合并零之间的节点
public class LeetCode_2181 {

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
        ;
    }

    public static ListNode mergeNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        int tail = 0;
        ListNode newP = new ListNode();
        ListNode cur = newP;
//        head = head.next;
        while (cur != null) {
            if (cur.val != 0) {
                tail += cur.val;
            } else {
                if (tail == 0) {
                    cur = cur.next;
                    continue;
                }
                cur.next = new ListNode(tail);
                cur = cur.next;
                tail = 0;
            }
            cur = cur.next;
        }
        return newP.next;
    }
}
