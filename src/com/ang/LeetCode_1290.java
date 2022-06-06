package src.com.ang;

//二进制链表转整数
public class LeetCode_1290 {


    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0;
        }
        int result = 0;
        while (head != null) {
            result = result * 2 + head.val;
            head = head.next;
        }

        return result;
    }
}
